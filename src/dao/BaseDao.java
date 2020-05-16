package dao;

import java.sql.*;

public class BaseDao {
	private String driver="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/Hospital";
	private String name="root";
	private String pwd="123456";
	
	public Connection con = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;
	
	public void getCon(){
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, name, pwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closeAll(){
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int execute(String sql, Object ... param){
		int result = 0;
		try {
			this.getCon();
			ps = con.prepareStatement(sql);
			int i = 1;
			for (Object obj : param) {
				ps.setObject(i++, obj);
			}
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeAll();
		}
		return result;
	}
}
