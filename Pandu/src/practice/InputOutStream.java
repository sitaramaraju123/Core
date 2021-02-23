package practice;
import java.io.*;
import java.util.zip.InflaterInputStream;
public class InputOutStream {

	public static void main(String[] args) throws IOException {
		InputOutStream decompress = new InputOutStream();
		decompress.Unzip("Just.txt","Unzip.txt");
	}

	private void Unzip(String string, String string2) throws IOException{
		
			FileInputStream fin = new FileInputStream(string);
			InflaterInputStream in = new InflaterInputStream(fin);
			FileOutputStream fo = new FileOutputStream(string2);
		
			int i;
			while((i = in.read())!=-1) {
				fo.write((char) i);
			}
			fo.close();
			System.out.println("Unzipped...");
		}  
			
	}

