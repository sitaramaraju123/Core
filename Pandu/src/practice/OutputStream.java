package practice;
import java.io.*;
import java.util.zip.DeflaterOutputStream;
public class OutputStream {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		FileOutputStream fo =new FileOutputStream("Just.txt");
		
		BufferedOutputStream about = new BufferedOutputStream(fo, 1024);
		DeflaterOutputStream bi =new DeflaterOutputStream(about);
		
		System.out.println("Please Enter Something.... @ to Exit");
		
		char ch;
		while((ch = (char)br.read())!='@') {
			bi.write(ch);
		}
		bi.close();
		System.out.println("End");
	}
 
}
