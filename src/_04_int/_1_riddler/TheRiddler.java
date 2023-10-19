package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score=0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(riddle.equals("stamp")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score+=1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		
		riddle = JOptionPane.showInputDialog("What has to be broken before you use it?");
		if(riddle.equals("egg")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score+=1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		
		riddle = JOptionPane.showInputDialog("What runs all around a backyard, yet never moves?");
		if(riddle.equals("fence")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score+=1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		
		riddle = JOptionPane.showInputDialog("I am an odd number. Take away a letter and I become even. What number am I?");
		if(riddle.equals("seven")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score+=1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Score = " + score);
	}
}

