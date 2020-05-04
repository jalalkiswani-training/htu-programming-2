package edu.htu.review;
/*To run this source code (class), we should compile it:
 and to compile it, we need a Compiler (JDK - Java Development Kit)
 to compiler using the manual way:
 1- Open CMD (command line)
 2- navigate to the folder of source code using "cd" command
 3- compile the class using "javac" javac Test.java
 4- Test.class file will be generated 
 5- To run the compiled class, we should use the "java" command
 6- java Test  //this will call the Test.class
 
 Result: The manual approach of using TextEditor and manual compilation and execution 
 is not practical 
 
 Recommendation: Always use an IDE (Integrated Development Environment)
 ----------------------------------------------
 Main Concepts:
 1- Program: Source (Text Editor) --> Compilation (JDK) ---> Execution (JRE Java Runtime Environment)
 2- IDE Features: Project management, auto compilation, code assistance , simple execution 
 3- Types of projects: 
 	3.1 Java Project (Simple to create, but not recommanded in the industry of real-life projects) - 
 	3.2 Maven Project (harder to create, but extremely recommanded)  

*/
import javax.swing.JOptionPane;
public class Test{
	
	public static void main(String args[]){
		//System.out.println("Hello from uncle Jalal");
		JOptionPane.showMessageDialog(null,"Hello from uncle Jalal");
	}
}