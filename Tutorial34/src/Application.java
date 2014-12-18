//This tutorial is about abstract classes
/*You can use abstract classes when you want to create a class hierarchy.  The class doesn't do much except
 * act as a base for other classes*/
public class Application {

	public static void main(String[] args) {
		
		Camera camera1=new Camera();
		
		camera1.setId(1);
		
		Car car1=new Car();
		
		car1.setId(1);
		
		//All machine is, is a base class that groups together subclasses that have common functionality
		/*If we use the 'abstract' keyword (see machine.java), Eclipse returns error-'Cannot instantiate
		the type Machine'*/
		//Machine machine1=new Machine();
		
		car1.run();
	}
}
