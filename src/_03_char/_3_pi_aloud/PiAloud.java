package _03_char._3_pi_aloud;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PiAloud {
public static void main(String[] args) {
	

	// 1. Make a main method and make sure your program can run

	// 2. Make a String variable to hold 20 digits of Pi. You could use http://www.piday.org/million/ to get this.
String pi = ("3.14159265358979323846");
pi.length();
/*
	// 3. Print out 3 digits of Pi. The first value is "pi.charAt(0)", the second is "pi.charAt(1)"
	// Check the console shows 3.1
for (int z = 0; z < pi.length(); z++) {
System.out.println(pi.charAt(z));
speak(pi.charAt(z));
}
*/
	// 4. Print ALL the digits of of the Pi String (hint: use a loop)

	// 5. Use the speak() method below to speak each digit of Pi.



for (int a = 0; a < pi.length(); a ++) {
	if (pi.charAt(a) != '.') {
	String quiz = JOptionPane.showInputDialog("What is the next digit of pi?");
if (quiz.charAt(0) == pi.charAt(a)) {
	//speak(pi.charAt(a));
System.out.println("correct");
}
else {
	System.out.println("Incorrect. Correct is " + pi.charAt(a));
}
	}
}

	// [CHALLENGE]
	// *6. Get a character from the user using the getInputFromUser() method
	// *7. Compare the users' char to the next digit of Pi
	// *8. If they are correct, print out "correct". If they are not, print "incorrect" 
	
	
}
	/********************  Use these methods. DON'T CHANGE THE CODE BELOW  ******************/

	static void speak(char characterToSpeak) {
		try {
			Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}


