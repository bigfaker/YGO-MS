<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" import="java.sql.*"%>
<%@ page import="entity.Member"%>
<%@ page import="dao.MemberDAO"%>
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
       String TN=request.getParameter("TN");
       String TS=request.getParameter("TS");
       String DT=request.getParameter("DT");
       String JD=request.getParameter("JD");
       
       String sql="";
       if(JudQQ.length()==0||JudQQ.length()>10){out.println("<script language='javaScript'>alert('添加失败,要添加的QQ号不允许为空或不能大于10位'); window.location.href='Add-Member.jsp'; </script>");}
       else
    	   {if(JudName.length()>10){out.println("<script language='javaScript'>alert('昵称不能超过10位哟'); window.location.href='Add-Member.jsp'; </script>");}
    	    else
    	    {String sq = "select * from Memberinfo where MemberQQ="+JudQQ; // SQL语句
			stmt = conn.prepareStatement(sq);
			rs = stmt.executeQuery();
			if(rs.next()){
			out.println("<script language='javaScript'>alert('此人已经被添加请不要重复录入');history.back();</script>");
			}else{
			String vr="'"+JudQQ+"'"+","+"'"+JudName+"'"+",'"+DT+"',"+"'"+TN+"','"+TS+"','"+JD+"'";
		    sql="insert into Memberinfo(MemberQQ,MemberName,MemberDuty,TeamName,TeamSign,JoinTime)values("+vr+")";
			}
			PreparedStatement stmt1 = conn.prepareStatement(sql);
			int temp=stmt1.executeUpdate();
			if(temp>0){
				out.println("<script language='javaScript'>alert('添加成功'); window.location.href='Add-Member.jsp'; </script>");}
			else
			{
				out.println("<script language='javaScript'>alert('添加失败'); window.location.href='Add-Member.jsp'; </script>");
			}}
           
			}}catch(Exception ex){ex.printStackTrace();}
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