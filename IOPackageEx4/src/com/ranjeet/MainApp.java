package com.ranjeet;

import java.io.File;
import java.io.IOException;



public class MainApp 
{
	public static void main(String[] args)throws IOException
	{
		File F=new File("c:/demo/sample.txt");
		if(F.exists())
		{
			System.out.println("\n File already present");
		}
		else
		{
			F.createNewFile();
			System.out.println("New File cretaed");
			
		}
		System.out.println("getName()="+F.getName());
		System.out.println("getparent()="+F.getParent());
		System.out.println("getpath()="+F.getPath());
		System.out.println("canRead()="+F.canRead());
		System.out.println("canwrite()="+F.canWrite());
		System.out.println("isdirectory()="+F.isDirectory());
		System.out.println("isFile()="+F.isFile());
		System.out.println("ishidden()="+F.isHidden());
		System.out.println("length()="+F.length());
		System.out.println("delete()="+F.delete());
		
		
		
	}
	

}
