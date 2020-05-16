<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		    padding: 0 0.75rem; 
		}
		.show{
			display: table-row;
		}
		.hid{
			display:none;
		}
        tr th:nth-child(4){
            padding-left: 30px;
        }
        tr td:nth-child(3){
            padding-left: 40px;
        }
	</style>
  </head>
  <body>

           <% 
        int count=0; //总行数
	    int page_count=1;  //开始条数
	    int page_total=4;  //总页码
	    int page_current= 1;  //首页
	    int page_size=5;//一页的行数 
	    String page_cu = request.getParameter("page_current");  
	    if(page_cu==null){  
	       page_cu="1";  
	    }  
	    page_current = Integer.parseInt(page_cu);
	    if(page_current<0){
	       page_current = 1;  
	    } 
	    page_count=page_count+ page_current*page_size; 
                %>  
    	<section id="list1" class="">
        <div class="container-fluid">
          <!-- Page Header-->
          <header> 
            <h1 class="h3 display">  </h1>
          </header>
          <div class="row">
            <div class="col-lg-12">
              <div class="card">
                <div class="card-header">
                  <h4>用户信息</h4>
                </div>
                <div class="card-body">
                  <div class="table-responsive">
                    <table class="table">
                      <thead>
                       	<tr>
                          <th>#</th>
                          <th>用户名</th>
                          <th>激活状态</th>
                          <th>操作</th>
                        </tr>
                      </thead>
                      <tbody> 

			<c:forEach items="${list}"  var="p"  step="1" varStatus="i" 
		            begin="0"  end="4">
					<tr class="show first">
							<td>${p.userId}</td>
							<td>${p.username}</td>
							<td>
                                ${p.delMark }
                            </td>
							<td>
							    <a href="UserDelServlet?userId=${p.userId }">注销</a>
                                <a href="UserOpenServlet?userId=${p.userId }">开启</a>
							</td>
					</tr>
			</c:forEach> 
 
			<tr>
				<td colspan="2" align="center" style="font-size:18px">  
                    <a style="color: #777777;cursor:no-drop;padding:5px" onclick="first()">1</a>  
                    <a style="color: #33b35a;cursor:pointer;padding:5px" onclick="second()">2</a>  
                    <a style="color: #33b35a;cursor:pointer;padding:5px" onclick="thred()">3</a>  
                    <a style="color: #33b35a;cursor:pointer;padding:5px" onclick="last()">4</a>  
                    <a style="color: #33b35a;cursor:pointer;padding:5px" onclick="last()">尾页</a>  
                    	第<%=page_current%> 页/共<%=page_total%> 页
    			</td>
			</tr>  
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
            </div>
			</div>
        </div>
      </section> 
	
		<section id="list2" class="hid">
        <div class="container-fluid">
          <!-- Page Header-->
          <header> 
            <h1 class="h3 display">   </h1>
          </header>
          <div class="row">
            <div class="col-lg-12">
              <div class="card">
                <div class="card-header">
                  <h4>用户信息</h4>
                </div>
                <div class="card-body">
                  <div class="table-responsive">
                    <table class="table">
                      <thead>
                       	<tr>
                          <th>#</th>
                          <th>用户名</th>
                          <th>激活状态</th>
                          <th>操作</th>
                        </tr>
                      </thead>
                      <tbody> 
              
			<c:forEach items="${list}"  var="p"  step="1" varStatus="i" 
		            begin="5"  end="9">
					<tr class="show first">
							<td>${p.userId}</td>
							<td>${p.username}</td>
							<td>${p.delMark }</td>
							<td>
							    <a href="UserDelServlet?userId=${p.userId }">注销</a>
                                <a href="UserOpenServlet?userId=${p.userId }">开启</a>
							</td>
					</tr>
			</c:forEach> 
 
			<tr>
				<td colspan="2" align="center" style="font-size:18px">
					<a style="color: #33b35a;cursor:pointer" onclick="first()">首页</a>  
                   	<a style="color: #33b35a;cursor:pointer;padding:5px" onclick="first()">1</a>  
                    <a style="color: #777777;cursor:no-drop;padding:5px" onclick="second()">2</a>  
                    <a style="color: #33b35a;cursor:pointer;padding:5px" onclick="thred()">3</a>  
                    <a style="color: #33b35a;cursor:pointer;padding:5px" onclick="last()">4</a>  
                    <a style="color: #33b35a;cursor:pointer;padding:5px" onclick="last()">尾页</a>  
                    	第2  页/共<%=page_total%> 页
    			</td>
			</tr>  
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
            </div>
			</div>
        </div>
      </section> 
			
			
	<section id="list3" class="hid">
        <div class="container-fluid">
          <!-- Page Header-->
          <header> 
            <h1 class="h3 display">   </h1>
          </header>
          <div class="row">
            <div class="col-lg-12">
              <div class="card">
                <div class="card-header">
                  <h4>用户信息</h4>
                </div>
                <div class="card-body">
                  <div class="table-responsive">
                    <table class="table">
                      <thead>
                       	<tr>
                          <th>#</th>
                          <th>用户名</th>
                          <th>激活状态</th>
                          <th>操作</th>
                        </tr>
                      </thead>
                      <tbody> 
              
			<c:forEach items="${list}"  var="p"  step="1" varStatus="i" 
		            begin="10"  end="14">
					<tr class="show first">
							<td>${p.userId}</td>
							<td>${p.username}</td>
							<td>${p.delMark }</td>
							<td>
							    <a href="UserDelServlet?userId=${p.userId }">注销</a>
                                <a href="UserOpenServlet?userId=${p.userId }">开启</a>
							</td>
					</tr>
			</c:forEach> 
 
			<tr>
				<td colspan="2" align="center" style="font-size:18px">
					<a style="color: #33b35a;cursor:pointer" onclick="first()">首页</a>  
                   	<a style="color: #33b35a;cursor:pointer;padding:5px" onclick="first()">1</a>  
                    <a style="color: #33b35a;cursor:pointer;padding:5px" onclick="second()">2</a>  
                    <a style="color: #777777;cursor:no-drop;padding:5px" onclick="thred()">3</a>  
                    <a style="color: #33b35a;cursor:pointer;padding:5px" onclick="last()">4</a>  
                    <a style="color: #33b35a;cursor:pointer;padding:5px" onclick="last()">尾页</a>  
                    	第3  页/共<%=page_total%> 页
    			</td>
			</tr>  
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
            </div>
			</div>
        </div>
      </section> 
      
      
      <section id="list4" class="hid">
        <div class="container-fluid">
          <!-- Page Header-->
          <header> 
            <h1 class="h3 display">   </h1>
          </header>
          <div class="row">
            <div class="col-lg-12">
              <div class="card">
                <div class="card-header">
                  <h4>用户信息</h4>
                </div>
                <div class="card-body">
                  <div class="table-responsive">
                    <table class="table">
                      <thead>
                       	<tr>
                          <th>#</th>
                          <th>用户名</th>
                          <th>激活状态</th>
                          <th>操作</th>
                        </tr>
                      </thead>
                      <tbody> 
              
			<c:forEach items="${list}"  var="p"  step="1" varStatus="i" 
		            begin="15"  end="19">
					<tr class="show first">
							<td>${p.userId}</td>
							<td>${p.username}</td>
							<td>${p.delMark }</td>
							<td>
							  <a href="UserDelServlet?userId=${p.userId }">注销</a>
                              <a href="UserOpenServlet?userId=${p.userId }">开启</a>
							</td>
					</tr>
			</c:forEach> 
 
			<tr>
				<td colspan="2" align="center" style="font-size:18px">
					<a style="color: #33b35a;cursor:pointer" onclick="first()">首页</a>  
                   	<a style="color: #33b35a;cursor:pointer;padding:5px" onclick="first()">1</a>  
                    <a style="color: #33b35a;cursor:pointer;padding:5px" onclick="second()">2</a>  
                    <a style="color: #33b35a;cursor:pointer;padding:5px" onclick="thred()">3</a>  
                    <a style="color: #777777;cursor:no-drop;padding:5px" onclick="last()">4</a>   
                    	第4  页/共<%=page_total%> 页
    			</td>
			</tr>  
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
            </div>
			</div>
        </div>
      </section> 
			
			
	<script>
	var in1=document.getElementById("list1"); 
	var in2=document.getElementById("list2"); 
	var in3=document.getElementById("list3"); 
	var in4=document.getElementById("list4"); 
		function first(){ 			
			in1.className="";
			in2.className="hid";
			in3.className="hid";
			in4.className="hid";
		}
		function second(){
			in1.className="hid";
			in2.className="";
			in3.className="hid";
			in4.className="hid";
		}
		function thred(){
			in1.className="hid";
			in2.className="hid";
			in3.className="";
			in4.className="hid";
		}
		function last(){
			in1.className="hid";
			in2.className="hid";
			in3.className="hid";
			in4.className="";
		}
	</script>
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