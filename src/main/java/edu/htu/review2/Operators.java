package edu.htu.review2;

public class Operators {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;

		int s=n1+n2;
		s=n1-n2;
		s=n1*n2;
		s=n1/n2;
		s=n1%n2;//modulous: remaining of the division 
		
		n1++;//post increment
		++n1;//pre increment
		//Post increment and pre decrement have the same effect if they are alone in the same line
		//the difference will be shown if the exist in an equation
		s= n1++ * --n2;
		
		
	}
}
