//what the 'implements' keyword does is grabs all of the method headers from the 'Info' interface
public class Machine implements Info {
	
	private int id=7;
	
	public void start(){
		
		System.out.println("Machine Started");
	}

	public void showInfo() {
		
		System.out.println("Machine id is:" + id);
	}
}
