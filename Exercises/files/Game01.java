package files;
import util.KeyboardReader;
/*
 * Write a program called Game that will ask the user to guess a number and compare their guess
 * to a stored integer value between 1 and 100. Use a field called answer to store the expected answer.
 * 
 * For now, just hard-code the stored value; we will create a random value later
 * (your code will be easier to debug if you know the correct answer).
 * 
 * Create a method called play() that holds the logic for the guessing.
 * 
 * Use the KeyboardReader class to ask for a number between 1 and 100, read the result,
 * and tell the user if they are too low, correct, or too high.
 * 
 * Create a main method, have it create a new instance of Game and call play().
 */
public class Game01 {
	
	private  int answer=56;
	private  int guess;
	
	public void play(){
		guess = KeyboardReader.getPromptedInt("Please guess a number between 1 and and 100\n");
		if (guess < answer) System.out.println("Too low");
		if (guess > answer) System.out.println("Too high");
		if (guess == answer) System.out.println("Correct!");
	}

	public static void main(String[] args) {
		new Game01().play();
	}

}
