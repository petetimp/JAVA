//This tutorial is about constructors

/*A constructor is a special type of method which is run every time an instance
of a specific class is created

All methods require a return type, EXCEPT constructors, which don't have a return type

The name of the constructor HAS to have the same name as the class 
(must start with uppercase letter)

Constructors are typically used for initialization of instance variables
*/
class Machine{
	
	//instance variables
	private String name;
	private int code;
	
	/*Multiple constrctors.  Constructors can also take parameters like methods can
	 * You can have different methods with the same name, but you MUST have different parameters.
	 * Java will figure out which method to call when it is called from the program*/
	
	/*Calling one constructor from within another constructor--Sometimes you might want to call
	 * a complex constructor from one of the simpler constructors OR call a simpler constructor
	 * from a complex one depending on the situation*/
	
	
	//constructor
	public Machine(){
		/*By using the 'this' keyword, we are calling the Machine method that takes the specific
		parameters in the specific class (third method in Machine class). NOTE: the constructor
		call MUST be the first statement in a constructor*/
		
		this("Arnie",0);
		
		System.out.println("Constructor running");
		
		//every instance of the machine object that is created will have a name equal to 'Arnie'
		//name="Arnie";
	}
	
	//this constructor has the same name as the method above, but takes a string parameter
	//this constructor is a bit like a 'setter' method
	public Machine(String name){
		this(name, 0);
		System.out.println("Second constructor running");
		//this.name=name;
	}
	
	//a third constructor with the same name (also like a setter method)
	public Machine(String name, int code){
		System.out.println("Third constructor running");
		this.name=name;
		this.code=code;
	}
}

public class Application {

	public static void main(String[] args) {
		//instance of the 'Machine' class
		Machine machine1= new Machine();/*'new Machine()' is where the instance of the class is
										actually created. 'new Machine()' is the object being
										created by a call to the constructor 'public Machine()'*/
		
		System.out.println("End of first constructor call");
		
		/*We usually create a variable (in this case 'Machine machine') and set it equal to the
		 * object that is returned, but we can just type 'new Machine()' by itself, which creates
		 * a new object  */
		
		/*new Machine();By itself 'new Machine();' also sends "Constructor running" to the console
		 			    We are still invoking the constructor */
		
		
		//this is a call to the second constructor
		Machine machine2=new Machine("Bertie");
		
		System.out.println("End of second constructor call");
		
		//this is a call to the third constructor
		Machine machine3=new Machine("Tommy",4);
		
		System.out.println("End of third constructor call");
	}
}
