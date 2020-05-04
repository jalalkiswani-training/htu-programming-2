package edu.htu.review2;

public class Conditionals1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c=5;
		/*
		 * if (condition) { condition shold always result in a true or false (boolean)
		 * statement1; statement2; }
		 */
		if (a > b) {
			// this statment will be executed if the value of the condition is true
			System.out.println("Good");
		} else if (b > 4) {
			// this statement when the value of the condition is false
			System.out.println("Not bad");
		} else {
			System.out.println("Fair enough");
		}
		
		if(a>b && b>c) {//&& = and 
			System.out.println("ok");
		}
		
		if(a>b || b>10) { // || : OR operation
			System.out.println("Excellent");
		}
	}
}
