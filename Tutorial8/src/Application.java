
public class Application {
	//Introduction to arrays in java
	public static void main(String[] args) {
	
		int value =7;//integer by value
		
		//Declaration of array
		int values[];//REFERS to a list(array) of integers (reference). Doesn't hold anything. 
			
		//Initialization of array
		//allocate some memory (3) to put integers into
		values=new int [3];/*creates a 'label' for the bucket that holds integers but doesn't hold
		anything*/
		
		//if there is no value defined, Java automatically makes it 0
		System.out.println(values[0]);
		
		//Setting of array values
		values[0]=10;//values[0] refers to the value stored at the first index in the values array
		values[1]=20;
		values[2]=30;
		//if you try to set a fouth value, Java will throw an exception.  Other languages such as
		//C++ will not give any feedback
		
		//Getting of array values
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		//Iterate through values using a for loop
		for (int i=0; i<values.length; ++i){
			System.out.println(values[i]);
		}
		
		//Declaration and initialization of an array
		int numbers[]={5,6,7};
		
		
		for (int i=0; i<numbers.length; ++i){
			System.out.println(numbers[i]);
		}
		
	}
}
