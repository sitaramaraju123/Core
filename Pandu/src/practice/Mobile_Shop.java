package practice;
import java.util.Scanner;

public class Mobile_Shop {
	static int iphone_10 = 35000, iphone_11 = 70000, iphone_11_plus = 83000, iphone_12_mini = 75000, iphone_12_Max = 120000;
	static int Samsung_A50s = 26000, Samsung_s10 = 65000, Samsung_s10_plus= 73560, Samsung_s21_Ultra = 94000, Samsung_Note_20_Ultra_5G = 104999;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Which Phone you want");
		System.out.println("1.Apple, 2.Samsung");
		int num = sc.nextInt();
		if(num==1) {
			System.out.println("Welcome Apple Phone's Zone");
			for(int i=1; i<3;i++) {
			System.out.println("1.iphone 10  2.iphone 11  3.iphone 11 pro  4.iphone 12 mini  5.iphone 12 Max");
			System.out.println("please Select Which Model you want..");
			int nu = sc.nextInt();
			if(nu==1) {
				System.out.println("iphone 10 Cost: "+iphone_10+" \n64Gb Rom  \n5.8 inch Super Retina HD Display  \n12MP + 12MP Dual Rear Camera | 7MP Front Camera \nColor: Space Gray");
				System.out.println("if you want Select enter yes if not enter No");
				String select = sc.next();
				
				if(select.equalsIgnoreCase("yes")) {
					System.out.println("Thanks for Shopping please enter 'pay' to get billing");
					String pay = sc.next();
					if(pay.equalsIgnoreCase("pay")) {
						System.out.println("Getting data...");
						try {
							Thread.sleep(3000);
						}catch(Exception e1) {
							e1.printStackTrace();
						}
						System.out.println("Model:- iphone 10");
						System.out.println("Cost:- "+iphone_10);
						System.out.println("You have  5% discount on this phone");
						float total = (float) (iphone_10 * 0.05);
						System.out.println("Total Amount:- "+(iphone_10-total));
						System.out.println("Cash or Card");
						String payment=sc.next();
						if(payment.equalsIgnoreCase("card")) {
							
							System.out.println("Please enter your pin");
							for(int j=0; j<=3; j++) {
							int pin=sc.nextInt();
							if(pin==1234) {
								System.out.println("Processing....");
								try {
									Thread.sleep(3000);
								}catch(Exception e1) {
									e1.printStackTrace();
								}
								System.out.println("Transaction Successfull.. ");
								System.out.println("Thank you for Shopping have a great day");
								break;
							}else {
								System.out.println("Entered Wrong pin please Try Again");
								
							}
						}break;
						}else {
							System.out.println("Payment completed.. \nThank you for Shopping have a great day");
							break;
						}
					}
				}
				}else if(nu==2) {
					System.out.println("iphone 11 Cost: "+iphone_11+" \n64Gb Rom  \n6.1 inch Liquid Retina HD Display  \n12MP + 12MP Dual Rear Camera | 7MP Front Camera \nColor: Black");
					System.out.println("if you want Select enter yes if not enter No");
					String select = sc.next();
					
					if(select.equalsIgnoreCase("yes")) {
						System.out.println("Thanks for Shopping please enter 'pay' to get billing");
						String pay = sc.next();
						if(pay.equalsIgnoreCase("pay")) {
							System.out.println("Getting data...");
							try {
								Thread.sleep(3000);
							}catch(Exception e1) {
								e1.printStackTrace();
							}
							System.out.println("Model:- iphone 11");
							System.out.println("Cost:- "+iphone_11);
							System.out.println("You have  5% discount on this phone");
							float total = (float) (iphone_11 * 0.05);
							System.out.println("Total Amount:- "+(iphone_11-total));
							System.out.println("Cash or Card");
							String payment=sc.next();
							if(payment.equalsIgnoreCase("card")) {
								System.out.println("Please enter your pin");
								for(int j=0; j<=3; j++) {
								int pin=sc.nextInt();
								if(pin==2345) {
									System.out.println("Processing....");
									try {
										Thread.sleep(3000);
									}catch(Exception e1) {
										e1.printStackTrace();
									}
									System.out.println("Transaction Successfull.. ");
									System.out.println("Thank you for Shopping have a great day");
									break;
								}else {
									
									System.out.println("Entered Wrong pin please Try Again");
									
								}
							}break;
							}else {
								System.out.println("Payment completed.. Thank you for Shopping have a great day");
								break;
							}
						}
					}
				}else if(nu==3) {
					System.out.println("iphone 11 pro Cost: "+iphone_11_plus+" \n256Gb Rom  \n5.8 inch OLED Display  \n12MP + 12MP Dual Rear Camera | 7MP Front Camera \nColor: Gray");
					System.out.println("if you want Select enter yes if not enter No");
					String select = sc.next();
					
					if(select.equalsIgnoreCase("yes")) {
						System.out.println("Thanks for Shopping please enter 'pay' to get billing");
						String pay = sc.next();
						if(pay.equalsIgnoreCase("pay")) {
							System.out.println("Getting data...");
							try {
								Thread.sleep(3000);
							}catch(Exception e1) {
								e1.printStackTrace();
							}
							System.out.println("Model:- iphone 11 pro");
							System.out.println("Cost:- "+iphone_11_plus);
							System.out.println("You have  5% discount on this phone");
							float total = (float) (iphone_11_plus * 0.05);
							System.out.println("Total Amount:- "+(iphone_11_plus-total));
							System.out.println("Cash or Card");
							String payment=sc.next();
							if(payment.equalsIgnoreCase("card")) {
								System.out.println("Please enter your pin");
								for(int j=0; j<=3; j++) {
								int pin=sc.nextInt();
								if(pin==3456) {
									System.out.println("Processing....");
									try {
										Thread.sleep(3000);
									}catch(Exception e1) {
										e1.printStackTrace();
									}
									System.out.println("Transaction Successfull.. ");
									System.out.println("Thank you for Shopping have a great day");
									break;
								}else {
									
									System.out.println("Entered Wrong pin please Try Again");
									
								}
							}break;
							}else {
								System.out.println("Payment completed.. Thank you for Shopping have a great day");
								break;
							}
						}
					}
					
				}else if(nu==4) {
					System.out.println("iphone 12 mini Cost: "+iphone_12_mini+" \n256Gb Rom  \n5.4-inch Super Retina XDR display \nAdvanced dual-camera system with 12MP Ultra Wide and Wide cameras; Night mode, Deep Fusion, Smart HDR 3, 4K Dolby Vision HDR recording | 7MP Front Camera \nColor: Gray");
					System.out.println("if you want Select enter yes if not enter No");
					String select = sc.next();
					
					if(select.equalsIgnoreCase("yes")) {
						System.out.println("Thanks for Shopping please enter 'pay' to get billing");
						String pay = sc.next();
						if(pay.equalsIgnoreCase("pay")) {
							System.out.println("Getting data...");
							try {
								Thread.sleep(3000);
							}catch(Exception e1) {
								e1.printStackTrace();
							}
							System.out.println("Model:- iphone 12 mini");
							System.out.println("Cost:- "+iphone_12_mini);
							System.out.println("You have  5% discount on this phone");
							float total = (float) (iphone_12_mini * 0.05);
							System.out.println("Total Amount:- "+(iphone_12_mini-total));
							System.out.println("Cash or Card");
							String payment=sc.next();
							if(payment.equalsIgnoreCase("card")) {
								System.out.println("Please enter your pin");
								for(int j=0; j<=3; j++) {
								int pin=sc.nextInt();
								if(pin==4567) {
									System.out.println("Processing....");
									try {
										Thread.sleep(3000);
									}catch(Exception e1) {
										e1.printStackTrace();
									}
									System.out.println("Transaction Successfull.. ");
									System.out.println("Thank you for Shopping have a great day");
									break;
								}else {
									
									System.out.println("Entered Wrong pin please Try Again");
									
								}
							}break;
							}else {
								System.out.println("Payment completed.. Thank you for Shopping have a great day");
								break;
							}
						}
					}
				}else if(nu==5) {
					System.out.println("iphone 12 Max Cost: "+iphone_12_Max+" \n256Gb Rom  \n6.7-inch Super Retina XDR display \nAdvanced dual-camera system with 12MP Ultra Wide and Wide cameras; Night mode, Deep Fusion, Smart HDR 3, 4K Dolby Vision HDR recording | 7MP Front Camera \nColor: Gray");
					System.out.println("if you want Select enter yes if not enter No");
					String select = sc.next();
					
					if(select.equalsIgnoreCase("yes")) {
						System.out.println("Thanks for Shopping please enter 'pay' to get billing");
						String pay = sc.next();
						if(pay.equalsIgnoreCase("pay")) {
							System.out.println("Getting data...");
							try {
								Thread.sleep(3000);
							}catch(Exception e1) {
								e1.printStackTrace();
							}
							System.out.println("Model:- iphone 12 Max");
							System.out.println("Cost:- "+iphone_12_Max);
							System.out.println("You have  5% discount on this phone");
							float total = (float) (iphone_12_Max * 0.05);
							System.out.println("Total Amount:- "+(iphone_12_Max-total));
							System.out.println("Cash or Card");
							String payment=sc.next();
							if(payment.equalsIgnoreCase("card")) {
								System.out.println("Please enter your pin");
								for(int j=0; j<=3; j++) {
								int pin=sc.nextInt();
								if(pin==5678) {
									System.out.println("Processing....");
									try {
										Thread.sleep(3000);
									}catch(Exception e1) {
										e1.printStackTrace();
									}
									System.out.println("Transaction Successfull.. ");
									System.out.println("Thank you for Shopping have a great day");
									break;
								}else {
									
									System.out.println("Entered Wrong pin please Try Again");
								
								}
							}break;
							}else {
								System.out.println("Payment completed.. Thank you for Shopping have a great day");
								break;
							}
						}
					}
				}
			}
			//Samsung................
		}else if(num==2) {
			System.out.println("Welcome Samsung Phone's Zone");
			for(int i=1; i<=3;i++) {
			System.out.println("1.Samsung A50s  2.Samsung S10  3.Samsung S10 Plus  4.Samsung S21 Ultra   5.Samsung Note 20 Ultra 5G");
			System.out.println("please Select Which Model you want..");
			int nu = sc.nextInt();
			if(nu==1) {
				System.out.println("Samsung A50s  Cost: "+Samsung_A50s +" \n128GB Rom \n4GB RAM  \n6.40-inch \nAndroid Version:- Android 10 Oreo  \n48MP + 5MP + 8MP \nColor: White \nBattery Capacity:- 4000mAh");
				System.out.println("if you want Select enter yes if not enter No");
				String select = sc.next();
				
				if(select.equalsIgnoreCase("yes")) {
					System.out.println("Thanks for Shopping please enter 'pay' to get billing");
					String pay = sc.next();
					if(pay.equalsIgnoreCase("pay")) {
						System.out.println("Getting data...");
						try {
							Thread.sleep(3000);
						}catch(Exception e1) {
							e1.printStackTrace();
						}
						System.out.println("Model:- Samsung A50s");
						System.out.println("Cost:- "+Samsung_A50s);
						System.out.println("You have  5% discount on this phone");
						float total = (float) (Samsung_A50s * 0.05);
						System.out.println("Total Amount:- "+(Samsung_A50s-total));
						System.out.println("Cash or Card");
						String payment=sc.next();
						if(payment.equalsIgnoreCase("card")) {
							
							System.out.println("Please enter your pin");
							for(int j=0; j<=3; j++) {
							int pin=sc.nextInt();
							if(pin==1234) {
								System.out.println("Processing....");
								try {
									Thread.sleep(3000);
								}catch(Exception e1) {
									e1.printStackTrace();
								}
								System.out.println("Transaction Successfull.. ");
								System.out.println("Thank you for Shopping have a great day");
								break;
							}else {
								System.out.println("Processing....");
								try {
									Thread.sleep(3000);
								}catch(Exception e1) {
									e1.printStackTrace();
								}
								System.out.println("Entered Wrong pin please Try Again");
								
							}
						}break;
						}else {
							System.out.println("Payment completed.. \nThank you for Shopping have a great day");
							break;
						}
					}
				}
				}else if(nu==2) {
					System.out.println("Samsung S10 Cost: "+Samsung_s10+" \n128GB Rom \n8GB RAM  \n6.10-inch \nAndroid Version:- Android 10 Oreo  \nCanera:- 12MP + 12MP + 16MP Rear| 10MP Front\nColor: Blue \nBattery Capacity:- 3400mAh");
					System.out.println("if you want Select enter yes if not enter No");
					String select = sc.next();
					
					if(select.equalsIgnoreCase("yes")) {
						System.out.println("Thanks for Shopping please enter 'pay' to get billing");
						String pay = sc.next();
						if(pay.equalsIgnoreCase("pay")) {
							System.out.println("Getting data...");
							try {
								Thread.sleep(3000);
							}catch(Exception e1) {
								e1.printStackTrace();
							}
							System.out.println("Model:- Samsung S10");
							System.out.println("Cost:- "+Samsung_s10);
							System.out.println("You have  5% discount on this phone");
							float total = (float) (Samsung_s10 * 0.05);
							System.out.println("Total Amount:- "+(Samsung_s10-total));
							System.out.println("Cash or Card");
							String payment=sc.next();
							if(payment.equalsIgnoreCase("card")) {
								System.out.println("Entered Wrong pin please Try Again");
								for(int j=0; j<=3; j++) {
								int pin=sc.nextInt();
								if(pin==2345) {
									System.out.println("Processing....");
									try {
										Thread.sleep(3000);
									}catch(Exception e1) {
										e1.printStackTrace();
									}
									System.out.println("Transaction Successfull.. ");
									System.out.println("Thank you for Shopping have a great day");
									break;
								}else {
									
									System.out.println("Please Re-enter your pin");
									
								}
							}break;
							}else {
								System.out.println("Payment completed.. Thank you for Shopping have a great day");
								break;
							}
						}
					}
				}else if(nu==3) {
					System.out.println("Samsung S10 plus Cost: "+Samsung_s10_plus+" \n128GB Rom  \n8GB RAM \n6.40 inch  \nAndroid Version:- Android 10 Oreo  \n12MP + 12MP + 16MP Rear Camera |10MP + 8MP Front Camera \nColor: Gray \nBatteryCapascity = 4100mAh");
					System.out.println("if you want Select enter yes if not enter No");
					String select = sc.next();
					
					if(select.equalsIgnoreCase("yes")) {
						System.out.println("Thanks for Shopping please enter 'pay' to get billing");
						String pay = sc.next();
						if(pay.equalsIgnoreCase("pay")) {
							System.out.println("Getting data...");
							try {
								Thread.sleep(3000);
							}catch(Exception e1) {
								e1.printStackTrace();
							}
							System.out.println("Model:- Samsung S10 plus");
							System.out.println("Cost:- "+Samsung_s10_plus);
							System.out.println("You have  5% discount on this phone");
							float total = (float) (Samsung_s10_plus * 0.05);
							System.out.println("Total Amount:- "+(Samsung_s10_plus-total));
							System.out.println("Cash or Card");
							String payment=sc.next();
							if(payment.equalsIgnoreCase("card")) {
								System.out.println("Please enter your pin");
								for(int j=0; j<=3; j++) {
								int pin=sc.nextInt();
								if(pin==3456) {
									System.out.println("Processing....");
									try {
										Thread.sleep(3000);
									}catch(Exception e1) {
										e1.printStackTrace();
									}
									System.out.println("Transaction Successfull.. ");
									System.out.println("Thank you for Shopping have a great day");
									break;
								}else {
									
									System.out.println("Please Re-enter your pin");
									
								}
							}break;
							}else {
								System.out.println("Payment completed.. Thank you for Shopping have a great day");
								break;
							}
						}
					}
					
				}else if(nu==4) {
					System.out.println("Samsung S21 Ultra Cost: "+Samsung_s21_Ultra+" \n128GB Rom \n12GB RAM \n6.80-inch \nAndroid Version:- Android 11 \n108MP + 12MP + 10MP + 10MP Rear | 40MP Front Camera \nColor: Black \nBatteryCapacity:- 5000mAh");
					System.out.println("if you want Select enter yes if not enter No");
					String select = sc.next();
					
					if(select.equalsIgnoreCase("yes")) {
						System.out.println("Thanks for Shopping please enter 'pay' to get billing");
						String pay = sc.next();
						if(pay.equalsIgnoreCase("pay")) {
							System.out.println("Getting data...");
							try {
								Thread.sleep(3000);
							}catch(Exception e1) {
								e1.printStackTrace();
							}
							System.out.println("Model:- Samsung S21 Ultra");
							System.out.println("Cost:- "+Samsung_s21_Ultra);
							System.out.println("You have  5% discount on this phone");
							float total = (float) (Samsung_s21_Ultra * 0.05);
							System.out.println("Total Amount:- "+(Samsung_s21_Ultra-total));
							System.out.println("Cash or Card");
							String payment=sc.next();
							if(payment.equalsIgnoreCase("card")) {
								System.out.println("Please enter your pin");
								for(int j=0; j<=3; j++) {
								int pin=sc.nextInt();
								if(pin==4567) {
									System.out.println("Processing....");
									try {
										Thread.sleep(3000);
									}catch(Exception e1) {
										e1.printStackTrace();
									}
									System.out.println("Transaction Successfull.. ");
									System.out.println("Thank you for Shopping have a great day");
									break;
								}else {
									
									System.out.println("Please Re-enter your pin");
									
								}
							}break;
							}else {
								System.out.println("Payment completed.. Thank you for Shopping have a great day");
								break;
							}
						}
					}
				}else if(nu==5) {
					System.out.println("Samsung Note 20 Ultra 5G: "+Samsung_Note_20_Ultra_5G+" \n128GB Rom \n12GB RAM  \n6.90-inch \nAndroid Version:- Android 10 Oreo \n108MP + 12MP + 12MP Rear | 10MP Front Camera \nColor: Red \nBatteryCapacity:- 4500mAh");
					System.out.println("if you want Select enter yes if not enter No");
					String select = sc.next();
					
					if(select.equalsIgnoreCase("yes")) {
						System.out.println("Thanks for Shopping please enter 'pay' to get billing");
						String pay = sc.next();
						if(pay.equalsIgnoreCase("pay")) {
							System.out.println("Getting data...");
							try {
								Thread.sleep(3000);
							}catch(Exception e1) {
								e1.printStackTrace();
							}
							System.out.println("Model:- Samsung Note 20 Ultra 5G");
							System.out.println("Cost:- "+Samsung_Note_20_Ultra_5G);
							System.out.println("You have  5% discount on this phone");
							float total = (float) (Samsung_Note_20_Ultra_5G * 0.05);
							System.out.println("Total Amount:- "+(Samsung_Note_20_Ultra_5G-total));
							System.out.println("Cash or Card");
							String payment=sc.next();
							if(payment.equalsIgnoreCase("card")) {
								System.out.println("Please enter your pin");
								for(int j=0; j<=3; j++) {
								int pin=sc.nextInt();
								if(pin==5678) {
									System.out.println("Processing....");
									try {
										Thread.sleep(3000);
									}catch(Exception e1) {
										e1.printStackTrace();
									}
									System.out.println("Transaction Successfull.. ");
									System.out.println("Thank you for Shopping have a great day");
									break;
								}else {
									
									System.out.println("Please Re-enter your pin");
									
								}
							}break;
							}else {
								System.out.println("Payment completed.. Thank you for Shopping have a great day");
								break;
							}
						}
					}
				}
			}
			
			
		}
	}

}
