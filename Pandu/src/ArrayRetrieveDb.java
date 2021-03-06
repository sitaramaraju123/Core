package Collections;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;  

public class ArrayRetrieveDb {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Connection con =DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		Statement st = con.createStatement();
		String q ="select * from employee";
		ResultSet rs = st.executeQuery(q);
		ArrayList<Data> a = new ArrayList<>();
		int count=0;
		System.out.print("Enter id or name or age or salary: ");
		int name= sc.nextInt();
		while(rs.next()) {
			Data d = new Data(rs.getInt(1));
			a.add(d);
			int n=a.size();
			int num1=0;
			for(int i=0; i<n; i++) {
				String num=a.get(i).toString();
				num1 =Integer.parseInt(num);
			}
			if(name==num1) {
				count++;
				System.out.println(rs.getInt(1)+ "\t" +rs.getString(2)+ "\t" +rs.getInt(3)+ "\t" +rs.getInt(4));
			}
		}
		if(count==0) {
			System.out.println("No Data");
		}
		con.close();
	}
}
class Data{
	private int num;
////	private String name;
////	private int age;
////	private int salary;
	Data(int num){
		this.num=num;
	}
	public String toString() {
		return""+num;
	}
}