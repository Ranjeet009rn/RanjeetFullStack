package com.ranjeet.example;

public class Author {
	private int Authorid; 
	private String AuthorName;
	private String Qualification;
	
    public Author()
    {
		
	}
	
	public Author(int Authorid, String AuthorName, String Qualification)
	{
		this();
		this.Authorid = Authorid;
		this.AuthorName = AuthorName;
		this.Qualification = Qualification;
	}

	public int getAuthorid() 
	{
		return Authorid;
	}

	
	public String getAuthorName()
	{
		return AuthorName;
	}


	public String getQualification()
	{
		return Qualification;
	}

	
	public void setAuthorid(int authorid) {
		Authorid = authorid;
	}

	
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}


	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	
}
