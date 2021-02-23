package dbpackage;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Alterdata {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		Statement stmt = con.createStatement();
		System.out.println("Enter Table name: ");
		String tablename=sc.next();
		System.out.print("Enter column name: ");
		String name = sc.next();
		System.out.println("Enter type: ");
		String type = sc.next();
		String que = "alter table "+tablename+" add "+name+" "+type+"";
		stmt.execute(que);
		System.out.println("Alter Table is Add Successfully..");
		con.close();
		stmt.close();
	}

}
