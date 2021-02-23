package dbpackage;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Deletedata {

	public static void main(String[] args) throws Exception {
		System.out.println("          Delete the data in Database");
		Scanner sc = new Scanner(System.in);
		System.out.println("How many persons data u want delete: ");
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		Statement st = con.createStatement();
		String quary="delete from login where id=?";
		PreparedStatement pre = con.prepareStatement(quary);
		System.out.print("Enter id to Delete: ");
		int num = sc.nextInt();
		pre.setInt(1, num);
		pre.execute();
		pre.close();
		st.close();
		con.close();
		}
		System.out.println("Data Deleted Successfully..");
	}

}
