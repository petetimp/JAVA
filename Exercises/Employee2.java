/*
After review with management, it is decided that we will store the following information for each employee:

Employee ID (an integral number, automatically assigned when a new employee is added).
First name and last name.
Department number (an integral value, call it dept).
Pay rate (a floating-point value, using a double).
In addition, we would like:

A method called getPayInfo() that will return a sentence with the employee's name, id, department, and pay rate amount.
A method called getFullName() that will return the first and last names separated by a space.
Define a class called Employee with these characteristics, using standard practices for limiting data access and for method naming .
In order to be useful, there should be methods to set and get all properties (except setting the employee id, which will happen
automatically in a manner to be determined later; for now, just let it default to 0, but still provide a method to retrieve it).
*/
public class Employee2 {
	
	private int employeeId;//0 for now
	private String firstName;
	private String lastName;
	private int deptNum;
	double payRate;
	
	public String getPayInfo(){
		return getFullName() + "\nID: " +  employeeId + "\n" + getDeptNum() + "\n" + getPayRate(); 	
	}
	
	public String getFullName(){
		return "Name: " + firstName + " " + lastName;
	}
	
	public String getFirstName(){
		return "First Name: " + firstName;
	}
	
	public String getLastName(){
		return "Last Name: " + lastName;
	}
	
	public String getPayRate(){
		return "Pay Rate: $" + payRate;
	}
	
	public String getDeptNum(){
		return "Department Number: "+ deptNum;
	}
	
	public int getId() {
		return employeeId; 
	}
	
	public void setFullName(String fName, String lName){
		setFirstName(fName);
		setLastName(lName);
	}
	
	public void setFirstName(String fName){
		firstName=fName;
	}
	
	public void setLastName(String lName){
		lastName=lName;
	}
	
	public void setPayRate(double pRate){
		payRate=pRate;
	}
	
	public void setDeptNum(int dNum){
		deptNum=dNum;
	}
}
