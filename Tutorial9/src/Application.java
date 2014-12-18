
public class Application {
	//Program demonstrating arrays of strings, looping through them, and values and references
	public static void main(String[] args) {
		
		//Declaration & initialization of string
		//here we are allocating and enough memory for 3 references to strings
		String words[]=new String[3];
		
		//Setting elements in array
		//Here we are allocating memory for each individual string
		words[0]="Hello";
		words[1]="to";
		words[2]="you";
		
		System.out.println(words[0]);

		//another string array but declaration, initialization, memory allocation, and the setting
		//of elements are all done on one line
		String[] fruits={"apple","banana","pear", "kiwi"};
		
		/*iterating through a loop without an index. 
		Java (temporarily) sets the String fruit variable to each individual string in fruits while
		it is being iterated over
		
		This is very similar to for(value in array) in javascript and
		foreach ($array as $value) in php
		*/
		for (String fruit: fruits){
			
			System.out.println(fruit);
			
		}
		
		//primitive type
		//allocates 32 bits of memory
		int number=56;
		
		
		//non-primitive type. Strings are classes. classes are denoted by capital letter
		//allocates enough memory for a reference to a string (address)
		String text=null; //(null is default value) pointless reference; not pointing anywhere
		//null is a special type that means 'nothing'
		
		//NOTE: default value for Strings is null, for ints is 0.
	
		System.out.println("\n"+text);
		
		//allocates enough memory for 2 references to 2 strings
		String[] texts=new String[2];
		
		//allocating memory for a string
		//pointing the reference (texts[0]) to the String memory with a value of "one"
		texts[0]="one";
	}

}
