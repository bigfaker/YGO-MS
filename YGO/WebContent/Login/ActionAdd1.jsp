<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" import="java.sql.*"%>
<%@ page import="entity.Admin"%>
<%@ page import="dao.AdminDAO"%>
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
       String Ad=request.getParameter("Ad");
       String pa=request.getParameter("pa");     
       String sql="";
       if(Ad.length()==0||Ad.length()>10){out.println("<script language='javaScript'>alert('添加失败,要添加的QQ号不允许为空或不能大于10位'); window.location.href='Add-Login.jsp'; </script>");}
       else
    	  
    	    
    	    {String sq = "select * from Manageinfo where Admin="+Ad; // SQL语句
			stmt = conn.prepareStatement(sq);
			rs = stmt.executeQuery();
			if(rs.next()){
			out.println("<script language='javaScript'>alert('此人已经被添加请不要重复录入');history.back();</script>");
			}else{
			String vr="'"+Ad+"'"+","+"'"+pa+"'";
		    sql="insert into Manageinfo(Admin,password)values("+vr+")";
			}
			PreparedStatement stmt1 = conn.prepareStatement(sql);
			int temp=stmt1.executeUpdate();
			if(temp>0){
				out.println("<script language='javaScript'>alert('添加成功'); window.location.href='Add-Login.jsp'; </script>");}
			else
			{
				out.println("<script language='javaScript'>alert('添加失败'); window.location.href='Add-Login.jsp'; </script>");
			}}
           
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