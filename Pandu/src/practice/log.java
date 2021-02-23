package practice;
import java.util.*;
public class log {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num=s.nextInt();
		data R = new data(num);
		R.r();
	}

}
class data{
	private int i;
	private int j;
	private int num;
	data(int n){
		num=n;
	}
	public void r() {
		for (int i=0; i<num; i++)
		{
			for (int j=num-i; j>1; j--)
			{
				System.out.print(" ");
				}
			for (int k=0; k<=i; k++ )
			{
				System.out.print("* ");
				}
			System.out.println();
			}
}
}