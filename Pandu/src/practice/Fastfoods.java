package practice;
import java.util.*;
public class Fastfoods {

	public static void main(String[] args) {
		FastfoodCenter a= new FastfoodCenter();
		a.foods();

	}

}
class FastfoodCenter{
	static int veg_fried_rice = 60;
	static int egg_fried_rice = 80;
	static int chicken_fried_rice = 100;
	static int veg_noodles = 60;
	static int egg_noodles =80;
	static int chicken_noodles =100;
	static int gobi_manchuriya = 60;
	static int egg_manchuriya =80;
	static int chicken_manchuriya = 100;
	static int veg_sandwich=35;
	static int chees_sandwich=45;
	static int chicken_sandwich=70;
	static int choclate_milkshack = 80;
	static int vanila_milkshack = 75;
	static int nutella = 100;
	void foods() {
		int total=0;
		int total1=0;
		int total2=0;
		int total3=0;
		int total4=0;
		int total5=0;
		int total6=0;
		int total7=0;
		int total8=0;
		int total9=0;
		int total10=0;
		int total11=0;
		int total12=0;
		int total13=0; 
		int total14=0;
		System.out.println("                          Welcome to Food Aada");
		System.out.println();
		int Total=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<=3;i++) {
		System.out.println("1.Order Food,   2. Bill");
		int con = sc.nextInt();
		if(con==1) {
	    System.out.println("Menu");
	    System.out.println();
		System.out.println("1.Fast foods  2.Sandwiches  3.Milkshakes");
		int select = sc.nextInt();
		if(select==1) {
			System.out.println("1.veg Fried Rice:- "+veg_fried_rice+ ", 2.Egg Fried Rice:- "+egg_fried_rice+ ", 3.Chicken Fried Rice:- "+chicken_fried_rice+ ", 4.Veg Noodles:- "+veg_noodles+",  5.Egg Noodles:- "+egg_noodles+", 6.Chicken Noodles:- "
					+chicken_noodles+ ", 7.Gobi Manchuriya:- "+gobi_manchuriya+", 8.Egg Manchuriya:- "+egg_manchuriya+", 9.Chicken Manchuriya:- "+chicken_manchuriya);
			int item = sc.nextInt();
			if(item==1) {
				System.out.print("Enter your Quantity: ");
				int quantity=sc.nextInt();
				if(quantity<=6) {
					total = (quantity*veg_fried_rice);
				}else {
					System.out.println("Sorry we dont have that much of Quantity");
				}
			}else if(item==2) {
				System.out.print("Enter your Quantity: ");
				int quantity=sc.nextInt();
				if(quantity<=6) {
					total1 = (quantity*egg_fried_rice);
				}else {
					System.out.println("Sorry we dont have that much of Quantity");
				}
			}else if(item==3) {
				System.out.print("Enter your Quantity: ");
				int quantity=sc.nextInt();
				if(quantity<=6) {
					total2 = (quantity*chicken_fried_rice);
				}else {
					System.out.println("Sorry we dont have that much of Quantity");
				}
			}else if(item==4) {
				System.out.print("Enter your Quantity: ");
				int quantity=sc.nextInt();
				if(quantity<=6) {
					total3 = (quantity*veg_noodles);
				}else {
					System.out.println("Sorry we dont have that much of Quantity");
				}
			}else if(item==5) {
				System.out.print("Enter your Quantity: ");
				int quantity=sc.nextInt();
				if(quantity<=6) {
					total4 = (quantity*egg_noodles);
				}else {
					System.out.println("Sorry we dont have that much of Quantity");
				}
			}else if(item==6) {
				System.out.print("Enter your Quantity: ");
				int quantity=sc.nextInt();
				if(quantity<=6) {
					total5 = (quantity*chicken_noodles);
				}else {
					System.out.println("Sorry we dont have that much of Quantity");
				}
			}else if(item==7) {
				System.out.print("Enter your Quantity: ");
				int quantity=sc.nextInt();
				if(quantity<=6) {
					total6 = (quantity*gobi_manchuriya);
				}else {
					System.out.println("Sorry we dont have that much of Quantity");
				}
			}else if(item==8) {
				System.out.print("Enter your Quantity: ");
				int quantity=sc.nextInt();
				if(quantity<=6) {
					total7 = (quantity*egg_manchuriya);
				}else {
					System.out.println("Sorry we dont have that much of Quantity");
				}
			}else if(item==9) {
				System.out.print("Enter your Quantity: ");
				int quantity=sc.nextInt();
				if(quantity<=6) {
					total8 = (quantity*chicken_manchuriya);
				}else {
					System.out.println("Sorry we dont have that much of Quantity");
				}
			}
		}else if(select==2) {
			System.out.println("1.Veg Sandwich:- "+veg_sandwich+",  2.Chees Sandwich:- "+chees_sandwich+",  3.Chicken Sandwich:- "+chicken_sandwich);
			int item = sc.nextInt();
			if(item==1) {
				System.out.print("Enter your Quantity: ");
				int quantity=sc.nextInt();
				if(quantity<=6) {
					total9 = (quantity*veg_sandwich);
				}else {
					System.out.println("Sorry we dont have that much of Quantity");
				}
			}else if(item==2) {
				System.out.print("Enter your Quantity: ");
				int quantity=sc.nextInt();
				if(quantity<=6) {
					total10 = (quantity*chees_sandwich);
				}else {
					System.out.println("Sorry we dont have that much of Quantity");
				}
			}else if(item==3) {
				System.out.print("Enter your Quantity: ");
				int quantity=sc.nextInt();
				if(quantity<=6) {
					total11 = (quantity*chicken_sandwich);
				}else {
					System.out.println("Sorry we dont have that much of Quantity");
				}
			}
		}else if(select==3) {
			System.out.println("1.Choclate MilkShake:- "+choclate_milkshack+",  2.Vanilla MilkShake:- "+vanila_milkshack+",  3.Nutella:- "+nutella);
			int item = sc.nextInt();
			if(item==1) {
				System.out.print("Enter your Quantity: ");
				int quantity=sc.nextInt();
				if(quantity<=6) {
					total12 = (quantity*choclate_milkshack);
				}else {
					System.out.println("Sorry we dont have that much of Quantity");
				}
			}else if(item==2) {
				System.out.print("Enter your Quantity: ");
				int quantity=sc.nextInt();
				if(quantity<=6) {
					total13 = (quantity*vanila_milkshack);
				}else {
					System.out.println("Sorry we dont have that much of Quantity");
				}
			}else if(item==3) {
				System.out.print("Enter your Quantity: ");
				int quantity=sc.nextInt();
				if(quantity<=6) {
					total14 = (quantity*nutella);
				}else {
					System.out.println("Sorry we dont have that much of Quantity");
				}
			}
			
		}
		}else {
			Total=(total+total1+total2+total3+total4+total5+total6+total7+total8+total9+total10+total11+total12+total13+total14);
			break;
		}
		}
		System.out.println("Total Bill: "+Total);
	}
}