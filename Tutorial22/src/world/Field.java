package world;


public class Field {
	
	private Plant plant2=new Plant();
	
	//constructor method
	public Field(){
		/*This works because 'size' is protected and the 'size' field (member variable) is in the
		 *same package (default package) as the 'Plant' class (Plant.java)*/
		System.out.println(plant2.size);
	}

}
