package com.App;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.ranjeet.DbConfig;
import com.ranjeet.example.license_info;
import com.ranjeet.example.person_info;

public class MainApp
{
    static Scanner scan=new Scanner (System.in);
	static Connection conn;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		int choice;
		license_info L=null;
		person_info  P=null;
		conn=DbConfig.connectMYSQL();
		
		try {
			while(true)
				{
					System.out.println("1.Add License Details");
					System.out.println("2.Add Person Details");
					System.out.println("3.Exit");
					System.out.println("\nEnter Your Choice");
					choice=scan.nextInt();
					
					switch(choice)
					{
					case 1:
						L=new license_info();
						createRecord(L);
						if(saveRecord (L)==false)
						{
							System.out.println("Record Inserted successfully");
						}
						else
						{
							System.out.println("Failed to insert record");
						}
						break;
						
					case 2:
						P=new person_info();
						createPerson(P);
						if(savePerson (P)==false)
						{
							System.out.println("Record Inserted successfully");
						}
						else
						{
							System.out.println("Failed to insert record");
						}
						break;
					case 3:System.exit(0);
					}
				}
		} catch (SQLException e)
		{
			System.out.println(e);
		}
	}
		static void createRecord(license_info L)
		{
		 System.out.println("Enter License Id: ");
		 L.setLicense_id(scan.nextInt());
		 System.out.println("Enter License Type: ");
		 L.setLicense_type(scan.next());
		}
		
		static boolean saveRecord(license_info Lic)throws SQLException
		{
			String query="INSERT INTO license_info(License_id,License_type)VALUES("+Lic.getLicense_id()+",'"+Lic.getLicense_type()+"')";
			Statement stmt=conn.createStatement();
			return stmt.execute(query);
		}   
		 static void createPerson(person_info P)
		 {
			 System.out.println("Enter Person Id: ");
			 P.setPersonId(scan.nextInt());	
			 System.out.println("Enter Person Name: ");
			 P.setPerson_Name(scan.next());
			 System.out.println("Enter Address: ");
			 P.setAddress(scan.next());	
			 System.out.println("Enter City: ");
			 P.setCity(scan.next());	
			 System.out.println("Enter Contact Number: ");
			 P.setContactNo(scan.next());	
			 System.out.println("Enter License Id: ");
			 P.setLicence_Id(scan.nextInt());	
		 }
		 
		 static boolean savePerson(person_info per)throws SQLException
		 {
			 String query="INSERT INTO person_info( person_id,person_name,address,city,contact,license_id)VALUES("+per.getPersonId()+",'"+per.getPerson_Name()+"','"+per.getAddress()+"','"+per.getCity()+"','"+per.getContactNo()+"',"+per.getLicense_Id()+")";
			 Statement stmt=conn.createStatement();
			 return stmt.execute(query);
		 }

	}



