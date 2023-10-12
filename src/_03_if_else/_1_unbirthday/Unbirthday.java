package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String birthday=JOptionPane.showInputDialog("Enter your Birthday: ");
		if(birthday.equals("10/11")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday");
		}
		else {
			JOptionPane.showMessageDialog(null, "Happy Unbirthday");
		}
	}

}
