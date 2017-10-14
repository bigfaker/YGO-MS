package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DBHelper;

import entity.Login;

//����������ҵ���߼���
public class LoginDAO {

	// ������е�����������Ϣ
	public ArrayList<Login> getAllLogins() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Login> list = new ArrayList<Login>(); // �ӳ���½��������
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Logininfo;"; // SQL���
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Login Jud = new Login();
				Jud.setCaptainQQ(rs.getInt("CaptainQQ"));
				Jud.setPassword(rs.getString("password"));
				
				list.add(Jud);// ��һ���ӳ���½�˺ż��뼯��
				
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
	//���ݴ����CaptainQQ�Ż�öӳ��˺ż���
	public ArrayList<Login> getLoginsbyQQ(String QQ) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Login> list = new ArrayList<Login>(); // ������������
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Logininfo where CaptainQQ='"+QQ+"';"; // SQL���
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Login Jud = new Login();
				Jud.setCaptainQQ(rs.getInt("CaptainQQ"));
				Jud.setPassword(rs.getString("Password"));
				
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
	
	
	
		//���ݴ���Ķӳ�QQ����ɾ������
		public int deleteByQQ(int Login) {
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try {
				conn = DBHelper.getConnection();
				String sql = "delete  from Logininfo where CaptainQQ="+"'"+Login+"'"; // SQL���
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