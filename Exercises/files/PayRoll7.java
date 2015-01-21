package files;
import files.Employee7;
import util.KeyboardReader;


/**
* Tests the {@link Employee7} class.
*/
public class PayRoll7 {

	/**
	* Tests the {@link Employee7} class.
	*/
	public static void main(String[] args) {
		
		String firstName=null; 
	    String lastName=null;
	    double payRate=0.0; 
	    int department=0;
		
		Employee7.setNextId(22);
		
		Employee7 Pete= new Employee7();
		Pete.setFullName("Peter", "Timpone");
		Pete.setPayRate(100000);
		Pete.setDeptNum(4);
		
		System.out.println(Pete.getPayInfo());
		
		System.out.println();
		
		Employee7 Sarah= new Employee7("Sarah", "Grey", 3, 75000);
		System.out.println(Sarah.getPayInfo());
		
		System.out.println();
		
		Employee7 Bob = new Employee7("Bob", "Jones", 5400.0);
	    System.out.println(Bob.getPayInfo());

	    System.out.println();
	    
	    Employee7 Bill = new Employee7("Bill", "Meelater", 4);
	    System.out.println(Bill.getPayInfo());
	    
	    System.out.println();
	    
	    firstName = KeyboardReader.getPromptedString("Please enter the employee's first name: ");
	    lastName = KeyboardReader.getPromptedString("Please enter the employee's last name: ");
	    payRate = KeyboardReader.getPromptedDouble("Please enter the employee's pay rate: ");
	    department = KeyboardReader.getPromptedInt("Please enter the employee's department #: ");
	    Employee7 Mike = new Employee7(firstName, lastName, department, payRate);
	    System.out.println(Mike.getPayInfo());  
	}
}
