package entity;

import java.util.Date;

//������
public class Suspend {
	private int SuspendQQ;//����QQ
	private String SuspendName;//��������
	private String Remark;//��ע
	private Date date;//���ʱ��
	public Suspend() {

	}
	public Suspend(int SuspendQQ,String SuspendName,String Remark,Date date){
		this.SuspendQQ=SuspendQQ;
		this.SuspendName=SuspendName;
		this.Remark=Remark;
		this.date=date;
	}
	public int getSuspendQQ() {
		return SuspendQQ;
	}
	public void setSuspendQQ(int SuspendQQ) {
		this.SuspendQQ = SuspendQQ;
	}
	public String getSuspendName() {
		return SuspendName;
	}
	public void setSuspendName(String SuspendName) {
		this.SuspendName = SuspendName;
	}
	public String getRemark() {
		return Remark;
	}
	public void setRemark(String remark) {
		Remark = remark;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}}//��ע
