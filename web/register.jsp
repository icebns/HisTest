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
            margin: 1% 0;
            width: 80px;
            line-height: 2px;
        }
        input :hover{
            color: #FFFFFF;
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
                            <h4>现场挂号</h4>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <form action="putData" method="post">
                                    <div>
                                        <span>*</span>发票号：<input value="123" name="id" type="text" id="fph">
                                        <input type="submit" value="&#xe607; 挂号" class="btn iconfont" style="width: ;"/>
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

