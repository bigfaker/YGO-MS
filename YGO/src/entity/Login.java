package entity;

//�ӳ���½��
public class Login {
	private int CaptainQQ;//�ӳ�QQ
	private String password;

	public Login() {

	}
	public Login(int CaptainQQ,String password){
		this.CaptainQQ=CaptainQQ;
		this.setPassword(password);
	}

	public int getCaptainQQ() {
		return CaptainQQ;
	}

	public void setCaptainQQ(int judgementQQ) {
		CaptainQQ = judgementQQ;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
