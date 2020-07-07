package _02_boolean._1_sleepy_head;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
        String day = JOptionPane.showInputDialog("what day is it?");
		// Set the boolean isWeekend based on the value they enter
		if (day.equalsIgnoreCase("saturday")|| day.equalsIgnoreCase("sunday")) {
			isWeekend = true;
		}
		else {
			isWeekend = false;
		}
		// If it is the weekend, tell the user they get to sleep in.
		if (isWeekend == true) {
			JOptionPane.showMessageDialog(null, "You get to sleep in");
		} else if (isWeekend == false) { 
			JOptionPane.showMessageDialog(null, "GET to school");
		}
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
		String score = JOptionPane.showInputDialog("what did you score on your exam?");
		
	double scoreDou = Double.parseDouble(score);
	if (scoreDou > 70.00) {
		 passedExam = true;
	}
	else {
		passedExam = false; 
	}

		
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		if (passedExam == true) {
			JOptionPane.showMessageDialog(null, "Keep up the good work");
		} else if (passedExam == false) {
			JOptionPane.showMessageDialog(null, "Study harder");
		}
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true
			JOptionPane.showMessageDialog(null, "game is over");
		}
		// Tell the user "game is over" 
		
		
		/***********************   RED SQUARE  ********************/
		Robot ap = new Robot ("mini");
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String colorr = JOptionPane.showInputDialog("What color do you want to draw with? (green or red) ");
		if (colorr.equals("green")) {
			isRed = true;
		} 
		else {
			isRed = false;
		}
		
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String shape = JOptionPane.showInputDialog("What shape do you want to draw? (square or triangle)");
		if (shape.equals("square")) {
			isSquare = true;
		}
		else {
			isSquare = false;
		}
		
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		ap.setSpeed(50);
		if (isRed == true &&(isSquare == true)) {
			ap.penDown();
			ap.setPenColor(Color.GREEN);
			for (int z = 0; z < 4; z++) {
				ap.move(50);
				ap.turn(90);
			}
		}

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
	}	
}
