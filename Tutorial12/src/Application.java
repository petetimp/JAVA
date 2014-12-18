//This tutorial is about getters and return values
//usually classes are declared in their own file and made public

/*Later on we're going to look at encapsulation, which means the data that you have in a class (such
 * as Person) is hidden away from other classes (such as Application).  We can stop classes from
 * accessing the data in other classes directly, which what is going on here (more on this later)*/
class Person{
	String name;
	int age;
	
	//methods usually either retrieve data or calculate something
	//'void' means that the method doesn't return anything	
	void speak(){
		
		System.out.println("Hello my name is " + name + " and I am "+ age + " years old." );
	}
	
	
	int calculateYearsToRetirement(){
		int yearsLeft=65-age;
		
		return yearsLeft;
	}
	//These are 'GETTER' methods
	int getAge(){
		
		return age;
	}
	
	String getName(){
		
		return name;
	}
}

public class Application {
	public static void main(String args[]){
		
		//declare and initialize a variable person1 of type 'Person'
		Person person1 = new Person();
		//person1 is object variable, name is data variable "Joe Blogs" is the value
		//of the data variable
		person1.name="Joe Blogs";
		person1.age=37;
		//person1.speak();//for a method you NEED parentheses()
		
		int retireYears=person1.calculateYearsToRetirement();
		
		System.out.println("Years till retirement: "+retireYears);
		
		/*You can alternately do:
		System.out.println(person1.calculateYearsToRetirement());*/
		
		String name=person1.getName();
		int age = person1.getAge();
		
		System.out.println("Name is: "+ name);
		System.out.println("Age is: "+ age);
		
	}
}
