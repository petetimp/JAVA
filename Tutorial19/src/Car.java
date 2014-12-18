//When using the 'extends' keyword, Car becomes a child class of Machine (in Machine.java)

/*In other words Car INHERITS all of Machine's methods, car is a machine, and car is derived from
machine

*When you can't see the source code for a certain class, you can extend it (most of the time) and 
*overwrite the parent class's methods with your own
*
*If a class uses the final keyword (such as public final class String extends Object), you can't
*extend the class using a child class
*/
public class Car extends Machine {
	
	//Eclipse-specific way of overriding a method
	/*	1. Right-click inside body of 'Car' class and select Source
	 *	2. Then click 'Override/Implement Methods' and select the method that you want to override*/
	
	/*@Override is an annotation inserted by Eclipse (this is actually a class name) that makes
	  sure that the class you're trying to override is defined in the parent class*/
	@Override 
	public void start() {
		System.out.println("Car started");
	}
	
	//overrides Machine.start() (non-Eclipse method)
	/*public void start(){
		System.out.println("Car started");
	}*/
	
	//NOTE:DO NOT TRY TO OVERWRITE A VARIABLE-The results will be horrible
	
	public void wipeWindShield(){
		
		System.out.println("Wiping windshield");
	}
	
	public void showInfo(){
		System.out.println("Car name: " + name);
	}
	/*CAN'T DO THIS when the 'name' variable in Machine.java is private.
	Eclipse returns error:'The field Machine.name is not visible'
					B U T
	When the 'private' keyword is not used with the 'name' variable in the Machine class, the Car
	class can inherit it just fine*/
	
	
}
