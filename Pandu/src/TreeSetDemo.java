package Collections;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(10);
		t.add(5);
		t.add(6);
		t.add(1);
		t.add(2);
		
		Iterator it = t.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());       //Asscending order
		}
		System.out.println();
		Iterator it1 = t.descendingIterator();  //descending order
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println();
		System.out.println(t.first());          //first value
		System.out.println();
		System.out.println(t.last());           //last value
		
		System.out.println();
		TreeSet t1 = (TreeSet) t.headSet(10);   //headSet means(less than 10 numbers will be the output)
		System.out.println(t1);
		
		System.out.println();
		TreeSet t2 = (TreeSet) t.tailSet(10);   //tailSet means(greater than 10 numbers will be the output)
		System.out.println(t2);
		
		System.out.println();
		TreeSet t3 = (TreeSet) t.subSet(2,6);   //SubSet means(in between 2 and 6 numbers will be the output)
		System.out.println(t3);
	}

}
