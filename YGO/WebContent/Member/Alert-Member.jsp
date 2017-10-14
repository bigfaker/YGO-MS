<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ page import="entity.Member"%>
<%@ page import="dao.MemberDAO"%>
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

    <title>Member</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/dashboard.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="js/ie-emulation-modes-warning.js"></script>
     <script src="js/Calendar3.js"></script>
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

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
            <li><a href="../Team/Team.jsp">Team</a></li>
            <li class="active"><a href="../Member/Member.jsp">Member</a></li>

          </ul> 

          
         
        </div>
      </div>
    </nav>

    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
            <li><a href="Member.jsp">Member List</a></li>

          </ul>
          <ul class="nav nav-sidebar">
            <li><a href="Add-Member.jsp">Add Member List</a></li>
          </ul>
          <ul class="nav nav-sidebar">
            <li><a href="Delete-Member.jsp">Delete Member List</a></li>
          </ul>
          
        <ul class="nav nav-sidebar">
            <li class="active"><a href="Alert-Member.jsp">Alert Member List</a></li>
          </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">


 
          <h2 class="sub-header">Member List</h2>
          <div class="table-responsive">
              <table class="table table-striped">
              <thead>
                 <tr>
                  <th>No.</th>
                  <th>Member QQ</th>
                  <th>Member Name</th>
                  <th>Member Duty</th>
                  <th>Team Name</th>
                  <th>Team Sign</th>
                  <th>JoinTime</th>
                  <th>Alert</th>
                  
                </tr>
              </thead>
             <tbody></tbody></table>
                     <!-- 循环开始 -->
           <%
               MemberDAO MemberDao = new MemberDAO(); 
               ArrayList<Member> list = MemberDao.getAllMembers();
               if(list!=null&&list.size()>0)
               {
	               for(int i=0;i<list.size();i++)
	               {
	                  Member jud = list.get(i);
           %>
           <form action="ActionAlert.jsp" method="post"><table class="table table-striped">
           <tr>
                  <td><%=1001+i%></td>
                  <td><input type="text" style="border:0px;" readonly="true" size=10 name=<%="JudQQ" %> value='<%=jud.getMemberQQ() %>'></td>
                  <td><input type="text" style="border:0px;" size=15 name=<%="JudName"%> value='<%=jud.getMemberName() %>'></td>
                  <td><select class="form-control" name="DT">
						<option value="队长">队长</option>
						<option value="队员">队员</option>
					
					</select> </td>
				  <td><input type="text" style="border:0px;" size=10 name=<%="TN"%> value='<%=jud.getTeamName() %>'></td>
                  <td><input type="text" style="border:0px;" size=10 name=<%="TS"%> value='<%=jud.getTeamSign() %>'></td>
                  <td><input type="text" style="border:0px;" size=10 onclick="new Calendar().show(this);" readonly="readonly" name=<%="JD"%> value='<%=jud.getJoinTime() %>'></td>
                  <td><input type="submit" size=3 value="Alert"></td>                

           </tr></table>
                </form>
          <%
	               }
              } 
          %>  
          </div>
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