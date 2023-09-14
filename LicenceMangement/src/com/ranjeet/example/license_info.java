package com.ranjeet.example;

import java.sql.SQLException;

public class license_info 
{
	private int license_id;
	private String license_type;
	
	public license_info() 
	{
	
	}
	public license_info(int license_id,String license_type )throws ClassNotFoundException,SQLException
	{
		this();
		this.license_id=license_id;
		this.license_type=license_type;
	}
	public int getLicense_id() {
		return license_id;
	}
	public String getLicense_type() {
		return license_type;
	}
	public void setLicense_id(int license_id) {
		this.license_id = license_id;
	}
	public void setLicense_type(String license_type) {
		this.license_type = license_type;
	}
}