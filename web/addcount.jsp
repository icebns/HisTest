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
                  <h4>添加用户</h4>
                </div>
                <div class="card-body">
                  <div class="table-responsive">
                    <form action="AddUser" method="post">
				用户昵称： <input type="text" name="userName" class="form-control"/><br/>
				用户密码： <input type="text" name="passwd" class="form-control"/><br/>
				用户级别：
                            <select name="userType" class="form-control">
                                <option value="1">管理员</option>
                                <option value="2">挂号员</option>
                                <option value="3">医生</option>
                            </select>
			      	<input type="submit" value="添加" class="btn btn-primary"/>
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
