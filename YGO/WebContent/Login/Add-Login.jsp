<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ page import="entity.Login"%>
<%@ page import="dao.LoginDAO"%>

<%@ page import="entity.Admin"%>
<%@ page import="dao.AdminDAO"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
if((session.getAttribute("password")==null)){
%><script>
alert("非法登陆");
location.href="http://localhost:8080/YGO/Starter/Starter.htm"
</script>
<%} %>
<!DOCTYPE html>
<html lang="en"><head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="http://v3.bootcss.com/favicon.ico">
    <title>Login</title>
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/dashboard.css" rel="stylesheet">
    <script src="js/ie-emulation-modes-warning.js"></script>
  </head>
  
<style type="text/css">
            	
#s1{
	       height:30px;
	       width:100px; 
            margin:0px 0px 0px 1420px;
            ï½
</style>
  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="../Manage/Manage.htm">Yu-Gi-Oh!</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
        <ul class="nav navbar-nav navbar-right">
           

          </ul>
         
        </div>
      </div>
    </nav>

    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
            <li><a href="Login.jsp">Account List</a></li>

          </ul>
          <ul class="nav nav-sidebar">
            <li class="active"><a href="Add-Login.jsp">Add Account List</a></li>
          </ul>
          <ul class="nav nav-sidebar">
            <li><a href="Delete-Login.jsp">Delete Account List</a></li>
          </ul>
          
        <ul class="nav nav-sidebar">
            <li><a href="Alert-Login.jsp">Alert Account List</a></li>
          </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">


 <form action="ActionAdd.jsp" method=post role="form">
          <h2 class="sub-header">CaptainQQ List</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead> <tr>
                  <th>No.</th>
                  <th>CaptainQQ</th>
                  <th>Password</th>
                  
                </tr>
              </thead>
              <tbody>
                <!-- 驱逐循环开始 -->
           <%
               LoginDAO LoginDao = new LoginDAO(); 
               ArrayList<Login> list = LoginDao.getAllLogins();
               if(list!=null&&list.size()>0)
               {
	               for(int i=0;i<list.size();i++)
	               {
	                  Login jud = list.get(i);
           %>   
                <tr>
                  <td><%=1001+i%></td>
                  <td><%=jud.getCaptainQQ() %></td>
                  <td><%=jud.getPassword() %></td>
                  
                </tr>
                
          <%
	               }
              } 
          %> 
          
                <tr >
                	<td><input  type="submit" value="ADD"  name="ifAll" size=5></td>
                	<td><input  type="text" size=15 name=JudQQ></td>
                	<td><input  type="text" size=15 name=JudName></td>
                	
                </tr>
               
              </tbody>
            </table></div></form>
         
         <form action="ActionAdd1.jsp" method=post role="form">
         <h2 class="sub-header">Admin List</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>No.</th>
                  <th>Admin</th>
                  <th>password</th>
                </tr>
              </thead>
              <tbody>
              <!-- 获取队长登陆账号循环开始 -->
           <%
               AdminDAO AdminDao = new AdminDAO(); 
               ArrayList<Admin> list1 = AdminDao.getAllAdmins();
               if(list!=null&&list1.size()>0)
               {
	               for(int i=0;i<list1.size();i++)
	               {
	                 Admin ad = list1.get(i);
           %>   
                <tr>
                  <td><%=1001+i%></td>
                  <td><%=ad.getAdmin() %></td>
                  <td><%=ad.getPassword() %></td>
                  
                </tr>
                
          <%
	               }
              } 
          %> 
            <tr >
                	<td><input  type="submit" value="ADD"  name="ifAll" size=5></td>
                	<td><input  type="text" size=15 name=Ad></td>
                	<td><input  type="text" size=15 name=pa></td>
                	
                </tr>
                </tbody></table></div></form>
          </div>
        </div>
      </div>  

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.js"></script>
    <script src="js/docs.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/ie10-viewport-bug-workaround.js"></script>
  

<div data-original-title="Copy to clipboard" title="" style="position: absolute; left: 0px; top: -9999px; width: 15px; height: 15px; z-index: 999999999;" class="global-zeroclipboard-container" id="global-zeroclipboard-html-bridge">      <object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" id="global-zeroclipboard-flash-bridge" height="100%" width="100%">         <param name="movie" value="/assets/flash/ZeroClipboard.swf?noCache=1482998943554">         <param name="allowScriptAccess" value="sameDomain">         <param name="scale" value="exactfit">         <param name="loop" value="false">         <param name="menu" value="false">         <param name="quality" value="best">         <param name="bgcolor" value="#ffffff">         <param name="wmode" value="transparent">         <param name="flashvars" value="trustedOrigins=v3.bootcss.com%2C%2F%2Fv3.bootcss.com%2Chttp%3A%2F%2Fv3.bootcss.com">         <embed src="Dashboard%20Template%20for%20Bootstrap_files/ZeroClipboard.swf" loop="false" menu="false" quality="best" bgcolor="#ffffff" name="global-zeroclipboard-flash-bridge" allowscriptaccess="sameDomain" allowfullscreen="false" type="application/x-shockwave-flash" wmode="transparent" pluginspage="http://www.macromedia.com/go/getflashplayer" flashvars="trustedOrigins=v3.bootcss.com%2C%2F%2Fv3.bootcss.com%2Chttp%3A%2F%2Fv3.bootcss.com" scale="exactfit" height="100%" width="100%">                </object></div><svg style="visibility: hidden; position: absolute; top: -100%; left: -100%;" preserveAspectRatio="none" viewBox="0 0 200 200" height="200" width="200" xmlns="http://www.w3.org/2000/svg"><defs></defs><text style="font-weight:bold;font-size:10pt;font-family:Arial, Helvetica, Open Sans, sans-serif;dominant-baseline:middle" y="10" x="0">200x200</text></svg></body></html>