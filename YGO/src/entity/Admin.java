package entity;

//����Ա��½��
public class Admin {
	private int Admin;//����ԱQQ
	private String password;

	public Admin() {

	}
	public Admin(int Admin,String password){
		this.setAdmin(Admin);
		this.setPassword(password);
	}

	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAdmin() {
		return Admin;
	}
	public void setAdmin(int admin) {
		Admin = admin;
	}
	
}
