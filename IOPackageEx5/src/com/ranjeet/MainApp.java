package com.ranjeet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;



public class MainApp
{
	public static void main(String[] args)throws IOException
	{
		File reff=new File("c:/demo/records.txt");
		if(reff.exists()==false)
			System.out.println("File not exist");
		else
		{
			FileInputStream fin =new FileInputStream(reff);
			InputStreamReader isr=new InputStreamReader(fin);
			
			int code;
			while(true)
			{
				code=isr.read();
				if(code==-1)
					break;
				char ch=(char)code;
				System.out.println(ch);
				
			}
			isr.close();
			}
		
	}
	

}
