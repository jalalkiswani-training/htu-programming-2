package htu.edu.lesson1;

import javax.swing.JOptionPane;

public class Test2 {

	public static void main(String[] args) {
		//Show a GUI (graphical user interface) dialog to allow the user to 
		//input value
		String name=JOptionPane.showInputDialog("Please enter your name");
		
		//The message is a varaiable shall ensure that we have no duplicates
		// (one of the important things in Clean Code)
		String msg = "Welcome "+name+"!";

		//Print the results on command line 
		System.out.println(msg);
		
		//Show the results on GUI dialog
		JOptionPane.showMessageDialog(null, msg);
		
		//end the application process
		System.exit(0);
	}

}
