package servlet;

import dao.MedicineDao;
import entity.Medicine;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MedicineAddServlet extends HttpServlet {
//	public void doGet(HttpServletRequest request, HttpServletResponse response)
//		throws ServletException, IOException {
//		this.doPost(request, response);
//	}
//
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		MedicineDao md = new MedicineDao();
	
		 
		String mname = request.getParameter("mname");
		String msort = request.getParameter("msort");
		String mshop = request.getParameter("mshop");
		int mcount = Integer.parseInt(request.getParameter("mcount"));
		int mprice = Integer.parseInt(request.getParameter("mprice"));
		String mdesc = request.getParameter("mdesc");
		String mphoto = "img/mphoto/01.jpg";

		Medicine m = new Medicine(0, mname, msort, mshop, mcount, mprice, mdesc, mphoto);
		
		int result = md.add(m);
		if(result == 1){
			request.getRequestDispatcher("MedicineSelectServlet").forward(request, response);
		} else {
			request.getRequestDispatcher("add.jsp").forward(request, response);
		}
	}
}
