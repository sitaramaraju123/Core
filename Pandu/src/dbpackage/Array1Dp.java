package dbpackage;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Array1Dp {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		Statement stmt = con.createStatement();
		String sql = "select * from employee";
		 ResultSet rs  = stmt.executeQuery(sql);
		 System.out.print("Enter your Sno: ");
		 int num= sc.nextInt();
		 int[] n = new int[7];
		 int count=0;
		 for(int i=0; i<7; i++) {
			rs.next();
			 n[i]=rs.getInt(1);
			 if(num==n[i]) {
				 count++;
					 System.out.println(rs.getInt(1)+ "\t" +rs.getString(2)+ "\t" +rs.getInt(3)+ "\t" +rs.getInt(4) );
			 }
		 }
		 if(count==0) {
			 System.out.println("Data Not Found");
		 }
		 rs.close();
		 stmt.close();
		 con.close();
	}

}
