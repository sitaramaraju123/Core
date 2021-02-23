import java.lang.String;
public class Exceptions {

	public static void main(String[] args) {
             try{
		System.out.println("Open files");
		int n = args.length;
		int a = 45/0;
		System.out.println(a);
                }
                catch(ArithmeticException e){

System.out.println("Please pass data while running this program");
		
}
finally{
System.out.println("Close files");
}
	}

}
