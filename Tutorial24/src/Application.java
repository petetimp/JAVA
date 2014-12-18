//This tutorial is about encapsulation and the API docs

/*Encapsulation is about 'encapsulating' the inner workings of a class by hiding it from other 
programmers and using an API of methods (getters and setters) to access the variables.

*Encapsulation also prevents classes of the same name from getting tangled*/
class Plant{
	
	//member variables within a class should always be private (unless the variable is a constant)
	private String name;
	
	//When a variable is a constant it should be made public, static, and final
	public static final int ID=7;

	public String getName() {
		return name;
	}
	/*Always try to make classes and class or instance variables (member variables/fields) use the
	 *'private' als first before anything else.  
	 *
	 *If you need them in your subclasses use the 'protected' als.
	 *
	 *If you want to use them in your main method (in this case, in the 'Application' Class) inside 
	 *the same package, don't use an als.
	 *
	 *If you want to use a class everywhere (in the project folder), use the 'public' als
	 */
	public String getData(){
		
		String data="some stuff"+calculateGrowthForecast();
		
		return data;
	}

	
	private int calculateGrowthForecast(){
		
		return 9;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

public class Application {

	public static void main(String[] args) {
	
		System.out.println(String.CASE_INSENSITIVE_ORDER);

	}
}
