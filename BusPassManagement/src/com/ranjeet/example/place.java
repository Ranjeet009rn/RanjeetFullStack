package com.ranjeet.example;

public class place 
{
	private int Placeid;
	private String placeName;
	
	public place()
	{
		
	}

	public place( int Placeid,String placeName)
	{
		this ();
		this.Placeid=Placeid;
		this.placeName=placeName;
		
		
	}
	

	@Override
	public String toString() {
		return "place [Placeid=" + Placeid + ", placeName=" + placeName + "]";
	}

	public int getPlaceid() {
		return Placeid;
	}

	public void setPlaceid(int placeid) {
		Placeid = placeid;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	
}
