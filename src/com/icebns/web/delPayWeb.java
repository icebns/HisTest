package com.icebns.web;

import com.icebns.service.PayService;
import com.icebns.service.PayServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class delPayWeb extends HttpServlet {
    private PayService service = new PayServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer costId = Integer.parseInt(req.getParameter("costId"));
        System.out.println(costId);
        int a = service.del(costId);
        System.out.println("删除cost"+a);
        resp.sendRedirect("getPay");
    }
}
