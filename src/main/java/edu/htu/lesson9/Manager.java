package edu.htu.lesson9;

// Inheritence 
/*
 * Child class: subclass
 */
public class Manager extends Employee {
	private int level;

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	/*
	 * Method overrider: rewrite a method written origanally in the super class
	 * into the subclass to change its behavior
	 */
	public double calculateSalary() {
		double totalSalary = getBasic() + (getAllownces()/2) - getDeductions();
		return totalSalary;
	}

}
