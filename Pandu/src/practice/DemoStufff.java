package practice;
import java.util.*;
public class DemoStufff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bike name to know details");
		String name = sc.nextLine();
		Royle r = new Royle();
		r.royle(name);
		r.Enfield(); 
	}

}
abstract class Bikes{
	
	abstract void royle(String bike_Name);
	
	//Royle Enfield
	String bike_Name;
	String displacement = "346cc";
	String engine_Type = "Single cylinder 4 "
			+ "stroke, air cooled fuel injection";
	  int  no_of_cylinders = 1;
	String max_power = "20.07ps @ 5450rpm";
	String breaking = "Front Disk and Back Drum";
	String fuel_capacity = "13.5L";
	String Body = "Cruiser Bikes";
	
	//Kawasaki ninja
	
	String displacement1 = "1043cc";
	String engine_Type1 = "In-line foure, 4-stroke,"
			+ " 16-valve, DOHC";
	int no_of_cylinders1 = 4;
	String max_power1 = "142ps @ 10000rpm";
	String breaking1 = "Front Disk and Back Disk";
	String fuel_capacity1 = "19L";
	String Body1 = "Super Bikes, Sports Tourer Bikes";
	
	//Harley-Davidson
	
	String displacement2 = "1745 cc";
	String engine_Type2 = "Milwaukee-Eight 107";
	int no_of_cylinders2 = 2;
	int no_of_gears = 6;
	String max_power2 = "65 bhp @ 5500 rpm";
	String breaking2 = "Front Disk and Back Disk";
	String fuel_capacity2 = "19.1 L";
	String Body2 = "Cruiser Bikes";
	
	//Triumph
	
	String displacement3 = "2458 cc";
	String engine_Type3 = "Inline 3-cylinder, water-cooled, DOHC";
	int no_of_cylinders3 = 3;
	int no_of_gears2 = 6;
	String max_power3 = "167 PS @ 6000 rpm";
	String breaking3 = "Front Disk and Back Disk";
	String fuel_capacity3 = "18 L";
	String Body3 = "Cruiser Bikes";
	
	//Bmw
	
	String displacement4 = "1254 cc";
	String engine_Type4 = "Air-Liquid Cooled, Twin Cylinder, DOHC, Boxer Engines";
	int no_of_cylinders4 = 2;
	int no_of_gears3 = 6;
	String max_power4 = "136 PS @ 7750 rpm";
	String breaking4 = "Front Disk and Back Disk";
	String fuel_capacity4 = "30 L";
	String Body4 = "Adventure Tourer Bikes";
	
}

class Royle extends Bikes{
	@Override
	void royle(String bike_Name) {
		super.bike_Name = bike_Name;
	}
	void Enfield() {
		if(bike_Name.equalsIgnoreCase("Royle enfield")) {
		System.out.println("Bike Name:- "+bike_Name);
		System.out.println("Displacement:- "+displacement);
		System.out.println("Engine Type:- "+engine_Type);
		System.out.println("No of cylinders:- "+no_of_cylinders);
		System.out.println("Max power:- "+max_power);
		System.out.println("Breaks:- "+breaking);
		System.out.println("Fuel capacity:- "+fuel_capacity);
		System.out.println("Body:- "+Body);
	}
		else if(bike_Name.equalsIgnoreCase("Kawasaki ninja")) {
		System.out.println("Bike Name:- "+bike_Name);
		System.out.println("Displacement:- "+displacement1);
		System.out.println("Engine Type:- "+engine_Type1);
		System.out.println("No of cylinders:- "+no_of_cylinders1);
		System.out.println("Max power:- "+max_power1);
		System.out.println("Breaks:- "+breaking1);
		System.out.println("Fuel capacity:- "+fuel_capacity1);
		System.out.println("Body:- "+Body1);

	}
		else if(bike_Name.equalsIgnoreCase("Harley Davidson")){
		System.out.println("Bike Name:- "+bike_Name);
		System.out.println("Displacement:- "+displacement2);
		System.out.println("Engine Type:- "+engine_Type2);
		System.out.println("No of cylinders:- "+no_of_cylinders2);
		System.out.println("No of Gears:- "+no_of_gears);
		System.out.println("Max power:- "+max_power2);
		System.out.println("Breaks:- "+breaking2);
		System.out.println("Fuel capacity:- "+fuel_capacity2);
		System.out.println("Body:- "+Body2);
		
	}
		else if(bike_Name.equalsIgnoreCase("Triumph")){
		System.out.println("Bike Name:- "+bike_Name);
		System.out.println("Displacement:- "+displacement3);
		System.out.println("Engine Type:- "+engine_Type3);
		System.out.println("No of cylinders:- "+no_of_cylinders3);
		System.out.println("No of Gears:- "+no_of_gears2);
		System.out.println("Max power:- "+max_power3);
		System.out.println("Breaks:- "+breaking3);
		System.out.println("Fuel capacity:- "+fuel_capacity3);
		System.out.println("Body:- "+Body3);
	}
		else if(bike_Name.equalsIgnoreCase("Bmw")){
		System.out.println("Bike Name:- "+bike_Name);
		System.out.println("Displacement:- "+displacement4);
		System.out.println("Engine Type:- "+engine_Type4);
		System.out.println("No of cylinders:- "+no_of_cylinders4);
		System.out.println("No of Gears:- "+no_of_gears3);
		System.out.println("Max power:- "+max_power4);
		System.out.println("Breaks:- "+breaking4);
		System.out.println("Fuel capacity:- "+fuel_capacity4);
		System.out.println("Body:- "+Body4);
	}
		else {
		System.out.println("This is not in our Records but Dont worry search in google...");
	}
	
}
	}

