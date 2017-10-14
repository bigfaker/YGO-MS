<%@ page language="java" import="java.util.*,java.net.*"
	contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<style type="text/css">
select {
	color: #eee
}

option {
	color: #000;
}
</style>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="http://v3.bootcss.com/favicon.ico">

<title>Signin</title>
<link rel="stylesheet" href="index.css">
<link href="starter-template.css" rel="stylesheet">

<!-- Bootstrap core CSS -->
<link href="bootstrap.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="signin.css" rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="ie-emulation-modes-warning.js"></script>
<script type="text/javascript" src="jquery.js"></script>


<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Yu-Gi-Oh!</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li><a href="http://localhost:8080/YGO/Starter/Starter.htm">Home</a></li>
					<li><a href="#about">About</a></li>
					<li class="active"><a href="#contact">Login</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>



	<div class="headline">



		<h1>
			<a href="https://ygobbs.com/">Yu-Gi-Oh! </a>
		</h1>



		<p>Infomation Manage System</p>



		<p>It has come back</p>



	</div>
	

	<div class="container" style="color: white">
		<form class="form-signin" role="form" action="dologin.jsp"
			method="post">


			<h2>Please Sign in</h2>
			<input class="form-control" placeholder="Captain ID" name="username"
				> <input class="form-control"
				placeholder="Password" type="password" name="password"
				>
			<div class="checkbox">
				<select class="form-control input-sm" name="sel">
					<option value="Captain">我是队长</option>
					<option value="Manage">我不是队长</option>
				</select>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
				in</button>
		</form>

	</div>
	<!-- /container -->


	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="ie10-viewport-bug-workaround.js"></script>
	<audio autoplay="autoplay">
		<source src="20170940ee81fe8d19746f4cb124f3094e2f4b.mp3"
			type="audio/mpeg">
	</audio>



</body>
</html>