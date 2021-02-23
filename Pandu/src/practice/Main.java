package practice;

public class Main {
public static void main(int a) {
	System.out.println(a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main(20);
		int a,b,c,d,e;
		a=4;
		b=3;
		c=++a - b++;//5 - 3 =2
		//System.out.println(a+" - "+b+" = "+c);
		d=a++ - b++ + ++c;//6 - 5 + 3= 4
		//System.out.println(a+" - "+b+" + "+c+" = "+d);
		e=--a + c++; // 5 + 3 = 8
		//System.out.println(a+" + "+c+" = "+e);
		
		System.out.println(c+" "+d+" "+e);
	}

}
