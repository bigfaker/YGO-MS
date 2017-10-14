package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import util.DBHelper;

import entity.Banish;

//驱逐名单的业务逻辑类
public class BanishDAO {

	// 获得所有的驱逐名单信息
	public ArrayList<Banish> getAllBanishs() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Banish> list = new ArrayList<Banish>(); // 驱逐名单集合
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Banishinfo;"; // SQL语句
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Banish Jud = new Banish();
				Jud.setBanishQQ(rs.getInt("BanishQQ"));
				Jud.setBanishName(rs.getString("BanishName"));
				Jud.setRemark(rs.getString("Remark"));
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
	//根据传入的QQ号获得驱逐名单集合
	public ArrayList<Banish> getBanishsbyQQ(String QQ) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Banish> list = new ArrayList<Banish>(); // 驱逐名单集合
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Banishinfo where BanishQQ='"+QQ+"';"; // SQL语句
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Banish Jud = new Banish();
				Jud.setBanishQQ(rs.getInt("BanishQQ"));
				Jud.setBanishName(rs.getString("BanishName"));
				Jud.setRemark(rs.getString("Remark"));
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
	//根据队标获得驱逐名单集合
	public ArrayList<Banish> getBanishsbyTS(String ts) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Banish> list = new ArrayList<Banish>(); // 驱逐名单集合
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Banishinfo where Remark='"+ts+"';"; // SQL语句
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Banish Jud = new Banish();
				Jud.setBanishQQ(rs.getInt("BanishQQ"));
				Jud.setBanishName(rs.getString("BanishName"));
				Jud.setRemark(rs.getString("Remark"));
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

	public ArrayList<Banish> getBanishsbyName(String name) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Banish> list = new ArrayList<Banish>(); // 驱逐名单集合
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Banishinfo where BanishName='"+name+"';"; // SQL语句
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Banish Jud = new Banish();
				Jud.setBanishQQ(rs.getInt("BanishQQ"));
				Jud.setBanishName(rs.getString("BanishName"));
				Jud.setRemark(rs.getString("Remark"));
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
	// 根据驱逐名单QQ获得驱逐名单资料
	public Banish getBanishByQQ(int BanishQQ) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Banish where BanishQQ=?;"; // SQL语句
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, BanishQQ);
			rs = stmt.executeQuery();
			if (rs.next()) {
				Banish Jud = new Banish();
				Jud.setBanishQQ(rs.getInt("BanishQQ"));
				Jud.setBanishName(rs.getString("BanishName"));
				Jud.setRemark(rs.getString("Remark"));
				return Jud;
			} else {
				return null;
			}

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
			}}

		}
		//根据传入的驱逐名单QQ进行删除操作
		public int deleteByQQ(int BanishQQ) {
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try {
				conn = DBHelper.getConnection();
				String sql = "delete  from Banishinfo where BanishQQ="+"'"+BanishQQ+"'"; // SQL语句
				stmt = conn.prepareStatement(sql);
				int temp = stmt.executeUpdate();return temp;
				/*while (rs.next()) {
					Banish Jud = new Banish();
					Jud.setBanishQQ(rs.getInt("BanishQQ"));
					Jud.setBanishName(rs.getString("BanishName"));
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