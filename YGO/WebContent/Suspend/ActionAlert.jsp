<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" import="java.sql.*"%>
<%@ page import="entity.Suspend"%>
<%@ page import="dao.SuspendDAO"%>
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
       String DT=request.getParameter("DT");
       String sql="";
			String sq = "delete Suspendinfo where SuspendQQ="+"'"+JudQQ+"';insert into Suspendinfo(SuspendQQ,SuspendName,Remark,DeblockingDate)values('"+JudQQ+"','"+JudName+"','"+TS+"','"+DT+"');"; // SQL语句
			stmt = conn.prepareStatement(sq);
			int temp=stmt.executeUpdate();
			if(temp>0){
				out.println("<script language='javaScript'>alert('更新成功'); window.location.href='Alert-Suspend.jsp'; </script>");}
			else
			{
				out.println("<script language='javaScript'>alert('更新失败'); window.location.href='Alert-Suspend.jsp'; </script>");
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
				
			
			