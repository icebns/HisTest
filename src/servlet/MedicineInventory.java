package servlet;

import dao.MedicineDao;
import entity.Medicine;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class MedicineInventory extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
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
		request.getRequestDispatcher("index.jsp").forward(request, response); 
	}

}
