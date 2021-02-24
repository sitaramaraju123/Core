package dbpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Table {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		Statement stmt = con.createStatement();
		try {
		System.out.println("Enter any table name in your database: ");
		String name = sc.next();
		String q = "SELECT * FROM "+name;
		ResultSet rs = stmt.executeQuery(q);
		//System.out.println("id"+"\tUsername"+"\tPassword");
		 ResultSetMetaData rsMetaData = rs.getMetaData();
		 int n = rsMetaData.getColumnCount();
		 for(int j=1; j<=n;j++) {
				System.out.print(rsMetaData.getColumnName(j));
				System.out.print("     ");
			}
		 System.out.println();
		while(rs.next()) {
			for(int i=1; i<=n; i++) {	
			System.out.print(rs.getString(i));
			System.out.print("     \t");
			}
			System.out.println();
		}
		rs.close();
		stmt.close();
		con.close();
		}catch(Exception e) {
			System.out.println("Table not Found");
		}
	}
}
