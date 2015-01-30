package files;
import files.Employee8;
import util.KeyboardReader;
/*
 *Revise your payroll program to use only one Employee variable
 *
 *Use a loop to repeatedly create a new instance to store in it, populate it from the keyboard,
 *and display it on the screen (you can ask after each one if the user wants to enter another,
 *or just use a loop that has a fixed number of iterations).
 *
 *Also, change the logic for reading the pay rate and department values from the keyboard to use
 *do...while loops that will continue to loop as long as the user enters invalid values (note that
 *you will need to separate declaring the variables from populating them-declare each of them before
 *their loop starts, in order for the variable to be available to the test at the end of the loop).
 */

/**
* Tests the {@link Employee8} class.
*/
public class Payroll9 {

	/**
	* Tests the {@link Employee8} class.
	*/
	public static void main(String[] args) {
		
		String firstName=null; 
	    String lastName=null;
	    double payRate=0.0; 
	    int department=0;
	    int iterations=1;
	    Employee8.setNextId(22);
	    
	    do{
	    	iterations = KeyboardReader.getPromptedInt("Please enter the number (1, 5, 8, etc.) of employees that you would like to add: ");
	    }
	    while (iterations < 0);
	    
		for (int x=0; x<iterations; x++){
	    	firstName = KeyboardReader.getPromptedString("Please enter the employee's first name: ");
		    lastName = KeyboardReader.getPromptedString("Please enter the employee's last name: ");
		    
		    do{
		    	payRate = KeyboardReader.getPromptedDouble("Please enter the employee's pay rate: ");
		    }
		    while (payRate < 0.0);
		    
		    do{
		    	department = KeyboardReader.getPromptedInt("Please enter the employee's department #: ");
		    	if (department <= 0) System.out.println("Department must be >= 0");
		    }
		    while(department <= 0);
			
			Employee8 employee= new Employee8();
			employee.setFullName(firstName, lastName);
			employee.setPayRate(payRate);
			employee.setDeptNum(department);
			
			System.out.println(employee.getPayInfo());
			
			System.out.println();
		}   
	}
}
