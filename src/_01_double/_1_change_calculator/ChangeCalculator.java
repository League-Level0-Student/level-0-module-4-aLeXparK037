package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickels = JOptionPane.showInputDialog("How many nickels do you have?");
		int nickelsInt = Integer.parseInt(nickels);

		// Convert their answer to an int.   Hint: Integer.parseInt()  

		// Ask the user how many dimes they have, and convert their answer
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		// Ask the user how many quarters they have, and convert their answer
		int dimesInt = Integer.parseInt(dimes);
		String pennies = JOptionPane.showInputDialog("How many pennies do you have?");
		int penniesInt = Integer.parseInt(pennies);
		String quarters = JOptionPane.showInputDialog("How many quarters do you have?");
		int quartersInt = Integer.parseInt(quarters);
		// Calculate how much money the user has.  Hint: Use a double variable 
		JOptionPane.showMessageDialog(null, "You have a total of "+ (penniesInt + dimesInt + nickelsInt + quartersInt) + " coins" );

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		JOptionPane.showMessageDialog(null, "The sum of your money is "+ (penniesInt + 10*dimesInt + 5*nickelsInt + 25*quartersInt) + " cents " );
	}
}
