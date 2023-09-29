package com.App;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ranjeet.DbConfig;
import com.ranjeet.example.Author;
import com.ranjeet.example.BookCategory;
import com.ranjeet.example.BookMaster;

public class MainApp {
	static Scanner scan = new Scanner(System.in);
	static Connection conn;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int choice;
		BookCategory B = null;
		BookMaster BM = null;
		Author A = null;
		conn = DbConfig.connectMYSQL();

		try {
			while (true) {
				System.out.println("1.Create Book Category");
				System.out.println("2.Create Auther");
				System.out.println("3.Add Book");
				System.out.println("4.Show Book Details");
				System.out.println("5.Exit");
				System.out.println("\nEnter Your Choice");
				choice = scan.nextInt();

				switch (choice) {
				case 1:
					B = new BookCategory();
					createBookRecord(B);
					if (saveBookRecord(B) == false) {
						System.out.println("Record inserted successfully");
					} else {
						System.out.println("Failed to insert record");
					}
					break;

				case 2:
					A = new Author();
					createAuthorRecord(A);
					if (saveAuthorRecord(A) == false) {
						System.out.println("Record inserted successfully");
					} else {
						System.out.println("Failed to insert record");
					}
					break;
				case 3:
					BM = new BookMaster();
					createBookMaster(BM);
					if (saveBookMaster(BM) == false) {
						System.out.println("Record inserted successfully");
					} else {
						System.out.println("Failed to insert record");
					}
					break;
				case 4:
					BookMaster bookmaster = new BookMaster();
				List<BookMaster> data =	showBookMaster();
					System.out.println(data);
					break;
				case 5:
				
					System.exit(0);
				}
			}
		} catch (SQLException e) {

			System.out.println(e);
		}
	}

	static void createBookRecord(BookCategory B) {
		System.out.println("Enter  Book Category Id: ");
		B.setCategoryid(scan.nextInt());
		System.out.println("Enter Book Category Type: ");
		B.setCategoryName(scan.next());
	}

	static boolean saveBookRecord(BookCategory book) throws SQLException {
		String query = "INSERT INTO bookcategory(Categoryid,CategoryName)VALUES(" + book.getCategoryid() + ",'"
				+ book.getCategoryName() + "')";
		Statement stmt = conn.createStatement();
		return stmt.execute(query);
	}

	static void createAuthorRecord(Author A) {
		System.out.println("Enter Author Id : ");
		A.setAuthorid(scan.nextInt());
		System.out.println("Enter Author Name : ");
		A.setAuthorName(scan.next());
		System.out.println("Enter Qualification : ");
		A.setQualification(scan.next());
	}

	static boolean saveAuthorRecord(Author Ar) throws SQLException {
		String query = "INSERT INTO author(Authorid,AuthorName,Qualification)VALUES(" + Ar.getAuthorid() + ",'"
				+ Ar.getAuthorName() + "','" + Ar.getQualification() + "')";
		Statement stmt = conn.createStatement();
		return stmt.execute(query);
	}

	static void createBookMaster(BookMaster BM) {
		System.out.println("Enter Book id : ");
		BM.setBookid(scan.nextInt());
		System.out.println("Enter Record Date : ");
		BM.setRecordDate(scan.next());
		System.out.println("Enter Book Name : ");
		BM.setBookName(scan.next());
		System.out.println("Enter Category Id : ");
		BM.setFkCategoryid(scan.nextInt());
		System.out.println("Enter Author Id : ");
		BM.setFkAuthorid(scan.nextInt());
		System.out.println("Enter Price of Book : ");
		BM.setPrice(scan.nextInt());
	}

	static boolean saveBookMaster(BookMaster Master) throws SQLException {
		String query = "INSERT INTO bookmaster(Bookid,RecordDate,BookName,FkCategoryid,FkAuthor_id,Price)VALUES("
				+ Master.getBookid() + ",'" + Master.getRecordDate() + "','" + Master.getBookName() + "',"
				+ Master.getFkCategoryid() + "," + Master.getFkAuthorid() + "," + Master.getPrice() + ")";
		Statement stmt = conn.createStatement();
		return stmt.execute(query);
	}

	static List<BookMaster> showBookMaster() throws SQLException {

		String query = "SELECT Bookid,RecordDate,BookName,fkCategoryid,fkAuthorid,Price FROM bookmaster";
		Statement stmt = conn.createStatement();
		ResultSet r = stmt.executeQuery(query);

		List<BookMaster> bookList = new ArrayList<BookMaster>();

		while (true) {

			if (r.next()) {
				System.out.println(r.getInt("Bookid"));
				bookList.add(new BookMaster(r.getInt("Bookid"), r.getString("RecordDate"), r.getString("BookName"),
						r.getInt("fkCategoryid"), r.getInt("fkAuthorid"), r.getInt("Price")));
			} else {
				break;
			}
		}
		
		return bookList;
	}

}
