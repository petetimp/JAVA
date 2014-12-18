//This is a tutorial about the .toString() method and some other Object methods

//all objects in java have the object class as their ultimate implied parent
class Frog{
	/*.toString() is a very useful method that is used in developing and debugging applications
	  where you can create a string representation of your object that enables you to identify the
	  object*/
	
	private int id;
	private String name;
			
	//constructor 
	public Frog(int iD, String Name){
		
		this.id=iD;
		this.name=Name;
	}
	
	//overrides Object.toString() method
	public String toString(){
		
		//return id+ ": "+ name; this is inefficient (look at Tutorial17) use StringBuilder instead
		
		/*StringBuilder sb=new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();*/
		
		//using the 'format' style (similar to printf)
		
		return String.format("%-4d: %s", id, name);
	}
}

public class Application {

	public static void main(String[] args) {
		
		//Object obj=new Object();
		
		Frog frog1=new Frog(7,"Freddy");//the Frog class inherits all of the Object class's methods
		
		//with a defined .toString() method frog1.toString() will return "Hello" (defined above)
		/*without a defined .toString() method frog1.toString will return the class 'Frog' followed
		  by an @ sign and a hash code.
		  
		  *A hash code is a unique identifier for each object*/
		System.out.println(frog1.toString());
		
	}
}
