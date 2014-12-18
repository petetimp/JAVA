package src.demo2;
//try/catch blocks in java are another way to process error handling
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {

	public static void main(String[] args) {

		File file1=new File("test.txt");
		
		try {
			FileReader fr=new FileReader(file1);
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("File not found: "+file1.toString());
		}
	}

}
