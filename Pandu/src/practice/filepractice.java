package practice;
import java.io.*;
import java.util.Scanner;
public class filepractice {

	public static void main(String[] args) {
		try {
			File myfile = new File("test.txt");
			if(myfile.createNewFile()) {
				System.out.println("File Created: "+myfile.getName());  /// Creating File
			}else {
				System.out.println("File already Created...");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
		//==================================================================================
		try {
			FileWriter mywrite = new FileWriter("test.txt");
			mywrite.write("This is the File Write Program......"); //// Writing data to File
			mywrite.close();
			System.out.println("Successfully Completed...");
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
		//===================================================================================
		try {
			File myread =new File("test.txt");          ////Reading the File
			Scanner sc = new Scanner(myread);
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
		//====================================================================================
		File mydel = new File("test.txt");
		if(mydel.delete()) {
			System.out.println("Deleted the File....");   /// Deleting the File
		}else {
			System.out.println("fail to delete..");
		}
		
	}

}
