package edu.htu.lesson8;

public class Test {
	public static void main(String[] args) {
		/**
		 * Person: datatype
		 * p: reference 
		 * new Person(): construction:
		 * calling a method with the same class name
		 * 
		 *  "Person()" constructor: if the developer 
		 *  didnt write a constructor, the compiler will
		 *  write one for him/her
		 */
		Person p=new Person();
		p.name="Ata";
		p.age=16;
		p.sayHi();
		
		Person p2=new Person();
		p2.name="Essa";
		p2.age=20;
		p2.sayHi();
		
	}
}
