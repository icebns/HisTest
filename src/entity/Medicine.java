package entity;

public class Medicine {
	private int mid;
	private String mname;
	private String msort;
	private String mshop;
	private int mcount;
	private int mprice;
	private String mdesc;
	private String mphoto;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMsort() {
		return msort;
	}
	public void setMsort(String msort) {
		this.msort = msort;
	}
	public String getMshop() {
		return mshop;
	}
	public void setMshop(String mshop) {
		this.mshop = mshop;
	}
	public int getMcount() {
		return mcount;
	}
	public void setMcount(int mcount) {
		this.mcount = mcount;
	}
	public int getMprice() {
		return mprice;
	}
	public void setMprice(int mprice) {
		this.mprice = mprice;
	}
	public String getMdesc() {
		return mdesc;
	}
	public void setMdesc(String mdesc) {
		this.mdesc = mdesc;
	}
	public String getMphoto() {
		return mphoto;
	}
	public void setMphoto(String mphoto) {
		this.mphoto = mphoto;
	}
	public Medicine(int mid, String mname, String msort, String mshop,
			int mcount, int mprice, String mdesc, String mphoto) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.msort = msort;
		this.mshop = mshop;
		this.mcount = mcount;
		this.mprice = mprice;
		this.mdesc = mdesc;
		this.mphoto = mphoto;
	}
	
	public Medicine(int mid, int mcount) {
		super();
		this.mid = mid;
		this.mcount = mcount;
	}
	
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Medicine{" +
				"mid=" + mid +
				", mname='" + mname + '\'' +
				", msort='" + msort + '\'' +
				", mshop='" + mshop + '\'' +
				", mcount=" + mcount +
				", mprice=" + mprice +
				", mdesc='" + mdesc + '\'' +
				", mphoto='" + mphoto + '\'' +
				'}';
	}
}
