package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0; 
		// ASK A QUESTION AND CHECK THE ANSWER
		String question = JOptionPane.showInputDialog("Is League the most popular game in the world");
				// 2.  Ask the user a question 
				if (question.equalsIgnoreCase("Yes")) {
					
					score++;
				}
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null, "Your score is " + score);
	}
}
