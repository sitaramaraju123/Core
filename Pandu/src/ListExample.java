package Collections;
import java.util.*;
public class ListExample {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("Sitaramaraju");
		al.add("Madhu");
		al.add("Hari");
		al.add("krishna Sai");
		System.out.println(al);
		
		System.out.println();
		
		for(String s:al) {                  //Using for Each
			System.out.println(s);
		}
		System.out.println();
		
		for(int i=0; i<al.size(); i++) {      //Using size method
			System.out.println(al.get(i));    //Using get method
		}
		System.out.println();
		
		ListIterator<String> itr = al.listIterator();  //List iterator
		System.out.println("In Forword direction");
		while(itr.hasNext()) {                     //hasNext method
			System.out.println(itr.next());
		}
		
		System.out.println();
		System.out.println("In Reverse direction");   //hasPrevious method
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		System.out.println(); 
		Iterator itr1 = al.iterator();                //Iterator interface
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println();
		
		al.forEach(a->{
			System.out.println(a);                //using for each method by using lamda Expression
		});
		
		System.out.println();
		
		Iterator<String> itr2 = al.iterator();   //Using For each Remaining method
		itr2.forEachRemaining(a1->{
			System.out.println(a1);
		});
	}
}
