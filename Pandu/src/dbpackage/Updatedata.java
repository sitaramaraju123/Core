package dbpackage;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Updatedata {

	public static void main(String[] args) throws Exception {
		System.out.println("              Updating the Data");
		Scanner sc = new Scanner(System.in);
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		//Statement st = con.createStatement();
		System.out.print("Enter id number to Update: ");
		int nu = sc.nextInt();
		String q = "update login set Password = ? where id = "+nu;
		PreparedStatement pre = con.prepareStatement(q);
		System.out.print("Enter a data to update: ");
		String name = sc.next();
		pre.setString(1, name);
		pre.executeUpdate();
		System.out.println("Data Updated Successfully..");
		pre.close();
		//st.close();
		con.close();
	}

}
