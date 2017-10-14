<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ page import="entity.Login"%>
<%@ page import="dao.LoginDAO"%>
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
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>YGOCORE&mdash; Captain Manage </title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Template by FREEHTML5" />
	<meta name="keywords" content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />
	

  

  	<!-- Facebook and Twitter integration -->
	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />

	<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
	<link rel="shortcut icon" href="favicon.ico">

	<!-- <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'> -->
	
	<!-- Animate.css -->
	<link rel="stylesheet" href="css/animate.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="css/icomoon.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="css/bootstrap.css">
	<!-- Superfish -->
	<link rel="stylesheet" href="css/superfish.css">

	<link rel="stylesheet" href="css/style.css">


	<!-- Modernizr JS -->
	<script src="js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

	</head>
	
	<style type="text/css">
		#a1{
			margin: 0px 0px 0px 350px;
		}
	</style>
	<body>
		<div id="fh5co-wrapper">
		<div id="fh5co-page">
		<div id="fh5co-header">
			<header id="fh5co-header-section">
				<div class="container">
					<div class="nav-header">
						<a href="" class="js-fh5co-nav-toggle fh5co-nav-toggle"><i></i></a>
						<h1 id="fh5co-logo"><a href="../Signin/Signin.jsp">Yu-Gi-Oh!</a></h1>
						<!-- START #fh5co-menu-wrap -->
						<nav id="fh5co-menu-wrap" role="navigation">
							<ul class="sf-menu" id="fh5co-primary-menu">
								<li class="active">
									<a href="Home.html">Home</a>
								</li>
								<li>
									<a href=""  class="fh5co-sub-ddown">Team
									</a>
									<ul class="fh5co-sub-menu">
										<li><a href="Adopt-Team.jsp" target="_blank">Team Manage</a></li>
										<li><a href="Member/Member.jsp" target="_blank">Member Manage</a></li>
										<li><a href="Alert-Login.jsp" target="_blank">Account Manage</a></li>
									</ul>
								</li>
								<li>
									<a href="#" class="fh5co-sub-ddown">Judgment</a>
									 <ul class="fh5co-sub-menu">
										<li><a href="Judgment.jsp">Judgment List</a></li>
									</ul>
								</li>
								<li><a href="">BlackList</a>
									<ul class="fh5co-sub-menu">
												<li><a href="Banish.jsp" target="_blank">Banish List</a></li>
												<li><a href="Suspend.jsp" target="_blank">Suspend List</a></li>
											</ul>
								</li>
								<div id="a1">
									
								
																<li class="active">
									<a href="../Signin/Signin.jsp">Log out</a>
								</li>
								</div>
							</ul>
						</nav>
					</div>
				</div>
			</header>
			
		</div>
		
		
		<div class="fh5co-hero">
			<div class="fh5co-overlay"></div>
			<div class="fh5co-cover text-center" data-stellar-background-ratio="0.5" style="background-image: url(images/cover_bg_1.jpg);">
				<div class="desc animate-box"><%
				if(session.getAttribute("password")!=null){
				int QQ=Integer.parseInt((session.getAttribute("name")).toString());
				MemberDAO MemberDao=new MemberDAO();
				Member Mb=new Member();
				Mb=MemberDao.getMemberByQQ(QQ);
				%>
					<h2>Hello,<%=Mb.getMemberName()%></h2>
					<h2>The World Belongs to you.</h2><%
				session.setAttribute("TeamSign", Mb.getTeamSign());	
				session.setAttribute("TeamName",Mb.getTeamName() );
				} %>
					<!-- <span>Lovely Crafted by <a href="#" target="_blank" class="fh5co-site-name">FREEHTML5.co</a></span> -->
					<span><a class="btn btn-primary btn-lg" href="#">Go to the BBS</a></span>
				</div>
			</div>

		</div>


	
        <div class="copyrights">Collect from <a href="http://www.cssmoban.com/" ></a></div>


		<div class="fh5co-section">
			<div class="container">
				<div class="row">
					<div class="col-md-6 fh5co-news">
						<h3>News</h3>
						<ul>
							<li>
								<a href="#">
									<span class="fh5co-date">DEC,30,2016</span>
									<h3>2017.1.1卡表变更情况</h3>
									<p>震惊！几大元老级的卡出狱，能否撼动坏境中十二兽霸主的地位？</p>
								</a>
							</li>
							<li>
								<a href="#">
									<span class="fh5co-date">DEC. 30, 2016</span>
									<h3>决斗都市强势进入YGOCORE联盟</h3>
									<p>决斗者们，你们做好准备了吗！</p>
								</a>
							</li>
							<li>
								<a href="#">
									<span class="fh5co-date">Sep. 10, 2016</span>
									<h3>Newly done Bridge of London</h3>
									<p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Accusamus reprehenderit!</p>
								</a>
							</li>
						</ul>
					</div>
					<div class="col-md-6 fh5co-testimonial">
						<img src="images/img21.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co" class="img-responsive mb20">
						<img src="images/img22.jpg" alt="Free HTML5 Bootstrap Template by FreeHTML5.co" class="img-responsive">
					</div>
				</div>
			</div>
		</div>
		
		<footer>
			<div id="footer">
				<div class="container">
					<div class="row">
						<div class="col-md-6 col-md-offset-3 text-center">
							<p class="fh5co-social-icons">
								<a href="#"><i class="icon-twitter2"></i></a>
								<a href="#"><i class="icon-facebook2"></i></a>
								<a href="#"><i class="icon-instagram"></i></a>
								<a href="#"><i class="icon-dribbble2"></i></a>
								<a href="#"><i class="icon-youtube"></i></a>
							</p>
							<p>Gods in his heaven,all's rights with the world. <br>Created By Xx1 &amp; Paopao</a>. All Rights Reserved.
						</div>
					</div>
				</div>
			</div>
		</footer>
	

	</div>
	<!-- END fh5co-page -->

	</div>
	<!-- END fh5co-wrapper -->

	<!-- jQuery -->


	<script src="js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Stellar -->
	<script src="js/jquery.stellar.min.js"></script>
	<!-- Superfish -->
	<script src="js/hoverIntent.js"></script>
	<script src="js/superfish.js"></script>

	<!-- Main JS -->
	<script src="js/main.js"></script>

	</body>
</html>

