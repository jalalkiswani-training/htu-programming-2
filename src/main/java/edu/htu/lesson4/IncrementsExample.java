package edu.htu.lesson4;

public class IncrementsExample {
	public static void main(String[] args) {
		int i=10;
		i++;//i=i+1 , i+=1
		System.out.println(i);//11

		++i;//i=i+1 , i+=1
		System.out.println(i);//12
		
		int sum=i + 10;
		System.out.println(sum);//22
		
		int sum2=i++ +10;//12 + 10  , after that increment i
		System.out.println("Post-Sum2 is : "+sum2);//22
		System.out.println("Post-I after is : "+i);//13
		
		int sum3=++i +10 ;//increment i to 14 , then add to 10
		System.out.println("Pre-sum: "+sum3);//24
		System.out.println("Pre-i:"+i);//14
		
		
	}
}
