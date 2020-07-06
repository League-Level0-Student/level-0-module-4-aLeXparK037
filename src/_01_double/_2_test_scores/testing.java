package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class testing {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog("what score did you recieve on the test?");
	double scoreDou = Double.parseDouble(score);
	
	if (scoreDou >  90.01) {
		JOptionPane.showMessageDialog(null, "That is amazing");
	} else if (scoreDou > 80.00) {
		JOptionPane.showMessageDialog(null, "That is great");
	}
}
}
