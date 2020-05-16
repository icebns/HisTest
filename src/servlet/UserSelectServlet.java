package servlet;

import dao.UserDao;
import model.UserBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class UserSelectServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { 
		request.setCharacterEncoding("utf-8"); 
		response.setContentType("text/html;charset=utf-8");
		UserDao md = new UserDao();
		ArrayList<UserBean> list1 = md.select();
		System.out.print("list1");
		request.setAttribute("list", list1); 
		request.getRequestDispatcher("showuser.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		UserDao md = new UserDao();
		ArrayList<UserBean> list1 = md.select();
		request.setAttribute("list", list1);
		request.getRequestDispatcher("showuser.jsp").forward(request, response);
		
	}

}
