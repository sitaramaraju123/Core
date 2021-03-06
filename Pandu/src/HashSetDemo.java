package Collections;
import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("Ashfaaq");
		h.add("Hari");
		h.add("Madhu");
		h.add("Sitaramaraju");
		
		Iterator it =h.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
