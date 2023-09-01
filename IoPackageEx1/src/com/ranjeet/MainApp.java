package com.ranjeet;



import java.io.File;

import java.io.IOException;



public class MainApp 

{
	public static void main(String[] args)throws IOException
	{
	File f =new File("c:/demo/sample.txt");
	if(f.exists())
	{
		System.out.println("Already Exist");
		
	}
	else
	{
		f.createNewFile();
		System.out.println("New File Created");
		
		
	}

}
}