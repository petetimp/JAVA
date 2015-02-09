package employees;
import finance.Employee10;
import finance.Payable;

public class NonexemptEmployee extends Employee10 implements Payable {
	
	/**The number of hours worked*/
	private double hours=1;

	/**
	 *An empty NonexemptEmployee constructor that creates an instance of an employee object with no information
	 **/
	public NonexemptEmployee(){	
	}
	
	/**
	 *Creates an instance of an NonexemptEmployee object and calls the
	 *setFullName method to fill in the first and last name fields.
	 *@param firstName-the first name of the employee
	 *@param lastName-the last name of the employee 
	 **/
	public NonexemptEmployee(String firstName, String lastName){
		super(firstName, lastName);	
	}
	
	/**
	 *Creates an instance of an NonexemptEmployee object, calls 
	 *NonexemptEmployee(String firstName, String lastName)
	 *to fill in the first and last name fields, and calls
	 *the setDeptNum method to fill in the department # field.
	 *@param firstName-the first name of the employee 
	 *@param lastName-the last name of the employee
	 *@param deptNum-the department number of the employee
	 **/
	public NonexemptEmployee(String firstName, String lastName, int deptNum){
		
		this(firstName, lastName);
		setDeptNum(deptNum);
	}
	
	/**
	 *Creates an instance of an NonexemptEmployee object, calls 
	 *NonexemptEmployee(String firstName, String lastName)
	 *to fill in the first and last name fields, and calls
	 *the setPayRate method to fill in the pay field.
	 *@param firstName-the first name of the employee 
	 *@param lastName-the last name of the employee
	 *@param payRate-the pay of the employee
	 **/
	public NonexemptEmployee(String firstName, String lastName, double payRate){
		
		this(firstName, lastName);
		setPayRate(payRate);
	}
	
	/**
	 *Creates an instance of an NonexemptEmployee object, calls 
	 *NonexemptEmployee(String firstName, String lastName, int deptNum)
	 *to fill in the first and last name and department # fields,
	 *and calls the setPayRate method to fill in the pay field.
	 *@param firstName-the first name of the employee 
	 *@param lastName-the last name of the employee
	 *@param deptNum- the department # of the employee
	 *@param payRate-the pay of the employee
	 **/
	public NonexemptEmployee(String firstName, String lastName, int deptNum, double payRate, double hours){
		
		this(firstName, lastName, deptNum);
		setPayRate(payRate);
		setHours(hours);
	}
	
	/**
	 * Retrieves an individual NonexemptEmployee full name, employee id, department number,
	 * and pay by calling the appropriate method for each field
	 * @return the employee's first name, last name, id, department #, and pay
	 * */
	public String getPayInfo(){
	
		System.out.println("This is an non-exempt employee");
		System.out.println("---------------------------");
		return getFullName() + "\n" + getId() + "\n" + getDeptNum() + "\nPay Rate: $" +  getPayRate() + "\nHours: " + getHours() + "\nPay: $" + getPayRate()*hours; 
	}

	/**
	 * Retrieves the number of hours that a NonexemptEmployee has worked
	 * @return the number of hours worked
	 * **/
	public double getHours() {
		return hours;
	}
	/**
	 * Sets the number of hours that a NonexemptEmployee has worked
	 * @param hours-how much the employee has worked
	 */
	public void setHours(double hours) {
		this.hours = hours;
	}	
}
