package com.ranjeet.example;

public class driver 
{
	private int Driverid;
	private String join_Date;
	private String driver_name;
	private int experience;
	
	public driver() 
	{
		
	}
	public driver(int Driverid,String join_Date,String driver_name,int  experience) 
	{
		this ();
		this.Driverid=Driverid;
		this.join_Date=join_Date;
		this.driver_name=driver_name;
		this.experience= experience;
	
}
	
	@Override
	public String toString() {
		return "driver [Driverid=" + Driverid + ", join_Date=" + join_Date + ", driver_name=" + driver_name
				+ ", experience=" + experience + "]";
	}
	public int getDriverid() {
		return Driverid;
	}
	public void setDriverid(int driverid) {
		Driverid = driverid;
	}
	public String getJoin_Date() {
		return join_Date;
	}
	public void setJoin_Date(String join_Date) {
		this.join_Date = join_Date;
	}
	public String getDriver_name() {
		return driver_name;
	}
	public void setDriver_name(String driver_name) {
		this.driver_name = driver_name;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	
}
