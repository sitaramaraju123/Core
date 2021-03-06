package Collections;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		Stack s =new Stack();
		s.push(5);
		s.push(3);
		s.push(2);
		s.push(4);
		s.push(1);
		System.out.println(s);          //push method
		System.out.println(s.peek());    //peek method
		System.out.println(s.empty());    //empty method
		System.out.println(s.search(3));  //search method
		s.pop();                          //pop method
		System.out.println(s);
	}

}
