package practice;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the planet name");
		String name =sc.next();
		Planet s = new Planet();
		Solor se = new Solor();
		se.setPl(s);
		se.show(name);
	}

}

class Planet{
	
	void plan(String name) {
		switch(name) {
		case "Mercury":{
			System.out.println("Radius of Mercury is 2439.7 km");
			break;
		}
		case "Venus":{
			System.out.println("Radius of venus is 6051.8 km");
			break;
		}
		case "Earth":{
			System.out.println("Radius of earth is 6371 km");
			break;
		}
		case "Mars":{
			System.out.println("Radius of mars is 3389.5 km");
			break;
		}
		case "Jupiter":{
			System.out.println("Radius of jupiter is 69911 km");
			break;
		}
		case "Saturn":{
			System.out.println("Radius of saturn is 58232 km");
			break;
		}
		case "Uranus":{
			System.out.println("Radius of uranus is 25362 km");
			break;
		}
		case "Neptun":{
			System.out.println("Radius of neptun is 24622 km");
			break;
		}
		default :{
			System.out.println("No planet with this name");
		}
		}
	}
}

class Solor{
	Planet pl;

	public Planet getPl() {
		return pl;
	}

	public void setPl(Planet pl) {
		this.pl = pl;
	}
	
	public void show(String name) {
		pl.plan(name);
	}
}