package files;
/*We would like to develop a simple employee database system that will include the ability to pay an employee
 *(print a check for them, and processing necessary for bookkeeping). As a first step, we will define a type
 *of object to represent an employee. Note that we are not trying to create an actual Java class. We are only
 *interested in the sorts of things we think represent an employee. This is called pseudo code.
 *
 *Make a list of what data fields we would be likely to need (names and the type of data they would hold)
 *In a separate list, what methods might be associated with an employee's data?*/

/**Pseduocode*/
public class Employee {
	//data fields
	double totalGrossPay, totalDeduct, totalNetPay, weekGrossPay, weekDeduct, weekNetPay;
	int employeeId, bankAccNum, socSecurityNum;
	//Date dOB, hireDate, today, payPeriodBegin, payPeriodEnd;
	String firstName, lastName, fullName;
	char gender;
	
	//methods
	/**deposits a check into banking account*/
	public static void directDeposit(){
	}
	
	/**info necessary for bookkeeping*/
	public static void yearToDate(){
	}
	
	/**prints out a check*/
	public static void printCheck(){
	} 

	public static void main(String[] args) {
	//	Employee employee1= new Employee();
	}

}
