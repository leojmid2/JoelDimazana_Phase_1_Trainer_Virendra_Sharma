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
		
	}while (!isOperator(operator));
	
	do {
		data = input.next();
		isNum = isNumeric(data);
	}while (!isNum);
	
	double num2 = Double.valueOf(data);
	double result = operation(operator, num1, num2);
	System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	

	}
	
	public static boolean isNumeric(String input) {
	    if (input == null) {
	        return false;
	    }
	    try {
	        double d = Double.valueOf(input);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	
	public static boolean isOperator(String operator) {
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
	
	public static double operation(String operator,double num1, double num2) {
		double result = 0;
		if (operator.equals("+")) {
			return num1 + num2;
		}
		if (operator.equals("-")) {
			return num1 - num2;
		}
		if (operator.equals("*")) {
			return num1 *  num2;
		}
		if (operator.equals("/")) {
			return num1 /  num2;
		}
		return result;
		
	}
}