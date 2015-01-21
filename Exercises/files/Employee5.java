package files;
/*
Duration: 10 to 15 minutes.
Now we can clean up our Employee class definition.
Modify the set methods to use the same name for each parameter as the associated field.
Modify the constructors to eliminate redundant code - for example:

public Employee(String firstName, String lastName, int dept) {
    this(firstName, lastName); setDept(dept);
}
If you haven't already done so, make use of getFullName in getPayInfo.
*/
public class Employee5 {
	
	private int employeeId;//0 for now
	private String firstName;
	private String lastName;
	private int deptNum;
	double payRate;
	
	public Employee5(){	
	}
	
	public Employee5(String firstName, String lastName){
		
		setFullName(firstName, lastName);	
	}
	
	public Employee5(String firstName, String lastName, int deptNum){
		
		this(firstName, lastName);
		setDeptNum(deptNum);
	}
	
	public Employee5(String firstName, String lastName, double payRate){
		
		this(firstName, lastName);
		setPayRate(payRate);
	}
	public Employee5(String firstName, String lastName, int deptNum, double payRate){
		
		this(firstName, lastName, deptNum);
		setPayRate(payRate);
	}
	
	public String getPayInfo(){
		return getFullName() + "\n" + getId() + "\n" + getDeptNum() + "\n" + getPayRate(); 	
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
	
	public String getId() {
		return "ID: " + employeeId; 
	}
	
	public void setFullName(String fName, String lName){
		setFirstName(fName);
		setLastName(lName);
	}
	
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName=lastName;
	}
	
	public void setPayRate(double payRate){
		this.payRate=payRate;
	}
	
	public void setDeptNum(int deptNum){
		this.deptNum=deptNum;
	}
}
