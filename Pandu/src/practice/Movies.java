package practice;
import java.util.*;
public class Movies {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("                             WELCOME TO IMAX CINEMAS    ");
		System.out.println();
		Ticket t = new Ticket();
		t.booking();
	}

}
interface Movielist{
	int P_KGF = 150;
	int G_KGF = 200;
	int P_RRR = 150;
	int G_RRR = 200;
	int P_RED = 120;
	int G_RED = 180;	
}
class Ticket implements Movielist{
	void booking() {
		System.out.println("                                 Ticket Counter ");
		System.out.println();
		System.out.println("KGF :- Platinum Seats: "+P_KGF+",  Gold Seats: "+G_KGF);
		System.out.println("RRR :- Platinum Seats: "+P_RRR+",  Gold Seats: "+G_RRR);
		System.out.println("RED :- Platinum Seats: "+P_RED+",  Gold Seats: "+G_RED);
		
		String movie1="";
		String movie2="";
		String movie3="";
		int num1=20;
		
	Scanner sc = new Scanner(System.in);
	System.out.println();
	System.out.print("Enter Movie Name : ");
	String movieName = sc.next();
	switch (movieName) {
	case "KGF": {
		System.out.println("Select Platinum(P) or Gold(G)");
		String seat = sc.next();
		if(seat.equalsIgnoreCase("p")) {
			System.out.print("How many Tickets You Want: ");
			int num = sc.nextInt();
			int num2 = 0;
			if(num<=num1) {
				int a = num1-num;
				System.out.println("Your "+num+" seats are booked");
				System.out.println("Avilable tickets are: "+(a));
				System.out.println("if u Want To add few More tickets: yes or No");
				String nam = sc.next();
				if(nam.equalsIgnoreCase("yes")) {
					System.out.println("Please Enter how many tickets you want to add");
			    num2 = sc.nextInt();
				if(num2<=a) {
					System.out.println("Added "+num2+" more tickets");
					System.out.println("No more tickets");
				}
				}
				System.out.print ("Enter 'Pay' to payment mode:");
				String pay = sc.next();
				if(pay.equalsIgnoreCase("Pay")) {
					int Total = (num+num2);
					System.out.println("Total "+Total+" Tickets");
					int total =(Total*P_KGF);
					System.out.println("Getting your Bill...");
					try {
						Thread.sleep(3000);
					}catch(Exception e1) {
						e1.printStackTrace();
					}
					System.out.println("Total Payment: "+total);
					System.out.println("Payment Successfull");
					System.out.println("Thank your for booking Your Tickets.. Enjoy the Show..");
				}else {
					System.out.println("please check once");
				}
				}else {
				System.out.println("Sorry Tickets are Not Avilable");
			}
			}else if(seat.equalsIgnoreCase("G")) {
				System.out.print("How many Tickets You Want: ");
				int num3 = sc.nextInt();
				int num4 = 0;
				if(num3<=num1) {
					int b = num1-num3;
					System.out.println("Your "+num3+" seats are booked");
					System.out.println("Avilable tickets are: "+(b));
					System.out.println("if u Want To add few More tickets: yes or No");
					String nam = sc.next();
					if(nam.equalsIgnoreCase("yes")) {
						System.out.println("Please Enter how many tickets you want to add");
				    num4 = sc.nextInt();
					if(num4<=b) {
						System.out.println("Added "+num4+" more tickets");
						System.out.println("No more tickets");
					}
					}
					System.out.print ("Enter 'Pay' to payment mode:");
					String pay = sc.next();
					if(pay.equalsIgnoreCase("Pay")) {
						int Total = (num3+num4);
						System.out.println("Total "+Total+" Tickets");
						int total =(Total*G_KGF);
						System.out.println("Getting your Bill...");
						try {
							Thread.sleep(3000);
						}catch(Exception e1) {
							e1.printStackTrace();
						}
						System.out.println("Total Payment: "+total);
						System.out.println("Payment Successfull");
						System.out.println("Thank your for booking Your Tickets.. Enjoy the Show..");
					}else {
						System.out.println("please check once");
					}
				}else {
					System.out.println("Sorry Tickets are Not Avilable");
				}
			}
		break;
			}
	case "RRR": {
		System.out.println("Select Platinum(P) or Gold(G)");
		String seat = sc.next();
		if(seat.equalsIgnoreCase("p")) {
			System.out.print("How many Tickets You Want: ");
			int num = sc.nextInt();
			int num2 = 0;
			if(num<=num1) {
				int a = num1-num;
				System.out.println("Your "+num+" seats are booked");
				System.out.println("Avilable tickets are: "+(a));
				System.out.println("if u Want To add few More tickets: yes or No");
				String nam = sc.next();
				if(nam.equalsIgnoreCase("yes")) {
					System.out.println("Please Enter how many tickets you want to add");
			    num2 = sc.nextInt();
				if(num2<=a) {
					System.out.println("Added "+num2+" more tickets");
					System.out.println("No more tickets");
				} 
				}
				System.out.print ("Enter 'Pay' to payment mode:");
				String pay = sc.next();
				if(pay.equalsIgnoreCase("Pay")) {
					int Total = (num+num2);
					System.out.println("Total "+Total+" Tickets");
					int total =(Total*P_RRR);
					System.out.println("Getting your Bill...");
					try {
						Thread.sleep(3000);
					}catch(Exception e1) {
						e1.printStackTrace();
					}
					System.out.println("Total Payment: "+total);
					System.out.println("Payment Successfull");
					System.out.println("Thank your for booking Your Tickets.. Enjoy the Show..");
				}else {
					System.out.println("please check once");
				}
				}
			else {
				System.out.println("Sorry Tickets are Not Avilable");
			}
			}else if(seat.equalsIgnoreCase("G")) {
				System.out.print("How many Tickets You Want: ");
				int num3 = sc.nextInt();
				int num4 = 0;
				if(num3<=num1) {
					int b = num1-num3;
					System.out.println("Your "+num3+" seats are booked");
					System.out.println("Avilable tickets are: "+(b));
					System.out.println("if u Want To add few More tickets: yes or No");
					String nam = sc.next();
					if(nam.equalsIgnoreCase("yes")) {
						System.out.println("Please Enter how many tickets you want to add");
				    num4 = sc.nextInt();
					if(num4<=b) {
						System.out.println("Added "+num4+" more tickets");
						System.out.println("No more tickets");
					} 
					}
					System.out.print ("Enter 'Pay' to payment mode:");
					String pay = sc.next();
					if(pay.equalsIgnoreCase("Pay")) {
						int Total = (num3+num4);
						System.out.println("Total "+Total+" Tickets");
						int total =(Total*G_RRR);
						System.out.println("Getting your Bill...");
						try {
							Thread.sleep(3000);
						}catch(Exception e1) {
							e1.printStackTrace();
						}
						System.out.println("Total Payment: "+total);
						System.out.println("Payment Successfull");
						System.out.println("Thank your for booking Your Tickets.. Enjoy the Show..");
					}else {
						System.out.println("please check once");
					}
				}else {
					System.out.println("Sorry Tickets are Not Avilable");
				}
			}
		break;
		}
		
	case "Red":{
		System.out.println("Select Platinum(P) or Gold(G)");
		String seat = sc.next();
		if(seat.equalsIgnoreCase("p")) {
			System.out.print("How many Tickets You Want: ");
			int num = sc.nextInt();
			int num2 = 0;
			if(num<=num1) {
				int a = num1-num;
				System.out.println("Your "+num+" seats are booked");
				System.out.println("Avilable tickets are: "+(a));
				System.out.println("if u Want To add few More tickets: yes or No");
				String nam = sc.next();
				if(nam.equalsIgnoreCase("yes")) {
					System.out.println("Please Enter how many tickets you want to add");
			    num2 = sc.nextInt();
				if(num2<=a) {
					System.out.println("Added "+num2+" more tickets");
					System.out.println("No more tickets");
				} 
				}
				System.out.print ("Enter 'Pay' to payment mode:");
				String pay = sc.next();
				if(pay.equalsIgnoreCase("Pay")) {
					int Total = (num+num2);
					System.out.println("Total "+Total+" Tickets");
					int total =(Total*P_RED);
					System.out.println("Getting your Bill...");
					try {
						Thread.sleep(3000);
					}catch(Exception e1) {
						e1.printStackTrace();
					}
					System.out.println("Total Payment: "+total);
					System.out.println("Payment Successfull");
					System.out.println("Thank your for booking Your Tickets.. Enjoy the Show..");
				}else {
					System.out.println("please check once");
				}
				}
			else {
				System.out.println("Sorry Tickets are Not Avilable");
			}
			}else if(seat.equalsIgnoreCase("G")) {
				System.out.print("How many Tickets You Want: ");
				int num3 = sc.nextInt();
				int num4 = 0;
				if(num3<=num1) {
					int b = num1-num3;
					System.out.println("Your "+num3+" seats are booked");
					System.out.println("Avilable tickets are: "+(b));
					System.out.println("if u Want To add few More tickets: yes or No");
					String nam = sc.next();
					if(nam.equalsIgnoreCase("yes")) {
						System.out.println("Please Enter how many tickets you want to add");
				    num4 = sc.nextInt();
					if(num4<=b) {
						System.out.println("Added "+num4+" more tickets");
						System.out.println("No more tickets");
					} 
					}
					System.out.print ("Enter 'Pay' to payment mode:");
					String pay = sc.next();
					if(pay.equalsIgnoreCase("Pay")) {
						int Total = (num3+num4);
						System.out.println("Total "+Total+" Tickets");
						int total =(Total*G_RED);
						System.out.println("Getting your Bill...");
						try {
							Thread.sleep(3000);
						}catch(Exception e1) {
							e1.printStackTrace();
						}
						System.out.println("Total Payment: "+total);
						System.out.println("Payment Successfull");
						System.out.println("Thank your for booking Your Tickets.. Enjoy the Show..");
					}else {
						System.out.println("please check once");
					}
				}else {
					System.out.println("Sorry Tickets are Not Avilable");
				}
			}
		break;
		
	}
		}
	}
	}