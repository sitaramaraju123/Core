package dbpackage;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SwitchData {

	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		Connection con = DriverManager.getConnection("jdbc:mysql:///databasename","root","mysql");
		Statement stmt = con.createStatement();
		System.out.println("Enter Any Option you want ");
		System.out.println(" 1.Insert \n 2.Update \n 3.Delete \n 4.Alter Column \n 5.Search Details");
		int num = sc.nextInt();
		switch(num) {
		
		 case 1:  System.out.println("Before Inserting data");
                  Employetable db4 = new Employetable();
			      db4.main(args);
			      String query = " insert into employe_table (sno, employee_name, employe_age, employee_id, employe_salary, emp_pic) values (?, ?, ?, ?, ?, ?)";
				  PreparedStatement pre = con.prepareStatement(query);
				  try {
					  System.out.println();
			      System.out.print("How many Employes data you want to insert: ");
                  int no = sc.nextInt();
                  for(int i=0; i<no; i++) {
				  System.out.print("Enter Sno:");
				  int id = sc.nextInt();
				  System.out.print("Enter Employe name: ");
				  String name = sc.next();
				  System.out.print("Enter Employe Age: ");
				  int age = sc.nextInt();
				  System.out.print("Enter Employe Id: ");
				  int id1 = sc.nextInt();
				  System.out.print("Enter Employe Salary: ");
				  int salary = sc.nextInt();
				  System.out.println("Enter your Image Name: ");
				  String image = sc.next();
				  pre.setInt(1, id);
				  pre.setString(2, name);
				  pre.setInt(3, age);
				  pre.setInt(4, id1);
				  pre.setInt(5, salary);
				  InputStream in = new FileInputStream("D:\\"+image+".jpg");
				  pre.setBlob(6,in);
				  int n =pre.executeUpdate();
				  System.out.println(n+ " Rows of Data Inserted Successfully..");
				  
				  String sql = "SELECT * FROM employe_table";
				  ResultSet rse  = stmt.executeQuery(sql);
	       	     System.out.print("Enter Sno: ");
	       	     String sno = sc.next();
	    	     byte b[];
	    	     Blob blob;
	        	    while(rse.next())
	       	     {
	       	      if(sno.equalsIgnoreCase(rse.getString(1))) {
	       	      File f=new File("D:\\Emp_pics\\" + name + ".jpg");
	       	      FileOutputStream fs=new FileOutputStream(f);
	       	      blob=rse.getBlob("emp_pic");
	       	      b=blob.getBytes(1, (int)blob.length());
	       	      fs.write(b);
	       	      System.out.println("Image stored in D Folder..");
	       	      break;
	       	      }
	       	     }
                  }
				  System.out.println();
                  System.out.println("After Inserting data");
                  Employetable db5 = new Employetable();
			      db5.main(args);
				  }catch(Exception e) {
					  System.out.println("Enter Proper details to Insert");
				  }
				  con.close();
				  pre.close();
				  break;
				  
		 case 2:  System.out.println("Before Updating data");
		          Employetable db = new Employetable();
                  db.main(args);
                  try {
			      System.out.print("Which data you want to update: ");
		          System.out.println("\n 1.Employe name \n 2.anything \n 3.Image");
		          int n = sc.nextInt();
		          //int no1 = sc.nextInt();
		          if(n==1) {
		        	  String q = "update employe_table set employee_name = ? where sno = ?";
					  PreparedStatement pre2 = con.prepareStatement(q);
		        	  System.out.print("Enter Employee Name to Update: ");
		        	  String uname=sc.next();
		        	  System.out.print("Enter Sno: ");
		        	  int na=sc.nextInt();
		        	  pre2.setString(1, uname);
		        	  pre2.setInt(2, na);
		        	  pre2.executeUpdate();
		        	  System.out.println("Data Updated Successfully");
					 
		        	  pre2.close();
		          }else if(n==2) {
		        	  System.out.println("Column names: "+"\nemploye_age"+"\nemployee_id"+"\nemploye_salary");
		        	  System.out.print("Enter any column name to Update: ");
		        	  String ntg = sc.next();
		    	  String q = "update employe_table set "+ntg+"= ? where sno = ?";
				  PreparedStatement pre2 = con.prepareStatement(q);
//		          for(int j=0; j<no1; j++) {
				  System.out.print("Enter "+ntg+" to update: ");
				  int name = sc.nextInt();
				  System.out.print("Enter Sno: ");
			      int nu = sc.nextInt();
				  pre2.setInt(1, name);
				  pre2.setInt(2, nu);
				  pre2.executeUpdate();
				  System.out.println("Data Updated Successfully..");
//		          }
				  pre2.close();
		          }else if(n==3) {
		        	  String q = "update employe_table set emp_pic= ? where sno = ?";
		        	  PreparedStatement pstmt = con.prepareStatement(q);
		        	  System.out.print("Enter uploading  Image name: ");
		        	  String name = sc.next();
		        	  System.out.print("Enter Sno: ");
		        	  int id = sc.nextInt();
		        	    InputStream in = new FileInputStream("D:\\"+name+".jpg");
		        	    pstmt.setBlob(1, in);
		        	    pstmt.setInt(2, id);
		        	    pstmt.executeUpdate();
		        	    System.out.println("Image inserted......");
		        	    System.out.println();
		        	    String sql = "SELECT * FROM employe_table";
					  ResultSet rse  = stmt.executeQuery(sql);
		       	     System.out.print("Enter Sno: ");
		       	     String sno = sc.next();
		    	     byte b[];
		    	     Blob blob;
		        	    while(rse.next())
		       	     {
		       	      if(sno.equalsIgnoreCase(rse.getString(1))) {
		       	      File f=new File("D:\\Emp_pics\\" + name + ".jpg");
		       	      FileOutputStream fs=new FileOutputStream(f);
		       	      blob=rse.getBlob("emp_pic");
		       	      b=blob.getBytes(1, (int)blob.length());
		       	      fs.write(b);
		       	      System.out.println("Image stored in D Folder..");
		       	      break;
		       	      }
		       	     }
		          }
		          
		          System.out.println();
		          System.out.println("After Updating data");
		          Employetable db1 = new Employetable();
		          db1.main(args);
                  }
				  catch(Exception e) {
					  System.out.println("Enter Proper Details to Upload");
				  }
				  con.close();
		          break;
		          
		 case 3:  System.out.println("Before Deleting data");
		          Employetable db3 = new Employetable();
                  db3.main(args);  
                  String quary="delete from employe_table where sno=?";
				  PreparedStatement pre1 = con.prepareStatement(quary);
                  try {
			      System.out.print("How many data you want delete: ");
		          int no2 = sc.nextInt();
		          for(int k=0; k<no2; k++) {
				  System.out.print("Enter id to Delete: ");
				  int num1 = sc.nextInt();
				  pre1.setInt(1, num1);
				  pre1.execute();
				  System.out.println("Data deleted Successfully");
		          }
		          System.out.println("After Deleting data");
		          Employetable db6 = new Employetable();
                  db6.main(args);
                  }catch(Exception e) {
                	  System.out.println("Enter proper details to Delete");
                  }
				  pre1.close();
				  con.close();
		          
		          break;
		          
		 case 4: try { 
			      System.out.print("How many Column you want to Add: ");
		          int no3=sc.nextInt();
		          for(int l=0; l<no3; l++) {
				  System.out.println("Enter Table name: ");
				  String tablename=sc.next();
				  System.out.print("Enter column name: ");
				  String name = sc.next();
				  System.out.println("Enter type: ");
				  String type = sc.next();
				  String que = "alter table "+tablename+" add "+name+" "+type+"";
				  stmt.execute(que);
				  System.out.println("Alter Table is Add Successfully..");
		          }
		          }catch(Exception e) {
			      System.out.println("Enter proper details to Add new Column");
		          }
				  con.close();
				  stmt.close();
		          break;
		        
		 case 5:  System.out.println("All Details");
		          Employetable db7 = new Employetable();
			      db7.main(args);
			      System.out.println();
			      String sql = "SELECT * FROM employe_table";
			      ResultSet rs  = stmt.executeQuery(sql);
			      try {
			      System.out.print("Enter your login details to Search your details: ");
			      String name = sc.next();
			      int count=0;
			     
			      while(rs.next()) {
			    	  if(name.equalsIgnoreCase(rs.getString(1)) || name.equalsIgnoreCase(rs.getString(2)) || name.equalsIgnoreCase(rs.getString(3)) || name.equalsIgnoreCase(rs.getString(4)) || name.equalsIgnoreCase(rs.getString(5)) ) {
			    		  System.out.println("Sno"+"\tEmploye Name"+"\tEmploye Age"+"\tEmploye id"+"\tEmploye Salary"+"\tEmploye Image");
			    		  System.out.println(rs.getInt(1) + "\t " + rs.getString(2)+"\t     "+rs.getInt(3)+"\t        "+rs.getInt(4)+"\t         "+rs.getInt(5)+"\t   "+rs.getBlob(6));
			    		  count++;
			    		  break;
			    	  }
			      }
			      System.out.println();
			      if(count==0) {
			    	  System.out.println("Entered details are Not Inserted in database");
			      }
			      }
			      catch(Exception e) {
			    	  System.out.println("Enter proper details to Search Data");
			      }
			      rs.close();
			  	  stmt.close();
			  	  con.close();
			      break;
		}
	}

}
