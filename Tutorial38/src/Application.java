//This tutorial is about Inner Classes
//In Java we can pretty much declare classes anywhere
public class Application {

	public static void main(String[] args) {
		
		Robot robot1=new Robot(6);
		
		robot1.start();
		
		Robot.Battery battery1=new Robot.Battery();
		
		battery1.charge();
	}
}
