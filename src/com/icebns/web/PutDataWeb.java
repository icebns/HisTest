package com.icebns.web;

import com.icebns.pojo.Register;
import com.icebns.pojo.User;
import com.icebns.service.IregisterService;
import com.icebns.service.RegisterServiceImpl;
import com.icebns.utils.JdbcUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PutDataWeb extends HttpServlet {
    private IregisterService service = new RegisterServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer id = Integer.parseInt(req.getParameter("id"));
        String caseNumber = req.getParameter("caseNumber");
        String realName = req.getParameter("realName");
        String gender = req.getParameter("gender");
//        String idNumbers = req.getParameter("idNumbers");
        long l=Long.parseLong(req.getParameter("idNumber"));
        String str=String.valueOf(l);
//        Integer idNumber = Integer.parseInt(req.getParameter("idNumber"));
        String birthDate = req.getParameter("birthDate");
        Integer age = Integer.parseInt(req.getParameter("age"));
        String ageType = req.getParameter("ageType");
        String homeAddress = req.getParameter("homeAddress");
        String visitDate = req.getParameter("visitDate");
        String noon = req.getParameter("noon");
        Integer deptId = Integer.parseInt(req.getParameter("deptId"));
        Integer userId = Integer.parseInt(req.getParameter("userId"));
        Integer registLeid = Integer.parseInt(req.getParameter("registLeid"));
        Integer settleId = Integer.parseInt(req.getParameter("settleId"));
        String isBooks = req.getParameter("isBook");
        if(isBooks==null){
            isBooks="0";
        }
        Integer isBook = Integer.parseInt(isBooks);
        Integer payNumber = Integer.parseInt(req.getParameter("payNumber"));
        Integer begin = Integer.parseInt(req.getParameter("begin"));
        Integer been = Integer.parseInt(req.getParameter("been"));
        String payMeans = req.getParameter("payMeans");

        User user = (User) req.getSession().getAttribute("sessionuser");
        System.out.println("user.getId()"+user.getId());
        Integer registerId = user.getId();

        System.out.println("--发票号-"+id+"--病历号-"+caseNumber+"--姓名-"+realName+"--性别-"+
                gender+"--身份证-"+str+"--出生日期-"+birthDate+"--年龄-"+age+"--岁别-"+ageType
                +"--家庭住址-"+homeAddress+"--看诊日期-"+visitDate+"--午别-"+noon+"--科室id-"+deptId
                +"--看诊医生id-"+userId+"--号别id-"+registLeid+"--收费方式id-"+settleId+"--病历本-"+isBook+
                "--应收金额-"+payNumber+"--初始号额-"+begin+"--已用号额-"+been+"--结算类别-"+payMeans
        );

        Calendar calendar= Calendar.getInstance();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(dateFormat.format(calendar.getTime()));
        String registTime = dateFormat.format(calendar.getTime());

        Register register = new Register();
        register.setCaseNumber(caseNumber);
        register.setRealName(realName);
        register.setGender(gender);
        register.setIdNumber(str);
        register.setAge(age);
        register.setAgeType(ageType);
        register.setHomeAddress(homeAddress);
        register.setBirthDate(birthDate);
        register.setVisitDate(visitDate);
        register.setNoon(noon);
        register.setDeptId(deptId);
        register.setUserId(userId);
        register.setRegistLeid(registLeid);
        register.setSettleId(settleId);
        register.setIsBook(isBook);
        register.setRegistTime(registTime);
        register.setRegisterId(registerId);
        register.setVisitState(2);
        System.out.println(register);
        int a = service.add(register);
        System.out.println(a);
//        new JdbcUtils().insert();
//        new JdbcUtils().add("INSERT INTO `test`.`cat1`(`id`, `name`, `age`, `date`, `mark`, `tel`) VALUES (5, 'mmm', ?, '2020-04-02 15:38:47', 55.50, '15555555555');",18);

//        new JdbcUtils().add("insert into `test`.`register`(`case_number`, `real_name`, `gender`, `id_number`, `birth_date`, `age`," +
//                        " `age_type`, `home_address`, `visit_date`, `noon`, `dept_id`, `user_id`, `regist_leid`, `settle_id`, `is_book`, `regist_time`," +
//                        " `register_id`, `visit_state`) value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",caseNumber, realName,gender, str,
//                birthDate, age, ageType, homeAddress, visitDate, noon, deptId, userId, registLeid, settleId, isBook, registTime, 1, 2);
        resp.sendRedirect("registerlistweb");
    }
}
