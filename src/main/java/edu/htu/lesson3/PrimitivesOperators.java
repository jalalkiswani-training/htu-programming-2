package edu.htu.lesson3;

public class PrimitivesOperators {
	public static void main(String[] args) {
		int i1=10;
		int i2=20;
		int sum=i1+i2;//+,  - , * , / , % 
		int result1=i2-i2;
		
		i1=i1+10;
		//same as above
		i1+=10;
		
		i2=i2-20;
		//same as above
		i2-=20;
		
		sum++;//Post increment: add one to the sum
		++sum;//Pre increment: add one to the sum
		//to see the difference, check the PrimitivesOperators2 class
		
		result1--;//sub 1 from the sum
		
		System.out.println(sum);
	}
}
