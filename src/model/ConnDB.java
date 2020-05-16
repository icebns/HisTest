//得到数据库的链接
package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnDB {
	private Connection ct = null;

	public Connection getConn() {

		try {

			// 加载驱动
			Class.forName("com.mysql.jdbc.Driver");

			// 得到链接
			Connection ct = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/Hospital", "root", "123456");

			return ct;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return ct;
	}

}
