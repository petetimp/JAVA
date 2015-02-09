package finance;
import vendors.Invoice;
import employees.*;
import util.*;

public class Payroll14 {	
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
	    while (iterations <= 0);

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
			    }
			} while (badType);
			
			do{
				fName = KeyboardReader.getPromptedString("Enter first name: ");
			}while(fName.equals("false"));
			do{
				lName = KeyboardReader.getPromptedString("Enter last name: ");
			}while(lName.equals("false"));
			do{
				dept = KeyboardReader.getPromptedInt("Enter department: ");
			}while(dept<=0);
			do {
				payRate = KeyboardReader.getPromptedDouble("Enter pay rate or salary: ");
				if (payRate < 0.0) System.out.println("Pay rate must be > 0");
			} while (payRate <= 0.0);
			
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
		
		Invoice[] inv = new Invoice[4];
		
		inv[0] = new Invoice("ABC Co.", 456.78);
		inv[1] = new Invoice("XYZ Co.", 1234.56);
		inv[2] = new Invoice("Hello, Inc.", 999.99);
		inv[3] = new Invoice("World, Ltd.", 0.43);
		
		CheckPrinter.printChecks(inv);
		CheckPrinter.printChecks(employee);
	}
}