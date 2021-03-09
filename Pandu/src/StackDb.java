package Collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Stack;

public class StackDb {

	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		Statement st =con.createStatement();
		String s="select * from map";
		ResultSet rs = st.executeQuery(s);
		Stack<D1> s1 = new Stack<>();
		while(rs.next()) {
			D1 d = new D1(rs.getInt(1),rs.getString(2));
			s1.push(d);
		}
		for(D1 d1 : s1) {
			System.out.println(d1.n+" "+d1.name);
		}
		ArrayList<D1> al1 = new ArrayList<>();
		ListIterator<D1> l = s1.listIterator(s1.size());
		while(l.hasPrevious()) {
			al1.add(l.previous());
		}
		for(D1 d2: al1) {
			System.out.println(d2.n+" "+d2.name);
		}
		System.out.println();
	
	}

}
class D1{
	int n;
	String name;
	D1(int n, String name){
		this.n=n;
		this.name=name;
	}
}