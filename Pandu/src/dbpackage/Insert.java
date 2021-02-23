package dbpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		Statement stmt = con.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Table Name: ");
		String tablename = sc.next();
		System.out.print("Enter how many columns are there in your "+tablename+" Table: ");
		int num = sc.nextInt();
		String s1[]=new String[num];
		for(int i=0;i<num; i++) {
		System.out.print("Enter Column name: ");
		s1[i] = sc.next();
		}
		String s = "";
		for(int i=0; i<num; i++) {
			s=s+s1[i];
			if(i!=num-1) {
				s=s+(",");
			}
		}
		System.out.print("Enter how many columns you gave: ");
		int num1 = sc.nextInt();
		String s2[]=new String[num1];
		System.out.print("How many details you have to enter: ");
		int n = sc.nextInt();
		for(int i=0; i<n;i++) {
		
		for(int j=0; j<num1; j++) {
			System.out.print("Enter "+s1[j]+": ");
		s2[j]=sc.next();
		}
		String data="";
		for(int j=0; j<num1; j++) {
			data+=s2[j];
			if(j!=num-1) {
				data+=(",");
			}
		}
		
		String query = "insert into "+tablename+"("+s+") values ("+data+")";
		System.out.println(query);
		stmt.execute(query);
		}
		System.out.println("All data got Inserted");
		con.close();
	}

}
