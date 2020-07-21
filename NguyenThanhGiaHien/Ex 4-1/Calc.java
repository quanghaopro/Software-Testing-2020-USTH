package junitTests;

public class Calc {   

	static public int add (int a, int b)
	{
		return a + b;
	}	
	
	static public int substract(int a, int b)
	{
		return a - b;
	}
	
	static public int multiply(int a, int b) {
		return a * b;
	}
	
	static public int divide(int a, int b) {
		if(b == 0) throw new ArithmeticException("Calc.divide");
		int c = a / b;
		if(a != 0 && c == 0) throw new ArithmeticException("Calc.divide");

		return c;
	}
}