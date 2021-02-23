package dbpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Employetable  {
	public static void main(String[] args)throws Exception{
	Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
	Statement stmt = con.createStatement();
	 String q = "SELECT * FROM employe_table";
     ResultSet rs = stmt.executeQuery(q);
     System.out.println("Sno"+"\tEmploye Name"+"\tEmploye Age"+"\tEmploye id"+"\tEmploye Salary"+"\tEmploye Image");
     while(rs.next()) {
	  System.out.println(rs.getInt(1) + "\t " + rs.getString(2)+"\t     "+rs.getInt(3)+"\t        "+rs.getInt(4)+"\t           "+rs.getInt(5)+"\t   "+rs.getBlob(6));
	  }
}
}
