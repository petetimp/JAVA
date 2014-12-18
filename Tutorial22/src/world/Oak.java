package world;


public class Oak extends Plant {
	
	public Oak(){
		/*CAN'T DO THIS-Eclipse returns error 'The field Plant.type is not visible'.  This is
		  because the instance variable 'type' is private*/
		//type="tree";
	
		//Because the instance variable 'size' is protected (in Plant.java) and not private, we can
		//access it from the Oak subclass (which extends Plant)
		this.size="large";
		
		/*Because the 'Plant' class and the 'Oak' class are both contained in the 'world' package
		  the field 'height' (with no als) can be used in the Oak subclass of Plant*/
		this.height=10;
	}

}
