import java.util.ArrayList;
import java.util.HashMap;


class Animal{
	
	
}

//This tutorial is about generics (generic classes) in java

/*A generic class is a class that works with other objects.  You can specify what type of objects you want
 * it to work with when creating (instantiating) objects from the class*/

//Generics didn't come out until Java5
public class Application {

	public static void main(String[] args) {
		//ArrayList class in generic form-IMPORTANT
		/*An ArrayList is a class that manages arrays internally.  It's like having an array, but you don't have to
		 * worry about the size of the array.  .*/
	
		//////////////////BEFORE JAVA 5///////////////////////////////////////////////////
		
		ArrayList list=new ArrayList();//This is an object that can store other objects
		
		list.add("apple");
		list.add("orange");
		list.add("banana");
		
		String fruit=(String)list.get(1);//getter method that grabs the item from the array with the
		/*specific index. This method returns an OBJECT not a STRING. We have to downcast it using (String)
		 *for the method to return 'orange'*/
		
		System.out.println(fruit);
		
		//////////////////JAVA 5 and LATER (Modern)////////////////////////////////////////////////
		
		//Parameterized classes 
		/*The idea behind generics is that if you have a class that works with some particular type of 
		 * object(s), then you can use, using generics, type parameters which specify what type of object
		 * you want that class to work with*/
		
		/*With generics, inside the the diamond brackets, I specify the type of thing that I want to put in
		my ArrayList.  An ArrayList is a parameterized generic class where I put the class that I want to
		convert to in a parameter*/
		ArrayList<String> strings=new ArrayList<String>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("fish");
		
		String animal=strings.get(2);
		
		/*Getter method that grabs the item from the array with the specific index. This method returns an
		 *STRING not an OBJECT. We DON'T have to downcast it using (String) because we have used a generic
		 *with a <String> parameter when the ArrayList was declared and initialized above*/
		
		System.out.println(animal);
		
		/*Next tutorial-How we can pass parameterized objects as arguments to methods*/
		//You can have parameterized classes, but have more than one type argument
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		//////////////JAVA 7 style////////////////////////////////////////////////
		
		ArrayList<Animal> animals=new ArrayList<>();
		//Java assumes by default that the class name in the diamond brackets is Animal
	}

}
