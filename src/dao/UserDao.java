package dao;

import model.UserBean;

import java.sql.SQLException;
import java.util.ArrayList;

public class UserDao extends BaseDao {
	public ArrayList<UserBean> select() {
		ArrayList<UserBean> list = new ArrayList<UserBean>();
		String sql = "select * from `test`.`user`";
		try {
			this.getCon();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				UserBean m = new UserBean(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(5), rs.getInt(10));
				System.out.println(m);
				list.add(m);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			this.closeAll();
		}
		
		return list;
	}

	public UserBean getById(int id) {
		UserBean m = null;
		String sql = "select * from `test`.`user` where mid=?";
		try {
			this.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()){
				m = new UserBean(rs.getInt(1), rs.getString(2),  rs.getString(3), rs.getInt(4), rs.getInt(10));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeAll();
		}
		return m;
	}
	 
//	public void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		response.setContentType("text/html");
//		response.setCharacterEncoding("utf-8");
//		PrintWriter out = response.getWriter();
//
//
//		//得到用户名和密码
//		String u=request.getParameter("username");
//		String p=request.getParameter("password");
//
//		//验证用户
//		UserBeanBO ubb=new UserBeanBO();
//
//		if(ubb.checkUser(u, p)){
//
//			//用户合法
//
//			UserBean ub=ubb.getUserBean(u);
//			request.getSession().setAttribute("userInfo", ub);
//			request.getRequestDispatcher("MedicineSelectServlet").forward(request, response);
//
//		}else{
//
//			//用户不合法
//			request.getRequestDispatcher("login.jsp").forward(request, response);
//
//		}
//
//
//	}
 
//	public void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		this.doGet(request, response);
//	}

	public int add(UserBean m) {
		String sql = "insert into `test`.`user` values(null,?,?)";
		return this.execute(sql, m.getUsername(), m.getPasswd());
	}
	public int update(int id) {
		String sql = "update `test`.`user` set del_mark=1 where id=?";
		return this.execute(sql, id);
	}

	public int delete(int id) {
		String sql = "update `test`.`user` set del_mark=0 where id=?";
		return this.execute(sql, id);
	}
 
}
