package org.calc;

public class Calculator2 {
	
	private void addition(int a, int b) {
		int c;
		c = a+b;
		System.out.println("ADDITION ="+c);
	}
	private void subtraction(int a, int b) {
		int c;
		c = a-b;
		System.out.println("SUBTRACTION ="+c);
	}
	
	
	public static void main(String[] args) {
		
		Calculator1 cal1 = new Calculator1();
		Calculator2 cal2 = new Calculator2();
		
		cal2.addition(4, 3);
		cal2.subtraction(10, 5);
		cal1.division(7, 7);
		cal1.multiplication(4, 3);
	}

}
