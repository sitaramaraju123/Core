package Bank;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import com.itextpdf.text.List;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

public class Shopping {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		Statement st=con.createStatement();
		ResultSet rs = st.executeQuery("select * from market");
		Vector<Products> vp = new Vector<>();
		System.out.println("                    Market");
		System.out.println();
		Vector<Bill> vp1 = new Vector<>();
		try {
		while(rs.next()) {
			Products p = new Products(rs.getInt(1),rs.getString(2),rs.getInt(3));
			vp.add(p);
			
			Bill p1 = new Bill(rs.getInt(3));
			vp1.add(p1);
		}
		rs.close();
		st.close();
		System.out.println("Items List: ");
		for(Products pro:vp) {
			System.out.println(pro.id+"   "+pro.items+"   "+pro.prize);
		}
		
		float milk=0;
		float egg1=0;
		float chicken=0;
		float ricebag=0;
		float sum=0;
		for(int x=1;x<=vp.size();x++) {
			System.out.println("if you want to add more items..");
			System.out.println("Enter 1.Shopping  2.exit");
			int n=sc.nextInt();
			if(n==1) {
		System.out.print("How many items you want: ");
		int it=sc.nextInt();
		for(int i=1;i<=it;i++) {
			System.out.print("Select item id: ");
			int idno=sc.nextInt();
			switch(idno){
			case 1: 
				System.out.print("How many liters you want: ");
				float liter = sc.nextFloat();
				for(Bill a:vp1) {
					if(40==a.num) {
						milk+=(liter*(a.num));
						System.out.println(milk);
						break;
					}
				}
				break;
			case 2: 
				System.out.print("How many eggs you want: ");
				float egg = sc.nextFloat();
				for(Bill a:vp1) {
					if(5==a.num) {
					egg1+=(egg*(a.num));
					System.out.println(egg1);
					break;
					}
				}
				break;
			case 3:
				System.out.print("How many kg's of chicken you want: ");
				float chicken1 = sc.nextFloat();
				for(Bill a:vp1) {
					if(220==a.num) {
						chicken+=(chicken1*(a.num));
					System.out.println(chicken);
					break;
					}
				}
				break;
			case 4:
				System.out.print("How many bags you want: ");
				float rice = sc.nextFloat();
				for(Bill a:vp1) {
					if(1200==a.num) {
						ricebag+=(rice*(a.num));
					System.out.println(ricebag);
					break;
					}
				}
				break;
			}
			
		}
			}else {
				break;
			}
		}
		for(int j=1; j<=vp1.size(); j++) {
		System.out.println("if you want to remove any item  \nEnter item id  (or)\nEnter 0 to billing ");
		int x1=sc.nextInt();
		if(x1==1) {
			System.out.print("How many liters you want remove: ");
			float l=sc.nextFloat();
			milk-=(40*l);
		}else if(x1==2) {
			System.out.print("How many egg's you want remove: ");
			float l=sc.nextFloat();
			egg1-=(5*l);
		}else if(x1==3) {
			System.out.print("How many kg's you want remove: ");
			float l=sc.nextFloat();
			chicken-=(220*l);
		}else if(x1==4) {
			System.out.print("How many bags you want remove: ");
			float l=sc.nextFloat();
			ricebag-=(1200*l);
		}else {
			break;
		}
		}
		System.out.println("if you are New to our market \nenter 1  or not\nenter 2");
		int New = sc.nextInt();
		if(New==1) {
			String sq="insert into map (name,Phone_number) values (?, ?)";
			PreparedStatement pre = con.prepareStatement(sq);
			System.out.print("Enter your name: ");
			String name=sc.next();
			System.out.println("Enter your Phone Number: ");
			String number = sc.next();
			 pre.setString(1, name);
			 pre.setString(2, number);
			 pre.execute();
			 sum=(float) (0.9*(milk+egg1+chicken+ricebag));
			 
				if(milk!=0) {
					System.out.println("Milk: "+milk);
					System.out.println("=============");
				if(egg1!=0) {
					System.out.println("Egg's: "+egg1);
					System.out.println("=============");
				if(chicken!=0) {
					System.out.println("Chicken: "+chicken);
					System.out.println("=============");
				if(ricebag!=0) {
					System.out.println("Rice: "+ricebag);
					System.out.println("=============");
				}
				}
				}
				}
				System.out.println("Total: "+sum);
		}else if(New==2) {
			Shopping.Set();
			if(milk!=0) {
				System.out.println("Milk: "+milk);
				System.out.println("=============");
			if(egg1!=0) {
				System.out.println("Egg's: "+egg1);
				System.out.println("=============");
			if(chicken!=0) {
				System.out.println("Chicken: "+chicken);
				System.out.println("=============");
			if(ricebag!=0) {
				System.out.println("Rice: "+ricebag);
				System.out.println("=============");
			}
			}
			}
			}
			System.out.println();
			System.out.println("Total:- "+(milk+egg1+chicken+ricebag));
		}
		
		}catch (Exception e) {
			System.out.println("Please Check your Entered details");
		}
	}
static void Set() throws Exception {
	Scanner sc = new Scanner(System.in);
	Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
	Statement st=con.createStatement();
	ResultSet rs = st.executeQuery("select * from map");
	System.out.println("Please Enter your Phone which is exceded");
	String phone = sc.next();
	while(rs.next()) {
		if(phone.equals(rs.getString(2))) {
			System.out.println("Welcome "+rs.getString(1));
			System.out.println("======================");
		}
	}
}
}
class Products{
	int id;
	String items;
	int prize;
	public Products(int id, String items, int prize) {
		this.id = id;
		this.items = items;
		this.prize = prize;
	}
	
}
class Bill{
	int num;
	public Bill(int num) {
		this.num = num;
	}
	
}
