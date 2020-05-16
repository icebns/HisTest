package com.icebns.web;

import com.icebns.pojo.Pay;
import com.icebns.pojo.Register;
import com.icebns.service.IregisterService;
import com.icebns.service.PayService;
import com.icebns.service.PayServiceImpl;
import com.icebns.service.RegisterServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GetPayWeb extends HttpServlet {
    private PayService nservice = new PayServiceImpl();
    private IregisterService service = new RegisterServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String caseNumber = req.getParameter("caseNumber");
        System.out.println(caseNumber);
        Register register = service.getOne(caseNumber);
        Pay pay = nservice.getTwo(caseNumber);
        req.setAttribute("rep",pay);
        req.setAttribute("reg",register);
        System.out.println("reg = [" + register + "]");
        System.out.println("reg = [" + pay + "]");
        req.getRequestDispatcher("jiaofei.jsp").forward(req,resp);
    }
}
