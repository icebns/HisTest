<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/14
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="static/css/guahao.css">
    <link rel="stylesheet" href="static/font/iconfont.css">
</head>
<body>
<form action="putData" method="post">
    <div>
        <span>*</span>发票号：<input value="123" name="id" type="text" id="fph">
        <input type="submit" value="&#xe607; 挂号" class="btn iconfont"/>
        <input type="submit" value="&#xe6a9; 清空" class="btn iconfont"/>
    </div>
    <br>
    <div class="item">
        <span>*</span>病历号:<br>
        <input value="010" name="caseNumber" type="text">
    </div>
    <div class="item">
        <span>*</span>姓名:<br>
        <input placeholder="请输入姓名" name="realName" type="text">
    </div>
    <div class="item">
        <span>*</span>性别:<br>
        <select name="gender">
            <option value="男">男</option>
            <option value="女">女</option>
        </select>
    </div>
    <div class="item1">
        <span>*</span>年龄:<br>
        <input placeholder="请输入年龄" name="age" type="text">
        <select name="ageType">
            <option value="岁">岁</option>
            <option value="月">月</option>
            <option value="天">天</option>
        </select>
    </div>
    <div class="item">
        <span>*</span>出生日期:<br>
        <input placeholder="请输入出生日期" name="birthDate" type="date">
    </div>
    <div class="item">
        <span>*</span>身份证号:<br>
        <input placeholder="请输入身份证号" name="idNumber" type="text">
    </div>
    <div class="item">
        <span>*</span>家庭住址:<br>
        <input placeholder="请输入家庭住址" name="homeAddress" type="text">
    </div>
    <div class="item">
        <span>*</span>结算类别:<br>
        <select name="payMeans">
            <option value="自费">自费</option>
            <option value="社保">社保</option>
        </select>
    </div>
    <div class="item">
        <span>*</span>看诊日期:<br>
        <input placeholder="请输入看诊日期" name="visitDate" type="date">
    </div>
    <div class="item">
        <span>*</span>午别:<br>
        <select name="noon">
            <option value="上午">上午</option>
            <option value="下午">下午</option>
        </select>
    </div>
    <div class="item">
        <span>*</span>挂号科室:<br>
        <select name="deptId">
            <option value="1">骨科</option>
            <option value="2">外科</option>
            <option value="3">全科</option>
        </select>
    </div>
    <div class="item">
        <span>*</span>号别:<br>
        <select name="registLeid">
            <option value="1">专家号</option>
            <option value="2">普通号</option>
        </select>
    </div>
    <div class="item">
        <span>*</span>看诊医生:<br>
        <select name="userId">
            <option value="1">医生a</option>
            <option value="2">医生b</option>
        </select>
    </div>
    <div class="item">
        <span>*</span>初始号额:<br>
        <input placeholder="初始号额" type="text" value="10" name="begin">
    </div>
    <div class="item">
        <span>*</span>已用号额:<br>
        <input placeholder="已用号额" type="text" value="5" name="been">
    </div>
    <div class="item">
        <span>*</span>病历本:<br>
        <input type="checkbox" name="isBook" style="width: 13px;" value="1">
    </div>
    <div class="item">
        <span>*</span>应收金额:<br>
        <input placeholder="应收金额" value="0" type="text" name="payNumber">
    </div>
    <div class="item">
        <span>*</span>收费方式:<br>
        <select name="settleId">
            <option value="1">现金</option>
            <option value="2">微信</option>
            <option value="3">支付宝</option>
        </select>
    </div>
</form>
</body>
</html>
