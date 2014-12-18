/**
 * Towers of Hanoi
 * Pole are labeled 1, 2,3
 * Each disk is also labeled
 * @author Lars Vogel
 *
 */

public class TowersOfHanoi {
			   
  public static void move(int n, int startPole, int endPole) {
//1a. public static void move(5,1,3)
//2a. public static void move(4,1,2)
//3a. public static void move(3,1,3)
//4a. public static void move(2,1,2)
//5a. public static void move(1,1,3)
//6a. public static void move(0,1,2)
//7a. public static void move(0,2,3)
//8a. public static void move(1,3,2)
//9a. public static void move(0,3,1)
//10a.public static void move(0,1,2)
    if (n== 0){
      return; 
    }
    //1b. false n=5
	//2b. false n=4
	//3b. false n=3
    //4b. false n=2
    //5b. false n=1
    //6b. true  n=0-->return to 5d. (END of 6) 
    //7b. true  n=0-->return to 5g. (END of 7)
    //8b. false n=1
    //9b. true  n=0-->return to 8d. (END of 9)
    //10b.true  n=0-->return to 8g. (END of 10)
    int intermediatePole = 6 - startPole - endPole;
  //1c. intermediatePole = 2
  //2c. intermediatePole = 3
  //3c. intermediatePole = 2
  //4c. intermediatePole = 3
  //5c. intermediatePole = 2
  //8c. intermediatePole = 1
    
    move(n-1, startPole, intermediatePole);
//1d. move(4,1,2)-->go to 2a.
//2d. move(3,1,3)-->go to 3a.
//3d. move(2,1,2)-->go to 4a.-->//3e. '3d.' has been evaluated move to 3f.
//4d. move(1,1,3)-->go to 5a.-->//4e. '4d.' has been evaluated move to 4f.
//5d. move(0,1,2)-->go to 6a.-->//5e. '5d.' has been evaluated move to 5f.     
//8d. move(0,3,1)-->go to 9a.-->//8e. '8d'  has been evaluated move to 8f.
    
    System.out.println("Move " +n + " from " + startPole + " to " +endPole);
//5f. System.out.println("Move 1 from 1 to 3");
//4f. System.out.println("Move 2 from 1 to 2");
//8f. System.out.println("Move 1 from 3 to 2");
//3f. System.out.println("Move 3 from 1 to 3");
    
    move(n-1, intermediatePole, endPole);
//5g. move(0,2,3)-->go to 7a.-->//5h. '5g.' has been evaluated move to 4d. (END of 5) 
//4g. move(1,3,2)-->go to 8a.-->//4h. '4g' has been evaluated move to 3d. (END of 4)
//8g. move(0,1,2)-->go to 10a.-->//8h. '8g' has been evaluated move to 4g. (END of 8)
//3g. move(2//START HERE TOMORROW
  }
  
  public static void main(String[] args) {
    move(5, 1, 3);
  }
} 