package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class testing {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog("what score did you recieve on the test?");
	int scoreInt = Integer.parseInt(score);
	int z = 91 % 100;
	if (scoreInt >  z) {
		JOptionPane.showMessageDialog(null, "That is amazing");
	} else if (scoreInt > 80.00);
}
}
