package files;
import util.KeyboardReader;
import java.util.*;
/*
Revise the number guessing program to force the user to guess until they are correct (loop-wise, to keep guessing as long as they are incorrect).
Then add more logic to ask if they want to play again, read a Y or N as their answer, and loop as long as they enter a Y.
 */
public class Game04 {
	private Random r = new Random();
	private int range=10;
	private int answer;
	private int guess;
	
	
	public Game04(){		
	}
	
	public Game04(char level){
		
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
				System.out.println("Too low");
			}
			else if (guess > answer){
				System.out.println("Too high");
			}
			else {
				System.out.println("Correct!");
				
			}
		}while (guess != answer);
	}

	public static void main(String[] args) {
		char level;
		boolean play=false;
		String playAgain="N";
		
		do {
			level = KeyboardReader.getPromptedChar("Please pick a difficulty:\n\t 'B' is for Beginner\n\t 'I' is for Intermediate\n\t 'A' is for Advanced\n");
			new Game04(level).play();
			
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
