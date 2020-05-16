package com.icebns.web;

import com.icebns.service.MediService;
import com.icebns.service.MediServiceImpl;
import entity.Medicine;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AddmediWeb extends HttpServlet {

    private MediService service = new MediServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("AddmediWebWebbegin");
        String caseNumber = req.getParameter("caseNumber");
        System.out.println("caseNumber"+caseNumber);
        String mname = req.getParameter("mname");
        String msort = req.getParameter("msort");
        String mshop = req.getParameter("mshop");
        Integer mcount = Integer.parseInt(req.getParameter("mcount"));
        Integer mprice = Integer.parseInt(req.getParameter("mprice"));
        String mdesc = req.getParameter("mdesc");
        String date = req.getParameter("date");

        Medicine md = new Medicine();
        md.setMname(mname);
        md.setMsort(msort);
        md.setMshop(mshop);
        md.setMcount(mcount);
        md.setMprice(mprice);
        md.setMdesc(mdesc);
        md.setMphoto(date);

        System.out.println("md="+md);
        int a = service.add(md);
        System.out.println(a);
        resp.sendRedirect("add.jsp");
    }
//
//
//    String mname = md.getParameter("mname");
//    String msort = md.getParameter("msort");
//    String mshop = md.getParameter("mshop");
//    int mcount = Integer.parseInt(request.getParameter("mcount"));
//    int mprice = Integer.parseInt(request.getParameter("mprice"));
//    String mdesc = request.getParameter("mdesc");
//    String mphoto = "img/mphoto/01.jpg";
//
//    Medicine m = new Medicine(0, mname, msort, mshop, mcount, mprice, mdesc, mphoto);
//
//    int result = md.add(m);
//		if(result == 1){
//        request.getRequestDispatcher("MedicineSelectServlet").forward(request, response);
//    } else {
//        request.getRequestDispatcher("add.jsp").forward(request, response);
//    }
}
