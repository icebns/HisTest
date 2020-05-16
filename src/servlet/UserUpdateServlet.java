package servlet;

import entity.User;
import model.UserBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class UserUpdateServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        HttpSession session = req.getSession();
        UserBean usi = new UserBean(); 
        String action = req.getParameter("action");
        if(action.equals("login")){
            String userName = req.getParameter("userName");
            String userPwd = req.getParameter("passWord");
            UserBean user = new UserBean();
            user.setUsername(userName);
            user.setPasswd(userPwd);
            User checkUser = usi.User(user);
            if(checkUser != null){
                session.setAttribute("user", checkUser);//传user
                resp.sendRedirect("jsp/admin_index.jsp");
            }else{
                resp.setContentType("text/html;charset = utf-8");
                PrintWriter pw = resp.getWriter();
                pw.println("<script type=\"text/javascript\">");
                pw.println("alert(\"登录失败！请重新登录！\");");
                pw.println("open(\"/SupermarketBillingManagementSystem/jsp/login.jsp\",\"_self\");");
                pw.println("</script>");
                pw.close();
            }
        }else if(action.equals("show")){//第一次登陆设置当前页
           
          
            //还差传入分页 
            resp.sendRedirect("jsp/userAdmin.jsp");
        }else if(action.equals("add")){
            User user = new User();
            
            List<User> userList = new ArrayList<User>();
            int currentPageNo = Integer.parseInt(req.getParameter("test"));
            int pageSize = 3; 
            //还差传入分页
            session.setAttribute("userList", userList);
            resp.sendRedirect("jsp/userAdmin.jsp");
        }else if(action.equals("search")){
            User user = new User();
            String idString = req.getParameter("id");
            int id = Integer.parseInt(idString); 
            session.setAttribute("user",user);
            resp.sendRedirect("jsp/user_detail.jsp");
        }
    }
     
}