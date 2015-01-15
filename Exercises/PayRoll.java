/*
Create another class called Payroll with a main method, which should:
Instantiate an Employee object.
Set values for all the properties (name, department, and pay rate).
Call the getPayInfo() method to see the results.
*/
public class PayRoll {

	public static void main(String[] args) {
	
		Employee2 Pete= new Employee2();
		
		Pete.setFullName("Peter", "Timpone");
		Pete.setPayRate(10.00f);
		Pete.setDeptNum(4);
		
		System.out.println(Pete.getPayInfo());
	}
}
