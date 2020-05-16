package com.icebns.web;

import com.icebns.pojo.Register;
import com.icebns.service.IregisterService;
import com.icebns.service.RegisterServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GetRegisterWeb extends HttpServlet {
    private IregisterService service = new RegisterServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String caseNumber = req.getParameter("caseNumber");
        System.out.println(caseNumber);
        Register register = service.getOne(caseNumber);
        req.setAttribute("reg",register);
        System.out.println("reg = [" + register + "]");
        req.getRequestDispatcher("tuihao.jsp").forward(req,resp);
    }
}
