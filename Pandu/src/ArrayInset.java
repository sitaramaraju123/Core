package Collections;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ArrayInset {

	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		String query = " insert into array (sno, name, age,city) values (?, ?, ?, ?)";
		PreparedStatement pre = con.prepareStatement(query);
		ArrayList<In> a = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter sno: ");
		int num=sc.nextInt();
		System.out.print("Enter Name: ");
		String name=sc.next();
		System.out.print("Enter Age: ");
		int age=sc.nextInt();
		System.out.print("Enter City: ");
		String city=sc.next();
		In i = new In(num,name,age,city);
		a.add(i);
		for(In a1:a) {
			System.out.println("["+a1.n+" "+a1.name+" "+a1.age+" "+a1.city+"]");
			  pre.setInt(1, a1.n);
			  pre.setString(2, a1.name);
			  pre.setInt(3, a1.age);
			  pre.setString(4, a1.city);
			  int n =pre.executeUpdate();
			  System.out.println(n+ " Rows of Data Inserted Successfully..");
		}
	}

}
class In{
	int n;
	String name;
	int age;
	String city;
	In(int n, String name, int age, String city){
		this.n=n;
		this.name=name;
		this.age=age;
		this.city=city;
	}
}