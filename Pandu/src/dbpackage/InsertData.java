package dbpackage;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class InsertData {
	public static void main(String[] args) throws Exception {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("          Insert data into Database");
		try {
			System.out.println("Enter how many persons data you want Insert: ");
			int num = sc.nextInt();
			  for(int i=0; i<num;i++) {
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		//Statement stmt = con.createStatement();
		  String query = " insert into login (id, User_name, Password) values (?, ?, ?)";
		  PreparedStatement pre = con.prepareStatement(query);
		  System.out.print("Enter id:");
		  int id = sc.nextInt();
		  System.out.print("Enter Username: ");
		  String name = sc.next();
		  System.out.print("Enter password: ");
		  String password = sc.next();
		  pre.setInt(1, id);
		  pre.setString(2, name);
		  pre.setString(3, password);
		  int n =pre.executeUpdate();
		  System.out.println(n+ " Rows of Data Inserted Successfully..");
		 
		  con.close(); 
		  //stmt.close();
		  con.close();
		  }
		//Insert.........
		}
		catch(Exception e) {
			System.out.println("Please Don't repeat Dulpicate Values..");
		}
		 Updatedata u =new Updatedata();
		  u.main(args);
		  //Updaete......................
		  LoginDb L = new LoginDb();
		  L.main(args);
		  //Table................
		  System.out.println("if you want delete any Column Enter 'yes' or else 'No'");
		  String yes = sc.next();
		  if(yes.equalsIgnoreCase("yes")) {
			  Deletedata D = new Deletedata();
			  D.main(args);
			  //Delete............
		  }else {
			  
		  }
		  L.main(args);
		  
	}

}
