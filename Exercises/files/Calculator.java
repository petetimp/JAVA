package files;

public class Calculator {
	
	public static double add(double num1, double num2){
		double answer=num1+num2;
		return answer;
	}
	
	public static double subtract(double num1, double num2){
		double answer=num1-num2;
		return answer;
	}

	public static double multiply(double num1, double num2){
		double answer=num1*num2;
		return answer;
	}

	public static double divide(double num1, double num2){
		double answer=num1/num2;
		return answer;
	}

	public static void main(String[] args) {
		double a=10, b=2, c;
		c=add(a,b);
		System.out.println(a + " + " + b + " = " + c);
		c=subtract(a,b);
		System.out.println(a + " - " + b + " = " + c);
		c=multiply(a,b);
		System.out.println(a + " * " + b + " = " + c);
		c=divide(a,b);
		System.out.println(a + " / " + b + " = " + c);
	}

}
