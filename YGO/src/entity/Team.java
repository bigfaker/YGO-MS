package entity;

public class Team {
	private String TeamName;
	private String TeamSign;
	private String CaptainName;
	private int CaptainQQ;
	private String Honor;
	private int HonorScore;
	private String Cleared;
	private String Opened;

	public Team() {

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

	public String getCaptainName() {
		return CaptainName;
	}

	public void setCaptainName(String captainName) {
		CaptainName = captainName;
	}

	public int getCaptainQQ() {
		return CaptainQQ;
	}

	public void setCaptainQQ(int captainQQ) {
		CaptainQQ = captainQQ;
	}

	public String getHonor() {
		return Honor;
	}

	public void setHonor(String honor) {
		Honor = honor;
	}

	public int getHonorScore() {
		return HonorScore;
	}

	public void setHonorScore(int honorScore) {
		HonorScore = honorScore;
	}

	public String getCleared() {
		return Cleared;
	}

	public void setCleared(String cleared) {
		Cleared = cleared;
	}

	public String getOpened() {
		return Opened;
	}

	public void setOpened(String opened) {
		Opened = opened;
	}

}
