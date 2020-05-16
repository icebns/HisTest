<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/14
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="static/css/index.css">
</head>
<body>
<div id="header">
    东软云医疗HIS系统
    <a>${mess}${username}</a>
</div>
<div id="content">
    <div id="left">
        <c:if test="${type==1||type==2}">
            <dl>
                <dt>挂号收费</dt>
                <dd><a href="/registerlistweb"></a>现场挂号</dd>
                <dd><a href="/getRegister"></a>退号</dd>
                <dd><a href="/getPay"></a>收费</dd>
                <dd><a href="/getNoPay"></a>退费</dd>
            </dl>
        </c:if>
        <c:if test="${type==3}">
            <dl>
                <dt>门诊医生</dt>
                <dd>门诊医生1</dd>
                <dd>门诊医生2</dd>
                <dd>门诊医生3</dd>
                <dd>门诊医生4</dd>
            </dl>
        </c:if>
        <c:if test="${type==4}">
        <dl>
            <dt>医技处置</dt>
            <dd>医技处置1</dd>
            <dd>医技处置2</dd>
            <dd>医技处置3</dd>
            <dd>医技处置4</dd>
        </dl>
        </c:if>
        <c:if test="${type==1||type==5}">
        <dl>
            <dt>药房管理</dt>
            <dd><a href="/add.jsp"></a>添加药品</dd>
            <dd><a href="/MlistSelectServlet"></a>查询药品</dd>
        </dl>
        </c:if>
        <c:if test="${type==1||type==6}">
            <dl>
                <dt>用户管理</dt>
                <dd><a href="/addcount.jsp"></a>添加用户</dd>
                <dd><a href="/UserSelectServlet"></a>管理用户</dd>
            </dl>
        </c:if>
    </div>
    <div id="right">
        <iframe src=""></iframe>
    </div>
</div>
<script src="static/js/jquery.js"></script>
<script>
    $(function(){
        $("dt").click(function () {
            $(this).siblings().toggle().parent().siblings().children("dd").hide();
            // $(this).siblings().toggle();
        });
        $("dd").click(function () {
            var addr =  $(this).children("a").attr("href");
            $(this).addClass
            $("iframe").attr("src",addr);
        })
    })
</script>
</body>
</html>
