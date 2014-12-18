public class Application {
	//This is a string program
	public static void main(String[] args) {
	
		int myInt=7;
		
		String text="Hello";
		//String is not a data type but actually a class (capital 'S' denotes this)
		
		String blank=" ";
		
		String name="Peter";
		
		String greeting=text + blank + name;
		
		System.out.println(greeting);
		
		//System.out.println("Hello" + " " + "Peter"); //same as above
		
		System.out.println("My integer is: " + myInt);
		
		double myDouble=34.5;
		
		System.out.println("My number is: " + myDouble + ".");
	}
}
