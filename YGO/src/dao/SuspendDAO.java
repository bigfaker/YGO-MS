package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DBHelper;

import entity.Suspend;

//����������ҵ���߼���
public class SuspendDAO {

	// ������е�����������Ϣ
	public ArrayList<Suspend> getAllSuspends() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Suspend> list = new ArrayList<Suspend>(); // ������������
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Suspendinfo;"; // SQL���
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Suspend Jud = new Suspend();
				Jud.setSuspendQQ(rs.getInt("SuspendQQ"));
				Jud.setSuspendName(rs.getString("SuspendName"));
				Jud.setRemark(rs.getString("Remark"));
				Jud.setDate(rs.getDate("DeblockingDate"));
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
	public ArrayList<Suspend> getSuspendsbyQQ(String QQ) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Suspend> list = new ArrayList<Suspend>(); // ������������
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Suspendinfo where SuspendQQ='"+QQ+"';"; // SQL���
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Suspend Jud = new Suspend();
				Jud.setSuspendQQ(rs.getInt("SuspendQQ"));
				Jud.setSuspendName(rs.getString("SuspendName"));
				Jud.setRemark(rs.getString("Remark"));
				Jud.setDate(rs.getDate("DeblockingDate"));
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
	

	public ArrayList<Suspend> getSuspendsbyName(String name) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Suspend> list = new ArrayList<Suspend>(); // ������������
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Suspendinfo where SuspendName='"+name+"';"; // SQL���
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Suspend Jud = new Suspend();
				Jud.setSuspendQQ(rs.getInt("SuspendQQ"));
				Jud.setSuspendName(rs.getString("SuspendName"));
				Jud.setRemark(rs.getString("Remark"));
				Jud.setDate(rs.getDate("DeblockingDate"));
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
	public Suspend getSuspendByQQ(int SuspendQQ) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Suspend where SuspendQQ=?;"; // SQL���
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
		public int deleteByQQ(int SuspendQQ) {
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try {
				conn = DBHelper.getConnection();
				String sql = "delete  from Suspendinfo where SuspendQQ="+"'"+SuspendQQ+"'"; // SQL���
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