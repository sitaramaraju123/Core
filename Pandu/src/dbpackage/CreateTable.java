package dbpackage;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		Statement stmt = con.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Table Name: ");
		String tablename = sc.next();
		System.out.print("Enter Column name: ");
		String name1=sc.next();
		System.out.print("Enter type: ");
		String type1 = sc.next();
	    String createTable = "create table "+tablename+"("+name1+" "+type1+")";
	    stmt.execute(createTable);
	    
	    System.out.print("Enter how many column you want: ");
	    int num=sc.nextInt();
	    for(int i=0;i<num;i++) {
	    System.out.print("Enter column name: ");
		String name = sc.next();
		System.out.println("Enter type: ");
		String type=sc.next();
		String que = "alter table "+tablename+" add "+name+" "+type+"";
		stmt.execute(que);
		System.out.println("Column is Added");
		}
	    
		System.out.println("Table is Add Successfully..");
		con.close();
		stmt.close();

	}

}
