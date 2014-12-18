package demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//This tutorial is about exception handling in Java
/*Exceptions are a very important part of the Java language.  They are also often the least thought out,
 * and can make your code look very messy. An exception is part of an error handling mechanism, and are
 * just a class (objects) that are thrown from another class (object) when something is wrong.*/
public class Application {

	public static void main(String args[]) throws FileNotFoundException {

		File file1 = new File("text.text");

		FileReader fr = new FileReader(file1);
		// The red text that appears when there is an exception is called a
		// "stack trace"
	}
}
