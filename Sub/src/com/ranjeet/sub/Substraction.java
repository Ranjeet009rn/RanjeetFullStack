package com.ranjeet.sub;

public class Substraction
{
	public int Ans;
	public int A;
	public int B;
	public Substraction(int A,int B)
	{
		this.A=A;
		this.B=B;
		Ans=A-B;
	}
	@Override
	public String toString() {
		return "Substraction [Ans=" + Ans + "]";
	}

}
