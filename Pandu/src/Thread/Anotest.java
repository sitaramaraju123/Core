package Thread;

public class Anotest {
	public static void main(String[] args) {
		Runnable an = new Runnable() {
			public void run() {
				String s="sitaramaraju";
				try {
					for(int i=0; i<s.length();i++) {
						char ch = s.charAt(i);
						System.out.print(ch);
						try { Thread.sleep(500);}catch(Exception e) { e.printStackTrace();}
					}
				}catch(Exception e) {
					System.out.println("Something Went Wrong...");
				}
			}
		};
		Thread t = new Thread(an);
		t.start();
		
	}
}
