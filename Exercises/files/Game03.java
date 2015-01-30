package files;
import util.KeyboardReader;
import java.util.*;
/*
What if we want to offer gamers multiple levels of difficulty in our game?
We could make the random number multiplier a property of the Game class, 
and set a value into it with a constructor, after asking the user what level they'd like to play.

Add a range field to the Game class (an int).

Add a constuctor that accepts a level parameter; use a char.

Within that constructor, use a switch to process the incoming level:
Uppercase or lowercase B means Beginner, set the range to 10.
I means Intermediate; set the range to 100.
A means Advanced; set the range to 1000.

Any other value results a Beginner game; after all,
if they can't answer a simple question correctly,
how could we expect them to handle something more advanced.

You could put the default option stacked above the "B" cases,
so that you can print an error message and then fall through to the 'B' logic

Use range as the parameter when you call the Random object's nextInt method
(move the logic that creates the Random object and generates the answer to this constructor).

Add a default constructor that calls this new constructor, passing 'I' for intermediate.

The prompt given by the play method should now take the range into account.

In the main method, ask the user for the level and call the new constructor with their response.
 */
public class Game03 {
	private Random r = new Random();
	private int range=10;
	private int answer;
	private int guess;
	
	public Game03(){		
	}
	
	public Game03(char level){
		
		switch(level){
		
			default:
				System.out.println("Not a valid character.  Beginner has been choosen.  Use 'B' for Beginner, 'I' for Intermediate, or'A' for advanced");
			case 'B':
			case 'b':
				System.out.println("Beginner");
				range=10;
				break;
			case 'i':
			case 'I':
				System.out.println("Intermediate");
				range=100;
			case 'a':
			case 'A':
				System.out.println("Advanced");
				range=1000;
		}
		
		answer=r.nextInt(range) + 1;
	}
	
	public void play(){
		System.out.println(answer);
		
		guess = KeyboardReader.getPromptedInt("Please guess a number between 1 and " + range + "\n");
			
		if (guess < answer){
			System.out.println("Too low");
		}
		else if (guess > answer){
			System.out.println("Too high");
		}
		else {
			System.out.println("Correct!");
		}
	}

	public static void main(String[] args) {
		char level;
	
		level = KeyboardReader.getPromptedChar("Please pick a difficulty:\n\t 'B' is for Beginner\n\t 'I' is for Intermediate\n\t 'A' is for Advanced\n");
		new Game03(level).play();
	}

}
