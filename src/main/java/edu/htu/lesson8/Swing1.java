package edu.htu.lesson8;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * Event-driven development: GUI (graphical user interface) programming
 * to develope a graphical user interface in Java: AWT, Swing , JavaFX
 */

public class Swing1 {
	public static void main(String[] args) {
		/*
		 * JFrame: data type
		 * frm: variable name/reference 
		 * new JFrame(); construction
		 */
		JFrame frm=new JFrame();
		frm.setLayout(new FlowLayout());//make the frame put the components based on their required sizes
		
		frm.setTitle("My First Frame");
		frm.setSize(500, 300);
		frm.setLocationRelativeTo(null);//center the frame in the screen
		
		JButton btn=new JButton("Say Hello");
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frm, "Hi from my first frame");
			}
		});
		frm.add(btn);
		frm.setVisible(true);
	}
}
