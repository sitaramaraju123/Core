package practice;
import java.util.*;
public class Newcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Car Type: ");
		String car = sc.next();
		Model cars = new Model();
		Audi a = new  Audi();
		a.setEngine(cars);
		a.startengine(car);
		
		System.out.println("Enter Car Type: ");
		String car1 = sc.next();
		Benz1 a1 = new  Benz1();
		a1.setEngine(cars);
		a1.startengine(car1);
		
		System.out.println("Enter Car Type: ");
		String car2 = sc.next();
		BMW a2 = new  BMW();
		a2.setEngine(cars);
		a2.startengine(car2);
		
		
	}

}

class Model{
	void first() {
			System.out.println("This car run's on petrol");
	}
	void second() {
			System.out.println("This car run's on Gas");
	}
	void third() {
		System.out.println("This car run's on Desial");
}
}

class Audi{
	private Model engine;

	public Model getEngine() {
		return engine;
	}

	public void setEngine(Model engine) {
		this.engine = engine;
	}
	public void startengine(String car) {
		if(car.equalsIgnoreCase("Audi")) {
		engine.first();
		}else {
			System.out.println("Given model is not in records");
		}
	}
}

class Benz1{
	private Model engine;

	public Model getEngine() {
		return engine;
	}

	public void setEngine(Model engine) {
		this.engine = engine;
	}
	public void startengine(String car) {
		if(car.equalsIgnoreCase("Benz")) {
			engine.second();
			}else {
				System.out.println("Given model is not in records");
			}
	}
}

class BMW{
	private Model engine;

	public Model getEngine() {
		return engine;
	}

	public void setEngine(Model engine) {
		this.engine = engine;
	}
	public void startengine(String car) {
		if(car.equalsIgnoreCase("Bmw")) {
			engine.third();
			}else {
				System.out.println("Given model is not in records");
			}
	}
}
