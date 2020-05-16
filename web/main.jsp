<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/14
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
${mess}${username}
</div>
<div id="content">
    <div id="left">
        <dl>
            <dt>挂号收费</dt>
            <dd><a href="/registerlistweb"></a>现场挂号</dd>
            <dd><a href="/getRegister"></a>退号</dd>
            <dd><a href="/getPay"></a>收费</dd>
            <dd><a href="/getNoPay"></a>退费</dd>
        </dl>
        <dl>
            <dt>门诊医生</dt>
            <dd>门诊医生1</dd>
            <dd>门诊医生2</dd>
            <dd>门诊医生3</dd>
            <dd>门诊医生4</dd>
        </dl>
        <dl>
            <dt>医技处置</dt>
            <dd>医技处置1</dd>
            <dd>医技处置2</dd>
            <dd>医技处置3</dd>
            <dd>医技处置4</dd>
        </dl>
        <dl>
            <dt>药房管理</dt>
            <dd>药房管理1</dd>
            <dd>药房管理2</dd>
            <dd>药房管理3</dd>
            <dd>药房管理4</dd>
        </dl>
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
