package practice;
import java.util.*;
import java.io.*;
public class ExampleFiles {

	public static void main(String[] args) throws IOException {
		File mybj = new File("D:\\Demotest.txt");
		
		if(mybj.createNewFile()) {
			System.out.println("File Created..");
		}else {
			System.out.println("File already Exists..");
		}
		
		System.out.println();
		
		if(mybj.exists()) {
			System.out.println(mybj.getName());
			System.out.println(mybj.getAbsolutePath());
			System.out.println(mybj.length());
			System.out.println(mybj.canRead());
			System.out.println(mybj.canWrite());
		}else {
			System.out.println("File Doesn't Exists...");
		}
		
		
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			FileOutputStream s = new FileOutputStream("D:\\Demotest.txt");
			Scanner sc = new Scanner(System.in);
			String name= sc.nextLine();
			byte b[] = name.getBytes();
			
//			System.out.println("Please Enter Something.... @ to Exit");
//			char ch;
//			while((ch = (char)br.read())!='@') {
			s.write(b);
//			}
			s.close();
			System.out.println("Successfully Updated");
	
//			catch(IOException e) {
//				e.printStackTrace();
//			}
		
		
	}

}
