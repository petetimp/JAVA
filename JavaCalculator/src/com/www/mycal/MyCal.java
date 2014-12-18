// my Package importation
package com.www.mycal;
// User input scanning
import java.util.Scanner;
// my Class
public class MyCal {
    public static int myMath =0;
    // hidding some data
    private static int x;
    private static int y;
     private int addition;
     private int multiply;
     private int division;
     private float substraction;
     //using setter method
     public void setAdd( int addition ){
         this.addition = x + y;
     }
     public void setMult( int multiply){
         this.multiply = x * y;
     }
     public void setDiv( int division){
         this.division = x/y;
     }
     public void setSub( double substraction){
         this.substraction = x-y;
     }
    // using getter method
     public int  getAdd(){
         return addition;
     }
 
     public int getMult(){
         return multiply;
     }
 
     public int getDiv(){
         return division;
     }
 
     public double getSub(){
         return substraction;
     }
 
     // Main class for the whole program
     public static void main(String[] args) {
         System.out.println("Welcome to Kriz Java Calculator:");
         System.out.println("Select which Operation you want to use ( Addition =1, Multiplication= 2, Division = 3, Substraction=4)");
        Scanner math = new Scanner(System.in);
         myMath = math.nextInt();
         switch(myMath){ // using switch statement for operation
	 
	         case 1:
	         {
	             System.out.println("Enter the First Value you want to Add: ");
	            Scanner add =new Scanner(System.in);
	              x = add.nextInt();
	              System.out.println("Enter the 2nd  Value you want to Add: ");
	                Scanner addy =new Scanner(System.in);
	                 y= addy.nextInt();
	            MyCal myAdd = new MyCal();
	             myAdd.setAdd(x+y);
	             myAdd.getAdd();
	             System.out.println("The Answer is :"+myAdd.getAdd());
	             break;
	         }
	         case 2:
	             System.out.println("Enter the First Value you want to Multiply: ");
	                Scanner mult =new Scanner(System.in);
	                  x = mult.nextInt();
	                  System.out.println("Enter the 2nd  Value you want to Multiply: ");
	                    Scanner addy =new Scanner(System.in);
	                     y= addy.nextInt();
	                MyCal myMult = new MyCal();
	                 myMult.setMult(x*y);
	                 myMult.getMult();
	                 System.out.println("The Answer is :"+myMult.getMult());
	                 break;
			case 3: {
				System.out.println("Enter the First Value you want to Divide: ");
				Scanner divme = new Scanner(System.in);
				x = divme.nextInt();
				System.out.println("Enter the 2nd  Value you want to DIvide: ");
				Scanner addy1 = new Scanner(System.in);
				y = addy1.nextInt();
				MyCal myd = new MyCal();
				myd.setDiv(x / y);
				myd.getDiv();
				System.out.println("The Answer is : " + myd.getDiv());
				break;
			}
			case 4: {
				System.out.println("Enter the First Value you want to Substract: ");
				Scanner mys = new Scanner(System.in);
				x = mys.nextInt();
				System.out.println("Enter the 2nd  Value you want to Substract: ");
				Scanner addy2 = new Scanner(System.in);
				y = addy2.nextInt();
				MyCal mysub1 = new MyCal();
				mysub1.setSub(x - y);
				mysub1.getSub();
				System.out.println("The Answer is: " + mysub1.getMult());
				break;
			}
		}// printing
	}
}
/*- See more at: http://www.asocode.com/java/project-1-simple-java-calculator-division-multiplicationsubtraction/#sthash.AOH4PrW8.dpuf*/