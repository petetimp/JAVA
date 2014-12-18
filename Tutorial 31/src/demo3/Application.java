package src.demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {

	public static void main(String[] args) {
		
		try {
			openFile("test.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not found: test.txt");	
		}
	}
	//method stack- domino effect of methods where one calling of a method sets off several others
	public static void openFile(String fileLocation) throws FileNotFoundException{
		
		File file1=new File(fileLocation);
		FileReader fr=new FileReader(file1);
	}
}