//This tutorial is about StringBuilder and string formatting
public class Application {

	public static void main(String[] args) {
		
		//it is very common to use the += operator for adding on to strings
		//This string is going to be an empty string for the rest of its life in this program
		String info="";
		
		//here we are creating a new string made from the empty string above plus the text below
		//and we are reassigning the 'info' variable to it
		info +="My name is Bob.";
		
		/*here we are creating a new string made from all the previous text and the space below
		where we are also reassigning the 'info' variable to it*/
		info +=" ";
		info+="I am a builder.";//Doing the same thing again.
		
		/*Every time we use +="new string" we are not changing the original string, but rather
		 * creating a new string and assigning the 'info' variable to it.  This is not a big deal
		 * with a small program like this, but with bigger programs that use loops, recursion, etc.
		 * , it can slow down memory and waste space.  This is where the StringBuilder class comes
		 *  in */
		
		System.out.println(info);
		
		//The efficient way with the StringBuilder class
				
		StringBuilder sb=new StringBuilder("");//parameters are optional
		
		/*This string is having text appended to it, but in doing an append we are not creating a 
		new string (or StringBuilder) like the String class above, but modifying the existing
		string (StringBuilder, which is more efficient
		*
		*The append method returns a reference to the string builder object
		*
		*/
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
			
		//convert sb into a string by using the toString() method
		System.out.println(sb.toString());
			
		//shortcut-Method Chaining
			
		StringBuilder s = new StringBuilder();
			
		s.append("My name is Roger.")
		.append(" ")
		.append("I am a skydiver.");
			
		System.out.println(s.toString());
			
		//StringBuffer thread-safe version of StringBuilder (multiple threads)
		//StringBuilder is newer than StringBuffer and is more lightweight
			
			
		//More advanced string formatting/////////////////////////////////
			
		System.out.print("Here is some text. \t That was a tab. \nThat was a new line.");
		System.out.println("  More text.");
			
		//printf (print format) method-string with special formatting characters
		//Check out http://www.cs.gsu.edu/csc2010/f13/assignments/h4/printf.pdf for quick reference
		
		//formatting characters allow you more control than concatenation
		
		//%-10d allocates 10 character spaces (formatted + white space=10) to the right  
		//%10d allocates 10 character spaces (formatted + white space=10) to the left 
		System.out.printf("Total cost %-10d; quantity is %10d%n",5,120);
			
		//loop example using printf 
		//Make sure that you have as many arguments(parameters) as you do formatting characters
		/*notice that 2 spaces for the output are allotted for each number causing the numbers to
		 *line up*/   	
		for (int i=0; i<=20; ++i){
				
			System.out.printf("%-2d : %s \n",i,"Here is some text");				
		}
		
		//very useful-floating point formater %f
		/*all of these formatting specs can be a little confusing.  Only use what you need on an
		 * application-specific basis*/
									//2 decimal places-20.0 becomes 20.00
		System.out.printf("Total value: %.2f\n",20.0);
		System.out.printf("Total value: %5.3f\n",2.757485);
	}
}