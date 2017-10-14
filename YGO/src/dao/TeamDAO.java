package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DBHelper;

import entity.Team;

//����������ҵ���߼���
public class TeamDAO {

	// ������е�����������Ϣ
	public ArrayList<Team> getAllTeams() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Team> list = new ArrayList<Team>(); // ������������
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Teaminfo;"; // SQL���
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
				list.add(Jud);// ��һ�������������뼯��
				
			}
			return list; // ���ؼ��ϡ�
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		} finally {
			// �ͷ����ݼ�����
			if (rs != null) {
				try {
					rs.close();
					rs = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			// �ͷ�������
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
	//���ݴ����QQ�Ż��������������
	public ArrayList<Team> getTeamsbyTS(String TS) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Team> list = new ArrayList<Team>(); // ������������
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Teaminfo where TeamSign='"+TS+"';"; // SQL���
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
				list.add(Jud);// ��һ�������������뼯��
				
			}
			return list; // ���ؼ��ϡ�
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		} finally {
			// �ͷ����ݼ�����
			if (rs != null) {
				try {
					rs.close();
					rs = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			// �ͷ�������
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
		ArrayList<Team> list = new ArrayList<Team>(); // ������������
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Teaminfo where TeamName='"+name+"';"; // SQL���
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
				list.add(Jud);// ��һ�������������뼯��
				
			}
			return list; // ���ؼ��ϡ�
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		} finally {
			// �ͷ����ݼ�����
			if (rs != null) {
				try {
					rs.close();
					rs = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			// �ͷ�������
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
	// ������������QQ���������������
	public Team getTeamByQQ(int TeamQQ) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Team where TeamQQ=?;"; // SQL���
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
			// �ͷ����ݼ�����
			if (rs != null) {
				try {
					rs.close();
					rs = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			// �ͷ�������
			if (stmt != null) {
				try {
					stmt.close();
					stmt = null;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}}

		}
		//���ݴ������������QQ����ɾ������
		public int deleteByTS(String TeamSign) {
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try {
				conn = DBHelper.getConnection();
				String sql = "delete  from Teaminfo where TeamSign="+"'"+TeamSign+"'"; // SQL���
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
				// �ͷ����ݼ�����
				if (rs != null) {
					try {
						rs.close();
						rs = null;
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				// �ͷ�������
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