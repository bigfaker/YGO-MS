package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import util.DBHelper;

import entity.Banish;

//����������ҵ���߼���
public class BanishDAO {

	// ������е�����������Ϣ
	public ArrayList<Banish> getAllBanishs() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Banish> list = new ArrayList<Banish>(); // ������������
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Banishinfo;"; // SQL���
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Banish Jud = new Banish();
				Jud.setBanishQQ(rs.getInt("BanishQQ"));
				Jud.setBanishName(rs.getString("BanishName"));
				Jud.setRemark(rs.getString("Remark"));
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
	public ArrayList<Banish> getBanishsbyQQ(String QQ) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Banish> list = new ArrayList<Banish>(); // ������������
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Banishinfo where BanishQQ='"+QQ+"';"; // SQL���
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Banish Jud = new Banish();
				Jud.setBanishQQ(rs.getInt("BanishQQ"));
				Jud.setBanishName(rs.getString("BanishName"));
				Jud.setRemark(rs.getString("Remark"));
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
	//���ݶӱ���������������
	public ArrayList<Banish> getBanishsbyTS(String ts) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Banish> list = new ArrayList<Banish>(); // ������������
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Banishinfo where Remark='"+ts+"';"; // SQL���
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Banish Jud = new Banish();
				Jud.setBanishQQ(rs.getInt("BanishQQ"));
				Jud.setBanishName(rs.getString("BanishName"));
				Jud.setRemark(rs.getString("Remark"));
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

	public ArrayList<Banish> getBanishsbyName(String name) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Banish> list = new ArrayList<Banish>(); // ������������
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Banishinfo where BanishName='"+name+"';"; // SQL���
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Banish Jud = new Banish();
				Jud.setBanishQQ(rs.getInt("BanishQQ"));
				Jud.setBanishName(rs.getString("BanishName"));
				Jud.setRemark(rs.getString("Remark"));
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
	public Banish getBanishByQQ(int BanishQQ) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Banish where BanishQQ=?;"; // SQL���
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
		public int deleteByQQ(int BanishQQ) {
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try {
				conn = DBHelper.getConnection();
				String sql = "delete  from Banishinfo where BanishQQ="+"'"+BanishQQ+"'"; // SQL���
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