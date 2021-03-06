package Collections;
import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap tm= new TreeMap();
		tm.put("name","Hai");
		tm.put("Age", "Hello");
		tm.put("height", "6");
		Set s=tm.keySet();
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			String st = (String)obj;
			System.out.println(st+" "+tm.get(st));
		}

	}

}
