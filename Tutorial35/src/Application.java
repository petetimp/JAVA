import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//This tutorial is about 'Reading Files with FileReader'
public class Application {

	public static void main(String[] args) {
		/*This is cumbersome code, but it is very flexible across
		various platfroms and can read various file types.
		There is an easier way to do this in Java 7*/
		
		File file=new File("test.txt");
		/*From StackOverflow...
		 * 
		 *A FileReader class is a general tool to read in characters from a File.
		 *The BufferedReader class can wrap around Readers, like FileReader, to buffer
		 *the input and improve efficiency. So you wouldn't use one over the other,
		 *but both at the same time by passing the FileReader object to the BufferedReader constructor.*/
		
		BufferedReader br=null;/*Setting br equal to null initializes the BufferedReader so we do not get
							   error 'Variable br may have not been initialized.*/
		/////////////////NOTE:Try blocks have scope/////////////////////////////////////////
		try {
			FileReader fr= new FileReader(file);
			br=new BufferedReader(fr);
			
			String line;//this variable is a reference to each line in the file
			
			while((line=br.readLine()) != null){//while the value of 'line' is not null...
			
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			//The end user should have a user friendly way of knowing that the file has not been found
			System.out.println("File not found: "+ file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file: "+ file.toString());
		}
		finally{
			try {
				
				br.close();
				
			} catch (IOException e) {
				
				System.out.println("Can't close file: "+ file.toString());
				
			} catch (NullPointerException ex){
				//File was probably never opened
			}		
		}
	}
}
