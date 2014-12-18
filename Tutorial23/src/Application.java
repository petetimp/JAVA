//This tutorial is about  Polymorphism
public class Application {

	public static void main(String[] args) {
		
		Plant plant1=new Plant();
		Tree tree1=new Tree();
		
		/*This is polymorphism in action.  Because 'Tree' is a subclass of 'Plant', we can use a
		variable referring to the 'Plant' class (plant2) and set it equal to a 'Tree' object (tree1)
		*/
		Plant plant2=tree1;
		
		/*Prints out "Tree growing" NOT "Plant growing" because plant2 (Plant object) has been set
		equal to tree1 (Tree Object) and the Tree class has a grow() method that overrides the
		grow() method of its parent class, Plant.*/
		plant2.grow();
		
		tree1.shedLeaves();
		
		/*Even though plant2 is equal to tree1 (which refers to a Tree object), you can't apply
		 * shedLeaves() to the 'Plant' class because it is not defined there.
		 * shedLeaves() is only defined in the 'Tree' class and can only be used by objects of that
		 * class.  If the 'Tree' class AND 'Plant' class had a shedLeaves() method, plant2 would
		 * use the 'Tree' class's shedLeaves() method instead of its own. */
		//plant2.shedLeaves();
		
		/*This works just fine because whenever a parent class is expected a child class of that
		 * parent can be used*/
		doGrow(tree1);
		
	}
	
	public static void doGrow(Plant plant){
			plant.grow();		
	}
}
