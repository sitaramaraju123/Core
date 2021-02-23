package dbpackage;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FormLogin {
public static void main(String[] args) throws Exception {
	Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
	Statement stmt = con.createStatement();
	String sql = "SELECT User_name, Password FROM login";
	ResultSet rs    = stmt.executeQuery(sql);
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your Username: ");
	String name = sc.next();
	System.out.print("Enter your password: ");
	String pass = sc.next();
	int count=0;
	while(rs.next()) {
		if(name.equalsIgnoreCase(rs.getString(1)) && pass.equalsIgnoreCase(rs.getString(2))) {
			System.out.println("Welcome "+ rs.getString("User_name"));
			count++;
			break;
		}
	}
	if(count==0) {
		System.out.println("Invalid data");
	}
	rs.close();
	stmt.close();
	con.close();
}
}
