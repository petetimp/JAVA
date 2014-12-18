//This tutorial is about Upcasting & Downcasting

class Machine{
	
	public void start(){
		
		System.out.println("Machine started");
	}
}

class Camera extends Machine{
	
	public void start(){
	
		System.out.println("Camera started");
	}
	
	public void snap(){
		
		System.out.println("Photo taken");
	}
}

public class Application {

	public static void main(String[] args) {
		
		Machine machine1=new Machine();
		Camera camera1=new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		/*Casting refers to variables NOT objects.  When we create objects (such as new Machine()),
		 * those objects will always be the type of object that they started out as.
		 * 								BUT
		 * You can change the variable types (such as Machine machine1) that refer to those objects
		 * from one type to another
		 * */
		/*Reference back to Polymorphism-You can always use an object of a child class type where
		 * you would expect an object of a parent class type*/
		
		/*CAN'T DO THIS-Eclipse returns error'Type mismatch: cannot convert from Machine to Camera'
		Camera camera2= new Machine();*/
		
		//Upcasting (guaranteed by polymorphism)
		Machine machine2=camera1;
		//Alternate-Machine machine2=new Camera();
		machine2.start();
		//machine2.snap(); CAN'T DO THIS Eclipse returns error-'machine cannot be resolved'
		/*									BUT
		 * There is a way around this
		 **/
		
		//Downcasting
		
		Machine machine3=new Camera();
		Camera camera2=(Camera)machine3; //Downcasting from a Machine to a Camera
		camera2.start();
		camera2.snap();
	
		/*CAN'T DO THIS- you can't make a 'Camera' object out a 'Machine' object
		Machine machine4=new Machine();
		Camera camera3=(Camera)machine4;
		camera3.start();
		camera3.stop();*/
		
		//You also can't downcast between unrelated types (classes)
		//It is really common in Java to cast objects
	}
}
