package files;
/*
Add more Employee constructors:
One that takes values for first and last names only.
One that takes values for first name, last name, and department.
One that takes values for first name, last name, and pay rate.
Note that, in practice, you can use the parameter lists for constructors to help enforce what you would consider
valid combinations of properties - for example, if you would not want an employee to exist in a state where they
had name and department information, but no pay rate, then the absence of that particular constructor would help ensure that
judicious use of copy-paste-edit can speed up this process, but be careful to make every necessary edit if you do this!
You will find yourself writing somewhat repetitive code, setting the same values the same way in several different constructors
- we will address this in a few pages.
*/
public class Employee4 {
	
	private int employeeId;//0 for now
	private String firstName;
	private String lastName;
	private int deptNum;
	double payRate;
	
	public Employee4(){	
	}
	
	public Employee4(String fName, String lName){
		
		setFullName(fName, lName);	
	}
	
	public Employee4(String fName, String lName, int dNum){
		
		setFullName(fName, lName);
		setDeptNum(dNum);
	}
	
	public Employee4(String fName, String lName, double pRate){
		
		setFullName(fName, lName);
		setPayRate(pRate);
	}
	public Employee4(String fName, String lName, int dNum, double pRate){
		
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
