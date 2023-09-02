package com.ranjeet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;






public class MainApp
{
	public static void main(String []args)throws IOException

	{
	   Scanner scan=new Scanner(System.in);
	   File reff=new File("c:/demo/records.txt");
	   if(reff.exists()==false)
	   {
		   System.out.println("File not Exists");
		   reff.createNewFile();
		   System.out.println("New File Created");
		   
	   }
	   else
	   {
		   String username;
		   System.out.println("Enter UserName");
		   username=scan.next();
		   
		   FileOutputStream fout=new FileOutputStream(reff,true);
		   OutputStreamWriter osw=new  OutputStreamWriter(fout);
		   osw.write("\n"+username);
		   osw.close();
		   
		      
	   }
		   
	   
	}

}
