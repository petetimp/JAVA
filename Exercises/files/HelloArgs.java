package files;
/**
 * This class prints the contents of the args array
 */
public class HelloArgs {
	public static void main(String[] args) {
		for(int i=0; i<args.length; i++){	
			System.out.println(args[i]);
		}
		//foreach loop
		for (String a : args){
			System.out.println(a);
		}
    }
}
