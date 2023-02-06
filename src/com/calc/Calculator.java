package com.calc;
import org.calc.*;

public class Calculator extends Calculator1{
	
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
		
		Calculator cal = new Calculator();
		
		cal.addition(4, 3);
		cal.subtraction(10, 5);
		cal.division(7, 7);
		cal.multiplication(4, 3);
	}

}
