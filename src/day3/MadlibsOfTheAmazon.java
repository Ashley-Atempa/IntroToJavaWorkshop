package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...

		// Get the user to enter an adjective
		String adj=JOptionPane.showInputDialog(null,"hey enter your adjective ");
		// Get the user to enter a type of liquid
String liquid=JOptionPane.showInputDialog(null, "enter your favorite drink");
		// Get the user to enter a body part
String part=JOptionPane.showInputDialog(null,"enter a body part");
		// Get the user to enter a verb
String Verb=JOptionPane.showInputDialog(null,"enter a verb");
		// Get the user to enter a place
String Place=JOptionPane.showInputDialog(null," enter ur place to go");
		// Fit the user's words into this sentence, and save it in a String:
JOptionPane.showMessageDialog(null, "i love to eat fruits "+adj+" eat.");
		// Piranhas are more [adjective] during the day, so cross the river at
	// night. Piranhas are attracted to fresh [type of liquid] and will most
JOptionPane.showMessageDialog(null," i like to eat "+ liquid + "eating,");
		// likely take a bite out of your [body part] if you [verb]. Whatever
JOptionPane.showMessageDialog(null,"i dont like to eat "+part+" hand,");
		// you do, if you have an open wound, try to find another way to get
// back to the [place]. Good luck!
JOptionPane.showMessageDialog(null,"i woould like to travel "+Place+" Chicago");
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		

	}
}

