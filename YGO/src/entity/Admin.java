package entity;

//管理员登陆类
public class Admin {
	private int Admin;//管理员QQ
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
