package Collections;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HashMapDemo {

	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		String query = " insert into map (id, name) values (?, ?)";
		PreparedStatement pre = con.prepareStatement(query);
		HashMap<Integer, Map> hm = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter sno: ");
		int num=sc.nextInt();
		System.out.print("Enter Name: ");
		String name=sc.next();
		Map m = new Map(num,name);
		hm.put(num, m);
		for(Integer i:hm.keySet()) {
			Map a = hm.get(i);
			System.out.println(a.id+" "+a.name);
			pre.setInt(1, a.id);
		    pre.setString(2, a.name);
		    int n =pre.executeUpdate();
			  System.out.println(n+ " Rows of Data Inserted Successfully..");
		}
		con.close();
	}

}
class Map{
	int id;
	String name;
	Map(int id, String name){
		this.id=id;
		this.name=name;
	}
}