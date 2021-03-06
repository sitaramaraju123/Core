package Collections;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class FetchingData {
	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		Statement st = con.createStatement();
		String q="select * from login";
		ResultSet rs = st.executeQuery(q);
		List<Table> at = new ArrayList<>();
		Task t1 = new Task();
		t1.main(args);
		System.out.println();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your Name or Id: ");
		String name=sc.next();
		int num=0;
		while(rs.next()) {
			if(name.equalsIgnoreCase(rs.getString(1))){
				num = Integer.valueOf(name);
				}
			Table t = new Table(rs.getInt(1), rs.getString(2), rs.getString(3));
			at.add(t);
			
		}
		for(Table a: at) {
			if(num==a.num || name.equals(a.name)) {
				System.out.println(a);
			}
		}
	}
}
class Table{
	int num;
	String name;
	String pass;
	Table(int num, String name, String pass){
		this.num=num;
		this.name=name;
		this.pass=pass;
	}
	
	public String toString() {
		return num+"  "+name+"  "+pass;
		
	}
}