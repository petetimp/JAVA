//This tutorial is about 'try-with-resources' statements
class Temp implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Closable!");
		throw new Exception("Oh no");
	}	
}
public class Application {

	public static void main(String[] args) {
		
		//////////////JAVA 7-Try with resources//////////////////////
		
		/*The try-with-resources statement is a try statement that declares
		one or more resources. A resource is an object that must be closed
		after the program is finished with it. The try-with-resources statement
		ensures that each resource is closed at the end of the statement.
		Any object that implements java.lang.AutoCloseable, which includes all
		objects which implement java.io.Closeable, can be used as a resource.*/
		
		try(Temp temp=new Temp()){//The try-with-resources statement calls the close() method automatically
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//BEFORE JAVA 7//////////////////////////////////////////////
		/*try {
			temp.close();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}
}
