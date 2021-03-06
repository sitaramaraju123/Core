package Collections;
import java.util.*;
public class LinkedlistExample {

	public static void main(String[] args) {
		LinkedList<Student1> l = new LinkedList<>();
		
		l.add(new Student1(24));
		l.add(new Student1(25));
		l.add(1,new Student1(30));
		l.set(2,new Student1(35));
		
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

}

class Student1{
	int rollno;
	Student1(int rollno){
		this.rollno=rollno;
	}
	public String toString() {
		return" "+rollno;
	}
}