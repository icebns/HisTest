package com.icebns.web;

import com.icebns.pojo.User;
import com.icebns.service.UserService;
import com.icebns.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AddUserWeb extends HttpServlet {
    private UserService service = new UserServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("AddUserWeb begin");
        String userName = req.getParameter("userName");
        String passwd = req.getParameter("passwd");
        Integer userType = Integer.parseInt(req.getParameter("userType"));
        User user = new User();
        user.setUserName(userName);
        user.setPassword(passwd);
        user.setUserType(userType);
        System.out.println(user);
        int a = service.add(user);
        System.out.println(a);
        resp.sendRedirect("addcount.jsp");
    }


}
