<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" import="java.sql.*"%>
<%@ page import="entity.Login"%>
<%@ page import="entity.Admin"%>
<%@ page import="dao.LoginDAO"%>
<%@ page import="dao.AdminDAO"%>
<%@ page import="util.DBHelper"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String str = request.getParameter("sel");
	request.setCharacterEncoding("utf-8");//防止中文乱码
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	conn=DBHelper.getConnection();
		
		
		if (str.equals("Captain")) {
			
			String sql = "select *from Logininfo where CaptainQQ='" + username + "' and Password='" + password+ "'";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			if (rs.next()) {
				//String strsql = rs.getString(1);
				session.setAttribute("name", username);
				session.setAttribute("password", password);
				//session.setAttribute("groupid", strsql);
				response.sendRedirect("../Captain/Captain.jsp");
			} else {
				out.print(
						"<script language='javaScript'>alert('用户名或密码错误'); window.location.href='Signin.jsp'; </script>");

			}
			if (rs != null) {
				try {
					rs.close();
					rs = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			// 释放语句对象
			if (stmt != null) {
				try {
					stmt.close();
					stmt = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
		if (str.equals("Manage")) {
			String sql = "select *from Manageinfo where Admin='" + username + "'and password='" + password+ "'";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			if (rs.next()) {
				//String strsql = rs.getString(1);
				session.setAttribute("name", username);
				session.setAttribute("password", password);
				//session.setAttribute("groupid", strsql);
				response.sendRedirect("../Manage/Manage.htm");
			} else {
				out.print(
						"<script language='javaScript'>alert('用户名或密码错误'); window.location.href='Signin.jsp'; </script>");
			}
			if (rs != null) {
				try {
					rs.close();
					rs = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			// 释放语句对象
			if (stmt != null) {
				try {
					stmt.close();
					stmt = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}}
		//}
	//} catch (Exception ex) {
		//ex.printStackTrace();
	//} finally {
		//out.println(username+password+str);}
				//"<script language='javaScript'>alert('账号不存在'); window.location.href='Signin.jsp'; </script>");
	//}

	// 释放数据集对象

	//如果用户和密码都等于admin,则登录成功
	/*
	if("x11x11".equals(username)&&"103050a70".equals(password))
	{
	   session.setAttribute("loginUser", username);
	   response.sendRedirect("../Manage/Manage.htm");
	   
	}
	else if("silverbell".equals(username)&&"1260611834".equals(password))
	{
	     session.setAttribute("loginUser", username);
	     response.sendRedirect("../Captain/Captain.html");
	     
	  }
	else
	{
	   response.sendRedirect("login_failure.jsp");
	}*/
%>

