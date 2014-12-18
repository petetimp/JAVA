import world.Plant;

/*
 * private class Weeds(){
   }
   protected class Weeds(){
   }

	CAN'T DO THESE two because these als's only apply to member variables (fields)/methods 
	and NOT classes
	There can only be no als or a public als (only one per file) when declaring classes
	*/


public class Grass extends Plant {

	//constructor
	public Grass(){
		
		/*CAN'T DO THIS-Eclipse returns error 'The field Plant.height is not visible'.  This is
		  because the instance variable 'height' has no als AND the 'Plant' class is located in the
		  'world' package rather than the default package (where the 'Grass' class is).  Also, even
		  though Grass extends Plant, having no als means that a subclass located in a different
		  package can't inherit the field/method.*/
		//System.out.println(this.height);
		
	}
}
