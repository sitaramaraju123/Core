package practice;
import java.util.*;
public class CustomException {

	public static void main(String[] args) {
		One a = new One("Sita");
		try {
			throw a;
		}
		catch(One e) {
			System.out.println(e.getMessage());
		}
		a.m1();
	}

}

class One extends Exception{
	One(String name){
		super(name);
	}
	void m1(){
		Two b = new Two("Rama");
		try {
			
			throw b;
		}
		catch(Two e) {
			System.out.println(e.getMessage());
		}
		b.m2();
	}
}

class Two extends Exception{
	Two(String name){
		super(name);
	}
	void m2(){
		
		try {
			Three c = new Three("Raju");
			throw c;
		}
		catch(Three e) {
			System.out.println(e.getMessage());
		}
	}
}

class Three extends Exception{
	Three(String name){
	super(name);
	}
}