package dbpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class LoginDb {
	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		Statement stmt = con.createStatement();
		String q = "SELECT * FROM login";
		ResultSet rs = stmt.executeQuery(q);
		System.out.println("id"+"\tUsername"+"\tPassword");
		while(rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2)+"\t "+rs.getString(3));
			
		}
		rs.close();
		stmt.close();
		con.close();
	}
}
