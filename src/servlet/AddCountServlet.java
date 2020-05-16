package servlet;

import dao.UserDao;
import model.UserBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddCountServlet extends HttpServlet {
//	public void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//			this.doPost(request, response);
//		}

		public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			System.out.println("[begin post]");
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			UserDao md = new UserDao();
			String username = request.getParameter("username");
			String passwd = request.getParameter("passwd");
			Integer userType = Integer.parseInt(request.getParameter("userType"));
			UserBean m = new UserBean(0, username, passwd, userType,1);
			int result = md.add(m);
			if(result == 1){
				request.getRequestDispatcher("UserSelectServlet").forward(request, response);
			} else {
				request.getRequestDispatcher("addcount.jsp").forward(request, response);
			}
		}

}
