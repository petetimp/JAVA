package files;
import employees.Employee6;
import util.KeyboardReader;

/*
Add another employee to your payroll, this time using the KeyboardReader class to prompt the user for all data;
for example, to read a double-precision value for a width:
	double width = KeyboardReader.getPromptedDouble("Please enter the width: ");
KeyboardReader is in the util package (which should already be present under Exercises);
you will need to import the class in Payroll.java.
There are no changes to Employee.java.
*/
public class PayRoll6 {

	public static void main(String[] args) {
		
		String firstName=null; 
	    String lastName=null;
	    double payRate=0.0; 
	    int department=0;
		
		Employee6.setNextId(22);
		
		Employee6 Pete= new Employee6();
		Pete.setFullName("Peter", "Timpone");
		Pete.setPayRate(100000);
		Pete.setDeptNum(4);
		
		System.out.println(Pete.getPayInfo());
		
		System.out.println();
		
		Employee6 Sarah= new Employee6("Sarah", "Grey", 3, 75000);
		System.out.println(Sarah.getPayInfo());
		
		System.out.println();
		
		Employee6 Bob = new Employee6("Bob", "Jones", 5400.0);
	    System.out.println(Bob.getPayInfo());

	    System.out.println();
	    
	    Employee6 Bill = new Employee6("Bill", "Meelater", 4);
	    System.out.println(Bill.getPayInfo());
	    
	    System.out.println();
	    
	    firstName = KeyboardReader.getPromptedString("Please enter the employee's first name: ");
	    lastName = KeyboardReader.getPromptedString("Please enter the employee's last name: ");
	    payRate = KeyboardReader.getPromptedDouble("Please enter the employee's pay rate: ");
	    department = KeyboardReader.getPromptedInt("Please enter the employee's department #: ");
	    Employee6 Mike = new Employee6(firstName, lastName, department, payRate);
	    System.out.println(Mike.getPayInfo());  
	}
}
