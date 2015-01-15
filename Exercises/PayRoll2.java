/*
Create another class called Payroll with a main method, which should:
Instantiate an Employee object.
Set values for all the properties (name, department, and pay rate).
Call the getPayInfo() method to see the results.
*/
public class PayRoll2 {

	public static void main(String[] args) {
	
		Employee3 Pete= new Employee3();
		
		Pete.setFullName("Peter", "Timpone");
		Pete.setPayRate(100000);
		Pete.setDeptNum(4);
		
		System.out.println(Pete.getPayInfo());
		
		System.out.println();
		
		Employee3 Sarah= new Employee3("Sarah", "Grey", 3, 75000);
		System.out.println(Sarah.getPayInfo());
		
	}
}
