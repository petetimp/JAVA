//The tutorial is about anonymous classes in Java
/*Anonymous classes are either a way of extending an existing class or implementing an interface*/

class Machine{
	
	public void start(){
		
		System.out.println("Starting Machine...");
		
	}
	
}

//Another example with interfaces

interface Plant{
	
	public void grow();
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//By including the curly brackets, we can override a default method.
		/*Instead of overriding a method in an extended class (such as  'class Camera'), we can use an
		 *anonymous class within the instantiation of a new object (such as 'new Machine();') */  
		Machine machine1=new Machine(){
			//Here we are creating a child class of 'Machine' without a name (hence the term 'anonymous')
			@Override
			public void start() {
				System.out.println("Camera snapping");
			}
		};
		machine1.start();
		
		//CAN'T DO THIS (we only have an interface above)
		//Plant plant1=new Plant();
		
		//DO THIS
		Plant plant1=new Plant(){

			public void grow() {
				System.out.println("Plant growing");
		
			}
		};
		
		plant1.grow();
		
		//We will be looking at anonymous classes in the future.
		/*Often you declare an anonymous class while passing it to a method at the same time. It is then
		 * used as a kind of listener event pattern.  This is important for GUI programming*/
	}
}