package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DBHelper;

import entity.Suspend;

//驱逐名单的业务逻辑类
public class SuspendDAO {

	// 获得所有的驱逐名单信息
	public ArrayList<Suspend> getAllSuspends() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Suspend> list = new ArrayList<Suspend>(); // 驱逐名单集合
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Suspendinfo;"; // SQL语句
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Suspend Jud = new Suspend();
				Jud.setSuspendQQ(rs.getInt("SuspendQQ"));
				Jud.setSuspendName(rs.getString("SuspendName"));
				Jud.setRemark(rs.getString("Remark"));
				Jud.setDate(rs.getDate("DeblockingDate"));
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
	public ArrayList<Suspend> getSuspendsbyQQ(String QQ) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Suspend> list = new ArrayList<Suspend>(); // 驱逐名单集合
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Suspendinfo where SuspendQQ='"+QQ+"';"; // SQL语句
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Suspend Jud = new Suspend();
				Jud.setSuspendQQ(rs.getInt("SuspendQQ"));
				Jud.setSuspendName(rs.getString("SuspendName"));
				Jud.setRemark(rs.getString("Remark"));
				Jud.setDate(rs.getDate("DeblockingDate"));
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
	

	public ArrayList<Suspend> getSuspendsbyName(String name) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Suspend> list = new ArrayList<Suspend>(); // 驱逐名单集合
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Suspendinfo where SuspendName='"+name+"';"; // SQL语句
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Suspend Jud = new Suspend();
				Jud.setSuspendQQ(rs.getInt("SuspendQQ"));
				Jud.setSuspendName(rs.getString("SuspendName"));
				Jud.setRemark(rs.getString("Remark"));
				Jud.setDate(rs.getDate("DeblockingDate"));
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
	public Suspend getSuspendByQQ(int SuspendQQ) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Suspend where SuspendQQ=?;"; // SQL语句
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, SuspendQQ);
			rs = stmt.executeQuery();
			if (rs.next()) {
				Suspend Jud = new Suspend();
				Jud.setSuspendQQ(rs.getInt("SuspendQQ"));
				Jud.setSuspendName(rs.getString("SuspendName"));
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
		public int deleteByQQ(int SuspendQQ) {
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try {
				conn = DBHelper.getConnection();
				String sql = "delete  from Suspendinfo where SuspendQQ="+"'"+SuspendQQ+"'"; // SQL语句
				stmt = conn.prepareStatement(sql);
				int temp = stmt.executeUpdate();return temp;
				/*while (rs.next()) {
					Suspend Jud = new Suspend();
					Jud.setSuspendQQ(rs.getInt("SuspendQQ"));
					Jud.setSuspendName(rs.getString("SuspendName"));
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