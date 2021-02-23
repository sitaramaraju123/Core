package practice;

public class DemoRelation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First b = new First(new Second());
		b.show();
		b.swap();
	}

}

class First{
	int x = 10;
	Second a;              //Has-A Relation (or) Using Reference variable
	First (Second a) {
		this.a=a;
	}
	void show() {
		System.out.println("Before Swapping: "+this.x+" "+a.y);
	}
	void swap() {
		int temp;
		temp=this.x;
		this.x=a.y;
		a.y=temp;
		System.out.println("After Swapping: "+this.x+ " " +a.y);
	}
}

class Second{
	int y = 20;
}
