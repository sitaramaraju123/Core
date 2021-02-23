package practice;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(j==0 && i<=6 || i==0 && j<=num/2 || j==num-4 && i<=6 && i>=3
						|| i==3 && j<=num-4 && j>=2 || i==num-4 && j<=6 || i+j==num-4 && i<=3) {
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
		
		System.out.println();
		   
		}
		
	}

}
