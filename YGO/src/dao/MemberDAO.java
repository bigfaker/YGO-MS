package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DBHelper;

import entity.Member;

//��Ա��Ϣ��ҵ���߼���
public class MemberDAO {

	// ������еĶ�Ա��Ϣ
	public ArrayList<Member> getAllMembers() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Member> list = new ArrayList<Member>(); // ������������
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Memberinfo;"; // SQL���
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Member Jud = new Member();
				Jud.setMemberQQ(rs.getInt("MemberQQ"));
				Jud.setMemberName(rs.getString("MemberName"));
				Jud.setMemberDuty(rs.getString("MemberDuty"));
				Jud.setTeamName(rs.getString("TeamName"));
				Jud.setTeamSign(rs.getString("TeamSign"));
				Jud.setJoinTime(rs.getDate("JoinTime"));
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
	//���ݴ����QQ�Ż�ö�Ա����
	public ArrayList<Member> getMembersbyQQ(String QQ) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Member> list = new ArrayList<Member>(); // ������������
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Memberinfo where MemberQQ='"+QQ+"';"; // SQL���
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Member Jud = new Member();
				Jud.setMemberQQ(rs.getInt("MemberQQ"));
				Jud.setMemberName(rs.getString("MemberName"));
				Jud.setMemberDuty(rs.getString("MemberDuty"));
				Jud.setTeamName(rs.getString("TeamName"));
				Jud.setTeamSign(rs.getString("TeamSign"));
				Jud.setJoinTime(rs.getDate("JoinTime"));
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
	

	public ArrayList<Member> getMembersbyName(String name) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Member> list = new ArrayList<Member>(); // ����
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Memberinfo where MemberName='"+name+"';"; // SQL���
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Member Jud = new Member();
				Jud.setMemberQQ(rs.getInt("MemberQQ"));
				Jud.setMemberName(rs.getString("MemberName"));
				Jud.setMemberDuty(rs.getString("MemberDuty"));
				Jud.setTeamName(rs.getString("TeamName"));
				Jud.setTeamSign(rs.getString("TeamSign"));
				Jud.setJoinTime(rs.getDate("JoinTime"));
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
	public ArrayList<Member> getMembersbyTS(String ts) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Member> list = new ArrayList<Member>(); // ����
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Memberinfo where TeamSign='"+ts+"';"; // SQL���
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Member Jud = new Member();
				Jud.setMemberQQ(rs.getInt("MemberQQ"));
				Jud.setMemberName(rs.getString("MemberName"));
				Jud.setMemberDuty(rs.getString("MemberDuty"));
				Jud.setTeamName(rs.getString("TeamName"));
				Jud.setTeamSign(rs.getString("TeamSign"));
				Jud.setJoinTime(rs.getDate("JoinTime"));
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
	// ����Q���������������
	public Member getMemberByQQ(int MemberQQ) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Memberinfo where MemberQQ='"+MemberQQ+"'"; // SQL���
			stmt = conn.prepareStatement(sql);
			//stmt.setInt(1, MemberQQ);
			rs = stmt.executeQuery();
			if (rs.next()) {
				Member Jud = new Member();
				Jud.setMemberQQ(rs.getInt("MemberQQ"));
				Jud.setMemberName(rs.getString("MemberName"));
				Jud.setMemberDuty(rs.getString("MemberDuty"));
				Jud.setTeamName(rs.getString("TeamName"));
				Jud.setTeamSign(rs.getString("TeamSign"));
				Jud.setJoinTime(rs.getDate("JoinTime"));
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
		public int deleteByQQ(int MemberQQ) {
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try {
				conn = DBHelper.getConnection();
				String sql = "delete  from Memberinfo where MemberQQ="+"'"+MemberQQ+"'"; // SQL���
				stmt = conn.prepareStatement(sql);
				int temp = stmt.executeUpdate();return temp;
				/*while (rs.next()) {
					Member Jud = new Member();
					Jud.setMemberQQ(rs.getInt("MemberQQ"));
					Jud.setMemberName(rs.getString("MemberName"));
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