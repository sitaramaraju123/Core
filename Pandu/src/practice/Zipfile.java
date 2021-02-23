package practice;
import java.io.*;
import java.util.zip.DeflaterOutputStream;
public class Zipfile {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileOutputStream f = new FileOutputStream("Zip.txt");
		BufferedOutputStream B = new BufferedOutputStream(f,1234);
		DeflaterOutputStream D = new DeflaterOutputStream(f);
		System.out.println("Enter any Data..");
		char ch;
		while((ch=(char)br.read())!='#') {
			D.write(ch);
		}
		D.close();
		System.out.println("Check your File..");
	}

}
