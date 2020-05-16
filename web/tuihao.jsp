<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/14
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="static/css/guahao.css">
    <link rel="stylesheet" href="static/font/iconfont.css">
</head>
<body>
<%--${reg}--%>
<form action="/getRegister" method="post">

    <div>
        <H3>患者信息查询 </H3>
    </div>
    <div class="item item2">
        <span>*</span>病历号:
        <input value="010" name="caseNumber" type="text">
    </div>
    <input type="submit" value="&#xe729; 搜索" class="btn btn2 iconfont"/>
    <br>
    <div>
        <H3>患者信息确认 </H3>
    </div>
    <div>
        <div class="item">
            <span>*</span>姓名:<br>
            <input placeholder="请输入姓名" name="realName" type="text" value="${reg.realName}">
        </div>

        <div class="item">
            <span>*</span>身份证号:<br>
            <input placeholder="请输入身份证号" name="idNumber" type="text" value="${reg.idNumber}">
        </div>
        <div class="item">
            <span>*</span>家庭住址:<br>
            <input placeholder="请输入家庭住址" name="homeAddress" type="text" value="${reg.homeAddress}">
        </div>
    </div>
</form>
    <br><br><br>
    <div>
        <h3 style="float: left;margin-top:5px">患者挂号信息 </h3>
    </div>
    <table border="0" style="width: 100%;">
        <tr style="box-shadow: #ccc 0px 6px 0px -4px;">
            <th>病历号</th>
            <th>姓名</th>
            <th>身份证号</th>
            <th>挂号日期</th>
            <th>挂号午别</th>
            <th>看诊科室</th>
            <th>看诊状态</th>
            <th>操作</th>
        </tr>
        <tr style="height:30px">
            <td>${reg.caseNumber}</td>
            <td>${reg.realName}</td>
            <td>${reg.idNumber}</td>
            <td>${reg.registTime}</td>
            <td>${reg.noon}</td>
            <td>${reg.deptId}</td>
            <td>${reg.visitState}</td>
            <td><form action="/delRegister" method="post"><input type="submit" value="退号" style="background: #FFF;border: 0px;"/><input value="${reg.caseNumber}" name="caseNumber" type="text" style="display: none;"></form></td>
        </tr>

        <tr>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
    </table>

</body>
</html>