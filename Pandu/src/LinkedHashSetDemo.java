package Collections;
import java.util.*;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet l = new LinkedHashSet();
		l.add(10);
		l.add(5);
		l.add(15);
		l.add(20);
		
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
