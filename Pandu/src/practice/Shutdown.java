package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shutdown {

	public static void main(String[] args) throws Exception {
	      Runtime runtime = Runtime.getRuntime();
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	      System.out.print("Enter No. c Seconds after which You want your Computer to Shutdown :");
	      long a=Long.parseLong(br.readLine());

	      Process proc = runtime.exec("shutdown -s -t " +a);

	      System.exit(0);

	}

}
