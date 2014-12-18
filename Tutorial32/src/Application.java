import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;



//This tutorial is about throwing & handling multiple exceptions
public class Application {
	//You can throw the exceptions out of the main method
	//public static void main(String[] args) throws IOException, ParseException {
	public static void main(String[] args){
	//you can also use a try/catch block
		Test test=new Test();
		
		/*try{
			test.run();
		} catch (IOException e){
			e.printStackTrace();
			
		} catch (ParseException e){
			
			System.out.println("Couldn't parse command file.");
		}*/
		
		/* NEW in JAVA 7*/
		//try multi-catch
		/*try {
			test.run();
		} catch (IOException | ParseException e) {

			e.printStackTrace();
		}*/
		
		try {
			test.run();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		try {
			test.input();
		} catch (FileNotFoundException e) {//NOTE: Make sure that FileNotFoundException comes before
			e.printStackTrace();		  //IOException. (child exception must come before parent exception)
										  //If we do it the other way around, the code will not compile
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
