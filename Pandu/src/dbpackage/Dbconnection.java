package dbpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Dbconnection {
	public static void main(String args[]) throws Exception{  
		Class.forName("com.mysql.cj.jdbc.Driver");

	          Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306","root","mysql");

	         if(con==null) {
	        	 System.out.println("Not Connected..");
	        	 return;
	         }else {
	        	 System.out.println("Connected....");
	         }
	          con.close();
	}
		
	} 