package employees;
import finance.Employee10;
import finance.Payable;

public class ExemptEmployee extends Employee10 implements Payable {

	/**
	 *An empty employee constructor that creates an instance of an employee object with no information
	 **/
	public ExemptEmployee(){	
	}
	
	/**
	 *Creates an instance of an employee object and calls the
	 *setFullName method to fill in the first and last name fields.
	 *@param firstName-the first name of the employee
	 *@param lastName-the last name of the employee 
	 **/
	public ExemptEmployee(String firstName, String lastName){
		super(firstName, lastName);	
	}
	
	/**
	 *Creates an instance of an ExemptEmployee object, calls 
	 *ExemptEmployee(String firstName, String lastName)
	 *to fill in the first and last name fields, and calls
	 *the setDeptNum method to fill in the department # field.
	 *@param firstName-the first name of the employee 
	 *@param lastName-the last name of the employee
	 *@param deptNum-the department number of the employee
	 **/
	public ExemptEmployee(String firstName, String lastName, int deptNum){
		
		super(firstName, lastName, deptNum);
	}
	
	/**
	 *Creates an instance of an employee object, calls 
	 *ExemptEmployee(String firstName, String lastName)
	 *to fill in the first and last name fields, and calls
	 *the setPayRate method to fill in the salary field.
	 *@param firstName-the first name of the employee 
	 *@param lastName-the last name of the employee
	 *@param payRate-the salary of the employee
	 **/
	public ExemptEmployee(String firstName, String lastName, double payRate){
		
		super(firstName, lastName, payRate);
	}
	
	/**
	 *Creates an instance of an employee object, calls 
	 *ExemptEmployee(String firstName, String lastName, int deptNum)
	 *to fill in the first and last name and department # fields,
	 *and calls the setPayRate method to fill in the salary field.
	 *@param firstName-the first name of the employee 
	 *@param lastName-the last name of the employee
	 *@param deptNum- the department # of the employee
	 *@param payRate-the salary of the employee
	 **/
	public ExemptEmployee(String firstName, String lastName, int deptNum, double payRate){
		
		super(firstName, lastName, deptNum, payRate);
	}
	
	/**
	 * Retrieves an individual employee's full name, employee id, department number,
	 * and salary by calling the appropriate method for each field
	 * @return the employee's first name, last name, id, department #, and salary
	 * */
	public String getPayInfo(){
	
		System.out.println("This is an exempt employee");
		System.out.println("---------------------------");
		return getFullName() + "\n" + getId() + "\n" + getDeptNum() + "\n" + "Salary: $" +  getPayRate(); 	
	}	
}
