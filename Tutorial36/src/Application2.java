import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Application2 {

	public static void main(String[] args) {
		
		//Slow way of reading a file
		/*File file=new File("test.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br= new BufferedReader(fr);*/

		//Faster way of reading a file
		
		File file=new File("test.txt");
		try (BufferedReader br=new BufferedReader(new FileReader(file))){
			
			String line;//this variable is a reference to each line in the file
			
			while((line=br.readLine()) != null){//while the value of 'line' is not null...
			
				System.out.println(line);
			}
		}catch (FileNotFoundException e) {
			System.out.println("Cant find file: "+ file.toString());
		} catch (IOException e1) {
			System.out.println("Unable to read file: "+ file.toString());
		}
		
		//Faster way of writing a file
		File file2=new File("test.txt");
		try (BufferedWriter br=new BufferedWriter(new FileWriter(file2))){
			
			br.write("This is line one");
			br.newLine();
			br.write("This is line two");
			
			
		} catch (IOException e1) {
			System.out.println("Unable to read file: "+ file.toString());
		}
	}

}
