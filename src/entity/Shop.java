package entity;

public class Shop {
	private int sid;
	private String sname;
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Shop(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
}
