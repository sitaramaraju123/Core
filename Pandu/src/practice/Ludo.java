package practice;
import java.util.*;
public class Ludo {
	String player1;
	String player2;
	String player3;
	String player4;
	
	Ludo(String player1, String player2, String player3, String player4){
		this.player1=player1;
		this.player2=player2;
		this.player3=player3;
		this.player4=player4;
		System.out.println(player1+ " vs " +player2);
	}
	public static void main(String[] args) {
		System.out.println("                         LUDO KING                            ");
		System.out.println("--------------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("                    Enter players names");
		System.out.println();
		System.out.print("Enter player1 Name: ");
		String name=sc.next();
		System.out.print("Enter player2 Name: ");
		String name1=sc.next();
		System.out.println();
		System.out.print("Welcome players: ");
		Ludo s = new Ludo(name,name1,"r","j");
		int count=0;
		int sum=0;
		
		for(int i=1; i<=5; i++) {
			int randomNum=0;
			System.out.println("--------"+i+"---------");
			System.out.println("player1: "+name);
			System.out.println("Enter 'S' to start");
			String c = sc.next();
			if(c.equalsIgnoreCase("s")) {
				 randomNum = getRandomInteger(7,1); 
				    System.out.println(randomNum);
				    if(randomNum < 7) {
						count = count+randomNum;
					}
			}
			System.out.println("-----------------");
			System.out.println("player2: "+name1);
			System.out.println("Enter 'S' to start");
			String a = sc.next();
			if(a.equalsIgnoreCase("s")) {
				 randomNum = getRandomInteger(7,1);
				    System.out.println(randomNum);
				    if(randomNum < 7) {
						sum = sum+randomNum;
					}
			}

	}
		System.out.println("player1: "+count);
		System.out.println("player2: "+sum);
		System.out.println();
		if(count>sum) {
			System.out.println("Winner Winner Chicken Dinner: " +name+ "\nTotal Score: "+count);
		}else if(count == sum){
			System.out.println("Tie");
		}else {
			System.out.println("Winner Winner Chicken Dinner: "+name1+ "\nTotal Score: "+sum);
		}
	}
	private static int getRandomInteger(int i, int j) {
		
		return ((int) (Math.random()*(i-j)))+j;
	}
}
