<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" import="java.sql.*"%>
<%@ page import="entity.Judgment"%>
<%@ page import="dao.JudgmentDAO"%>
<%@ page import ="util.DBHelper"%>
<%request.setCharacterEncoding("utf-8"); %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
request.setCharacterEncoding("utf-8");//防止中文乱码
Connection conn = null;
PreparedStatement stmt = null;
ResultSet rs = null;
   try{conn=DBHelper.getConnection();
       String JudQQ=request.getParameter("JudQQ");
       String JudName=request.getParameter("JudName");
       String TS=request.getParameter("TS");
			String sq = "delete Judgmentinfo where JudgmentQQ="+"'"+JudQQ+"';insert into Judgmentinfo(JudgmentQQ,JudgmentName,TeamSign)values('"+JudQQ+"','"+JudName+"','"+TS+"');"; // SQL语句
			stmt = conn.prepareStatement(sq);
			int temp=stmt.executeUpdate();
			if(temp>0){
				out.println("<script language='javaScript'>alert('更新成功'); window.location.href='Alert-Judgment.jsp'; </script>");}
			else
			{
				out.println("<script language='javaScript'>alert('更新失败'); window.location.href='Alert-Judgment.jsp'; </script>");
			}
			}catch(Exception ex){ex.printStackTrace();}
   finally{
	// 释放数据集对象
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
   %>		
				
			
			