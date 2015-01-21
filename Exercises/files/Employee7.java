package files;
/*
Add javadoc comments to all the fields and methods in Employee. Don't worry about making them completely descriptive, but do document parameters and return values for the methods. Note that judicious use of copy and paste can speed up the process.
Run javadoc and view index.html in a browser.
*/
/**
 *Represents an employee object 
 **/
public class Employee7 {
	
	
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
	public Employee7(){	
	}
	
	/**
	 *Creates an instance of an employee object and calls the
	 *setFullName method to fill in the first and last name fields.
	 *@param firstName-the first name of the employee
	 *@param lastName-the last name of the employee 
	 **/
	public Employee7(String firstName, String lastName){
		
		setFullName(firstName, lastName);	
	}
	
	/**
	 *Creates an instance of an employee object, calls 
	 *Employee7(String firstName, String lastName)
	 *to fill in the first and last name fields, and calls
	 *the setDeptNum method to fill in the department # field.
	 *@param firstName-the first name of the employee 
	 *@param lastName-the last name of the employee
	 *@param deptNum-the department number of the employee
	 **/
	public Employee7(String firstName, String lastName, int deptNum){
		
		this(firstName, lastName);
		setDeptNum(deptNum);
	}
	
	/**
	 *Creates an instance of an employee object, calls 
	 *Employee7(String firstName, String lastName)
	 *to fill in the first and last name fields, and calls
	 *the setPayRate method to fill in the salary field.
	 *@param firstName-the first name of the employee 
	 *@param lastName-the last name of the employee
	 *@param payRate-the salary of the employee
	 **/
	public Employee7(String firstName, String lastName, double payRate){
		
		this(firstName, lastName);
		setPayRate(payRate);
	}
	
	/**
	 *Creates an instance of an employee object, calls 
	 *Employee7(String firstName, String lastName, int deptNum)
	 *to fill in the first and last name and department # fields,
	 *and calls the setPayRate method to fill in the salary field.
	 *@param firstName-the first name of the employee 
	 *@param lastName-the last name of the employee
	 *@param deptNum- the department # of the employee
	 *@param payRate-the salary of the employee
	 **/
	public Employee7(String firstName, String lastName, int deptNum, double payRate){
		
		this(firstName, lastName, deptNum);
		setPayRate(payRate);
	}
	
	/**
	 * Retrieves the next available employee id number 
	 * for the Employee7 class
	 * @return the id number
	 * */
	public static int getNextId() {
	    return nextId;
	}
	
	/**
	 * Sets the id for the Employee7 class that the next
	 * employee will have 
	 * @param nextId-the id passed in when calling the method
	 * */
	public static void setNextId(int nextId) {
	    Employee7.nextId = nextId;
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
		this.payRate=payRate;
	}
	
	/**
	 * Sets an individual employee's department number 
	 * @param deptNum-the department # of the employee 
	 * */
	public void setDeptNum(int deptNum){
		this.deptNum=deptNum;
	}
}
