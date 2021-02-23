package practice;
import java.util.*;
public class Market {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------------WELCOME TO ONLINE MART-------------------");
		System.out.println("PRIZE OF ALL ITEMS:- ");
		System.out.println();
		Shop a = new Shop();
		a.customer();

	}

}

interface Fruits{
	int Apple = 100,  Banana = 60,  Guava = 50, Mango = 100, Chiku = 50, Custedapple = 100, Promogranet = 60, Pineapple = 50,
	Kiwi = 150,Orange = 100, Lemon = 30, Blackgraps = 50;
}
interface Dailyproducts{
	int Milk = 60, Bread = 30, Jam = 60, Curd = 70, Butter = 60, Chees = 40, Badhammilk = 25;
}

class Shop implements Fruits, Dailyproducts{
	
	void customer() {
		float apple=0;
		float banana=0;
		float guava=0;
		float mango=0;
		float chiku =0;
		float custedapple=0;
		float promogranet=0;
		float pineapple=0;
		float kiwi=0;
		float orange=0;
		float lemon=0;
		float blackgraps=0;
		float milk=0;
		float bread=0;
		float jam=0;
		float curd=0;
		float butter=0;
		float chees=0;
		float badhammilk=0;
	
		float a=0;
		float b=0;
		float c=0;
		float d=0;
		float d1=0;
		float e=0;
		float f=0;
		float g=0;
		float h=0;
		float i1=0;
		float j=0;
		float k=0;
		float l=0;
		float m1=0;
		float m=0;
		float n=0;
		float o=0;
		float p=0;
		float q=0;
		
		String fruit="";
		
		Scanner s =  new Scanner(System.in);
		System.out.println("Apples 1 kg : "+Apple);
		System.out.println("Banana 1 kg : "+Banana);
		System.out.println("Guava 1 kg : "+Guava);
		System.out.println("Mango 1 kg : "+Mango);
		System.out.println("Chiku 1 kg : "+Chiku);
		System.out.println("Custedapple 1 kg : "+Custedapple);
		System.out.println("Promogranet 1kg : "+Promogranet);
		System.out.println("Pineapple 1kg : "+Pineapple);
		System.out.println("Kiwi 1 kg : "+Kiwi);
		System.out.println("Orange 1 kg : "+Orange);
		System.out.println("Lemon 1 kg : "+Lemon);
		System.out.println("Blackgraps 1kg : "+Blackgraps);
		System.out.println("Milk 1 Liter : "+Milk);
		System.out.println("Bread 1 Pack : "+Bread);
		System.out.println("Jam 1 Pack : "+Jam);
		System.out.println("Curd 1 Liter : "+Curd);
		System.out.println("Butter 1 Pack: "+Butter);
		System.out.println("Chees 1 Pack : "+Chees);
		System.out.println("Badham Milk 1 bottle : "+Badhammilk);
		System.out.println("--------------------------------------------");
		
		System.out.println("Yes for Shopping");
		System.out.println("No for billing");
		for(int i=1; i<20; i++) {
			System.out.print("Enter yes (or) no to Continue: ");
			String name =  s.next();
			if(name.equalsIgnoreCase("yes")) {
				System.out.println("Enter your items: ");
				 fruit = s.next();
				if(fruit.equalsIgnoreCase("Apple")) {
				System.out.print("Apples in Kg: ");
				apple = s.nextFloat();
				}else if(fruit.equalsIgnoreCase("Banana")) {
				System.out.print("Banana's in kg: ");
				banana=s.nextFloat();
				}else if(fruit.equalsIgnoreCase("Guava")) {
				System.out.print("Guava's in kg: ");
			    guava=s.nextFloat();
				}else if(fruit.equalsIgnoreCase("Mango")) {
			    System.out.print("Mango's in kg: ");
			    mango=s.nextFloat();
				}else if(fruit.equalsIgnoreCase("Chiku")) {
				System.out.print("Chiku in kg: ");
			    chiku=s.nextFloat();
				}else if(fruit.equalsIgnoreCase("Custedapple")) {
			    System.out.print("Custedapple's in kg: ");
			    custedapple=s.nextFloat();
				}else if(fruit.equalsIgnoreCase("Promogranet")) {
			    System.out.print("Promogranet's in kg: ");
			    promogranet=s.nextFloat();
				}else if(fruit.equalsIgnoreCase("Pineapple")) {
			    System.out.print("Pineapple's in kg: ");
			    pineapple=s.nextFloat();
				}else if(fruit.equalsIgnoreCase("Kiwi")) {
			    System.out.print("Kiwi's in kg: ");
			    kiwi=s.nextFloat();
				}else if(fruit.equalsIgnoreCase("Orange")) {
			    System.out.print("Orange's in kg: ");
			    orange=s.nextFloat();
				}else if(fruit.equalsIgnoreCase("Lemon")) {
			    System.out.print("Lemon's in kg: ");
			    lemon=s.nextFloat();
				}else if(fruit.equalsIgnoreCase("Blackgraps")) {
			    System.out.print("Blackgrap's in kg: ");
			    blackgraps=s.nextFloat();
				}else if(fruit.equalsIgnoreCase("Milk")) {
			    System.out.print("Milk in liters: ");
				milk = s.nextFloat();
				}else if(fruit.equalsIgnoreCase("Bread")) {
		    	System.out.print("Bread pack: ");
				 bread= s.nextFloat();
				}else if(fruit.equalsIgnoreCase("Jam")) {
				System.out.print("Jam packs: ");
				jam = s.nextFloat();
				}else if(fruit.equalsIgnoreCase("Curd")) {
				System.out.print("Curd liters: ");
				curd = s.nextFloat();
				}else if(fruit.equalsIgnoreCase("Butter")) {
				System.out.print("Butter packs: ");
				butter = s.nextFloat();
				}else if(fruit.equalsIgnoreCase("Chees")) {
				System.out.print("Chees packs: ");
				chees = s.nextFloat();
				}else if(fruit.equalsIgnoreCase("Badhammilk")) {
				System.out.print("Badhammilk bottels: ");
				badhammilk = s.nextFloat();
				}
				System.out.println("------------------------------------");
				
			}else if(name.equalsIgnoreCase("No")) {
				 a = (apple*Fruits.Apple);
				 b = (banana*Fruits.Banana);
				 c = (guava*Fruits.Guava);
				 d = (mango*Fruits.Mango);
				 d1 =(chiku*Chiku);
				 e = (custedapple*Fruits.Custedapple);
				 f = (promogranet*Fruits.Promogranet);
				 g = (pineapple*Fruits.Pineapple);
				 h = (kiwi*Fruits.Kiwi);
				 i1 = (orange*Fruits.Orange);
				 j = (lemon*Fruits.Lemon);
				 k = (blackgraps*Fruits.Blackgraps);
				 l = (milk*Dailyproducts.Milk);
				 m1 = (bread*Dailyproducts.Bread);
				 m = (jam*Dailyproducts.Jam);
				 n = (curd*Dailyproducts.Curd);
				 o = (butter*Dailyproducts.Butter);
				 p = (chees*Dailyproducts.Chees);
				 q = (badhammilk*Dailyproducts.Badhammilk);
	
				    System.out.println(apple+" kg of Apples = "+a+" rs");
					System.out.println(banana+" kg of Banana = "+b+" rs");
					System.out.println(guava+" kg of Guava = "+c+" rs");
					System.out.println(mango+" kg of Mango = "+d+" rs");
					System.out.println(chiku+" kg of Chiku = "+d1+" rs");
					System.out.println(custedapple+" kg of Custedapple = "+e+" rs");
					System.out.println(promogranet+" kg of Promogranet = "+f+" rs");
					System.out.println(pineapple+" kg of Pineapple = "+g+" rs");
					System.out.println(kiwi+" kg of Kiwi = "+h+"rs");
					System.out.println(orange+" kg of Orange = "+i1+" rs");
					System.out.println(lemon+" kg of Lemon = "+j+" rs");
					System.out.println(blackgraps+" kg of Blackgraps = "+k+" rs");
					System.out.println(milk+" Liter of Milk = "+l+" rs");
					System.out.println(bread+" Pack of Bread = "+m1+" rs");
					System.out.println(jam+" Pack of Jam = "+m+" rs");
					System.out.println(curd+" kg of Curd = "+n+" rs");
					System.out.println(butter+" Pack of Butter = "+o+" rs");
					System.out.println(chees+" Pack of Chees = "+p+" rs");
					System.out.println(badhammilk+" Bottle's of Badhammilk = "+q+" rs");
					System.out.println("----------------------------------------------");
				 
				break;
			}
		}
		System.out.println("Enter your Name: ");
		String name=s.next();
		System.out.println("Enter your Phone Number: ");
		long num = s.nextLong();
		if(name.equalsIgnoreCase(name)) {
			if(num == num) {
				float total =(a+b+c+d+d1+e+f+g+h+i1+j+k+l+m1+m+n+o+p+q)*0.1f;
				System.out.println("Genarating your Bill....");
				try {
					Thread.sleep(3000);
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				System.out.println("Actual Bill: "+(a+b+c+d+d1+e+f+g+h+i1+j+k+l+m1+m+n+o+p+q));
				System.out.println("10% discount");
				System.out.println("Total bill: "+((a+b+c+d+d1+e+f+g+h+i1+j+k+l+m1+m+n+o+p+q)-total));
			}
		}
		
		
	}
	
	}