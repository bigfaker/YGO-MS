package entity;

//≤√≈–¿‡
public class Judgment {
	private int JudgmentQQ;//≤√≈–QQ
	private String JudgmentName;//≤√≈–√˚≥∆
	private String TeamSign;//∂”±Í

	public Judgment() {

	}
	public Judgment(int JudgmentQQ,String JudgmentName,String TeamSign){
		this.JudgmentQQ=JudgmentQQ;
		this.JudgmentName=JudgmentName;
		this.TeamSign=TeamSign;
	}

	public int getJudgmentQQ() {
		return JudgmentQQ;
	}

	public void setJudgmentQQ(int judgementQQ) {
		JudgmentQQ = judgementQQ;
	}

	public String getJudgmentName() {
		return JudgmentName;
	}

	public void setJudgmentName(String judgmentName) {
		JudgmentName = judgmentName;
	}

	public String getTeamSign() {
		return TeamSign;
	}

	public void setTeamSign(String teamSign) {
		TeamSign = teamSign;
	}
}
