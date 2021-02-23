package practice;
import java.util.*;
public class Getandset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name and id");
		String name=sc.next();
		int id=sc.nextInt();
		p s = new p();
		s.setId(id);
		s.setName(name);
		s.result();
	}

}
class p{
	private String name;
	private int id;
	public void setName(String name) {
		this.name=name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return this.name;
	}
	public int getId(){
		return this.id;
	}
	public void result() {
		System.out.println(getName());
		System.out.println(getId());
	}
}