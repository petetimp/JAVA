import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;


public class Test {
	//Methods very rarely throw exceptions on their own
	//you can't throw 2 exceptions at the same time, but you can throw either one
	public void run() throws IOException, ParseException{
	
		//throw new IOException();
	
		throw new ParseException("Error in command list",2);
	}
	
	
	public void input() throws IOException, FileNotFoundException{
		
		
	}
}
