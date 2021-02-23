package practice;
import java.io.*;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
   try {
	   FileInputStream fi = new FileInputStream("C:\\Lnd\\Java\\Pandu\\src\\practice\\A.java");
			Scanner myr = new Scanner(fi);
			while(myr.hasNextLine()) {
			String data = myr.nextLine();
			System.out.println(data);
			}
			myr.close();
			
//			int i=0;
//			while((i= fi.read())!=-1) {
//			System.out.print((char)i);
//			}
//			fi.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
