package util;
import java.io.*;

public class KeyboardReader {

  private static BufferedReader in =
      new BufferedReader(new InputStreamReader(System.in));
  
  public KeyboardReader() { }
  
  public static String getPromptedString(String prompt) {
    String response = null;
    System.out.print(prompt);
    try {
      response = in.readLine();
      if(response.equals("") || response.equals(" ")){
    	  return "false";
      }
    } catch (IOException e) {
      System.out.println("IOException occurred");
    }
    return response;
  }
  
  public static char getPromptedChar(String prompt) {
    char ch;
	try{
    	ch = getPromptedString(prompt).charAt(0);
    }
    catch(StringIndexOutOfBoundsException e){
    	return ' ';
    }
    return ch;
  }
  
  public static int getPromptedInt(String prompt) {
   int num;
   try{
	  num=Integer.parseInt(getPromptedString(prompt));
   }
   catch(NumberFormatException e){
	   return 0;
   }
   return num;
  }
  
  public static float getPromptedFloat(String prompt) {
    return Float.parseFloat(getPromptedString(prompt));
  }
  public static double getPromptedDouble(String prompt) {
    double doub;
	 try{
		 doub=Double.parseDouble(getPromptedString(prompt));
    }catch(NumberFormatException e){
    	return 0;
    }
	return doub;
  }
}
