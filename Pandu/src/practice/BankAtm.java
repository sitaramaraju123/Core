package practice;
import java.util.*;
public class BankAtm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("                 Welcome to _____ ATM");
		ATM a = new ATM();
		for(int i=1; i<=3; i++) {
		try {
			a.deposit();
			break;
		}
		catch(Dep e) {
			System.out.println(e.getMessage());
		}
		catch(bal e) {
			System.out.println(e.getMessage());
			break;
		}
		}
	}

}

class ATM{
	static int pin = 1234;
	static String name = "Sitaramaraju";
	static String Account_num = "702134567899000";
	
	void deposit() throws Dep, bal{
		int Amount = 20000;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
		System.out.print("Enter your Pin: ");
		int Atm_pin = sc.nextInt();
		if(Atm_pin==pin) {
			System.out.println("1. Deposit  2. Withdraw  3. Balance Enquiry");
			int n = sc.nextInt();
			if(n==1) {
				System.out.println("Processing...");
				try {
					Thread.sleep(3000);
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				System.out.println("Welcome Mr."+name);
				System.out.println("Account Number: "+Account_num);
				int amt;
				System.out.println("Enter Deposit Amount: ");
				amt = sc.nextInt();
				if(Amount>=amt && amt%100==0) {
					Amount =Amount+amt;
					System.out.println("Processing...");
					try {
						Thread.sleep(3000);
					}catch(Exception e1) {
						e1.printStackTrace();
					}
					System.out.println("Actual Amount: "+Amount);
					System.out.println("Added Amount: "+amt);
					System.out.println("Total Balance: "+Amount);
					break;
				}else {
					System.out.println("Processing...");
					try {
						Thread.sleep(3000);
					}catch(Exception e1) {
						e1.printStackTrace();
					}
					Dep ob = new Dep("please enter only 100, 200, 500 and 2000");
					throw ob;
				}
				}else if(n==2) {
					System.out.println("Processing...");
					try {
						Thread.sleep(3000);
					}catch(Exception e1) {
						e1.printStackTrace();
					}
					System.out.println("Welcome Mr."+name);
					int withdraw;
					System.out.println("Enter Withdraw Amount: ");
					withdraw = sc.nextInt();
					if(Amount>=withdraw && withdraw%100==0) {
						Amount = Amount-withdraw;
						System.out.println("Processing....");
						try {
							Thread.sleep(3000);
						}catch(Exception e1) {
							e1.printStackTrace();
						}
						System.out.println("Withdraw Amount: "+withdraw);
						System.out.println("Total balance: "+Amount);
						break;
					}else if(withdraw%100!=0) {
						System.out.println("Processing...");
						try {
							Thread.sleep(3000);
						}catch(Exception e1) {
							e1.printStackTrace();
						}
						Dep ob = new Dep("please enter only 100, 200, 500 and 2000");
						throw ob;
					}else {
						System.out.println("Processing...");
						try {
							Thread.sleep(3000);
						}catch(Exception e1) {
							e1.printStackTrace();
						}
						bal obj = new bal("Please Check your Account You have Insufficient Balance....");
						throw obj;
					}
				}else if(n==3) {
					System.out.println("Processing...");
					try {
						Thread.sleep(3000);
					}catch(Exception e1) {
						e1.printStackTrace();
					}
					System.out.println("Welcome Mr."+name);
					System.out.println("your Current Balance is: "+Amount);
					break;
				}
			}else {
				System.out.println("Entred Wrong Pin");
			}
		}
		}
	}

class Dep extends Exception{
	Dep(String msg){
		super(msg);
	}
}

class bal extends Exception{
	bal(String m1){
		super(m1);
	}
}