package finance;
import employees.*;
/**
 *Represents an employee object 
 **/
public abstract class Employee10 extends Person implements Payable {
	
	/**
	 *The default/starting employee id
	 **/
	private static int nextId=1;
	
	/**
	 *Increments the id so each employee has an individual id 
	 **/
	private int employeeId=nextId++;
	
	/**
	 *The employee's department number
	 **/
	private int deptNum;
	
	/**
	 *The employee's yearly salary
	 **/
	double payRate;
	
	/**
	 *An empty employee constructor that creates an instance of an employee object with no information
	 **/
	public Employee10(){	
	}
	
	/**
	 *Creates an instance of an employee object and calls the
	 *setFullName method to fill in the first and last name fields.
	 *@param firstName-the first name of the employee
	 *@param lastName-the last name of the employee 
	 **/
	public Employee10(String firstName, String lastName){
		
		setFullName(firstName, lastName);	
	}
	
	/**
	 *Creates an instance of an employee object, calls 
	 *Employee10(String firstName, String lastName)
	 *to fill in the first and last name fields, and calls
	 *the setDeptNum method to fill in the department # field.
	 *@param firstName-the first name of the employee 
	 *@param lastName-the last name of the employee
	 *@param deptNum-the department number of the employee
	 **/
	public Employee10(String firstName, String lastName, int deptNum){
		
		this(firstName, lastName);
		setDeptNum(deptNum);
	}
	
	/**
	 *Creates an instance of an employee object, calls 
	 *Employee10(String firstName, String lastName)
	 *to fill in the first and last name fields, and calls
	 *the setPayRate method to fill in the salary field.
	 *@param firstName-the first name of the employee 
	 *@param lastName-the last name of the employee
	 *@param payRate-the salary of the employee
	 **/
	public Employee10(String firstName, String lastName, double payRate){
		
		this(firstName, lastName);
		setPayRate(payRate);
	}
	
	/**
	 *Creates an instance of an employee object, calls 
	 *Employee10(String firstName, String lastName, int deptNum)
	 *to fill in the first and last name and department # fields,
	 *and calls the setPayRate method to fill in the salary field.
	 *@param firstName-the first name of the employee 
	 *@param lastName-the last name of the employee
	 *@param deptNum- the department # of the employee
	 *@param payRate-the salary of the employee
	 **/
	public Employee10(String firstName, String lastName, int deptNum, double payRate){
		
		this(firstName, lastName, deptNum);
		setPayRate(payRate);
	}
	
	/**
	 * Retrieves the next available employee id number 
	 * for the Employee10 class
	 * @return the id number
	 * */
	public static int getNextId() {
	    return nextId;
	}
	
	/**
	 * Sets the id for the Employee10 class that the next
	 * employee will have 
	 * @param nextId-the id passed in when calling the method
	 * */
	public static void setNextId(int nextId) {
	    Employee10.nextId = nextId;
	}
	
	/**
	 * Retrieves an individual employee's full name, employee id, department number,
	 * and salary by calling the appropriate method for each field
	 * @return the employee's first name, last name, id, department #, and salary
	 * */
	public abstract String getPayInfo();
	//return getFullName() + "\n" + getId() + "\n" + getDeptNum() + "\n" + "Pay Rate: $" +  getPayRate();
	
	/**
	 * Retrieves an individual employee's private salary field 
	 * @return the employee's yearly salary
	 * */
	public double getPayRate(){
		return payRate;
	}
	
	/**
	 * Retrieves an individual employee's private department # field 
	 * @return the employee's department number
	 * */
	public String getDeptNum(){
		return "Department Number: "+ deptNum;
	}
	
	/**
	 * Retrieves an individual employee's private id field
	 * @return the employee's id
	 * */
	public String getId() {
		return "ID: " + employeeId; 
	}
	
	/**
	 * Sets an individual employee's salary 
	 * @param payRate-the yearly salary of the employee 
	 * */
	public void setPayRate(double payRate){
		if (payRate < 0) return;
		this.payRate=payRate;
	}
	
	/**
	 * Sets an individual employee's department number 
	 * @param deptNum-the department # of the employee 
	 * */
	public void setDeptNum(int deptNum){
		if (deptNum < 0) return;
		this.deptNum=deptNum;
	}
}
