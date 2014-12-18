
/*This tutorial is about passing parameters to methods.					 *
 *In the last tutorial we saw that we could return values from methods.  *
 *Often though, we want to pass values (parameters) into methods to alter*
 *what the method does depending on a condition, the value of a variable,*
 *etc...					 											 */



class Robot{
					 //parameter variable
	public void speak(String text){
		
		System.out.println(text);
		
	}
	
	public void jump(int height){
		
		System.out.println("Jumping: " + height);
		
	}
	
	public void move(String direction, double distance){
		
		System.out.println("Moving: "+ distance + " meters in direction " + direction);
	}
}


public class Application {

	public static void main(String[] args) {
	
		Robot sam=new Robot();
		
		sam.speak("Hello there, my name is Sam.");
		sam.jump(7);
		sam.move("West", 10.5);//make sure to separate parameters by commas
		
		//you can also pass a variable as a parameter as long as the data types are the same 
		String greeting="Hello there";
		
		//for the String class, the variable name acts as a reference label for the class that 
		//processes it while for ints (and other primitive types) the variable acts like a bucket
		//and refers to the actual memory that contains the value

		sam.speak(greeting);
		
		//a string is an array of chars
		char[]phrase={'H','e','l','l','o',' ','t','h','e','r','e'};
		
		for (int i=0; i<phrase.length; ++i){
			
			System.out.print(phrase[i]);
		}
		
		System.out.println();
		
		int number=14;
		
		sam.jump(14);

		
	}
}
