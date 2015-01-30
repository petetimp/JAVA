package files;
import util.KeyboardReader;
import java.util.*;
/*
Modify your guessing game program to hold an array of several different String messages,
all of which have some form of message for "Correct".

Generate a random number in the range from 0 to the size of the array.

Use this value to select one message to print when they guess correctly.

Continue this approach for "Too Low" and "Too High".

There are three arrays of messages; note that they are not all the same size.
The code to handle too high, too low, and correct generates a random number between 0 and the
appropriate array's length, by using the Random object's nextInt method, and passing the length of the array.
 */
public class GameArrays01 {
	private Random r = new Random();
	private int range=10;
	private int answer;
	private int guess;
	private String[] correct={"Correct!","You got it!", "That's the number, nice job!"};
	private String[] low={"Too low","Go higher","Not quite high enough"};
	private String[] high={"Too high","Go lower","Not quite low enough"};
	private int arrayRandom;
	
	public GameArrays01(){		
	}
	
	public GameArrays01(char level){
		
		switch(level){
		
			default:
				System.out.println("Not a valid character.  Beginner has been chosen.  Use 'B' for Beginner, 'I' for Intermediate, or'A' for advanced");
			case 'B':
			case 'b':
				System.out.println("Beginner");
				range=10;
				break;
			case 'i':
			case 'I':
				System.out.println("Intermediate");
				range=100;
				break;
			case 'a':
			case 'A':
				System.out.println("Advanced");
				range=1000;
		}
		
		answer=r.nextInt(range) + 1;
	}
	
	public void play(){
		//System.out.println(answer);
		
		do{
			guess = KeyboardReader.getPromptedInt("Please guess a number between 1 and " + range + "\n");
				
			if (guess < answer){
				arrayRandom=r.nextInt(low.length);
				System.out.println(low[arrayRandom]);
			}
			else if (guess > answer){
				arrayRandom=r.nextInt(high.length);
				System.out.println(high[arrayRandom]);
			}
			else {
				arrayRandom=r.nextInt(correct.length);
				System.out.println(correct[arrayRandom]);
				
			}
		}while (guess != answer);
	}

	public static void main(String[] args) {
		char level;
		boolean play=false;
		String playAgain="N";
		
		do {
			level = KeyboardReader.getPromptedChar("Please pick a difficulty:\n\t 'B' is for Beginner\n\t 'I' is for Intermediate\n\t 'A' is for Advanced\n");
			new GameArrays01(level).play();
			
			playAgain=KeyboardReader.getPromptedString("Would you like to play again? (Type 'Y' for Yes or 'N' for No)\n");
				
			switch (playAgain){
				
				default:
				case "n":
				case "N":
					System.out.println("Thanks for Playing!");
					play=false;
					break;
				case "y":
				case "Y":
					play=true;
			}
		}
		while (play);
		
	}

}
