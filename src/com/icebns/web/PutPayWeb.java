package com.icebns.web;

import com.icebns.pojo.Pay;
import com.icebns.service.PayService;
import com.icebns.service.PayServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PutPayWeb extends HttpServlet {

    private PayService service = new PayServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("PutPayWebbegin");
        String caseNumber = req.getParameter("caseNumber");
        System.out.println("caseNumber"+caseNumber);
        String realName = req.getParameter("realName");
        String costName = req.getParameter("costName");
        Integer costPay = Integer.parseInt(req.getParameter("costPay"));
        Integer costNumber = Integer.parseInt(req.getParameter("costNumber"));
        String costState = req.getParameter("costState");
        Calendar calendar= Calendar.getInstance();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(dateFormat.format(calendar.getTime()));
        String costTime = dateFormat.format(calendar.getTime());
        System.out.println("--发票号-"+0+"--病历号-"+caseNumber+"--姓名-"+realName+"--costName-"+
                costName+"--costPay-"+costPay+"--costNumber-"+costNumber+"--costState-"+costState+"--costTime-"+costTime

        );
        Pay pay = new Pay();
        pay.setCaseNumber(caseNumber);
        pay.setRealName(realName);
        pay.setCostName(costName);
        pay.setCostPay(costPay);
        pay.setCostNumber(costNumber);
        pay.setCostState(costState);
        pay.setCostTime(costTime);

        System.out.println("pay="+pay);
        int a = service.add(pay);
        System.out.println(a);
        resp.sendRedirect("getPay");
    }

}
