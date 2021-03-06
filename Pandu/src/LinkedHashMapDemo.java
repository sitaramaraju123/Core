package Collections;
import java.util.*;
public class LinkedHashMapDemo {
public static void main(String[] args) {
	LinkedHashMap hm = new LinkedHashMap();
	hm.put("name", "Sitaramaraju");
	hm.put("Dob", "26thApr");
	hm.put("place", "Vijayawada");
	Set s=hm.keySet();
	Iterator it = s.iterator();
	while(it.hasNext()) {
		Object obj=it.next();
		String st =(String)obj;
		System.out.println(st+" "+hm.get(st));
	}
}
}
