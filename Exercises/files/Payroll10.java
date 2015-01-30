package files;
import files.Employee8;
import util.KeyboardReader;
/*
Modify the payroll program to use an array of Employee objects with a size of 3 or more
(later we will come up with a more flexible solution that allows for the number of employees to change dynamically).

Use a for loop to populate and display the data.

After the loop is complete, ask the user to enter a last name.

Loop through the array to find the element with the matching last name and display it.
 */

/**
* Tests the {@link Employee8} class.
*/
public class Payroll10 {

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
	    String lName=null;
	    
	     
	    do{
	    	iterations = KeyboardReader.getPromptedInt("Please enter the number (1, 5, 8, etc.) of employees that you would like to add: ");
	    }
	    while (iterations < 0);
	    
	    Employee8[] employees=new Employee8[iterations];
	    
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
			
			employees[x]= new Employee8();
			employees[x].setFullName(firstName, lastName);
			employees[x].setPayRate(payRate);
			employees[x].setDeptNum(department);
			System.out.println();
		}  
		
		lName="Last Name: " + KeyboardReader.getPromptedString("Please enter the employee's last name that you want to see info for: \n");
		
		System.out.println();
		
		for (int x=0; x<employees.length; x++){
			if(lName.equals(employees[x].getLastName())){
				System.out.println(employees[x].getPayInfo());
			}
		}
	}
}
