package com.App;


import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ranjeet.DbConfig;
import com.ranjeet.example.bus_type;
import com.ranjeet.example.busmaster;
import com.ranjeet.example.driver;
import com.ranjeet.example.place;
import com.ranjeet.example.routmaster;

public class MainApp
{
	

    static Scanner scan=new Scanner (System.in);
	static Connection conn;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		int choice;
		
		
		
		
		conn=DbConfig.connectMYSQL();
		
		
			try {
				while(true)
					{
					
					System.out.println("1.Show Bus_Types");

					System.out.println("2.Show Bus Details");

					System.out.println("3.Show Driver_Details");

					System.out.println("4.Show Place");
					
					System.out.println("5.Show RoutMaster");

					System.out.println("Enter Your Choice");
					
					choice=scan.nextInt();
					
					switch(choice)
					{
					case 1:
						bus_type bt = new bus_type();
						List<bus_type> data1 =	showbus_type();
							System.out.println(data1);
							break;
					case 2:
						busmaster BM=new busmaster();
						List<busmaster> data2 =  showbusmaster();
						System.out.println(data2);
						break;
					case 3:
						driver DR=new driver();
						List<driver> data3 =  showdriver();
						System.out.println(data3);
						break;
					case 4:
						place PL=new place();
						List<place> data4 =  showplace();
						System.out.println(data4);
						break;
					case 5:
						routmaster RM=new routmaster();
						List<routmaster> data5 =  showroutmaster();
						System.out.println(data5);
						break;
					case 6:System.exit(0);
					}
					
					}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
               }
	static List<bus_type> showbus_type() throws SQLException {

		String query = "SELECT bus_typeid,bus_type FROM bus_type;";
		Statement stmt = conn.createStatement();
		ResultSet r = stmt.executeQuery(query);

		List<bus_type> busType = new ArrayList<bus_type>();

		while (true) {

			if (r.next()) {
				
				busType.add(new bus_type(r.getInt("bus_typeid"), r.getString("bus_type")
						));
			} else {
				break;
			}
		}
		
		return busType;
	}
	
	
	static List<busmaster> showbusmaster() throws SQLException {

		String query = "SELECT BusMasterid,fkbus_typeid,bus_number FROM busmaster;";
		Statement stmt = conn.createStatement();
		ResultSet r = stmt.executeQuery(query);

		List<busmaster> busMaster = new ArrayList<busmaster>();

		while (true) {

			if (r.next()) {
				
				busMaster.add(new busmaster(r.getInt("BusMasterid"), r.getInt("fkbus_typeid"),r.getString("bus_number")
						));
			} else {
				break;
			}
		}
		
		return busMaster;
	}
	
	

	static List<driver> showdriver() throws SQLException {

		String query = "SELECT Driverid,join_Date,driver_name,experience FROM driver;";
		Statement stmt = conn.createStatement();
		ResultSet r = stmt.executeQuery(query);

		List<driver> Driver = new ArrayList<driver>();

		while (true) {

			if (r.next()) {
				
				Driver.add(new driver(r.getInt("Driverid"), r.getString("join_Date"),r.getString("driver_name"),r.getInt("experience")
						));
			} else {
				break;
			}
		}
		
		return Driver;
	}
	
	
	static List<place> showplace() throws SQLException {

		String query = "SELECT Placeid,placeName FROM place;";
		Statement stmt = conn.createStatement();
		ResultSet r = stmt.executeQuery(query);

		List<place> Place = new ArrayList<place>();

		while (true) {

			if (r.next()) {
				
				Place.add(new place(r.getInt("Placeid"), r.getString("placeName")
						));
			} else {
				break;
			}
		}
		
		return Place;
	}
	
	static List<routmaster> showroutmaster() throws SQLException {

		String query = "SELECT Routid,fkBusMasterid,fkDriverid,fkplaceidFrom,fkplaceidTo FROM routmaster;";
		Statement stmt = conn.createStatement();
		ResultSet r = stmt.executeQuery(query);

		List<routmaster> Routmaster = new ArrayList<routmaster>();

		while (true) {

			if (r.next()) {
				
				Routmaster.add(new routmaster(r.getInt("Routid"), r.getString("fkBusMasterid"),r.getString("fkDriverid"),r.getString("fkplaceidFrom"),r.getString("fkplaceidTo")
						));
			} else {
				break;
			}
		}
		
		return Routmaster;
	}
	
}

