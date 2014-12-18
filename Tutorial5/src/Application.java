import java.util.Scanner;

public class Application {
	
	//This program tells the user to input some text and outputs it to the user
	public static void main(String[] args) {
		//Scanner class like String class for variables;
		//Crate a new Scanner object using the Scanner class for the user to enter something
		Scanner input= new Scanner(System.in);//System.in is an input stream object
		
		//Tell the user to enter a line of text
		System.out.println("Please enter a line of text:  ");
		
		//Wait for the user to enter something...
		
		/*the nextLine() method of the Scanner object puts the line that the user entered into
		a variable named 'line'*/
		String line=input.nextLine();
		
		System.out.println("You entered: " + line);
		
		/*Alternate (with a double)
		 * System.out.printlin("Please enter a floating point value: ");
		 * 
		 * double value= input.nextDouble();
		 * 
		 * 
		 * System.out.println("You entered: " + double);
		 */
	}

}
