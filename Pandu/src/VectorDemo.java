package Collections;
import java.util.*;
public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector(4,2);
		v.add("Sitaramaraju");
		v.add("Madhu");
		v.add("Hari");
		v.add("Ashfaaq");
		v.add("Krishna sai");
		for(int i=0; i<v.size(); i++) {      
			System.out.println(v.get(i));    
			}
		
		System.out.println(v.capacity());
	}

}
