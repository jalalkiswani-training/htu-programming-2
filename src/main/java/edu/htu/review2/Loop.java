package edu.htu.review2;

public class Loop {
	public static void main(String[] args) {
		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");
//		System.out.println("4");
//		System.out.println("5");
		
		/*
		 * 1) init
		 * 2) check for condition
		 * 3) execution body
		 * 4) execution the post increment
		 * 5) go to step 3 
		 */
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		//the above is equivalent to the following statement
		int j=0;
		while(j<5) {
			System.out.println(j);
			j++;
		}
		
		System.out.println("Done");
	}
}
