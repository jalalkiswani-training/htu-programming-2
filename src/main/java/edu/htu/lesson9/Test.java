package edu.htu.lesson9;

public class Test {
	public static void main(String[] args) {
		/*
		 * Employee: datatype
		 * emp: reference
		 * new : keyword for constructing objects
		 * Employee(): constructor (a special method with the 
		 * same class name without return datatype)
		 */
		Employee emp=new Employee();
		emp.setName("123456789");
		emp.setId(20);
		emp.setName("Ata");
		emp.setBasic(-200);
		emp.setAllownces(25);
		emp.setDeductions(50);
		
		double finalSalary = emp.calculateSalary();
		System.out.println(finalSalary);
		
		Manager gm=new Manager();
		gm.setId(30);
		gm.setName("Essa");
		gm.setBasic(100);
		gm.setDeductions(20);
		gm.setAllownces(50);
		System.out.println(gm.calculateSalary());
		
	}
}
