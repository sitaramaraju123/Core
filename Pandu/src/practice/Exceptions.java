package practice;

public class Exceptions {

	public static void main(String[] args){
	
		try {
		String name = "Hello";
		int a1 = Integer.parseInt(name);
		System.out.println(a1);
		}catch(NumberFormatException c) {    //NumberFormatException 
			System.out.println(c.getMessage());
		}
		System.out.println();
		try {
			int a = 2/0;
			System.out.println(a);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException => "+e.getMessage()); //Arithmetic Exception
		}
		
		System.out.println();
		try {
            String a = null;
            System.out.println(a.charAt(0));
        } catch(NullPointerException e1) {
            System.out.println("NullPointerException.."+e1.getMessage());//Nullpointer Exception
        }
		
		System.out.println();
		 try {
	            String a = "This is like chipping "; 
	            char c = a.charAt(23); 
	            System.out.println(c);
	        }
	        catch(StringIndexOutOfBoundsException e) {
	            System.out.println("StringIndexOutOfBoundsException"+e.getMessage());// String index out of Bounds
                                                                                          //Exception
	        }
		 
		 
		 System.out.println();
		 try{
	            int a[] = new int[5];
	            a[5] = 9; 
	            System.out.println(a);
	        }
	        catch(ArrayIndexOutOfBoundsException e){
	            System.out.println ("Array Index is Out Of Bounds "+e.getMessage());//Array Index out of Bounds
	                                                                                //Exception  
	        }
	}

}
