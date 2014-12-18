//This tutorial is about setters and the 'this' keyword
class Frog{
	/*by setting these two instance variables to "private", they are no longer accessible from
	outside the Frog class.  They are hidden from all other classes and methods*/
	private String name;
	private int age;
	
	//setter methods (get used to seeing the 'this' keyword.  We will see it a lot in the future!)
	public void setName (String name){
		//this.name refers to 'private String name' while name refers to the parameter String name
		this.name=name;
	}
	
	public void setAge (int age){
		
		this.age=age;
	}
	
	//getter methods
	int getAge(){
		
		return age;
	}
	
	String getName(){
		
		return name;
	}
	
	public void setInfo(String name, int age){
		/*In this method, we DO NOT need the 'this' keyword because we are only using name and
		age once*/
		setAge(age);
		setName(name);
		
	}
}

public class Application {

	public static void main(String[] args) {
		
		Frog frog1= new Frog();
		
		//if you access variables directly from the class (name, age), then you have to know the
		//variables that the class contains.  This is undesirable and complicates things
		//frog1.name="Bernie";//setting the instance variable with an equal sign (.name and .age)
		//frog1.age=1;
		
		//This is called "Encapsulation"
		frog1.setName("Bernie");//here were are calling a method that 'sets' the instance variable
		frog1.setAge(2);
		
		//here we are calling a method that 'gets' the instance variable
		System.out.println(frog1.getAge());

	}
}
