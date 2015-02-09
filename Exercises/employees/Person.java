package employees;

public abstract class Person{
	/**
	 *The employee's first name
	 **/
	private String firstName;
	
	/**
	 *The employee's last name
	 **/
	private String lastName;
	
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
	 * Sets an individual employee's full name by calling the
	 * setFirstName() and setLastName() methods
	 * @param firstName-the first name of the employee 
	 * @param lastName-the last name of the employee
	 * */
	public void setFullName(String firstName, String lastName){
		setFirstName(firstName);
		setLastName(lastName);
	}
}
