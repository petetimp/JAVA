//This is a tutorial about the static keyword in java

class Thing{
	//most of the time member variables are either private or protected(later)
	/*From the Java Tutorials
	 * 
     *Member variables in a class—these are called fields.
     *Variables in a method or block of code—these are called local variables.
     *Variables in method declarations—these are called parameters.*/
	public String name;//instance variable
	public static String description;//class variable (or static instance variable)

	/*The difference with the member variable 'static' is that each object does not get its
	own copy as with instance variable name.  Rather it is a class variable with only ONE copy
	because there is only one class.*/
	
	//Now let's look at static methods vs. instance methods
	
	/*instance methods can access instance AND static data, but static methods
	can only access static data*/
	
	//outputting the name and description using an instance method (getter method)
	public void showName(){
		System.out.println(description +": "+ name);
	}
	
	//static methods, on the other hand, can be accessed by class name
	public static void showInfo(){
		
		System.out.println(description);
		//System.out.println(name); You cannot make a static reference to a non-static field name
		//in other words you can't use non-static instance variables with static methods
	}
	/*public-accessible outside the class
	 *final-is a constant
	 *static-each object does not get its own copy.  Must use Thing.LUCKY_NUMBER notation
	 *int-primitive data type
	 *LUCKY_NUMBER- class variable 
	 * */
	public final static int LUCKY_NUMBER=7;
	
	//usually this would be 'private', but for simplicity, we will use public in this example
	//because count is static, it belongs to the class, not the objects.
	public static int count=0;
	
	//when not initialized, variables have a default value of 0
	//For this instance variable 'id', every variable will have its own id
	public int id;
	
	//every time a Thing object is created, count is incremented by 1
	public Thing(){
		/*every object has its own identity because 'id' is an instance variable and not a static
		 *class variable.  We can set the class variable 'count' equal to the instance variable 'id'
		 *to keep track of what count was when each individual object was created (this in turn
		 *gives each Thing object a unique id) */
		id=count;
		
		count++;
	}
	
	public static int getCount(){
		return count;
	}
	
	public void showID(){
		System.out.println("Object id: "+ id);	
	}
}

public class Application {

	public static void main(String[] args) {
		
		/*notice how we use 'Thing' without a variable.  This gives you the clue that 'decription'
		is a class variable*/
		Thing.description="I am a thing";
	
		System.out.println(Thing.description);
		
	
		System.out.println("Before creating objects, count is: "+Thing.getCount());
		Thing thing1=new Thing();
		Thing thing2=new Thing();
		System.out.println("After creating objects, count is: "+Thing.getCount());
		
		//Each 'Thing' object has its own copy of name
		thing1.name="Bob";
		thing2.name="Sue";
		
		thing1.showName();
		thing2.showName();
		
		Thing.showInfo();
		
		thing1.showID();
		thing2.showID();
		
		//Some uses for static methods in java
			/*1. You can use a static method when there are no instance variables in the method.																				
			 	 If there are instance variables that you want to use, just drop the static keyword.																			
			 
			  2. Constants--such as PI in the Math Class in the Java Standard Library. We are
			     accessing the constant data 'PI' from the Math class. Constants can't be reassigned. 
			 	 	i.e. Math.PI=3; <---NO!! Can't do it 
			 	 -Constants are conventionally written in uppercase letters ("PI" in Math.PI)	
			 	 
			  3. Counting the number of objects that you are creating.
			  
			  4. Assigning a unique ID to each of your objects 
			 */
		System.out.println(Math.PI);
		System.out.println(Thing.LUCKY_NUMBER);
		
	}
}
