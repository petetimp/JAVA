package files;
import util.KeyboardReader;
import java.util.*;
/*
Revise your number guessing program to use if . . . else logic 
(you can test for too low and too high, and put the message for correct in the final else branch).

answer = 
the nextInt(int n) method generates a number greater than or equal to 0 and less than n, so r.nextInt(100) would range from 0 through 99; we need to add 1 to raise both ends of the range.
You might want to print the expected correct answer to aid debugging.
Note that until we cover looping, there will be no way to truly "play" the game, since we have no way to preserve the value between runs.
 */
public class Game02 {
	
	private int guess;
	private Random r = new Random();
	private int answer=r.nextInt(100) + 1;
	
	public void play(){
		//System.out.println(answer);
		guess = KeyboardReader.getPromptedInt("Please guess a number between 1 and and 100\n");
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
		new Game02().play();
	}

}
