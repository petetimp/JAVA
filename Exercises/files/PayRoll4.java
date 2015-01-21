package files;
/*
Create another class called Payroll with a main method, which should:
Instantiate an Employee object.
Set values for all the properties (name, department, and pay rate).
Call the getPayInfo() method to see the results.
*/
public class PayRoll4 {

	public static void main(String[] args) {
		Employee5 Pete= new Employee5();
		
		Pete.setFullName("Peter", "Timpone");
		Pete.setPayRate(100000);
		Pete.setDeptNum(4);
		
		System.out.println(Pete.getPayInfo());
		
		System.out.println();
		
		Employee5 Sarah= new Employee5("Sarah", "Grey", 3, 75000);
		System.out.println(Sarah.getPayInfo());
		
		System.out.println();
		
		Employee5 Bob = new Employee5("Bob", "Jones", 5400.0);
	    System.out.println(Bob.getPayInfo());

	    System.out.println();
	    
	    Employee5 Bill = new Employee5("Bill", "Meelater", 4);
	    System.out.println(Bill.getPayInfo());
	}
}
