//This tutorial is about the equals() method


class Person{
	//fields
	private int id;
	private String name;
	
	//Constructor
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class Application {

	public static void main(String[] args) {
		
		
		Object obj1=new Object();
		
		/*In the console the number after the @ sign is not a memory address,
		 *but a hash code that gives the object a unique id*/
		System.out.println(obj1);
		
		
		Person person1=new Person(5,"Bob");
		Person person2=new Person(8,"Sue");
		
		//With the below statement 'person1==person2' will return true
		//person2=person1;
		
		/*What == does is tells the programmer (with true or false)
		 * whether 2 references to objects point to the same object*/
		System.out.println(person1==person2);
		
		Person person3=new Person(5,"Bob");
		Person person4=new Person(5,"Bob");
		
		/*Even though person3 and person4 contain the same values
		 * (semantics) they still return false below because they
		 * point to different objects.  We can change this with the 
		 * .equals() method*/
		System.out.println(person3==person4);
		
		/*.equals() is a method that all objects inherit from the
		 * Object class.  If we run the sysout below, we still get
		 * false because we have to override the default behavior
		 * of the equals() method*/
		
		System.out.println(person3.equals(person4));
		
		/*With class types EXCEPTION(Integer, String in some cases (see below))
		you have to use .equals()*/ 
		
		Double value1=7.2;
		Double value2=7.2;
		
		System.out.println(value1==value2);
		System.out.println(value1.equals(value2));
		
		/*With primitive types, it's ok to use == but you can't use
		 * .equals()*/
		int number1=7;
		int number2=7;
		
		System.out.println(number1==number2);
		
		//EXCEPTION
		
		Integer integer1=5;
		Integer integer2=5;
		
		System.out.println(integer1.equals(integer2));
		
		//With Strings(Another EXCEPTION)
		
		String string1="Hello";
		String string2="Hello";
		
		System.out.println(string1==string2);
		
		String string3="Hello";
		String string4="Helloabc".substring(0, 5);
		
		System.out.println(string3==string4);
		System.out.println(string3.equals(string4));
		
		/*The take home message is to always use .equals() EXCEPT
		with primitive types*/
		
	}
}
