package Collections;
import java.util.*;
public class ListExample2 {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<>();
		al.add("Sitaramaraju");
		al.add("Madhu");
		al.add("Hari");
		al.add("krishna Sai");
		al.add(1,"Ashfaaq");        //Add method using Index values to set the place
		al.add("Sitaramaraju");
		//al.sort(Comparator.naturalOrder());     //sort method using comparator natural order
		
		List<String> al1 = new ArrayList<>();
		al1.add("Jeevan");
		al1.add("Kalyan");
		//al1.clear();                //Clear Method
		al1.add("Hema kumar");
		al1.add("Ganesh"); 
		al1.add("Suresh");
		al1.add("Hema kumar");
		al1.add("Hema kumar");
		al1.add("Hema kumar");
		al1.set(6, "Srikanth");           //set method
		al1.addAll(al);    //Add all method
		al1.remove(2);                         //Remove Method by using Index number
		al1.remove("Hema kumar");               //Remove method by using elements 
		                         //Remove all method is Used to remove all data in the array
		
		//al1.sort(String.CASE_INSENSITIVE_ORDER);   //Sort method using case insensitive Order
		
		 
		
		for(String s : al) {
			System.out.println(s);           
		}
		
		System.out.println();
		
		for(String a :al1) {
			System.out.println(a);
		}
		System.out.println();
		System.out.println(al.equals(al1));   //equals Method
		
		System.out.println();
		
		System.out.println(al.isEmpty());    //Empty Method
		
		System.out.println();
		System.out.println(al.lastIndexOf("Sitaramaraju"));   //last index method
		
		System.out.println();
		
		
		
		System.out.println(al.indexOf("Sitaramaraju"));      //Index method
		
		System.out.println();
		
		System.out.println(al.contains("Madhu"));
		
		System.out.println();
		
		System.out.println(al1.subList(0, 4));     //sublist method
	}

}
