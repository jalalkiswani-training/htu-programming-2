package edu.htu.lesson6;

public class Performance2 {
	public static void main(String[] args) {
		int s1 = 10;//1
		int s2 = 20;//1
		int sum = s1 + s2;//1
		int n = 50;//1
		for (int i = 0; i < n; i++) { //n*n
			for (int j = 0; j < n; j++) {
				System.out.println(i);				
			}
		}
		//What is the time complixity for this app?  O(n^2): read as : order of n square
		//for example: n=1000 and time complxity O(n)==> total number of operations?? 1000
		//n=1000, and time complixity O(n^2)==> 1_000_000
	}
}
