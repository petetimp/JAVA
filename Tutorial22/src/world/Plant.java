package world;

public class Plant {

	//The public ALS means that the instance variable can be accessed anywhere within the program
	//This is legal BUT is considered bad practice
	/*It is better to ENCAPSULATE and hide your instance variables and use a method (getter method)
	to access and control the variables instead*/
	
	public String name;
	
	/*If you DO want a public instance variable, it is a good idea to make it a constant by
	 *using the 'final' and 'static' keywords.  Because the variable is public, you can ACCESS it
	 * from anywhere, but you can't CHANGE the value of the variable.  You would also have to access the
 	variable through the class itself, not through an object; i.e. Plant.ID NOT plant1.ID.  This
 	is good practice compared to the instance variable above*/
	
	public final static int ID=8;
	
	/*It is a good idea to make an instance or class variable private so that programmers can't
	* access it from outside the class*/
	
	private String type;
	
	/*The PROTECTED als means that variables or methods can be accessed from within classes,
	* subclasses, and within the same package*/
	
	protected String size;
	
	/*Not having any als means that fields and methods can only be accessed within a class
	* or within the same package.  If a subclass is in the same package as a class then that's ok,
	* but if a subclass is not in the same package, access is denied
	* 
	*  Access Levels 
	*  
	*  Modifier 		Class 	Package 	Subclass 	World
	   	public 			Y 		Y 			Y 			Y
		protected 		Y 		Y 			Y 			N
		no modifier 	Y 		Y 			N 			N
		private 		Y 		N 			N 			N
	*/
	
	int height;
	
	//constructor
	public Plant(){
		
		name="Freddy";
		type="Plant";
		size="medium";
		height=8;
	}
}
