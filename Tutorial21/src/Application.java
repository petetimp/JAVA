//This tutorial is about creating interfaces in java
//If you want to give 2 completely different objects the same method you can implement an interface
//An interface is almost like a textual contract
//You can implement multiple interfaces, but extend only one parent class


public class Application {

	public static void main(String[] args) {
		
		Machine mach1=new Machine();
		mach1.start();
		
		Person person1=new Person("Bob");
		person1.greet();
		
		/*You can use an interface as a reference type (class name) everywhere where the interface
		 *is being implemented EXCEPT next to the 'new' keyword
		 **/
		
		Info info1=new Machine();
		/*Keep in mind that the only method that the new Machine has is showInfo(), the method
		header from the Info interface*/
		
		Info info2=person1;//now person1 and info2 both point to new Person("Bob);
		info2.showInfo();
		
		System.out.println();
		
		outputInfo(info1);
		outputInfo(info2);
	}
	//Class methods usually aren't static, but the is no Application object present
	//This method accepts any object that implements the 'Info' interface
	private static void outputInfo(Info thing){
		thing.showInfo();
	}
	/*This is one way to use an interface.  There are other examples on caveofprogramming.com that
	 * deal with the collections packages in java that deal with manipulating and storing data
	 * (grouping objects)
	 * 
	 * Some people design whole programs by using interfaces (IStartable.java)*/
}
