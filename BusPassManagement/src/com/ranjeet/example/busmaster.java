package com.ranjeet.example;

public class busmaster 
{
	private int BusMasterid ;
	private int fkbus_typeid;
	private String bus_number;
	
	
		public busmaster() 
		{
		
	    }
        public busmaster(int busMasterid, int fkbus_typeid, String bus_number)
	    {
		this();
		this.BusMasterid = busMasterid;
		this.fkbus_typeid = fkbus_typeid;
	  	this.bus_number = bus_number;
	     }
        
		@Override
		public String toString() {
			return "busmaster [BusMasterid=" + BusMasterid + ", fkbus_typeid=" + fkbus_typeid + ", bus_number="
					+ bus_number + "]";
		}
		public int getBusMasterid() {
			return BusMasterid;
		}
		public void setBusMasterid(int busMasterid) {
			BusMasterid = busMasterid;
		}
		public int getFkbus_typeid() {
			return fkbus_typeid;
		}
		public void setFkbus_typeid(int fkbus_typeid) {
			this.fkbus_typeid = fkbus_typeid;
		}
		public String getBus_number() {
			return bus_number;
		}
		public void setBus_number(String bus_number) {
			this.bus_number = bus_number;
		}
		public String getBus_type() {
			// TODO Auto-generated method stub
			return null;
		}
}
