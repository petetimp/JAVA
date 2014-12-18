import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//import java.util.ArrayList;
//import java.util.Arrays;

//This tutorial is about SERIALIZATION: SAVING OBJECTS TO FILES, SERIALIZING ARRAYS, and THE TRANSIENT KEYWORD AND MORE SERIALIZATION  
/*To serialize an object (data) means to translate it into binary form (data).
 *The opposite of serialization is DESERIALIZATION.*/

public class WriteObjects {

	public static void main(String[] args) {
		
		System.out.println("Writing objects...");
		
		//-- means from 2 tutorials ago
		//!! means from last tutorial
		
		//--Person mike=new Person(543,"Mike");
		//--Person sue=new Person(123, "Sue");
		
		//--System.out.println(mike);
		//--System.out.println(sue);
		
		//Writing Objects to a File
		
		/*To write objects to a file in Java we use a class called FileOutputStream
		 * This class lets us stream data to a file.
		 * Streaming means sending data sequentially to a file. 
		 * */ 
		//An array is serializable as long as the objects in it are serializable (arrays are just objects, themselves)
			//Person[] people={new Person(99,"Sue"), new Person (78,"Bob"), new Person(44,"Rich"), new Person(3,"Todd")};
		
		
		
		//create an ArrayList of the People[] array above
			//ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
		
		//REMEMBER: With the 'try with resources' Java 7 statement, files are automatically closed
		//--try(FileOutputStream fs= new FileOutputStream("people.bin")){
		try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("serarray.bin"));){	
			
			/*If we do not implement the Serializable interface in the Person class
			 * (located in Person.java), Java will throw a 'NotSerializableException'*/
			
			Person person1=new Person(7,"Bob");
			
			Person.setCount(88);
			
			os.writeObject(person1);
			
			//--os.writeObject(mike);
			//--os.writeObject(sue);
			
			//serializing the Array
			//!!os.writeObject(people);
			
			//serializing the ArrayList
			//!!os.writeObject(peopleList);
			
			//!!os.writeInt(peopleList.size());
			
			/*!!for (Person person: peopleList){
			
				os.writeObject(person);
			}*/
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
