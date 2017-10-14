package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DBHelper;

import entity.Admin;

//驱逐名单的业务逻辑类
public class AdminDAO {

	// 获得所有的驱逐名单信息
	public ArrayList<Admin> getAllAdmins() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Admin> list = new ArrayList<Admin>(); // 驱逐名单集合
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Manageinfo;"; // SQL语句
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Admin Jud = new Admin();
				Jud.setAdmin(rs.getInt("Admin"));
				Jud.setPassword(rs.getString("password"));
				
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
	//根据传入的Admin号获得管理员账号集合
	public ArrayList<Admin> getAdminsbyQQ(String QQ) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Admin> list = new ArrayList<Admin>(); // 驱逐名单集合
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Manageinfo where Admin='"+QQ+"';"; // SQL语句
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Admin Jud = new Admin();
				Jud.setAdmin(rs.getInt("Admin"));
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
	
	
	
		//根据传入的驱逐名单QQ进行删除操作
		public int deleteByQQ(int Admin) {
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try {
				conn = DBHelper.getConnection();
				String sql = "delete  from Manageinfo where Admin="+"'"+Admin+"'"; // SQL语句
				stmt = conn.prepareStatement(sql);
				int temp = stmt.executeUpdate();return temp;
				/*while (rs.next()) {
					Admin Jud = new Admin();
					Jud.setAdminQQ(rs.getInt("AdminQQ"));
					Jud.setAdminName(rs.getString("AdminName"));
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