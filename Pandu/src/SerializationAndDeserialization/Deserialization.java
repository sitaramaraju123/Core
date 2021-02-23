package SerializationAndDeserialization;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fin =new FileInputStream("A.txt");
		ObjectInputStream ob = new ObjectInputStream(fin);
		Demo223 obj =(Demo223) ob.readObject();
		obj.display();
		ob.close();
	}

}
