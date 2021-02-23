package practice;
public class Objectclass {

	public static void main(String[] args) throws CloneNotSupportedException {
		Objectclass a = new Objectclass();
		a.displayClassName(new PowerRangers()); //GetClass
		
		Person_One s = new Person_One("Ram",24); //To String
		System.out.println(s.toString()+"-> (it is To String)");
		
		Person_One rajOne = new Person_One("Ram",24); //Equals
		if(s.equals(rajOne)) {
		System.out.println("Same"+ "-> (it is Equals)");	
		}else {
			System.out.println("Not Same"+ "-> (it is Equals)");	
		}
		
		Person_One raj = new Person_One("Ram",24); //Cloning
		System.out.println("Original Object "+raj +"-> (it is Cloning)");

		Person_One rajDuplicate =raj.clone();
		
		Person_One raj1 = new Person_One("Vishnu",24);
		Person_One rajDuplicate1 =raj1.clone();
		
		System.out.println("Duplicate Object "+rajDuplicate +"(-> it is Cloning)");
		System.out.println("Duplicate Object "+rajDuplicate1 );
	}
	void displayClassName(Object o) {
		Class c=o.getClass();
		String className=c.getName();
		System.out.println(className+" ->(it is get class)");
	}
}
class Person_One implements Cloneable {
	 String name;
	 int age;
	
	public Person_One(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person_One [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person_One other = (Person_One) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	protected Person_One clone() throws CloneNotSupportedException {
 		return (Person_One) super.clone();
	}
	
}