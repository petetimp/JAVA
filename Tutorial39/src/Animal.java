//declaring an enum is a lot like declaring a class or interface
public enum Animal {
	//These are objects of type 'Animal'
	/*Having constants accessed directly from a class rather
	 * than instances (objects) of that class, saves memory*/
	CAT("Fergus"),DOG("Fido"),MOUSE("Jerry");
	
	private String name;
	
	//You can give enum types a constructor or methods
	 Animal(String name){
		 
		 this.name=name;
	}

	public String getName() {
		return name;
	}
	
	public String toString(){
		return "This animal is called + name";
		
	}
}
