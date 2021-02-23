package dbpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ColumnTable {

	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		Statement stmt = con.createStatement();
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter Table Name: ");
		String tablename = sc.next();
		System.out.print("Enter how many columns you want to add: ");
		int num = sc.nextInt();
		String s1[]=new String[num];
		String s2[]=new String[num];
		for(int i=0;i<num; i++) {
		System.out.print("Enter Column name: ");
		s1[i] = sc.next();
		System.out.print("Enter type: ");
		s2[i] = sc.next();
		}
		String s = "";
		for(int i=0; i<num; i++) {
			s=s+s1[i]+" "+s2[i];
			if(i!=num-1) {
				s=s+(",");
			}
		}
		String createTable = "create table "+tablename+"("+s+")";
	    stmt.execute(createTable);
	    System.out.println("Table is Add Successfully..");
		con.close();
		stmt.close();
	}

}
