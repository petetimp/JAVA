public class Application {
	//this is an 'if' statement program
	public static void main(String[] args) {
		
		int i=15;
		
		if(i != 4){
			System.out.println("i is not equal to 4");
		}
		
		if (i>20){
			System.out.println("i is greater than 20");
		
		}else if(i<10){
			System.out.println("i is less than 10");
	
		}else{
			System.out.println("i is a number between 10 and 20");
			
		}
		
		int loop=0;
		
		while(true){
			System.out.println(loop);
		
			if (loop == 5){
				break;//break statement breaks out of current loop
			}	
			
			++loop;
		}
	}
}
