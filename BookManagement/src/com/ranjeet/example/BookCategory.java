package com.ranjeet.example;

public class BookCategory {


	private int Categoryid;  ; 
	private String CategoryName;
	
	public BookCategory() 
	{
	
	}

	public BookCategory(int Categoryid,String CatagoryName) 
	{
		this();
		this.Categoryid=Categoryid;
		this.CategoryName=CategoryName;
	}

	
	public int getCategoryid() 
	{
		return Categoryid;
	}

	
	public String getCategoryName()
	{
		return CategoryName;
	}

	
	public void setCategoryid(int categoryid)
	{
		Categoryid = categoryid;
	}

	
	public void setCategoryName(String categoryName) 
	{
		CategoryName = categoryName;
	}
	
}
