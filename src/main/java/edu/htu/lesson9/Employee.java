package edu.htu.lesson9;

/**
 * Parent class: Super class
 * @author Jalal Kiswani
 *
 */
public class Employee {
	// attributes: instance variables in Java
	/*
	 * the private keyword is a visibility modifier that enables the field to be
	 * accessed ONLY within the class
	 * 
	 * The concept of making the instance variables private and use setters/getters
	 * is called encapsulation
	 */
	private int id;
	private String name;
	private double basic;
	private double allownces;
	private double deductions;

	// default constructor: the compiler will write one for me
	// if I didnt provide any cosntructor
	public Employee() {
	}

	// actions: methods in Java
	public double calculateSalary() {
		double totalSalary = basic + allownces - deductions;
		return totalSalary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		//using the setters, I can create validation rules
		if (basic >= 0) {
			this.basic = basic;
		} else {
			System.out.println("Invalid value");
		}
	}

	public double getAllownces() {
		return allownces;
	}

	public void setAllownces(double allownces) {
		this.allownces = allownces;
	}

	public double getDeductions() {
		return deductions;
	}

	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}
}
