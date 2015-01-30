package files;
import files.Employee8;
import util.KeyboardReader;


/**
* Tests the {@link Employee8} class.
*/
public class Payroll8 {

	/**
	* Tests the {@link Employee8} class.
	*/
	public static void main(String[] args) {
		
		String firstName=null; 
	    String lastName=null;
	    double payRate=0.0; 
	    int department=0;
		
		Employee8.setNextId(22);
		
		Employee8 Pete= new Employee8();
		Pete.setFullName("Peter", "Timpone");
		Pete.setPayRate(100000);
		Pete.setDeptNum(4);
		
		System.out.println(Pete.getPayInfo());
		
		System.out.println();
		
		Employee8 Sarah= new Employee8("Sarah", "Grey", 3, 75000);
		System.out.println(Sarah.getPayInfo());
		
		System.out.println();
		
		Employee8 Bob = new Employee8("Bob", "Jones", 5400.0);
	    System.out.println(Bob.getPayInfo());

	    System.out.println();
	    
	    Employee8 Bill = new Employee8("Bill", "Meelater", 4);
	    System.out.println(Bill.getPayInfo());
	    
	    System.out.println();
	    
	    firstName = KeyboardReader.getPromptedString("Please enter the employee's first name: ");
	    lastName = KeyboardReader.getPromptedString("Please enter the employee's last name: ");
	    payRate = KeyboardReader.getPromptedDouble("Please enter the employee's pay rate: ");
		if (payRate < 0.0) {
			System.out.println("Pay rate must be >= 0");
			payRate = 0.0;
		}
	    department = KeyboardReader.getPromptedInt("Please enter the employee's department #: ");
	    if (department <= 0) { 
			System.out.println("Department must be > 0");
			department = 0;
		}
	    Employee8 Mike = new Employee8(firstName, lastName, department, payRate);
	    System.out.println(Mike.getPayInfo());  
	}
}
