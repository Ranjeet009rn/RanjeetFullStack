package com.ranjeet.example;


import java.sql.SQLException;

public class person_info 
{

	private int PersonId;
	private String Person_Name;
	private String Address;
	private String City;
	private String ContactNo;
	private int License_Id;
	
	public person_info() 
	{
		
	}
	
	public person_info(int PersonId,String Person_Name, String Address,String City,String ContactNo,int License_Id )throws ClassNotFoundException ,SQLException
	{
		this();
		this.PersonId=PersonId;
		this.Person_Name=Person_Name;
		this.Address=Address;
		this.City=City;
		this.ContactNo=ContactNo;
		this.License_Id=License_Id;
	}

	
	public int getPersonId() {
		return PersonId;
	}

	
	public void setPersonId(int personId) {
		PersonId = personId;
	}

	
	public String getPerson_Name() {
		return Person_Name;
	}

	
	public void setPerson_Name(String person_Name) {
		Person_Name = person_Name;
	}

	
	public String getAddress() {
		return Address;
	}

	
	public void setAddress(String address) {
		Address = address;
	}

	
	public String getCity() {
		return City;
	}

	
	public void setCity(String city) {
		City = city;
	}

	
	public String getContactNo() {
		return ContactNo;
	}

	
	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}

	
	public int getLicense_Id() {
		return License_Id;
	}

	
	public void setLicence_Id(int license_Id) {
		License_Id = license_Id;
	}
	
	
	
}
