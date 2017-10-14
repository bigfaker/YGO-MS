package entity;

import java.util.Date;

public class Member {
	private int MemberQQ;
	private String MemberName;
	private String MemberDuty;
	private String TeamName;
	private String TeamSign;
	private Date JoinTime;

	public Member(){
		
	}
	public Member(int MemberQQ,String MemberName,String MemberDuty,String TeamName,String TeamSign,Date JoinTime){
		this.MemberQQ=MemberQQ;
		this.MemberName=MemberName;
		this.MemberDuty=MemberDuty;
		this.TeamName=TeamName;
		this.TeamSign=TeamSign;
		this.JoinTime=JoinTime;
	}
	public int getMemberQQ() {
		return MemberQQ;
	}

	public void setMemberQQ(int memeberQQ) {
		MemberQQ = memeberQQ;
	}

	public String getMemberName() {
		return MemberName;
	}

	public void setMemberName(String memberName) {
		MemberName = memberName;
	}

	public String getMemberDuty() {
		return MemberDuty;
	}

	public void setMemberDuty(String memberDuty) {
		MemberDuty = memberDuty;
	}

	public String getTeamName() {
		return TeamName;
	}

	public void setTeamName(String teamName) {
		TeamName = teamName;
	}

	public String getTeamSign() {
		return TeamSign;
	}

	public void setTeamSign(String teamSign) {
		TeamSign = teamSign;
	}

	public Date getJoinTime() {
		return JoinTime;
	}

	public void setJoinTime(Date joinTime) {
		JoinTime = joinTime;
	}
}
