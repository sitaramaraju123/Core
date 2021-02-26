package Bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("                      Welcome to Hari Bank");
		System.out.println();
		System.out.println(" 1. Create Account  2. Deposit  3. Withdraw  4. Balance Check");
		int n = sc.nextInt();
		Bank_holder b;
		switch(n) {
		case 1: System.out.println("        Create Account");
		Create c= new Create();
		Thread t = new Thread() {
			public void run() {
				try {
					c.table();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t.start();
		break;
		case 2:System.out.println("         Deposit ");
		System.out.print("Enter Account Holder Name: ");
		String name = sc.next();
		System.out.print("Enter pin: ");
		int pin = sc.nextInt();
		 b= new Bank_holder(name, pin);
		 Thread t1 = new Thread() {
			public void run() {
				try {
					b.Deposit();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		 };
		 t1.start();
		 break;
		case 3:System.out.println("         Withdraw ");
		System.out.print("Enter Account Holder Name: ");
		String name1 = sc.next();
		System.out.print("Enter pin: ");
		int pin1 = sc.nextInt();
		 b= new Bank_holder(name1, pin1);
		 Thread t2 = new Thread() {
			public void run() {
				try {
					b.Withdraw();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		 };
		 t2.start();
		 break;
		case 4: System.out.println("         Balance Check ");
		System.out.print("Enter Account Holder Name: ");
		String name2 = sc.next();
		System.out.print("Enter pin: ");
		int pin2 = sc.nextInt();
		 b= new Bank_holder(name2, pin2);
		 Thread t3 = new Thread() {
			public void run() {
				try {
					b.Balance();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		 };
		 t3.start();
		 break;
		}
	}

}
class Bank_holder{
	Scanner sc = new Scanner(System.in);
	String name;
	int pin;
	Bank_holder(String name, int pin){
		this.name=name;
		this.pin=pin;
	}
	synchronized void Deposit() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		Statement stmt = con.createStatement();
		String q = "SELECT holder_name, pin, acount_balance FROM bank"; 
		ResultSet rs    = stmt.executeQuery(q);
		int count=0;
		while(rs.next()) {
			if(name.equals(rs.getString(1)) &&  pin==(rs.getInt(2))) {
				System.out.println("Welcome "+name);
				System.out.println();
				float amt = rs.getFloat(3); 
				count++;
				System.out.print("Enter your pin: ");
				int p = sc.nextInt();
					System.out.print("Enter Deposit Amount: ");
					float dep = sc.nextFloat();
					if(amt>=dep && dep%100==0) {
					float balance1 =dep+amt;
					String q1 = "update bank set acount_balance ="+balance1+" where pin = "+p;
					stmt.executeUpdate(q1);
					System.out.println("Total Amount Deposited: "+dep);
					break;
					}else {
						System.out.println("Only 100, 200, 500, 2000 Notes are Accpeted");
					}
			}
		}
		if(count==0) {
			System.out.println("Invalid Details");
		}
		rs.close();
		stmt.close();
		con.close();
	}
	synchronized void Withdraw() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		Statement stmt = con.createStatement();
		String q = "SELECT holder_name, pin, acount_balance FROM bank"; 
		ResultSet rs    = stmt.executeQuery(q);
		int count=0;
		while(rs.next()) {
			if(name.equals(rs.getString(1)) &&  pin==(rs.getInt(2))) {
				System.out.println("Welcome "+name);
				System.out.println();
				float amt = rs.getFloat(3);
				count++;
				System.out.print("Enter your pin: ");
				int p = sc.nextInt();
					System.out.print("Enter Withdraw Amount: ");
					float dep = sc.nextFloat();
					if(amt>=dep && dep%100==0) {
					float balance1 =amt-dep;
					String q1 = "update bank set acount_balance ="+balance1+" where pin = "+p;
					stmt.executeUpdate(q1);
					System.out.println("Total Amount in your Account: "+balance1);
					break;
					}else {
						System.out.println("Please Check your Balance");
						break;
					}
			}
		}
		if(count==0) {
			System.out.println("Invalid Details");
		}
		rs.close();
		stmt.close();
		con.close();
	}
	synchronized void Balance() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		Statement stmt = con.createStatement();
		String q = "SELECT holder_name, pin, acount_balance FROM bank"; 
		ResultSet rs    = stmt.executeQuery(q);
		int count=0;
		while(rs.next()) {
			if(name.equals(rs.getString(1)) &&  pin==(rs.getInt(2))) {
				System.out.println("Welcome "+name);
				System.out.println();
				float amt = rs.getFloat(3);
				System.out.println("Your Current Balance is: "+amt);
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("Invalid Details");
		}
		rs.close();
		stmt.close();
		con.close();
	}
}

class Create{
	void table() throws SQLException {
	 Scanner sc = new Scanner(System.in);
	 Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
	 String query = " insert into bank (id, holder_name, pin, acount_balance) values (?, ?, ?, ?)";
	  PreparedStatement pre = con.prepareStatement(query);
	  System.out.print("Enter id:");
	  int id = sc.nextInt();
	  System.out.print("Enter your Name: ");
	  String name = sc.next();
	  System.out.print("Enter any 4 digits pin: ");
	  int pin = sc.nextInt();
	  System.out.print("Enter how much Amount you want to deposit: ");
	  float balance = sc.nextFloat();
	  pre.setInt(1, id);
	  pre.setString(2, name);
	  pre.setInt(3, pin);
	  pre.setFloat(4, balance);
	  int n =pre.executeUpdate();
	  System.out.println("Your Account Was Created Successfully");
	}
}