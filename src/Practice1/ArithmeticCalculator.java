package Practice1;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	String data = null;
	String operator = null;
	boolean isNum= true;
	do {
		data = input.next();
		isNum = isNumeric(data);
	}while (!isNum);
	double num1 = Double.valueOf(data);
	
	
	do {
		
		operator = input.next();
		System.out.println("valid "+isOperator(operator));
		
	}while (!isOperator(operator));
	
	do {
		data = input.next();
		isNum = isNumeric(data);
	}while (!isNum);
	
	double num2 = Double.valueOf(data);
	

	}
	
	public static boolean isNumeric(String input) {
	    if (input == null) {
	        return false;
	    }
	    try {
	        double d = Double.valueOf(input);
	       // int i = Integer.valueOf(input);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	
	public static boolean isOperator(String operator) {
		System.out.println("operator " + operator);
		
		
		switch(operator) {
		case ("+"):{
			return true;
		}
		case ("-"):{
			return true;
		}
		case ("*"):{
			return true;
		}
		case ("/"):{
			return true;
		}
		default: return false;
		
		}
	}
}