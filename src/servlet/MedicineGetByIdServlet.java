package servlet;

import dao.MedicineDao;
import entity.Medicine;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MedicineGetByIdServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		MedicineDao md = new MedicineDao();
		
		int mid = Integer.parseInt(request.getParameter("mid"));
		Medicine m = md.getById(mid);
		request.setAttribute("m", m);
		request.getRequestDispatcher("update.jsp").forward(request, response);
	}
}
