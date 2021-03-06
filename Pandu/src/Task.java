package Collections;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class Task {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<D> a = new ArrayList<>();
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		Statement stmt = con.createStatement();
		String sql = "select * from login";
		 ResultSet rs  = stmt.executeQuery(sql);
		 int n=0;
		 while(rs.next()) {
			 D b = new D(rs.getInt(1), rs.getString(2), rs.getString(3));
			 a.add(b);
			 n=a.size();
			 }
		 for(D d:a) {
			 System.out.println(d);
		 }
//		 System.out.println();
//		 System.out.print("Enter your id: ");
//		 int num=sc.nextInt();
//		 for(D d1:a) {
//			 if(num==d1.id) {
//				 System.out.println(d1);
//			 }
//		 }
	}

}
class D{
	int id;
	String Username;
	String Password;
	D(int id, String Username, String password){
		this.id=id;
		this.Username=Username;
		this.Password=password;
	}
	public String toString() {
		return" "+id+"   "+Username+"    "+Password;
	}
}