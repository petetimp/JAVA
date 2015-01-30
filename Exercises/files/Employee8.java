package files;
/*
The Employee class should protect itself from bad data, so modify setPayRate
and setDept to check the incoming data (and ignore it if it is less than 0).

Test your program to see what happens with negative input values.

The code using Employee should avoid sending it bad data, so also change
main in Payroll.java to	check for acceptable pay rate and department values
(print an error message for any negative entry, then just set that variable to 0
(for lack of anything better that we can do right now). Later we will find a way to ask the user for a new value instead)
*/
/**
 *Represents an employee object 
 **/
public class Employee8 {
	
	
	/**
	 *The default/starting employee id
	 **/
	private static int nextId=1;
	
	/**
	 *Increments the id so each employee has an individual id 
	 **/
	private int employeeId=nextId++;
	
	/**
	 *The employee's first name
	 **/
	private String firstName;
	
	/**
	 *The employee's last name
	 **/
	private String lastName;
	
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
	public Employee8(){	
	}
	
	/**
	 *Creates an instance of an employee object and calls the
	 *setFullName method to fill in the first and last name fields.
	 *@param firstName-the first name of the employee
	 *@param lastName-the last name of the employee 
	 **/
	public Employee8(String firstName, String lastName){
		
		setFullName(firstName, lastName);	
	}
	
	/**
	 *Creates an instance of an employee object, calls 
	 *Employee8(String firstName, String lastName)
	 *to fill in the first and last name fields, and calls
	 *the setDeptNum method to fill in the department # field.
	 *@param firstName-the first name of the employee 
	 *@param lastName-the last name of the employee
	 *@param deptNum-the department number of the employee
	 **/
	public Employee8(String firstName, String lastName, int deptNum){
		
		this(firstName, lastName);
		setDeptNum(deptNum);
	}
	
	/**
	 *Creates an instance of an employee object, calls 
	 *Employee8(String firstName, String lastName)
	 *to fill in the first and last name fields, and calls
	 *the setPayRate method to fill in the salary field.
	 *@param firstName-the first name of the employee 
	 *@param lastName-the last name of the employee
	 *@param payRate-the salary of the employee
	 **/
	public Employee8(String firstName, String lastName, double payRate){
		
		this(firstName, lastName);
		setPayRate(payRate);
	}
	
	/**
	 *Creates an instance of an employee object, calls 
	 *Employee8(String firstName, String lastName, int deptNum)
	 *to fill in the first and last name and department # fields,
	 *and calls the setPayRate method to fill in the salary field.
	 *@param firstName-the first name of the employee 
	 *@param lastName-the last name of the employee
	 *@param deptNum- the department # of the employee
	 *@param payRate-the salary of the employee
	 **/
	public Employee8(String firstName, String lastName, int deptNum, double payRate){
		
		this(firstName, lastName, deptNum);
		setPayRate(payRate);
	}
	
	/**
	 * Retrieves the next available employee id number 
	 * for the Employee8 class
	 * @return the id number
	 * */
	public static int getNextId() {
	    return nextId;
	}
	
	/**
	 * Sets the id for the Employee8 class that the next
	 * employee will have 
	 * @param nextId-the id passed in when calling the method
	 * */
	public static void setNextId(int nextId) {
	    Employee8.nextId = nextId;
	}
	
	/**
	 * Retrieves an individual employee's full name, employee id, department number,
	 * and salary by calling the appropriate method for each field
	 * @return the employee's first name, last name, id, department #, and salary
	 * */
	public String getPayInfo(){
		return getFullName() + "\n" + getId() + "\n" + getDeptNum() + "\n" + getPayRate(); 	
	}
	
	/**
	 * Retrieves an individual employee's full name by 
	 * concatenating the private first name and last name fields 
	 * @return the employee's full name
	 * */
	public String getFullName(){
		return "Name: " + firstName + " " + lastName;
	}
	
	/**
	 * Retrieves an individual employee's private first name field 
	 * @return the employee's first name
	 * */
	public String getFirstName(){
		return "First Name: " + firstName;
	}
	
	/**
	 * Retrieves an individual employee's private last name field 
	 * @return the employee's last name
	 * */
	public String getLastName(){
		return "Last Name: " + lastName;
	}
	
	/**
	 * Retrieves an individual employee's private salary field 
	 * @return the employee's yearly salary
	 * */
	public String getPayRate(){
		return "Pay Rate: $" + payRate;
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
	 * Sets an individual employee's full name by calling the
	 * setFirstName() and setLastName() methods
	 * @param firstName-the first name of the employee 
	 * @param lastName-the last name of the employee
	 * */
	public void setFullName(String firstName, String lastName){
		setFirstName(firstName);
		setLastName(lastName);
	}
	
	/**
	 * Sets an individual employee's first name 
	 * @param firstName-the first name of the employee 
	 * */
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
	
	/**
	 * Sets an individual employee's last name 
	 * @param lastName-the last name of the employee 
	 * */
	public void setLastName(String lastName){
		this.lastName=lastName;
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
