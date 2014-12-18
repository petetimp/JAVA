//This tutorial is about ENUM TYPES: BASIC AND ADVANCED USAGE

/*An enum type is a special data type that enables for a variable to be a set
 *of predefined constants.  The variable must be equal to one of the values
 *that have been predefined for it. Common examples include compass directions
 *(values of NORTH, SOUTH, EAST, and WEST) and the days of the week. Because
 *they are constants, the names of an enum type's fields are in uppercase letters.
 *
 *In the Java programming language, you define an enum type by using the enum keyword*/
public class Application {
	
	public static final int DOG=0;
	public static final int CAT=1;
	public static final int MOUSE=2;
	
	public static void main(String[] args) {
		/*In Java it is very common to have a variable
		 *represent a fixed set of values
		 *
		 *int animal=CAT;
		 *
		 *What we want is a special type that can be set to only represent
		 *certain members of a fixed set that have fixed (constant) values
		 **/
		//Using enums also increases type safety
		Animal animal= Animal.CAT;
		
		//enums can also be used in switch statements where we can't use Strings
		switch(animal){
			case CAT:
				System.out.println("Cat");
				break;
			case DOG:
				System.out.println("Dog");
				break;
			case MOUSE:
				System.out.println("Mouse");
				break;
			default:
				break;
		}
		System.out.println(Animal.DOG);
		System.out.println(Animal.DOG.getClass());
		
		//The .name() method gives you the exact name of a constant within an enum as a string
		System.out.println("Enum name as a String: "+ Animal.DOG.name());
		
		/*The 'instanceof' keyword tells us whether an object is an instance
		 *of a particular class*/ 
		System.out.println(Animal.DOG instanceof Animal);
		System.out.println(Animal.DOG instanceof Enum);
		
		System.out.println(Animal.MOUSE.getName());
		
		//valueOf converts a string into an enum
		Animal animal2=Animal.valueOf("CAT");
		System.out.println(animal2);
	}
}
