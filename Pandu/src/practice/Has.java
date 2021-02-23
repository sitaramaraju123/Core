package practice;
import java.util.*;
class planets{
	Sun s;
	planets(Sun s){
		this.s=s;
	}
	void test() {
		switch(s.name){
		case "Hari" :{
			System.out.println("Handsome hunk of regnent and Also 420..");
			break;
		}
		case "Madhu" :{
			System.out.println("Silent killer and Actor and Futuer elonmusk..");
			break;
		}
		case "Srikanth" :{
			System.out.println("Rebel candidate And leader..");
			break;
		}
		case "Hemakumar" :{
			System.out.println("Python ka baap and Sr coder..");
			break;
		}
		case "Kalyantarun" :{
			System.out.println("Viz ka don and regnent ka stylish star..");
			break;
		}
		case "Krishnasai" :{
			System.out.println("Decent fellow..");
			break;
		}
		case "Jeevan" :{
			System.out.println("Chill bro with Budweiser..");
			break;
		}
		case "Suresh":{
			System.out.println("Lover boy of Regnent..");
			break;
		}
		case "Ganesh" :{
			System.out.println("Jr Mark zuckerberg..");
			break;
		}
		case "Ashfaaq":{
			System.out.println("Jr coder and Lover boy of telangana..");
			break;
		}
		case "Swathi":{
			System.out.println("Hybread pilla with little crack..");
			break;
		}
		case "Vagdevi":{
			System.out.println("Joined as fresher but coding like pro..");
			break;
		}
		default:{
			System.out.println("There is no one is there with this name");
		}
		}
	}
}

class Sun{
	String name;
	Sun(String name){
		this.name=name;
	}
}
public class Has {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=sc.next();
		Sun se = new Sun(name);
		planets d = new planets(se);
		d.test();
	}

}

