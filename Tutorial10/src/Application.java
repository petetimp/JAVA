public class Application {
	//This is a program demonstrating multi-dimensional arrays
	public static void main(String[] args) {
		
		//one-dimensional int array
		int[] values={3, 5, 2343};
		
		System.out.println(values[2]);
		
		//multi-dimensional arrays are arrays of arrays
		//each element within a multi-dimensional array is a reference to another array
		//here we are declaring, initializing, and setting the elements in the array 
		int[][] grid={ {3, 5, 2343},
					   {1,2,3},
					   {2,3}			//internal arrays can differ in number of elements, but
		};								//it's recommended that they have the same length
		
		//[2] refers to third array (row); [0] refers to first element within row (column)
		System.out.println(grid[2][0]);
		System.out.println(grid[0][0]);
	
		//2 Dimensional Reference to array of array of Strings
		String[][] texts= new String [2][3];
		
		texts [0][1]="Hello";
		
		System.out.println(texts[0][1]);
		
		//you can output a multidimensional array with a nested for loop
		for(int row=0; row < grid.length; ++row){
			
			for(int col=0; col < grid[row].length; ++col){
				
				//use print() NOT println() method
				System.out.print(grid[row][col] + "\t");
			}
			
		    System.out.println();
		}
		
		//declare and initialize a 2d string array without specifying the column count
		String[][] words=new String[2][];
		
		System.out.println(words[0]);//print out null
		
		//declare and initialize an array within a 2d array
		words[0]=new String[3];
		
		words[0][1]="Hi there!";
		
		System.out.println(words[0][1]);
	}
}
