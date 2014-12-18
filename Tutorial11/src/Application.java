//This tutorial is about classes AND subroutines (methods)

//A class is a template for an object.  The class keyword is lowercase, like all keywords
//Class Person doesn't represent a specific person.  Rather, it specifies what a person
//should/could be
//A class is almost like a user-defined type (vs types like int, double, ect)
class Person{
	//Instance variables (data or 'state') (represent data that you want to attach to an object)
	String name;
	int age;
	
	//Classes can contain
	
	//1. Data
	//2. Subroutines(methods)
	//A subroutine that is part of a class is called a method
	
	void speak(){
		
		System.out.println("Hello my name is " + name + " and I am "+ age + " years old." );
	}
	
	void sayHello(){
		
		System.out.println("Hello there!");
	}
	
}
//the file name for this class must match the class name
//You can only have ONE public class per file, but you can have as many
//non-public classes as you want
public class Application {
	
	public static void main(String[] args) {//This is a subroutine-the main method
		//declare and initialize a variable person1 of type 'Person'
		Person person1 = new Person();
		//person1 is object variable, name is data variable "Joe Blogs" is the value
		//of the data variable
		person1.name="Joe Blogs";
		person1.age=37;
		person1.speak();//for a method you NEED parentheses()
		person1.sayHello();
		
		Person person2 = new Person();
		
		person2.name="Sally Mae";
		person2.age=29;
		person2.speak();
		person2.sayHello();
	}
}
