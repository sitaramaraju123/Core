package dbpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TableDrop {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		Statement stmt = con.createStatement();
		String tablename="";
		try {
		System.out.print("Enter Table name: ");
		tablename = sc.next();
		System.out.print("Enter column name tob Delete column: ");
		String name = sc.next();
		String q="Alter table "+tablename+" Drop "+name+"";
		stmt.executeUpdate(q);
		System.out.println("Column deleted Successfully");
		}
		catch(Exception e) {
			System.out.println("Column not Deleted");
		}
		con.close();
		stmt.close();
	}

}
