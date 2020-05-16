package com.icebns.web;

import com.icebns.pojo.Register;
import com.icebns.service.IregisterService;
import com.icebns.service.RegisterServiceImpl;
import com.sun.javaws.exceptions.JRESelectException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static com.sun.deploy.config.JREInfo.getAll;

public class RegisterListWeb extends HttpServlet{
//    private IregisterService service = new RegisterServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        List<Register> registers = service.getAll();
//        req.setAttribute("registers",registers);
        req.getRequestDispatcher("register.jsp").forward(req,resp);
    }
}
