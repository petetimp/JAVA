import java.util.Scanner;
//This program demonstrates a switch/case statement
public class Application {
	
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
		String text= input.nextLine();
		
		switch (text){
			//NOTE:case statements MUST be constants such as strings ints, etc and NOT variables
			case "Start":
				System.out.println("Machine Started!");
				break;
			
			case "Stop":
				System.out.println("Machine Stopped!");
				break;
			
			default:
				System.out.println("Command not recognized");
		}
	}
}
