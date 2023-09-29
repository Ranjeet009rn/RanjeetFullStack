package com.ranjeet.example;

public class BookMaster {

	private int Bookid;
	private String RecordDate;
	private String BookName;
	private int fkCategoryid;
	private int fkAuthorid;
	private int Price;
	
	public BookMaster() 
	{
	
	}
	
	public BookMaster(int Bookid, String RecordDate, String BookName, int fkCategoryid, int fkAuthorid, int Price) 
	{
		this();
		this.Bookid = Bookid;
		this.RecordDate = RecordDate;
		this.BookName = BookName;
		this.fkCategoryid = fkCategoryid;
		this.fkAuthorid = fkAuthorid;
		this.Price = Price;
	}
	
	                         
	public String toString()
	{
		return "BookMaster [Bookid=" +Bookid + ", RecordDate=" +RecordDate + ", BookName=" + BookName
				+ ", fkCategoryid=" +fkCategoryid + ", fkAuthorid=" +fkAuthorid + ", Price=" + Price + "]";
		
	}
	

	public int getBookid()
	{
		return Bookid;
	}

	
	public String getRecordDate()
	{
		return RecordDate;
	}

	
	public String getBookName()
	{
		return BookName;
	}

	
	public int getFkCategoryid() 
	{
		return fkCategoryid;
	}

	
	public int getFkAuthorid()
	{
		return fkAuthorid;
	}

	
	public int getPrice() 
	{
		return Price;
	}

	
	public void setBookid(int bookid) 
	{
		Bookid = bookid;
	}

	
	public void setRecordDate(String recordDate)
	{
		RecordDate = recordDate;
	}

	
	public void setBookName(String bookName)
	{
		BookName = bookName;
	}

	
	public void setFkCategoryid(int fkCategoryid)
	{
		this.fkCategoryid = fkCategoryid;
	}

	
	public void setFkAuthorid(int fkAuthorid) 
	{
		this.fkAuthorid = fkAuthorid;
	}

	
	public void setPrice(int price) 
	{
		Price = price;
	}
}
