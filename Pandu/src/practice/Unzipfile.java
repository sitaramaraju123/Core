package practice;
import java.io.*;
import java.util.zip.InflaterInputStream;

public class Unzipfile {

	public static void main(String[] args) throws IOException {
		FileInputStream F = new FileInputStream("Zip.txt");
		InflaterInputStream I = new InflaterInputStream(F);
		FileOutputStream O = new FileOutputStream("Unzip1.txt");
		int i;
		while((i = I.read())!=-1) {
			O.write((char)i);
			
		}
		O.close();
		System.out.println("Unzipped....");

	}

}
