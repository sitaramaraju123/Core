package practice;
import java.util.*;
public class Inter {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("WELLCOME TO ALL BANKS BALANCE ENQUERY");
		System.out.println();
		System.out.print("Enter the Bank Name: ");
		String name1=sc.next();
		System.out.print("Enter Account Holder Name: ");
		String name2 = sc.next();
		
		Balance_Check b = new Balance_Check(name1,name2);
		
		System.out.print("Enter your Account Number: ");
		String Bname = sc.next();
		System.out.print("Enter your UPI id: ");
		int num = sc.nextInt();
		b.person(Bname, num);
		b.bank_Balance();
		
	}

}
interface Bank {
	String bank_Name = "1234";
	String Account_Holder = "Sitaramaraju";
	int UPI_id = 2143;
	int Amount = 1000000;
	
	String bank_Name1 = "7231";
	String Account_Holder1 = "Ashfaaq";
	int UPI_id1 = 3399;
	int Amount1 = 50000;
	
	String bank_Name2 = "96404";
	String Account_Holder2 = "Madhu";
	int UPI_id2 = 4400;
	int Amount2 = 100000;
	
	String bank_Name3 = "901212";
	String Account_Holder3 = "Hari";
	int UPI_id3 = 1432;
	int Amount3=200000;
	
	String bank_Name4 = "957345";
	String Account_Holder4 = "Srikanth";
	int UPI_id4 = 9542;
	int Amount4=200000;
	
	void bank_Balance();
}
abstract class Person_name implements Bank{
	String Bname;
	int Upi;
	void person(String name, int upi) {
		this.Bname=name;
		Upi = upi;
	}
	
	int amount;
	void amount(int amount) {
		this.amount=amount;
	}
}
class Balance_Check extends Person_name{
	String name1;
	String Name;
	Balance_Check(String name1,String Name){
		this.name1=name1;
		this.Name=Name;
	}
	@Override
	public void bank_Balance() {
		switch (name1) {
		case "SBI" :{
			if(Name.equalsIgnoreCase(Bank.Account_Holder)) {
			if(Bname.equalsIgnoreCase(Bank.bank_Name)){
					if(Upi==Bank.UPI_id) {
						System.out.println("Wellcome "+Bank.Account_Holder);
						System.out.println("Checking your Balance...");
						try {
							Thread.sleep(3000);
						}catch(Exception e) {
							e.printStackTrace();
						}
						System.out.println("Total Amount: "+Bank.Amount);
						
						Scanner s = new Scanner(System.in);
						System.out.print("Enter your withdraw Amount: ");
						int amount = s.nextInt();
						long num = (Bank.Amount-amount);
						if(num < 0) {
							System.out.println("You Have Insufficient Balance");
						}else {
							System.out.println("After Withdraw your Balance...");
							try {
								Thread.sleep(2000);
							}catch(Exception e) {
								e.printStackTrace();
							}
							System.out.println("Your Balance is: "+num);
						}
					}else {
						System.out.println("You Entered Wrong UPI");
					}
			
			}else {
				System.out.println("Check Out Your Bank Account Number");
			}
			}else if(Name.equalsIgnoreCase(Bank.Account_Holder4)) {
				
				if(Bname.equalsIgnoreCase(Bank.bank_Name4)){
				
				if(Upi==Bank.UPI_id4) {
					System.out.println("Wellcome "+Bank.Account_Holder4);
					System.out.println("Checking your Balance...");
					try {
						Thread.sleep(3000);
					}catch(Exception e) {
						e.printStackTrace();
					}
					System.out.println("Total Amount: "+(Bank.Amount4+amount));
					
					Scanner s = new Scanner(System.in);
					System.out.print("Enter your withdraw Amount: ");
					int amount = s.nextInt();
					long num = (Bank.Amount4-amount);
					if(num < 0) {
						System.out.println("You Have Insufficient Balance");
					}else {
						System.out.println("After Withdraw your Balance...");
						try {
							Thread.sleep(3000);
						}catch(Exception e) {
							e.printStackTrace();
						}
						System.out.println("Your Balance is: "+num);
					}
				}else {
					System.out.println("You Entered Wrong UPI");
				}
		}else {
			System.out.println("Check Out Your Account Number");
		}
			}
		
		break;
		}
			
			
		case "ICICI" :{
			if(Name.equalsIgnoreCase(Bank.Account_Holder1)) {
			if(Bname.equalsIgnoreCase(Bank.bank_Name1)){
					if(Upi==Bank.UPI_id1) {
						System.out.println("Wellcome "+Bank.Account_Holder1);
						System.out.println("Checking your Balance...");
						try {
							Thread.sleep(3000);
						}catch(Exception e) {
							e.printStackTrace();
						}
						System.out.println("Total Amount: "+Bank.Amount1);
						
						Scanner s = new Scanner(System.in);
						System.out.print("Enter your withdraw Amount: ");
						int amount = s.nextInt();
						long num = (Bank.Amount1-amount);
						if(num < 0) {
							System.out.println("You Have Insufficient Balance");
						}else {
							System.out.println("After Withdraw your Balance...");
							try {
								Thread.sleep(3000);
							}catch(Exception e) {
								e.printStackTrace();
							}
							System.out.println("Your Balance is: "+num);
						}
					}else {
						System.out.println("You Entered Wrong UPI");
					}
			}else {
				System.out.println("Check Out Your Account Number");
			}
			}
			break;
		}
		
		case "AndhraBank" :{
			if(Name.equalsIgnoreCase(Bank.Account_Holder2)) {
			if(Bname.equalsIgnoreCase(Bank.bank_Name2)){
				
					if(Upi==Bank.UPI_id2) {
						System.out.println("Wellcome "+Bank.Account_Holder2);
						System.out.println("Checking your Balance...");
						try {
							Thread.sleep(3000);
						}catch(Exception e) {
							e.printStackTrace();
						}
						System.out.println("Total Amount: "+Bank.Amount2);
						
						Scanner s = new Scanner(System.in);
						System.out.print("Enter your withdraw Amount: ");
						int amount = s.nextInt();
						long num = (Bank.Amount2-amount);
						if(num < 0) {
							System.out.println("You Have Insufficient Balance");
						}else {
							System.out.println("After Withdraw your Balance...");
							try {
								Thread.sleep(3000);
							}catch(Exception e) {
								e.printStackTrace();
							}
							System.out.println("Your Balance is: "+num);
						}
					}else {
						System.out.println("You Entered Wrong UPI");
					}
			}else {
				System.out.println("Check Out Your Account Number");
			}
			}
			break;
		}
		
		
		case "UnionBank" : {
			if(Name.equalsIgnoreCase(Bank.Account_Holder3)) {
			if(Bname.equalsIgnoreCase(Bank.bank_Name3)){
				
					if(Upi==Bank.UPI_id3) {
						System.out.println("Wellcome "+Bank.Account_Holder3);
						System.out.println("Checking your Balance...");
						try {
							Thread.sleep(3000);
						}catch(Exception e) {
							e.printStackTrace();
						}
						System.out.println("Total Amount: "+Bank.Amount3);
						
						Scanner s = new Scanner(System.in);
						System.out.print("Enter your withdraw Amount: ");
						int amount = s.nextInt();
						long num = (Bank.Amount3-amount);
						if(num < 0) {
							System.out.println("You Have Insufficient Balance");
						}else {
							System.out.println("After Withdraw your Balance...");
							try {
								Thread.sleep(3000);
							}catch(Exception e) {
								e.printStackTrace();
							}
							System.out.println("Your Balance is: "+num);
						}
					}else {
						System.out.println("You Entered Wrong UPI");
					}
			}else {
				System.out.println("Check Out Your Account Number");
			}
			}
			break;
		}
		default:{
			System.out.println("You are entered Wrong Bank details");
		}		
		}
	}
}
		
			







