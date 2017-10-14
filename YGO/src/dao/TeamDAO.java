package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DBHelper;

import entity.Team;

//驱逐名单的业务逻辑类
public class TeamDAO {

	// 获得所有的驱逐名单信息
	public ArrayList<Team> getAllTeams() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Team> list = new ArrayList<Team>(); // 驱逐名单集合
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Teaminfo;"; // SQL语句
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Team Jud = new Team();
				Jud.setTeamName(rs.getString("TeamName"));
				Jud.setTeamSign(rs.getString("TeamSign"));
				Jud.setCaptainName(rs.getString("CaptainName"));
				Jud.setCaptainQQ(rs.getInt("captainQQ"));
				Jud.setHonor(rs.getString("Honor"));
				Jud.setHonorScore(rs.getInt("HonorScore"));
				Jud.setCleared(rs.getString("Cleared"));
				Jud.setOpened(rs.getString("Opened"));
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
	public ArrayList<Team> getTeamsbyTS(String TS) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Team> list = new ArrayList<Team>(); // 驱逐名单集合
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Teaminfo where TeamSign='"+TS+"';"; // SQL语句
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Team Jud = new Team();
				Jud.setTeamName(rs.getString("TeamName"));
				Jud.setTeamSign(rs.getString("TeamSign"));
				Jud.setCaptainName(rs.getString("CaptainName"));
				Jud.setCaptainQQ(rs.getInt("CaptainQQ"));
				Jud.setHonor(rs.getString("Honor"));
				Jud.setHonorScore(rs.getInt("HonorScore"));
				Jud.setCleared(rs.getString("Cleared"));
				Jud.setOpened(rs.getString("Opened"));
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
	

	public ArrayList<Team> getTeamsbyName(String name) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Team> list = new ArrayList<Team>(); // 驱逐名单集合
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Teaminfo where TeamName='"+name+"';"; // SQL语句
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Team Jud = new Team();
				Jud.setTeamName(rs.getString("TeamName"));
				Jud.setTeamSign(rs.getString("TeamSign"));
				Jud.setCaptainName(rs.getString("CaptainName"));
				Jud.setCaptainQQ(rs.getInt("CaptainQQ"));
				Jud.setHonor(rs.getString("Honor"));
				Jud.setHonorScore(rs.getInt("HonorScore"));
				Jud.setCleared(rs.getString("Cleared"));
				Jud.setOpened(rs.getString("Opened"));
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
	public Team getTeamByQQ(int TeamQQ) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Team where TeamQQ=?;"; // SQL语句
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, TeamQQ);
			rs = stmt.executeQuery();
			if (rs.next()) {
				Team Jud = new Team();
				Jud.setTeamName(rs.getString("TeamName"));
				Jud.setTeamSign(rs.getString("TeamSign"));
				Jud.setCaptainName(rs.getString("CaptainName"));
				Jud.setHonor(rs.getString("Honor"));
				Jud.setHonorScore(rs.getInt("HonorScore"));
				Jud.setCleared(rs.getString("Cleared"));
				Jud.setOpened(rs.getString("Opened"));
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
		public int deleteByTS(String TeamSign) {
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try {
				conn = DBHelper.getConnection();
				String sql = "delete  from Teaminfo where TeamSign="+"'"+TeamSign+"'"; // SQL语句
				stmt = conn.prepareStatement(sql);
				int temp = stmt.executeUpdate();return temp;
				/*while (rs.next()) {
					Team Jud = new Team();
					Jud.setTeamQQ(rs.getInt("TeamQQ"));
					Jud.setTeamName(rs.getString("TeamName"));
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