package edu.htu.review2;

import java.util.Scanner;

public class Conditionals2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your choice:");
		int ch = s.nextInt();

		switch (ch) {
		case 1:
			System.out.println("Excellent");
			break;
		case 2:
			System.out.println("Very good");
		case 3:
		case 4:
		case 5:
			System.out.println("Good");
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
	}
}
