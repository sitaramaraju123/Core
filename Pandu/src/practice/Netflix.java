package practice;
import java.util.*;
public class Netflix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Ranger Name: ");
		String name = sc.next();
		System.out.print("Enter Ranger Color: ");
		String color = sc.next();
		System.out.print("Enter Ranger power: ");
		String power = sc.next();
		Ranger s = new Ranger();
		s.ninjastom(name,color);
		System.out.println();
		s.ninjastom(name, color, power);
	}

}
class PowerRangers{
	String name;
	String color;
	String power;
	void ninjastom(String name,String color) {
		System.out.println("Name: "+name);
		System.out.println("Color: "+color);
	}
	void ninjastom(String name, String color, String power) {
		System.out.println("Name: "+name);
		System.out.println("Color: "+color);
}
}

class Ranger extends PowerRangers{

	@Override
	void ninjastom(String name, String color,String power) {
		super.name=name;
		super.color=color;
		super.power=power;
		System.out.println("Name: "+name);
		System.out.println("Color: "+color);
		System.out.println("Power: "+power);
	}
	
}