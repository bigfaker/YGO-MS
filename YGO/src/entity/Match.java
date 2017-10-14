package entity;

import java.util.Date;

public class Match {
	private int Matchid;
	private String MatchName;
	private Date MatchDate;
	private String MatchRemark;
	private int MatchQQgroup;
	private String MajorJudgmentName;
	private String GroupJudgmentName;
	private int MajorJudgmentQQ;
	private int GroupJudgmentQQ;
	private String AllowedTeamSign;
	private int MatchPopulation;
	private int PermitMemberQQ;
	private String PermitMerberName;

	public int getMatchid() {
		return Matchid;
	}

	public void setMatchid(int matchid) {
		Matchid = matchid;
	}

	public String getMatchName() {
		return MatchName;
	}

	public void setMatchName(String matchName) {
		MatchName = matchName;
	}

	public Date getMatchDate() {
		return MatchDate;
	}

	public void setMatchDate(Date matchDate) {
		MatchDate = matchDate;
	}

	public String getMatchRemark() {
		return MatchRemark;
	}

	public void setMatchRemark(String matchRemark) {
		MatchRemark = matchRemark;
	}

	public int getMatchQQgroup() {
		return MatchQQgroup;
	}

	public void setMatchQQgroup(int matchQQgroup) {
		MatchQQgroup = matchQQgroup;
	}

	public String getMajorJudgmentName() {
		return MajorJudgmentName;
	}

	public void setMajorJudgmentName(String majorJudgmentName) {
		MajorJudgmentName = majorJudgmentName;
	}

	public String getGroupJudgmentName() {
		return GroupJudgmentName;
	}

	public void setGroupJudgmentName(String groupJudgmentName) {
		GroupJudgmentName = groupJudgmentName;
	}

	public int getMajorJudgmentQQ() {
		return MajorJudgmentQQ;
	}

	public void setMajorJudgmentQQ(int majorJudgmentQQ) {
		MajorJudgmentQQ = majorJudgmentQQ;
	}

	public int getGroupJudgmentQQ() {
		return GroupJudgmentQQ;
	}

	public void setGroupJudgmentQQ(int groupJudgmentQQ) {
		GroupJudgmentQQ = groupJudgmentQQ;
	}

	public String getAllowedTeamSign() {
		return AllowedTeamSign;
	}

	public void setAllowedTeamSign(String allowedTeamSign) {
		AllowedTeamSign = allowedTeamSign;
	}

	public int getMatchPopulation() {
		return MatchPopulation;
	}

	public void setMatchPopulation(int matchPopulation) {
		MatchPopulation = matchPopulation;
	}

	public int getPermitMemberQQ() {
		return PermitMemberQQ;
	}

	public void setPermitMemberQQ(int permitMemberQQ) {
		PermitMemberQQ = permitMemberQQ;
	}

	public String getPermitMerberName() {
		return PermitMerberName;
	}

	public void setPermitMerberName(String permitMerberName) {
		PermitMerberName = permitMerberName;
	}
}
