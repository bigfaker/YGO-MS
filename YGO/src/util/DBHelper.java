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
			   System.out.println("���ݿ�����������");
		   }
		   else
		   {
			   System.out.println("���ݿ������쳣��");
		   }
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

    private static final String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";//���ݿ�����
    private static final String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=";//�������ݿ��url��ַ
    private static final String userName = "";//���ݿ���û���
    private static final String userPwd = "";//���ݿ������
		
    private static Connection conn=null;
	static//��̬����鸺���������
	{	
		try {
			Class.forName(driverName);}
	    catch (Exception e) {
			e.printStackTrace();}
	}
		
		//����ģʽ�������ݿ����
		public static Connection getConnection() throws Exception
		{
			if(conn==null)
			{
				conn = DriverManager.getConnection(dbURL, userName, userPwd);
			}
			return conn;}
		}

