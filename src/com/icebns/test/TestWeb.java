package com.icebns.test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class TestWeb extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
//        System.out.println("执行了");
//        PrintWriter pw = resp.getWriter();
//        pw.print("success");
        List<String> lists = new ArrayList<>();
        for(int i = 0;i<100;i++){
            lists.add(i+"abc");
        }


        req.setAttribute("data",lists);
        req.getRequestDispatcher("test.jsp").forward(req,resp);
    }
}
