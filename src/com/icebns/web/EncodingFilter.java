package com.icebns.web;

import com.icebns.pojo.User;
import com.icebns.service.UserService;
import com.icebns.service.UserServiceImpl;
import com.icebns.utils.CookieUtils;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

public class EncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException{

    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)throws IOException,ServletException{
        servletRequest.setCharacterEncoding("utf-8");
        UserService service = new UserServiceImpl();
        HttpServletRequest req = (HttpServletRequest)servletRequest;
        HttpSession session = req.getSession();
        User user = (User)session.getAttribute("sessionuser");
        Cookie[] cookies = req.getCookies();
        Map<String,Cookie> cookieMap = CookieUtils.toCookie(cookies);
//        Cookie cookie = cookieMap.get("username");
        if (user == null){
            Cookie cookie = cookieMap.get("username");
            if (cookie==null){
                req.getRequestDispatcher("index.jsp").forward(req,servletResponse);
                filterChain.doFilter(servletRequest,servletResponse);
            }else{
                String username = cookie.getValue();
                User selectuser = service.getUserByUsername(username);
                if (selectuser==null){
                    req.getRequestDispatcher("index.jsp").forward(req,servletResponse);
                    filterChain.doFilter(servletRequest,servletResponse);
                }else{
                    session.setAttribute("sessionuser",selectuser);
                    filterChain.doFilter(servletRequest,servletResponse);
                }
            }
        }else{
            filterChain.doFilter(servletRequest,servletResponse);
        }




//        if (cookie==null){
//            req.getRequestDispatcher("index.jsp").forward(req,servletResponse);
//        }else if(user!=null){
//            req.getRequestDispatcher("main.jsp").forward(req,servletResponse);
//        }else{
//            String username = cookie.getValue();
//            User selectuser = service.getUserByUsername(username);
//            if (selectuser==null){
//                req.getRequestDispatcher("index.jsp").forward(req,servletResponse);
//
//            }else{
//                session.setAttribute("sessionuser",user);
//            }
//        }
//            System.out.println(c.getName());
//
//        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }

}
