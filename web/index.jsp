<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/14
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>$Title$</title>
      <link rel="stylesheet" href="static/css/guahao.css">
  </head>
  <body>
  <div id="win" style="display: inline;width: 300px">
  <form action="/login" method="post">
    <br>
    <div class="item item3">
      <span>*</span>用户名:<br>
      <input placeholder="username" value="" name="userName" type="text">
    </div>
    <div class="item item3">
      <span>*</span>密码:<br>
      <input placeholder="password" name="password" type="text">
    </div>
    <div class="item item3">
    <select name="userType" style="width: 300px">
      <option value="1">管理员</option>
      <option value="2">挂号员</option>
      <option value="3">医生</option>
    </select>
    </div>
    <input type="submit" value="登录" class="btn iconfont" style="width: 150px;margin-left: 75px;text-align: center;"/>
${mess}
  </form>
  </div>
  </body>
</html>
