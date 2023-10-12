package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String basketball = "Fun to play and exciting to watch";
		String cars = "Awesome to drive";
		String lakers_vs_celtics = "Most legendary rivalry";
		String karate = "Nice to learn how to fight someone";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String interesting = JOptionPane.showInputDialog("Enter something interesting: ");	
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		if(interesting.equals("Basketball")) {
			JOptionPane.showMessageDialog(null, basketball);
		}
		if(interesting.equals("Cars")) {
			JOptionPane.showMessageDialog(null, cars);
		}
		if(interesting.equals("Lakers vs Celtics")) {
			JOptionPane.showMessageDialog(null, lakers_vs_celtics);
		}
		if(interesting.equals("Karate")) {
			JOptionPane.showMessageDialog(null, karate);
		}
	}
}

