import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("Reading Objects...");
		
		//--From 2 tutorials ago
		//!! from last tutorial
		
		//--try(FileInputStream fi=new FileInputStream("people.bin")){
		try(ObjectInputStream os=new ObjectInputStream(new FileInputStream("serarray.bin"))){	
			
			//reading the people Person[] array 
			//!!Person[] people= (Person[])os.readObject();
			
			//reading the peopleList ArrayList<Person>
			//!!@SuppressWarnings("unchecked")
			//!!ArrayList<Person> peopleList=(ArrayList<Person>)os.readObject();
			
			/*we need to use the cast (Person) because we want a Person but are
			reading from an object*/
			//--Person person1=(Person)os.readObject();
			//--Person person2=(Person)os.readObject();
			
			//prints each person in people array out
			/*!!for (Person person: people){
				System.out.println(person);
			}*/
			
			//prints each person in the personList ArrayList<Person> out
			/*!!for (Person person:peopleList){
				System.out.println(person);
			}*/
			
			//!!int num=os.readInt();
			
			/*!!for (int i=0; i<num; i++){
				Person person= (Person)os.readObject();
				System.out.println(person);
			}*/
			
			//--System.out.println(person1);
			//--System.out.println(person2);
			
			Person person1= (Person)os.readObject();
			
			/*person1 has an id of '0' because the original id '7' was not serialized
			 * due to the 'transient' keyword*/
			System.out.println(person1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {//This exception is for if the 'Person' class is not found
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
