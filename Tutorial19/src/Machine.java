//this is a class that can be accessed from Application.java (Tutorial19), but is in a seperate file
public class Machine {	
	
	/*because this variable 'name' has been declared private, it can't be accessed from any other
	class (even if the class extends it)*/
	//private String name="Machine Type 1";
	
	/*On the other hand without the 'private' keyword the 'Car' class
	or any other class within the same package (more on this later) can use the 'name' variable
	*
	*The Car, Application, and Machine classes are all in the same package
	*/
	//String name="Machine Type 1";
	
	/*Access specifiers should be used with all variables within a class (let's rewrite the 'name'
	  variable with a 'protected' access specifier)
	*  
	*'protected' means that you can access the variable 'name' anywhere within the default package
	*OR from within any child class
	*/
	protected String name="Machine Type 1";
	
	
	
	public void start(){
		System.out.println("Machine started");
	}
	
	public void stop(){
		System.out.println("Machine stopped");	
	}
}
