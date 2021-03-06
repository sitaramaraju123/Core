package Collections;
import java.util.*;
public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable h =new Hashtable<>();
		h.put("name","Sitaramaraju"); 
		h.put("age","24");
		h.put("dop", "26 Apr");
		
		Set s=h.keySet();
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			String str=(String)obj;
			System.out.println(str+" "+h.get(str));
		}

	}

}
