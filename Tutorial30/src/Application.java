import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//This tutorial is about reading (text)files using scanner
public class Application {

	public static void main(String[] args) throws FileNotFoundException {
	
		/*C:\Users\Pete T\Documents\12714.txt -This is the original path of the Windows text file, but
		 * we have to alter it in order for Java to understand it and not confuse it for escaped characters
		 * (like /n)*/
		
		// replace the backslashes with forward slashes
		String fileName = "C:/Users/Pete T/Documents/12714.txt";
		// OR C:\\Users\\Pete T\\Documents\\12714.txt

		// Create a 'File' Object passing in the filename string
		File textFile = new File(fileName);

		/* You can use try/catch error handling OR use 'throws FileNotFoundException' in the method
		   declaration
		try {*/
			Scanner in = new Scanner(textFile);
		//} catch (FileNotFoundException e) {
			
			//e.printStackTrace();
		//}
			
		//Now we can read data from our file	
		int value=in.nextInt();	
		
		System.out.println("Read value: "+value);
		
		//empty line fix for carriage return and line feed (See video for more info)
		in.nextLine();
		
		int count=1;
		
		while(in.hasNextLine()){
			
			String line=in.nextLine();
			
			//System.out.println(line);
			
			System.out.println(count+ ": "+line);
			count++;
		}	
			
		in.close();//close the text file
	}
}
