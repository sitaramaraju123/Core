package practice;
import java.util.*;
public class Over {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any year: ");
		int i=s.nextInt();
		year se = new year(i);
		se.cen();
	}

}

class year{
	int x;
	year(int i){
		x=i;
	}
	void cen() {
	    if(x%100==0) {
				System.out.println(x/100);
		}else {
			System.out.println((x/100+1));
		}
	}
}