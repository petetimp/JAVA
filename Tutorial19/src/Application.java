//this tutorial is about inheritance
public class Application {

	public static void main(String[] args) {
		
		Machine mach1=new Machine();
		
		mach1.start();
		mach1.stop();
		
		Car car1=new Car();
		
		car1.start();//method defined in Machine class
		car1.wipeWindShield();//method defined in Car class
		car1.stop();//method defined in Machine class
		car1.showInfo();
	}
	
}
