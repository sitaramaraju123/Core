package Collections;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ArrayDb {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<value> personlist = new ArrayList<>();
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		Statement stmt = con.createStatement();
		String sql = "select * from employee";
		 ResultSet rs  = stmt.executeQuery(sql);
		 System.out.print("Enter your Sno: ");
		 int index= sc.nextInt();
		 int count=0;
		 while(rs.next()) {
			 value person = new value();
               person.setNum(rs.getInt("id"));
               personlist.add(person);
               
               int n =personlist.size();
     		  for(int i=0; i<n; i++) {
     			 int num =(personlist.get(i).getNum());
     				 if(index == num) {
     					 if(num == rs.getInt(1)) {
     						 count++;
     					 System.out.println(rs.getInt(1)+ "\t" +rs.getString(2)+ "\t" +rs.getInt(3)+ "\t" +rs.getInt(4) );
     					 }
     			 }
     		  }
		 }
		 if(count==0) {
			 System.out.println("Data not Found");
		 }
		  rs.close();
		  stmt.close();
		  con.close();
	}

}
class value{
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}