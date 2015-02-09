package files;
/*
 Add a private and static integer field called nextId to the Employee class (give it an initial value of 1).
Modify the declaration of the id field as follows:

private int id = nextId++;
What happens when each new Employee gets instantiated?
Run and test the application - you should see incrementing employee ids.
Now add the following to Employee.java:

public static int getNextId() {
    return nextId;
}
public static void setNextId(int nextId) {
    Employee.nextId = nextId;
}
Notice the syntax we use to resolve the name conflict between the nextId parameter and the static nextId field.
*/
public class Employee6 {
	
	private static int nextId=1;
	private int employeeId=nextId++;
	private String firstName;
	private String lastName;
	private int deptNum;
	double payRate;
	
	public Employee6(){	
	}
	
	public Employee6(String firstName, String lastName){
		
		setFullName(firstName, lastName);	
	}
	
	public Employee6(String firstName, String lastName, int deptNum){
		
		this(firstName, lastName);
		setDeptNum(deptNum);
	}
	
	public Employee6(String firstName, String lastName, double payRate){
		
		this(firstName, lastName);
		setPayRate(payRate);
	}
	public Employee6(String firstName, String lastName, int deptNum, double payRate){
		
		this(firstName, lastName, deptNum);
		setPayRate(payRate);
	}
	
	public static int getNextId() {
	    return nextId;
	}
	
	public static void setNextId(int nextId) {
	    Employee6.nextId = nextId;
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
