public class Application {
	//This is a while and for loop program
	public static void main(String[] args) {		
		
		boolean loop=true;
		int number=0;
		

		while(number < 10){
		
			System.out.println(loop + " " + number);
			
			++number;
		}
		
		int i;
		
		for(i=0; i<5; ++i){
			//here i is automatically converted into a string
			System.out.println("The value of i is " + i);
		}
		System.out.println();
		//with printf i is formatted as an integer.  Also, no new line is added automatically.
		System.out.printf("The value of i is %d\n", i);
	}
}
