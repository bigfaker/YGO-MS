package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import util.DBHelper;

import entity.Judgment;

//裁判的业务逻辑类
public class JudgmentDAO {

	// 获得所有的商品信息
	public ArrayList<Judgment> getAllJudgments() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Judgment> list = new ArrayList<Judgment>(); // 裁判集合
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Judgmentinfo;"; // SQL语句
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Judgment Jud = new Judgment();
				Jud.setJudgmentQQ(rs.getInt("JudgmentQQ"));
				Jud.setJudgmentName(rs.getString("JudgmentName"));
				Jud.setTeamSign(rs.getString("TeamSign"));
				list.add(Jud);// 把一个裁判加入集合
				
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
	//根据传入的QQ号获得裁判集合
	public ArrayList<Judgment> getJudgmentsbyQQ(String QQ) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Judgment> list = new ArrayList<Judgment>(); // 裁判集合
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Judgmentinfo where JudgmentQQ='"+QQ+"';"; // SQL语句
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Judgment Jud = new Judgment();
				Jud.setJudgmentQQ(rs.getInt("JudgmentQQ"));
				Jud.setJudgmentName(rs.getString("JudgmentName"));
				Jud.setTeamSign(rs.getString("TeamSign"));
				list.add(Jud);// 把一个裁判加入集合
				
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
	//根据队标获得裁判集合
	public ArrayList<Judgment> getJudgmentsbyTS(String ts) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Judgment> list = new ArrayList<Judgment>(); // 裁判集合
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Judgmentinfo where TeamSign='"+ts+"';"; // SQL语句
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Judgment Jud = new Judgment();
				Jud.setJudgmentQQ(rs.getInt("JudgmentQQ"));
				Jud.setJudgmentName(rs.getString("JudgmentName"));
				Jud.setTeamSign(rs.getString("TeamSign"));
				list.add(Jud);// 把一个裁判加入集合
				
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

	public ArrayList<Judgment> getJudgmentsbyName(String name) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Judgment> list = new ArrayList<Judgment>(); // 裁判集合
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Judgmentinfo where JudgmentName='"+name+"';"; // SQL语句
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Judgment Jud = new Judgment();
				Jud.setJudgmentQQ(rs.getInt("JudgmentQQ"));
				Jud.setJudgmentName(rs.getString("JudgmentName"));
				Jud.setTeamSign(rs.getString("TeamSign"));
				list.add(Jud);// 把一个裁判加入集合
				
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
	// 根据裁判QQ获得裁判资料
	public Judgment getJudgmentByQQ(int JudgmentQQ) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Judgment where JudgmentQQ=?;"; // SQL语句
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
		//根据传入的裁判QQ进行删除操作
		public int deleteByQQ(int JudgmentQQ) {
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try {
				conn = DBHelper.getConnection();
				String sql = "delete  from Judgmentinfo where JudgmentQQ="+"'"+JudgmentQQ+"'"; // SQL语句
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
	//获取最近浏览的前五条商品信息
	/*public ArrayList<Items> getViewList(String list)
	{
		System.out.println("list:"+list);
		ArrayList<Items> itemlist = new ArrayList<Items>();
		int iCount=5; //每次返回前五条记录
		if(list!=null&&list.length()>0)
		{
		    String[] arr = list.split(",");
		    System.out.println("arr.length="+arr.length);
		    //如果商品记录大于等于5条
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


