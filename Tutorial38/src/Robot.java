
public class Robot {
	
	//Field
	private int id;

	//Constructor
	public Robot(int id) {
		this.id = id;
	}
	//Inner classes are usually used for logically grouping classes
	//This is very common in Java
	private class Brain{
		public void think(){
			System.out.println("Robot "+ id +" is thinking.");
			
		}
	}
	//A second type of inner class are 'static' inner classes
	/*REMEMBER: Instances of the Robot object can't access the
	 *'Battery' class.  Only the 'Robot' itself can*/
	static class Battery{
		
		public void charge(){
			System.out.println("Battery charging.");
		}
	}
	
	public void start(){
		System.out.println("Starting robot "+ id);
		
		Brain brain=new Brain();
		
		brain.think();
	//A third type of inner class involves classes within methods 
		
		final String name="Robert";
		class Temp{
			public void doSomething(){
				System.out.println("ID is: "+ id);
				System.out.println("My name is "+ name);
			}
		}
		
		Temp temp1=new Temp();
		temp1.doSomething();
	}
}
