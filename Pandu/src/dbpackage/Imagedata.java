package dbpackage;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Imagedata {
public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
	String img = "INSERT INTO image VALUES(?,?,?)";
	PreparedStatement pstmt = con.prepareStatement(img);
	System.out.print("Enter id: ");
	String s = br.readLine();
	int id = Integer.parseInt(s);
	System.out.print("Enter Name: ");
	String name=br.readLine();
	System.out.print("Enter Image name: ");
	String image=br.readLine();
	pstmt.setInt(1, id);
    pstmt.setString(2, name);
    InputStream in = new FileInputStream("D:\\"+image+".jpg");
    pstmt.setBlob(3, in);
    pstmt.execute();
    System.out.println("Record inserted......");
    con.close();
    pstmt.close();
}
}
