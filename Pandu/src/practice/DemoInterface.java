package practice;
import java.util.*;
public class DemoInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Name: ");
		String name = sc.nextLine();
		SeDemo s = new SeDemo();
		s.nam(name);
		s.num();
		s.num1();
	}

}
interface InDemo1{
	String name = "pandu";
	void num();
}
interface InDemo2{
	String name = "Ram";
	void num1();
}
abstract class Abdemo implements InDemo1,InDemo2{
	String search_Name;
	void nam(String search_Name) {
		this.search_Name=search_Name;
	}
}
class SeDemo extends Abdemo{

	@Override
	public void num() {
		if(search_Name.equalsIgnoreCase(InDemo1.name)) {
			System.out.println("Sitaramaraju");
		}
	}
	@Override
	public void num1() {
		if(search_Name.equalsIgnoreCase(InDemo2.name)) {
			System.out.println("Ashfaaq");
		}
		
	}
	
}