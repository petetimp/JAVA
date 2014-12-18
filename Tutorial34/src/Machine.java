//The 'abstract' keyword prevents the programmer from accessing a class directly

public abstract class Machine {
	//Both 'Car' and 'Camera' can have an id
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	/*Abstract classes can also have abstract methods.  We make it abstract because
	all machines start differently*/
	public abstract void start();//This is exactly like an interface
	public abstract void doStuff();
	public abstract void shutDown();
	//By making these methods abstract, we force the child classes to implement them
	
	public void run(){
		
		start();
		doStuff();
		shutDown();
	}
	
	//Sometimes people get confused when they should implement an interface or an abstract class
	//Interfaces are more general and abstract classes are more specific
	//Abstract classes can actually define functionality while interfaces leave everything up
	//to the class that is implementing it
}
