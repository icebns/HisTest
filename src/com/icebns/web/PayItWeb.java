package com.icebns.web;

import com.icebns.service.IregisterService;
import com.icebns.service.PayService;
import com.icebns.service.PayServiceImpl;
import com.icebns.service.RegisterServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PayItWeb extends HttpServlet {
    private PayService service = new PayServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer costId = Integer.parseInt(req.getParameter("costId"));
        System.out.println(costId);
        int a = service.change(costId);
        System.out.println("改变"+a);
        resp.sendRedirect("/getPay");
    }
}
