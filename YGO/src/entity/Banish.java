package entity;

//������
public class Banish {
	private int BanishQQ;//����QQ
	private String BanishName;//��������
	private String Remark;
	public Banish() {

	}
	public Banish(int BanishQQ,String BanishName,String Remark){
		this.BanishQQ=BanishQQ;
		this.BanishName=BanishName;
		this.Remark=Remark;
	}
	public int getBanishQQ() {
		return BanishQQ;
	}
	public void setBanishQQ(int banishQQ) {
		BanishQQ = banishQQ;
	}
	public String getBanishName() {
		return BanishName;
	}
	public void setBanishName(String banishName) {
		BanishName = banishName;
	}
	public String getRemark() {
		return Remark;
	}
	public void setRemark(String remark) {
		Remark = remark;
	}}//��ע

