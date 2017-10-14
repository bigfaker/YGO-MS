package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import util.DBHelper;

import entity.Judgment;

//���е�ҵ���߼���
public class JudgmentDAO {

	// ������е���Ʒ��Ϣ
	public ArrayList<Judgment> getAllJudgments() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Judgment> list = new ArrayList<Judgment>(); // ���м���
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Judgmentinfo;"; // SQL���
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Judgment Jud = new Judgment();
				Jud.setJudgmentQQ(rs.getInt("JudgmentQQ"));
				Jud.setJudgmentName(rs.getString("JudgmentName"));
				Jud.setTeamSign(rs.getString("TeamSign"));
				list.add(Jud);// ��һ�����м��뼯��
				
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
	//���ݴ����QQ�Ż�ò��м���
	public ArrayList<Judgment> getJudgmentsbyQQ(String QQ) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Judgment> list = new ArrayList<Judgment>(); // ���м���
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Judgmentinfo where JudgmentQQ='"+QQ+"';"; // SQL���
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Judgment Jud = new Judgment();
				Jud.setJudgmentQQ(rs.getInt("JudgmentQQ"));
				Jud.setJudgmentName(rs.getString("JudgmentName"));
				Jud.setTeamSign(rs.getString("TeamSign"));
				list.add(Jud);// ��һ�����м��뼯��
				
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
	//���ݶӱ��ò��м���
	public ArrayList<Judgment> getJudgmentsbyTS(String ts) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Judgment> list = new ArrayList<Judgment>(); // ���м���
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Judgmentinfo where TeamSign='"+ts+"';"; // SQL���
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Judgment Jud = new Judgment();
				Jud.setJudgmentQQ(rs.getInt("JudgmentQQ"));
				Jud.setJudgmentName(rs.getString("JudgmentName"));
				Jud.setTeamSign(rs.getString("TeamSign"));
				list.add(Jud);// ��һ�����м��뼯��
				
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

	public ArrayList<Judgment> getJudgmentsbyName(String name) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Judgment> list = new ArrayList<Judgment>(); // ���м���
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Judgmentinfo where JudgmentName='"+name+"';"; // SQL���
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Judgment Jud = new Judgment();
				Jud.setJudgmentQQ(rs.getInt("JudgmentQQ"));
				Jud.setJudgmentName(rs.getString("JudgmentName"));
				Jud.setTeamSign(rs.getString("TeamSign"));
				list.add(Jud);// ��һ�����м��뼯��
				
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
	// ���ݲ���QQ��ò�������
	public Judgment getJudgmentByQQ(int JudgmentQQ) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Judgment where JudgmentQQ=?;"; // SQL���
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, JudgmentQQ);
			rs = stmt.executeQuery();
			if (rs.next()) {
				Judgment Jud = new Judgment();
				Jud.setJudgmentQQ(rs.getInt("JudgmentQQ"));
				Jud.setJudgmentName(rs.getString("JudgmentName"));
				Jud.setTeamSign(rs.getString("TeamSign"));
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
		//���ݴ���Ĳ���QQ����ɾ������
		public int deleteByQQ(int JudgmentQQ) {
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try {
				conn = DBHelper.getConnection();
				String sql = "delete  from Judgmentinfo where JudgmentQQ="+"'"+JudgmentQQ+"'"; // SQL���
				stmt = conn.prepareStatement(sql);
				int temp = stmt.executeUpdate();return temp;
				/*while (rs.next()) {
					Judgment Jud = new Judgment();
					Jud.setJudgmentQQ(rs.getInt("JudgmentQQ"));
					Jud.setJudgmentName(rs.getString("JudgmentName"));
					Jud.setTeamSign(rs.getString("TeamSign"));
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
	}
	//��ȡ��������ǰ������Ʒ��Ϣ
	/*public ArrayList<Items> getViewList(String list)
	{
		System.out.println("list:"+list);
		ArrayList<Items> itemlist = new ArrayList<Items>();
		int iCount=5; //ÿ�η���ǰ������¼
		if(list!=null&&list.length()>0)
		{
		    String[] arr = list.split(",");
		    System.out.println("arr.length="+arr.length);
		    //�����Ʒ��¼���ڵ���5��
		    if(arr.length>=5)
		    {
		       for(int i=arr.length-1;i>=arr.length-iCount;i--)
		       {
		    	  itemlist.add(getItemsById(Integer.parseInt(arr[i])));  
		       }
		    }
		    else
		    {
		    	for(int i=arr.length-1;i>=0;i--)
		    	{
		    		itemlist.add(getItemsById(Integer.parseInt(arr[i])));
		    	}
		    }
		    return itemlist;
		}
		else
		{
			return null;
		}*/
		
	}


