package Collections;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		HashMap  m = new HashMap();
		m.put("City","vijayawada");
		m.put("State","Andhra Pradesh");
		m.put("Country","India");
		System.out.println(m);
		System.out.println();
		System.out.println(m.get("State"));
		
		System.out.println();
		Set s=m.keySet();
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			String str =(String)obj;
			System.out.println(str+" "+m.get(str));
		}
	}

}
