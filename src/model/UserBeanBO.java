package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserBeanBO {
	 
		private ResultSet rs = null;
		private Connection ct = null;
		private PreparedStatement ps = null;
	
	public UserBean getUserBean(String u){
		
		UserBean ub=new UserBean();
		try {
			ct=new ConnDB().getConn();
			ps=ct.prepareStatement("select * from users where username=?");
			ps.setString(1, u);
			rs=ps.executeQuery();
			if(rs.next()){
				ub.setUserId(rs.getLong(1));
				ub.setUsername(rs.getString(2)); 
				ub.setPasswd(rs.getString(3));

			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			
			this.close();
		}
		return ub;
	}	
	public boolean checkUser(String u, String p) {
		boolean b = false;

		try {
			ct=new ConnDB().getConn();
			
			ps=ct.prepareStatement("select passwd from users where username=?");
			
			ps.setString(1,u);
			
			rs=ps.executeQuery();
			
			if(rs.next()){
				//取出数据库中的密码
				String dbPasswd=rs.getString(1);
				
				if(dbPasswd.equals(p)){
					b=true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
 
			//关闭资源
		this.close();
		}
		return b;

	}
	// 关闭资源
		public void close() {
			try {

				if (rs != null) {
					rs.close();
					rs = null;

				}
				if (ps != null) {
					ps.close();
					ps = null;

				}
				if (!ct.isClosed()) {

					ct.close();

				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();

			}

		}
}
