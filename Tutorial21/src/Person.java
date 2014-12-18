
public class Person implements Info {

	private String name;
	
	//To give the 'Person' class a constructor
	//1. Click Source-->Generate Constructor Using Fields
	
	public Person(String name) {
		this.name = name;
	}

	public void greet(){
		
		System.out.println("Hello There.");		
	}

	@Override//optional annotation-refer to Car.java Tutorial 19 for more on annotations
	public void showInfo() {
		System.out.println("Person name is: "+name);
		
	}
}
