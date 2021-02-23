package SerializationAndDeserialization;
import java.io.*;
import java.util.Scanner;
public class SerialiZation {

	public static void main(String[] args) throws IOException{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter data");
		String name ="";
		for(int i=1; i<=3; i++) {
			name = (name +"\n"+ sc.nextLine());
		}
		Demo223 obj = new Demo223(name);
				FileOutputStream f = new FileOutputStream("A.txt");
				 BufferedOutputStream D = new BufferedOutputStream(f,1024);
				 ObjectOutputStream out = new ObjectOutputStream(D);
				out.writeObject(obj);
				out.close();
		System.out.println("Success");
	}

}