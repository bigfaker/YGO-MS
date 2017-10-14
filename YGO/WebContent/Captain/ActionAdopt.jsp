<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" import="java.sql.*"%>
<%@ page import="entity.Team"%>
<%@ page import="dao.TeamDAO"%>
<%@ page import ="util.DBHelper"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	request.setCharacterEncoding("utf-8");//防止中文乱码
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	   try{conn=DBHelper.getConnection();
	       String TN=request.getParameter("TN");
	       String CN=request.getParameter("CN");
	       String CQQ=request.getParameter("CQQ");
	       String TS=request.getParameter("TS");
	       String Score=request.getParameter("Score");
	       String OP=request.getParameter("OP");
	       String Honor=request.getParameter("Honor");
	       String CL=request.getParameter("CL");
	       String str="'"+TN+"','"+TS+"','"+CN+"','"+CQQ+"','"+Honor+"','"+Score+"','"+CL+"','"+OP+"'";
	       String sq = "delete Teaminfo where TeamSign="+"'"+TS+"';insert into Teaminfo(TeamName,TeamSign,CaptainName,CaptainQQ,Honor,HonorScore,Cleared,Opened)values("+str+");"; 
	       stmt = conn.prepareStatement(sq);
			int temp=stmt.executeUpdate();
			if(temp>0){
				out.println("<script language='javaScript'>alert('保存成功'); window.location.href='Adopt-Team.jsp'; </script>");}
			else
			{
				out.println("<script language='javaScript'>alert('保存失败'); window.location.href='Adopt-Team.jsp'; </script>");
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
