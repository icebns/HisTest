<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/17
  Time: 1:03
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/17
  Time: 0:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Home</title>
    <meta name="description" content="#">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="robots" content="all,follow">
    <!-- Bootstrap CSS-->
    <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome CSS-->
    <link rel="stylesheet" href="vendor/font-awesome/css/font-awesome.min.css">
    <!-- Fontastic Custom icon font-->
    <link rel="stylesheet" href="css/fontastic.css">
    <!-- Google fonts - Roboto -->
    <link rel="stylesheet" href="#">
    <!-- jQuery Circle-->
    <link rel="stylesheet" href="css/grasp_mobile_progress_circle-1.0.0.min.css">
    <!-- Custom Scrollbar-->
    <link rel="stylesheet" href="vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.css">
    <!-- theme stylesheet-->
    <link rel="stylesheet" href="css/style.default.css" id="theme-stylesheet">
    <!-- Custom stylesheet - for your changes-->
    <link rel="stylesheet" href="css/custom.css">
    <!-- Favicon-->
    <link rel="shortcut icon" href="img/favicon.ico">
    <link rel="stylesheet" href="static/css/guahao.css">
    <link rel="stylesheet" href="static/font/iconfont.css">
    <style>
        .btn {
            width: 90%;
            margin: 5%;
        }
        .page{
            background: #ffffff;
        }
        .card{
            -webkit-box-shadow: #ccc 0 0 0 0;
            box-shadow: #ccc 0 0 0 0;
            background: #F4F7FA;
        }
        .btn{
            margin: 0;
            width: 80px;
            line-height: 2px;
        }
        input :hover{
            color: #FFFFFF;
        }
        .btn2{
            position: relative;
            left: -13px;
        }
        .item input, .item1 input {
            border-radius: 5px;
            height: 28px;
            width: 160px;
            padding-left: 10px;
            border: solid 1px #cccccc;
        }
        h3{
            font-size: 1.25rem;
        }
        .btn3{
            background: #00000000;
            color: #409eff;
            font-weight: 600;
            padding-top: 18px;
         }
    </style>
</head>
<body>
<div class="page">

    <section>
        <div class="container-fluid">
            <!-- Page Header-->
            <header>
                <h1 class="h3 display">   </h1>
            </header>
            <div class="row">
                <div class="col-lg-12">
                    <div class="card">
                        <div class="card-header">
                            <h4>退费</h4>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <form action="/getNoPay" method="post">

                                    <div>
                                        <H3>患者信息查询 </H3>
                                    </div>
                                    <div class="item item2">
                                        <span>*</span>病历号:
                                        <input value="010" name="caseNumber" type="text">
                                    </div>
                                    <input type="submit" value="&#xe729; 搜索" class="btn btn2 iconfont"/>
                                    <br>
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
                                    <H3 style="float: left;margin-top:5px">患者交费信息 </H3>
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
                                            <form action="/delPay" method="post">
                                                <input type="submit" value="$ 退费" class="btn btn3 iconfont"/>
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
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </section>
</div>
<!-- JavaScript files-->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/popper.js/umd/popper.min.js"> </script>
<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<script src="js/grasp_mobile_progress_circle-1.0.0.min.js"></script>
<script src="vendor/jquery.cookie/jquery.cookie.js"> </script>
<script src="vendor/chart.js/Chart.min.js"></script>
<script src="vendor/jquery-validation/jquery.validate.min.js"></script>
<script src="vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js"></script>
<script src="js/charts-home.js"></script>
<!-- Main File-->
<script src="js/front.js"></script>
</body>
</html>

