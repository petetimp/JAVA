/*
Modify your Employee class to use a constructor that accepts parameters for the first and last names, department, and pay rate.
Also add a constructor that takes no parameters and does nothing (as we discussed above).
public Employee() { }
*/
public class Employee3 {
	
	private int employeeId;//0 for now
	private String firstName;
	private String lastName;
	private int deptNum;
	double payRate;
	
	public Employee3(){	
	}
	
	public Employee3(String fName, String lName, int dNum, double pRate){
		
		setFullName(fName, lName);
		setDeptNum(dNum);
		setPayRate(pRate);
	}
	
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
