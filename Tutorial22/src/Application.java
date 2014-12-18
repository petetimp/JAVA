import world.Plant;

//This tutorial is about the PUBLIC, PRIVATE, and PROTECTED keywords (Access Level Specifiers) 
public class Application {

	public static void main(String[] args) {
		
		Plant plant1=new Plant();
		
		System.out.println(plant1.name);
		System.out.println(Plant.ID);
		/*CAN'T DO THIS-Eclipse returns error 'The field Plant.type is not visible'.  This is
		  because the instance variable 'type' is private*/
		//System.out.println(Plant.type);
		
		/*CAN'T DO THIS-Eclipse returns error 'The field Plant.size is not visible'.  This is
		  because the instance variable 'size' is protected AND the 'Plant' class is located in the
		  'world' package rather than the default package (where the 'Application' class is)*/
		//System.out.println(plant1.size);
		
		/*CAN'T DO THIS-Eclipse returns error 'The field Plant.height is not visible'.  This is
		 because the instance variable (member variable/field) 'height' has no als. The 'Plant'
		 class is located in the 'world' package rather than the default package
		 (where the 'Application' class is)*/
		//System.out.println(plant1.height);
	}
}
