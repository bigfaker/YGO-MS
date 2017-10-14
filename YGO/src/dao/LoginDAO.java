package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DBHelper;

import entity.Login;

//驱逐名单的业务逻辑类
public class LoginDAO {

	// 获得所有的驱逐名单信息
	public ArrayList<Login> getAllLogins() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Login> list = new ArrayList<Login>(); // 队长登陆名单集合
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Logininfo;"; // SQL语句
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Login Jud = new Login();
				Jud.setCaptainQQ(rs.getInt("CaptainQQ"));
				Jud.setPassword(rs.getString("password"));
				
				list.add(Jud);// 把一个队长登陆账号加入集合
				
			}
			return list; // 返回集合。
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		} finally {
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
			}
		}

	}
	//根据传入的CaptainQQ号获得队长账号集合
	public ArrayList<Login> getLoginsbyQQ(String QQ) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Login> list = new ArrayList<Login>(); // 驱逐名单集合
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Logininfo where CaptainQQ='"+QQ+"';"; // SQL语句
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Login Jud = new Login();
				Jud.setCaptainQQ(rs.getInt("CaptainQQ"));
				Jud.setPassword(rs.getString("Password"));
				
				list.add(Jud);// 把一个驱逐名单加入集合
				
			}
			return list; // 返回集合。
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		} finally {
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
			}
		}

	}
	
	
	
		//根据传入的队长QQ进行删除操作
		public int deleteByQQ(int Login) {
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try {
				conn = DBHelper.getConnection();
				String sql = "delete  from Logininfo where CaptainQQ="+"'"+Login+"'"; // SQL语句
				stmt = conn.prepareStatement(sql);
				int temp = stmt.executeUpdate();return temp;
				/*while (rs.next()) {
					Login Jud = new Login();
					Jud.setLoginQQ(rs.getInt("LoginQQ"));
					Jud.setLoginName(rs.getString("LoginName"));
					Jud.setRemark(rs.getString("Remark"));
					return Jud;
				} else {
					return null;
				}*/

			} catch (Exception ex) {
				ex.printStackTrace();
				return 0;
			} finally {
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
				}

			}	
		}}