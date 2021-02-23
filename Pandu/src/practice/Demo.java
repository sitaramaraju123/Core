package practice;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Air";
		String s2=new String("air");
	
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Same");
		}else {
			System.out.println("Not same");
		}
	}

}
