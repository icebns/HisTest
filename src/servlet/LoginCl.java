package servlet;

import model.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginCl extends HttpServlet {
 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		this.doPost(request, response);
		
	} 
//	public void doPost(HttpServletRequest request, HttpServletResponse response)
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
//
//		//验证用户
//		UserBeanBO ubb=new UserBeanBO();
//
//		if(ubb.checkUser(u, p)){
//			//用户合法
//			request.getRequestDispatcher("MedicineSelectServlet").forward(request, response);
//		}else{
//			//用户不合法
//
//			request.getRequestDispatcher("login.jsp").forward(request, response);
//
//		}
//	}

}
