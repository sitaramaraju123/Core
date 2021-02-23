package dbpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Retriveimg {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		String s = "select * from employe_table";
		PreparedStatement ps= con.prepareStatement(s);
	     ResultSet rset=ps.executeQuery();
	     byte b[];
	     Blob blob;
	     System.out.print("Enter id (or) name: ");
    	 String name = br.readLine();
    	 System.out.print("Enter image Name: ");
    	 String img =br.readLine();
	     while(rset.next())
	     {
	      if(name.equalsIgnoreCase(rset.getString(1)) || name.equalsIgnoreCase(rset.getString(2))) {
	      File f=new File("D:\\Emp_pics" + img + ".jpg");
	      FileOutputStream fs=new FileOutputStream(f);
	      blob=rset.getBlob("emp_pic");
	      b=blob.getBytes(1, (int)blob.length());
	      fs.write(b);
	      break;
	      }
		}
		System.out.println("Image Retrived Successfully.....");
		ps.close();
		con.close();

}
}
