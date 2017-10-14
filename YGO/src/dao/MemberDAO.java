package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DBHelper;

import entity.Member;

//队员信息的业务逻辑类
public class MemberDAO {

	// 获得所有的队员信息
	public ArrayList<Member> getAllMembers() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Member> list = new ArrayList<Member>(); // 驱逐名单集合
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Memberinfo;"; // SQL语句
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
	//根据传入的QQ号获得队员集合
	public ArrayList<Member> getMembersbyQQ(String QQ) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Member> list = new ArrayList<Member>(); // 驱逐名单集合
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Memberinfo where MemberQQ='"+QQ+"';"; // SQL语句
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
	

	public ArrayList<Member> getMembersbyName(String name) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Member> list = new ArrayList<Member>(); // 集合
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Memberinfo where MemberName='"+name+"';"; // SQL语句
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
	public ArrayList<Member> getMembersbyTS(String ts) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Member> list = new ArrayList<Member>(); // 集合
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Memberinfo where TeamSign='"+ts+"';"; // SQL语句
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
	// 根据Q获得驱逐名单资料
	public Member getMemberByQQ(int MemberQQ) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection();
			String sql = "select * from Memberinfo where MemberQQ='"+MemberQQ+"'"; // SQL语句
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
		public int deleteByQQ(int MemberQQ) {
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try {
				conn = DBHelper.getConnection();
				String sql = "delete  from Memberinfo where MemberQQ="+"'"+MemberQQ+"'"; // SQL语句
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