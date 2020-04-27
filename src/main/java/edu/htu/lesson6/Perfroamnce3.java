package edu.htu.lesson6;

public class Perfroamnce3 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int s1 = 10;// 1
		int s2 = 20;// 1
		int sum = s1 + s2;// 1
		int n = 10_000_000;// 1
		int totalSum = 0;
		for (int i = 0; i < n; i++) { // n*n
			for (int j = 0; j < n; j++) {
//				System.out.println(i);			
				totalSum += 1;
			}
		}
		System.out.println(totalSum);
		long after = System.currentTimeMillis();
		long duration = after - start;

		System.out.println("Duration = " + duration);
	}
}
