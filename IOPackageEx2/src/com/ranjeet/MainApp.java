package com.ranjeet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class MainApp 
{
	public static void main(String[] args) throws IOException
	{
		File ref=new File("C:/demo/sample.txt");
		if (ref.exists())
		{
			PrintWriter pw=new PrintWriter(ref);
			String s="Hii Ranjeet";
			pw.write(s);
			System.out.println("Message saved in File");
			pw.close();
			}
			
		}

}
