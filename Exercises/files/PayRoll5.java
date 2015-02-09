package files;

/*
In Payroll, before we create the first employee, call Employee.setNextId(22) to set the value that will be used for the first employee.
*/
public class PayRoll5 {

	public static void main(String[] args) {
		
		Employee6.setNextId(22);
		
		Employee6 Pete= new Employee6();
		Pete.setFullName("Peter", "Timpone");
		Pete.setPayRate(100000);
		Pete.setDeptNum(4);
		
		System.out.println(Pete.getPayInfo());
		
		System.out.println();
		
		Employee6 Sarah= new Employee6("Sarah", "Grey", 3, 75000);
		System.out.println(Sarah.getPayInfo());
		
		System.out.println();
		
		Employee6 Bob = new Employee6("Bob", "Jones", 5400.0);
	    System.out.println(Bob.getPayInfo());

	    System.out.println();
	    
	    Employee6 Bill = new Employee6("Bill", "Meelater", 4);
	    System.out.println(Bill.getPayInfo());
	}
}
