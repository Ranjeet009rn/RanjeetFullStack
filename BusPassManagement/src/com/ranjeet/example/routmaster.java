package com.ranjeet.example;

public class routmaster 
{
	private int Routeid;
	private String fkBusMasterid;
	private String fkDriverid;
	private String fkplaceidFrom;
	private String fkplaceidTo;
	
	
	public routmaster() {
		
	}



	public routmaster(int Routeid,String fkBusMasterid,String fkDriverid,String fkplaceidFrom,String fkplaceidTo) 
	{
     this();
	 this.Routeid =Routeid;
	 this.fkBusMasterid=fkBusMasterid;
	 this.fkDriverid=fkDriverid;
	 this.fkplaceidFrom=fkplaceidFrom;
	 this.fkplaceidTo=fkplaceidTo;
	}



	@Override
	public String toString() {
		return "routmaster [Routeid=" + Routeid + ", fkBusMasterid=" + fkBusMasterid + ", fkDriverid=" + fkDriverid
				+ ", fkplaceidFrom=" + fkplaceidFrom + ", fkplaceidTo=" + fkplaceidTo + "]";
	}



	public int getRouteid() {
		return Routeid;
	}



	public void setRouteid(int routeid) {
		Routeid = routeid;
	}



	public String getFkBusMasterid() {
		return fkBusMasterid;
	}



	public void setFkBusMasterid(String fkBusMasterid) {
		this.fkBusMasterid = fkBusMasterid;
	}



	public String getFkDriverid() {
		return fkDriverid;
	}



	public void setFkDriverid(String fkDriverid) {
		this.fkDriverid = fkDriverid;
	}



	public String getFkplaceidFrom() {
		return fkplaceidFrom;
	}



	public void setFkplaceidFrom(String fkplaceidFrom) {
		this.fkplaceidFrom = fkplaceidFrom;
	}



	public String getFkplaceidTo() {
		return fkplaceidTo;
	}



	public void setFkplaceidTo(String fkplaceidTo) {
		this.fkplaceidTo = fkplaceidTo;
	}



	
}
