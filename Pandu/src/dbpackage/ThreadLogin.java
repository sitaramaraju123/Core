package dbpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ThreadLogin {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter User name: ");
		String name =sc.next();
		System.out.print("Enter Password: ");
		String pass = sc.next();
		Login l =new Login(name, pass);
			Thread t1= new Thread() {
				@Override
				public void run() {
					try {
						l.first();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			};
			t1.start();
			
			Thread t2= new Thread() {
				public void run() {
					try {
						l.second();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			};
			t2.start();
	}
}

class Login{
	String name;
	String pass;
	Login(String name, String pass){
		this.name=name;
		this.pass=pass;
	}
	Connection con ;
	Statement stmt;
	int count=0;
	synchronized void first() throws SQLException {
		con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		stmt = con.createStatement();
		String sql = "SELECT User_name, Password FROM login where id <=7";
		ResultSet rs    = stmt.executeQuery(sql);
		
		while(rs.next()) {
			if(name.equals(rs.getString(1)) && pass.equals(rs.getString(2))) {
				System.out.println("Welcome "+ rs.getString("User_name"));
				count++;
				break;
			}
		}
			try {
				wait();
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(count==0) {
				System.out.println("Invalid data");
			}
	}
	synchronized void second() throws SQLException {
		String sql = "SELECT User_name, Password FROM login where id > 7 and id<=12";
		ResultSet rs    = stmt.executeQuery(sql);
		while(rs.next()) {
			if(name.equals(rs.getString(1)) && pass.equals(rs.getString(2))) {
				System.out.println("Welcome "+ rs.getString("User_name"));
				count++;
				break;
			}
	}
		notify();
	}	
	}
