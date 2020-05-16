//package com.icebns.web;
//
//import com.icebns.pojo.User;
//import com.icebns.service.UserService;
//import com.icebns.service.UserServiceImpl;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
//public class LoginWeb1 extends HttpServlet {
//    private UserService service = new UserServiceImpl();
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("utf-8");
//        Integer userType = Integer.parseInt(req.getParameter("userType"));
//        String userName = req.getParameter("userName");
//        String password = req.getParameter("password");
////        System.out.println(userType+userName+password);
//        User user = service.getUser(userName,password,userType);
//        if(user==null){
//            String message = "用户不存在";
//            req.setAttribute("mess",message);
//            req.getRequestDispatcher("index.jsp").forward(req,resp);
//        }else if(user.getDelMark()==0){
//            String message = "用户已注销";
//            req.setAttribute("mess",message);
//            req.getRequestDispatcher("index.jsp").forward(req,resp);
//        } else if(userType==1){
//            String message = "你好,管理员用户:";
//            req.setAttribute("mess",message);
//            req.setAttribute("username",userName);
//            HttpSession session = req.getSession();
//            session.setAttribute("sessionuser",user);
//            req.getRequestDispatcher("main.jsp").forward(req,resp);
//        }else if(userType==2) {
//            String message = "Hello:";
//            req.setAttribute("mess",message);
//            req.setAttribute("username",userName);
//            HttpSession session = req.getSession();
//            session.setAttribute("sessionuser",user);
//            req.getRequestDispatcher("main.jsp").forward(req,resp);
////            resp.sendRedirect("main.jsp");
//        }
//    }
//}
