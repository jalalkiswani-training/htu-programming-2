package edu.htu.lesson7;

import java.util.Scanner;

/**
 * The approach of dividing the applicatoin into seprate functions is called "Procedual Programming"
 * @author Jalal Kiswani
 *
 */
public class Test {
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.print("Please enter value :");
//		int n1=s.nextInt();
		
		int grade=readNumber("Enter your grade: ");//them message shold be: 
		
		int n1 = readNumber(1);

//		System.out.print("Please enter value :");
//		int n2 = s.nextInt();
		int n2 = readNumber(2);

//		System.out.print("Please enter value :");
//		int n3 = s.nextInt();
		int n3 = readNumber(3);

		int sum = n1 + n2 + n3;
		System.out.println("Sum = " + sum);
		System.out.println("Your grade is : "+grade);
	}

	/**
	 * Public: visiblity modifier that means this function/method could be accessed
	 * from anywhere Static: non-object oriented method / Proceduaral programming
	 * (could be called directly from the classname) int: return datatype
	 * readNumber: the function name the function could accept paramters
	 * 
	 * If the frunction doesnot return a value, the return datatype will be "void"
	 * @return
	 */
	public static int readNumber(int index) {
		//methods wrapping 
		return readNumber("Enter value #"+index+" : ");
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter value #"+index+" :");
//		int n = s.nextInt();
//		return n;
	}
	
	public static int readNumber() {
		return readNumber("Please enter value:");
	}
	
	//Duplicate: is one of the most visible signs of Bad Smells in code
	
	//method OVERLOADING: having another function with the same name,
	//the difference will be in the paramters datatypes, numebrs, and orders 
	//for example String, int   ==> int, String
	//if the function doesnot retrun any value, "void" keyword shall be used
	public static int readNumber(String msg) {
		//the variable decalred inside the method, is called "Local Variable", and is only visible inside the function/method
		Scanner s = new Scanner(System.in);
		System.out.print(msg);
		int n = s.nextInt();
		return n;
	}
}
