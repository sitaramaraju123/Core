package Collections;
import java.util.*; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class ArrayDbtoAnthoerDb {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		Statement st=con.createStatement();
		ResultSet rs = st.executeQuery("select * from array");
		ArrayList<Db> ad = new  ArrayList<>();
		while(rs.next()) {
			Db d = new Db(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4));
			ad.add(d);
		}
		String s =" insert into test (sno, name, age,city) values (?, ?, ?, ?)";
		PreparedStatement per = con.prepareStatement(s);
		System.out.print("Enter id to add: ");
		int n = sc.nextInt();
		int n1=0;
		for(Db a:ad) {
			System.out.println(a.sno+" "+a.name+" "+a.age+" "+a.city);
			if(n==a.sno) {
				per.setInt(1, a.sno);
				per.setString(2, a.name);
				per.setInt(3, a.age);
				per.setString(4, a.city);
				n1=per.executeUpdate();
			}
		}
		 System.out.println();
		 System.out.println(n1+ " Rows of Data Inserted Successfully..");
		 
		 String s1 ="delete from test where sno=?";
		 PreparedStatement pre = con.prepareStatement(s1);
		 System.out.println("if you want to delete data");
		 System.out.println("1.yes    2.No");
		 int num = sc.nextInt();
		 if(num==1) {
			 System.out.println("Enter sno to delete");
			 int sno=sc.nextInt();
			pre.setInt(1, sno);
			pre.execute();
			System.out.println("1 row deleted Successfully");
		 }
		con.close();
		
}
}
class Db{
	int sno;
	String name;
	int age;
	String city;
	Db(int sno, String name, int age, String city){
		this.sno=sno;
		this.name=name;
		this.age=age;
		this.city=city;
	}
}