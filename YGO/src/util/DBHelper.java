package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {
	public static void main(String[] args) {
		
		try
		{
		   Connection conn = DBHelper.getConnection();
		   if(conn!=null)
		   {
			   System.out.println("数据库连接正常！");
		   }
		   else
		   {
			   System.out.println("数据库连接异常！");
		   }
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

    private static final String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";//数据库驱动
    private static final String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=";//连接数据库的url地址
    private static final String userName = "";//数据库的用户名
    private static final String userPwd = "";//数据库的密码
		
    private static Connection conn=null;
	static//静态代码块负责加载驱动
	{	
		try {
			Class.forName(driverName);}
	    catch (Exception e) {
			e.printStackTrace();}
	}
		
		//单例模式返回数据库对象
		public static Connection getConnection() throws Exception
		{
			if(conn==null)
			{
				conn = DriverManager.getConnection(dbURL, userName, userPwd);
			}
			return conn;}
		}

