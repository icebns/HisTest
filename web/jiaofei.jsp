<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/15
  Time: 16:57
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
<form action="/getPay" method="post">

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
        <h3 style="float: left;margin-top:5px">患者消费信息 </h3>
        <span id="addbtn">新建项目</span>
    </div>
    <table border="0" style="width: 100%;">
        <tr style="box-shadow: #ccc 0px 6px 0px -4px;">
            <th><input type="checkbox"></th>
            <th>病历号</th>
            <th>姓名</th>
            <th>项目名称</th>
            <th>单价</th>
            <th>数量</th>
            <th>开立时间</th>
            <th>状态</th>
            <th>操作</th>
        </tr>
        <%--<c:forEach items="${rep}" var="item">--%>
        <tr style="height:30px">
            <td>${rep.costId}</td>
            <td>${rep.caseNumber}</td>
            <td>${rep.realName}</td>
            <td>${rep.costName}</td>
            <td>${rep.costPay}</td>
            <td>${rep.costNumber}</td>
            <td>${rep.costTime}</td>
            <td>${rep.costState}</td>
            <td>
                <form action="/payIt" method="post">
                    <input type="submit" value="$ 收费" class="btn iconfont"/>
                    <input name="costId" type="text" value="${rep.costId}" style="display: none;">
                </form>
            </td>
        </tr>
        <%--</c:forEach>--%>
        <tr>
            <td></td>
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
    <div id="win">
        <span id="close">×</span>
        <form action="/putPay" method="post">
            <br>
            <div class="item item3">
                <span>*</span>项目名称:<br>
                <input placeholder="请输入项目名称" value="" name="costName" type="text">
            </div>
            <div class="item item3">
                <span>*</span>单价:<br>
                <input placeholder="请输入单价" name="costPay" type="text">
            </div>
            <div class="item item3">
                <span>*</span>数量:<br>
                <input placeholder="请输入整数数字" name="costNumber" type="text">
            </div>
            <input type="submit" value="添加" class="btn iconfont" style="width: 150px;margin-left: 75px;text-align: center;"/>
            <input name="realName" type="text" value="${reg.realName}" style="display: none;">
            <input name="caseNumber" type="text" value="${reg.caseNumber}" style="display: none;">
            <input name="costState" type="text" value="未收费" style="display: none;">
        </form>
    </div>
    <script src="static/js/jquery.js"></script>
    <script>
        $("#addbtn").click(function () {
            $("#win").show();
        });
        $("#close").click(function () {
            $("#win").hide();
        });
    </script>
</body>
</html>