package com.ranjeet.example;

public class bus_type 
{
	private int bus_typeid;
	private String bus_type;
	
	public bus_type() 
	{
		
	}
	public bus_type( int bus_typeid,String bus_type) 
	{
		this ();
		this.bus_typeid=bus_typeid;
		this.bus_type=bus_type;
			
	}
	
	@Override
	public String toString() {
		return "bus_type [bus_typeid=" + bus_typeid + ", bus_type=" + bus_type + "]";
	}
	public int getBus_typeid() {
		return bus_typeid;
	}
	public void setBus_typeid(int bus_typeid) {
		this.bus_typeid = bus_typeid;
	}
	public String getBus_type() {
		return bus_type;
	}
	public void setBus_type(String bus_type) {
		this.bus_type = bus_type;
	}
	
	

}
