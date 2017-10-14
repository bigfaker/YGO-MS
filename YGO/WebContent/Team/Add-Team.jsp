<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%@ page import="entity.Team"%>
<%@ page import="dao.TeamDAO"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
if((session.getAttribute("password")==null)){
%><script>
alert("非法登陆");
location.href="http://localhost:8080/YGO/Starter/Starter.htm"
</script>
<%} %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="http://v3.bootcss.com/favicon.ico">

<title>Add Team</title>

<link href="css/bootstrap.css" rel="stylesheet">

<link href="css/dashboard.css" rel="stylesheet">
<link href="css/white.css" rel="stylesheet">
<link href="css/zclc2.css" rel="stylesheet">
<link href="css/zebra.css" rel="stylesheet">
<script src="js/ie-emulation-modes-warning.js"></script>

</head>

<body>

	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="../Manage/Manage.htm">Yu-Gi-Oh!</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a>Team</a></li>
					<li><a href="../Member/Member.jsp">Member</a></li>

				</ul>
				
			</div>
		</div>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				<ul class="nav nav-sidebar">
					<li><a href="Team.jsp">Check Team</a></li>

				</ul>
				<ul class="nav nav-sidebar">
					<li class="active"><a href="Add-Team.jsp">Add Team</a></li>
				</ul>
				<ul class="nav nav-sidebar">
					<li><a href="Delete-Team.jsp">Delete Team</a></li>
				</ul>
			</div>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main"
					style="padding: 0px 0px 0px 0px; margin-left: 580px;">

					<form action="ActionAdd.jsp" method="post">
						<div class="security-right" style="margin: 50px 774px 0px 0px;">
							<div class="sr-t">

								<span class="tit-b"></span><span class="acc-sec">Team
									Message</span>
							</div>
							<div class="sr-b">
								<ul>
									<li>
										<div class="sb-info">
											<p class="sbi-l">Team Name</p>
											<div class="sbi-m">
												<span><input class="user-id" name="TN" type="text"></span>
											</div>

										</div>
									</li>
									<li>
										<div class="sb-info">
											<p class="sbi-l">Team Sign</p>
											<div class="sbi-m">
												<span><input class="user-id" name="TS"
													 type="text"></span>
											</div>

										</div>
									</li>
									<li>
										<div class="sb-info">
											<p class="sbi-l">Captain Name</p>
											<div class="sbi-m">
												<span><input class="user-id" name="CN" type="text"></span>
											</div>

										</div>
									</li>
									<li>

										<div class="sb-info">
											<p class="sbi-l">Captain QQ</p>
											<div class="sbi-m">
												<span><input class="user-id" name="CQQ" type="text"></span>
											</div>

										</div>
									</li>

									<li>
										<div class="sb-info">
											<p class="sbi-l">Team Honor</p>
											<div class="sbi-m">
												<textarea name="Honor" id="" cols="30" rows="10"
													class="my-sign"></textarea>
											</div>
										</div>
									</li>
									<li>

										<div class="sb-info" style="margin: 80px 0px 0px 0px;">
											<p class="sbi-l">Honor Score</p>
											<div class="sbi-m">
												<span><input class="user-id" name="Score" type="text"></span>
											</div>

										</div>
									</li>

									<li>
										<div class="sb-info">
											<p class="sbi-l">Opened</p>

											<div class="sbi-m">
												<ul class="sex" id="sex_ul">

													<span><input class="user-id" name="OP" type="text"></span>
												</ul>
											</div>
										</div>
									</li>

									<li>
										<div class="sb-info">
											<p class="sbi-l">Cleared</p>
											<div class="sbi-m">
												<textarea name="CL" id="" cols="30" rows="10"
													class="my-sign"></textarea>
											</div>
										</div>
									</li>
									</br>
									<li><input type="submit" id="Save" value="添加"
										style="height: 50px; width: 60px; margin-top: 40px; border-right-style: solid; border-right-width: 0px; margin-left: 660px;" />
									</li>

								</ul>
							</div>
						</div>
					</form>
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


		<div data-original-title="Copy to clipboard" title=""
			style="position: absolute; left: 0px; top: -9999px; width: 15px; height: 15px; z-index: 999999999;"
			class="global-zeroclipboard-container"
			id="global-zeroclipboard-html-bridge">
			<object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000"
				id="global-zeroclipboard-flash-bridge" height="100%" width="100%">
				<param name="movie"
					value="/assets/flash/ZeroClipboard.swf?noCache=1482998943554">
				<param name="allowScriptAccess" value="sameDomain">
				<param name="scale" value="exactfit">
				<param name="loop" value="false">
				<param name="menu" value="false">
				<param name="quality" value="best">
				<param name="bgcolor" value="#ffffff">
				<param name="wmode" value="transparent">
				<param name="flashvars"
					value="trustedOrigins=v3.bootcss.com%2C%2F%2Fv3.bootcss.com%2Chttp%3A%2F%2Fv3.bootcss.com">
				<embed
					src="Dashboard%20Template%20for%20Bootstrap_files/ZeroClipboard.swf"
					loop="false" menu="false" quality="best" bgcolor="#ffffff"
					name="global-zeroclipboard-flash-bridge"
					allowscriptaccess="sameDomain" allowfullscreen="false"
					type="application/x-shockwave-flash" wmode="transparent"
					pluginspage="http://www.macromedia.com/go/getflashplayer"
					flashvars="trustedOrigins=v3.bootcss.com%2C%2F%2Fv3.bootcss.com%2Chttp%3A%2F%2Fv3.bootcss.com"
					scale="exactfit" height="100%" width="100%">
			</object>
		</div>
		<svg
			style="visibility: hidden; position: absolute; top: -100%; left: -100%;"
			preserveAspectRatio="none" viewBox="0 0 200 200" height="200"
			width="200" xmlns="http://www.w3.org/2000/svg">
				<defs></defs>
				<text
				style="font-weight:bold;font-size:10pt;font-family:Arial, Helvetica, Open Sans, sans-serif;dominant-baseline:middle"
				y="10" x="0">200x200</text></svg>
</body>
</html>