package dbpackage;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Bustickets {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		Statement stmt = con.createStatement();
		String q1 = "select * from bus_tickets";
		ResultSet rs1= stmt.executeQuery(q1);
		try {
			System.out.println("Bus Roats");
			System.out.println(" 1.Domlur \n 2.Kodihalli \n 3.Manipal Hospital Hal Road \n 4.Murugesh palya \n 5.Hal main Gate \n 6.Helicopter Division"
					+ "\n 7.Hal Kalyana Mantapa \n 8.Bore Well \n 9.Doddanekkundi CRS \n 10.Marathhalli");
			System.out.println();
		System.out.print("Enter pickup place: ");
		String pickup=br.readLine();
		System.out.print("Enter Drop place: ");
		String drop=br.readLine();
		int num=0;
		int num1=0;
		int total=0;
		while(rs1.next()) {
			if(pickup.equals(rs1.getString(2))) {
				num=rs1.getInt(1);
			}
			if(drop.equals(rs1.getString(2))) {
				num1 = rs1.getInt(1);
			}
		}
		String q = "SELECT * FROM  bus_tickets WHERE id BETWEEN "+num+" AND "+num1;
		ResultSet rs = stmt.executeQuery(q);
		while(rs.next()) {
			System.out.println(rs.getString(2));
			total+=rs.getInt(3);
		}
		System.out.println();
		System.out.println("Ticket price: "+(total - 10));
		rs.close();
		}catch(Exception e) {
			System.out.println("Please Check The Area");
		}
		rs1.close();
		stmt.close();
		con.close();
	}
}
