package practice;

public class Car {
	
		public static void main(String[] args) {
			Engine engine = new Engine();
			Benz benz= new Benz();
			benz.setEngine(engine);
			benz.startEngine();
			
			System.out.println();
			
			Ni20 i20= new Ni20();
			i20.setEngine(engine);
			i20.startEngine();
			
			
		}
	}
	class Engine{
		public void engineType_Petrol() {
			System.out.println("This car runs on Petrol engine");
		}
		public void engineType_Gas() {
			System.out.println("This car runs on Gas engine");
		}
	}
	class Ni20{
		private Engine engine;

		public Engine getEngine() {
			return engine;
		}

		public void setEngine(Engine engine) {
			this.engine = engine;
		}

		public void startEngine() {
			engine.engineType_Petrol();
		}
	}

	class Benz{
		private Engine engine;

		public Engine getEngine() {
			return engine;
		}

		public void setEngine(Engine engine) {
			this.engine = engine;
		}

		public void startEngine() {
			engine.engineType_Gas();
		}
	}
