<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/14
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            border:solid 1px black;
            border-collapse: collapse;
        }
        th,td{
            border: solid 1px black;
        }
    </style>
</head>
<body>
<div style="height: 100px;width: 100px;background: #CCCCCC">
    111
</div>
<table>
    <thead>
    <tr>
        <th>绑定de数据</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${data}" var="da">
        <tr>
            <td>${da}</td>
        </tr>

    </c:forEach>
    </tbody>
</table>


</body>
</html>
