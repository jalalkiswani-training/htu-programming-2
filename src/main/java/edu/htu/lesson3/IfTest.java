package edu.htu.lesson3;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter number 1: ");
		int a=scanner.nextInt();
		
		System.out.println("Please enter number 2: ");
		int b=scanner.nextInt();
		
		System.out.println("Please enter number 3: ");
		int c=scanner.nextInt();
		
		/*
		 * Conditional operators: 
		 * > : Larger than
		 * < : Less than
		 * >= : More than ore equals 
		 * <= : Less than or equals 
		 * != : Not  eauals 
		 * == : equals
		 * 
		 * ===============================
		 * More than one condition: 
		 * &&
		 * || 
		 * 
		 */
		
		if(a>b && b>c) {  //condition always should return boolean
			System.out.println("Ok");
		}else {
			System.out.println("Not Ok");
		}
		
		if(a == b) {
			System.out.println("Not bad");
		}
		
		if(b>1000) {
			System.out.println("B is a large value");
		}
	}
}
