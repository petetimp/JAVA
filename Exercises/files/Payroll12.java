package files;
import employees.*;
import finance.*;
import util.*;

public class Payroll12 {	
	public static void main(String[] args) {
		Employee10[] employee;
		String fName = null;
		String lName = null;
		int dept = 0;
		double payRate = 0.0;
		double hours = 0.0;
		int iterations;
		
		do{
	    	iterations = KeyboardReader.getPromptedInt("Please enter the number (1, 5, 8, etc.) of employees that you would like to add: ");
	    }
	    while (iterations < 0);

		employee=new Employee10[iterations];
		
		for (int x=0; x<iterations; x++){
			
			boolean  badType;
			do {
			    badType = false;
			    char empType = KeyboardReader.getPromptedChar("Enter employee type ('E' for Exempt, 'N' for Nonexempt, 'C' for Contract): ");
			    switch (empType) {
			        case 'E':
			        case 'e':
			        	employee[x]=new ExemptEmployee();
			            break;
			        case 'N':
			        case 'n':
			        	employee[x]=new NonexemptEmployee();
			            break;
			        case 'C':
			        case 'c':
			        	employee[x]=new ContractEmployee();
			            break;
			        default:
			            badType = true;
			            System.out.println("Please enter the correct employee type ('E' for Exempt, 'N' for Nonexempt, 'C' for Contract)"); 
			    }
			} while (badType);
			
			fName = KeyboardReader.getPromptedString("Enter first name: ");
			lName = KeyboardReader.getPromptedString("Enter last name: ");
			dept = KeyboardReader.getPromptedInt("Enter department: ");
			do {
				payRate = KeyboardReader.getPromptedDouble("Enter pay rate or salary: ");
				if (payRate < 0.0) System.out.println("Pay rate must be >= 0");
			} while (payRate < 0.0);
			
			if (employee[x] instanceof ExemptEmployee){
				employee[x].setFullName(fName, lName);
				employee[x].setPayRate(payRate);
				employee[x].setDeptNum(dept);
				continue;
			}else{
				do {
					hours = KeyboardReader.getPromptedDouble("Enter hours: ");
					if (hours < 0.0) System.out.println("Hours must be >= 0");
				} while (hours < 0.0);
				if(employee[x] instanceof NonexemptEmployee){
					employee[x]=new NonexemptEmployee(fName, lName, dept, payRate, hours);
					continue;
				}else{
					employee[x]=new ContractEmployee(fName, lName, dept, payRate, hours);
					continue;
				}
			}
		}
		
		lName="Last Name: " + KeyboardReader.getPromptedString("Please enter the employee's last name that you want to see info for: \n");
		System.out.println();
		
		for (int x=0; x<employee.length; x++){
			if(lName.equals(employee[x].getLastName())){
				System.out.println(employee[x].getPayInfo()+"\n");
			}
		}
	}
}