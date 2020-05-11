package edu.htu.lesson10;

/*
 * Naming/Coding convention and standard
 * Class name: Camel case for every word
 * Variable names (nouns): Camel case but first word is small
 * Method (verbs): Camel case but first word is small
 */
public class EmployeeSalaryCalculator {

	public static void main(String[] args) {
		int i = 10;
		double d = 10.2;

		int finalSalary = calculateEmployeeSalary();
		System.out.println(finalSalary);
	}

	private static int calculateEmployeeSalary() {
		int basicSalary = 1000;
		int allownces = 20;
		int deductions = 5;
		int finalSalary = basicSalary + allownces - deductions;
		return finalSalary;
	}
}
