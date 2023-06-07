package friends;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Friends {
	private int fid;
	private String fname;
	private String fmailid;
	private String no;
	private Date bdate;
	private String address;
	
	
	public Friends() {
		//super();
		this.fid = 0;
		this.fname = null;
		this.fmailid = null;
		this.no = null;
		this.bdate = null;
		this.address = null;
	}


	public Friends(int fid, String fname, String fmailid, String no, Date date, String address) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.fmailid = fmailid;
		this.no = no;
		this.bdate = date;
		this.address = address;
	}


	public int getFid() {
		return fid;
	}


	public void setFid(int fid) {
		this.fid = fid;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getFmailid() {
		return fmailid;
	}


	public void setFmailid(String fmailid) {
		this.fmailid = fmailid;
	}


	public String getNo() {
		return no;
	}


	public void setNo(String no) {
		this.no = no;
	}


	public Date getBdate() {
		return bdate;
	}


	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		SimpleDateFormat sdt=new SimpleDateFormat("dd/MM/YYYY");	
		String bdt=sdt.format(bdate);
		return "\n\n Friends List -----\n \n fid=" + fid + "\n  fname=" + fname + "\n fmailid=" + fmailid + "\n no=" + no + "\n bdt=" + bdt
				+ "\n address=" + address;
	}
	
	

}
