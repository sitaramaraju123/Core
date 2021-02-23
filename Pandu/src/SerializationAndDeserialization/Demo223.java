package SerializationAndDeserialization;

import java.io.Serializable;

public class Demo223 implements Serializable{
	private String name;
//	private int age;
	public Demo223(String name){
		this.name = name;
//		this.age = age;
	}
	
	void display() {
		System.out.println(name);
	}
}