package edu.htu.lesson5;

import java.util.Random;
import java.util.Scanner;

public class ArraysTest {
	public static void main(String[] args) {
		//int marks[] : decleare an array of int
		//new int[10], construct locations for 10 array items  
		int n = 1000;
		int marks[]= new int[n];
		
		//default values for array items
		//numbers: 0
		//boolean: false
		//classes: null
		
		//System.out.println(marks[0]); //0
		//System.out.println(marks[1]); //0
		//...
		//System.out.println(marks[9]); //0
		
		//java.lang.ArrayIndexOutOfBoundsException at location 10
//		System.out.println(marks[10]);
		Scanner s=new Scanner(System.in);

		//read values from user
//		for (int i = 0; i < marks.length; i++) {
//			System.out.println("Please enter value of index  "+i+" : ");
//			marks[i]=s.nextInt();
//		}
		
		Random rand = new Random();

		for (int i = 0; i < marks.length; i++) {
			marks[i]=rand.nextInt(50);
		}
		
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Item at location "+i+" = "+marks[i]);
		}
	}
}
