//This tutorial is about runtime vs checked exceptions
/*Checked exceptions must be handled while runtime (unchecked) exceptions are optionally handled*/
public class Application {

	public static void main(String[] args) {
		/*
		int value=7;
		
		value=value/0;//This code will compile, but still throws an exception (ArithmaticException)
		
		String text=null;
		
		System.out.println(text.length());/*This code will compile but has a NullPointerException-Eclipse
		 returns 'Null pointer access: The variable text can only be null at this location'*/
		
		/*You can still check runtime exceptions if you want to, but most of the time it's better to fix the
		underlying problem*/
		String[] texts={"one","two","three"};
		
		try{
			System.out.println(texts[3]);/*This code will compile but has a ArrayIndexOutOfBoundsException*/
		}catch (ArrayIndexOutOfBoundsException e){
			
			System.out.println(e.toString());
		}
	}
}
