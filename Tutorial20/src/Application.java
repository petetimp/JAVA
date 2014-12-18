//This tutorial is about packages

/*After any package statements (none here because this is the default package), we can use the 
'import' keyword to bring a class from another package*/

import ocean.Fish;//importing the 'Fish' class in the ocean package
import ocean.plants.Seaweed;//plants is a sub-package of the ocean package (dot notation)

/*An alternative for having an import statement for each class is using the * wildcard

import ocean.*;   

*/

/*Another alternative is using Eclipse to import the package for you
 * 1. Right click within your program and select "Source"-->"Organize Imports"
 * 2. Eclipse will add the imports that you need and remove the ones that you don't need

	This will work as long as the package is defined in your project or you include a jar file
	that is defined somewhere in your project.
	
	NOTE: You can also press CTRL+SHIFT+O on your keyboard to do this

 * */

/*Packages- 
 * 1.Help organize your code by helping you find your files quickly
 *
 * 2.Prevent conflicts between class names.  If you have 2 class names that are identical, but they
 * are in different packages, then it is ok.
 * 
 * 3.Packages are hierarchical, meaning that you can have packages within packages 
 * 		-import statements use dot notation to include sub-packages
 * 
 * 4.If you want to distribute your package to the whole world, you have to use a unique package
 * name.  The package would usually be in a jar file.  An example and popular convention would be
 * to name it after the website that your code is on.  
 * 			For example  com.caveofprogramming.oceangame */
public class Application {
	
	public static void main(String[] args){
		
		Fish fish1=new Fish();
		
		Seaweed weed=new Seaweed();
		
	}

}
