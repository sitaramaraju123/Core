package practice;
import java.util.*;
public class Passbyrefer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 values: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Before Swapping: "+x+" "+y);
		Emp1 i1 = new Emp1(x);
		Emp1 i2 = new Emp1(y);
		new chance().emp(i1,i2);
		System.out.println("After Swapping: "+i1.id+" "+i2.id);
	}

}
class Emp1{
	int id;
	Emp1(int id){
		this.id=id;
	}
}

class chance{
	int x;
	int y;
	void emp(Emp1 e1, Emp1 e2) {
		int temp;
		temp = e1.id;
		e1.id=e2.id;
		e2.id=temp;
	}
}