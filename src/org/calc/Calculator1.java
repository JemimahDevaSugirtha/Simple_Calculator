package org.calc;

public class Calculator1 {
	protected void multiplication(int a, int b) {
		int c;
		c = a*b;
		System.out.println("MULTIPLICATION ="+c);
	}
	public void division(int a, int b) {
		int c;
		c = a/b;
		System.out.println("DIVISION ="+c);
	}
	
	
	public static void main(String[] args) {
		
		Calculator1 calc = new Calculator1();
		
		calc.multiplication(4, 3);
		calc.division(10, 5);
		
		
	}

}
