package servlet;

import dao.MedicineDao;
import entity.Medicine;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class ExpiredSelectServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		MedicineDao md = new MedicineDao();
		
		String mname = "";
		if (request.getParameter("keyname") != null && request.getParameter("keyname") != "") {
			mname = request.getParameter("keyname");
		}
		
		int priceFrom = 0;
		if (request.getParameter("priceFrom") != null && request.getParameter("priceFrom") != "") {
			priceFrom = Integer.parseInt(request.getParameter("priceFrom"));
		}
		
		int priceTo = 0;
		if (request.getParameter("priceTo") != null && request.getParameter("priceTo") != "") {
			priceTo = Integer.parseInt(request.getParameter("priceTo"));
		}
		
		ArrayList<Medicine> list = md.select(mname, priceFrom, priceTo);
		
		request.setAttribute("keyname", mname);
		request.setAttribute("priceFrom", priceFrom);
		request.setAttribute("priceTo", priceTo);
		request.setAttribute("list", list);
		request.getRequestDispatcher("expired.jsp").forward(request, response); 
	}

}
