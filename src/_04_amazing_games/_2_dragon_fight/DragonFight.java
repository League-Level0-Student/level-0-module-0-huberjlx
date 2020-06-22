package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random();    //This will be used later to make random numbers. 

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/dragonPicture.jpg");
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);

		// 1. Create some variables to hold health levels
		int playerHealth = 100;
			// playerHealth to store your health - set it equal to 100
	int dragonHealth = 100; 
			// dragonHealth to store the dragon's health - set it equal to 100

		// 2. Create some variables to hold the attack strengths. These will be given different values later. 
	int playerAttack = 0;
			// playerAttack to store the damage the player's attack will do - set it equal
			// to 0 for now.
	int dragonAttack = 0;
			// dragonAttack to store the damage the dragon's attack will do - set it equal
			// to 0 for now.

		
		//  This while statement will cause the game to repeat until the player or dragon run out of health
		while (true) {

			// THE PLAYER ATTACKS THE DRAGON

				// 3. Ask the player in a pop-up if they want to attack the dragon with a yell
				// or a kick
	String attack=JOptionPane.showInputDialog("Do you want to kick or yell?");
				// 4. If they typed in "yell":
	if (attack.equalsIgnoreCase("yell")) {
		
		playerAttack=ran.nextInt(11);
		dragonHealth=dragonHealth-playerAttack;
	}
					// -- Find a random number between 0 and 10 and store it in playerAttack. Use
					// ran.nextInt(10)
		
					// -- Subtract the player attack value from the dragon's health
	
				// 5. If they typed in "kick":
	if (attack.equalsIgnoreCase("kick")) {
		
		playerAttack=ran.nextInt(26);
		dragonHealth=dragonHealth-playerAttack;
	}
					// -- Find a random number between 0 and 25 and store it in playerAttack.
		
					// -- Subtract the player attack value from the dragon's health

			// THE DRAGON RETALIATES

				// 6. Find a random number between 0 and 35 and store it in dragonAttack
	dragonAttack=ran.nextInt(36);
				// 7. Subtract the dragon attack value from the player's health
playerHealth=playerHealth-dragonAttack;
			// ASSESS THE DAMAGE CAUSED 

				// 8. If the player's health is less than or equal to 0
				// call the playerLost() method
	if (playerHealth<=0) {
		
		playerLost();
	}
			
				// 9. Else if the dragon's health is less than or equal to 0
				// call the dragonLost() method
	else if (dragonHealth<=0) {
		
		dragonLost();
	}
			
	else {
		JOptionPane.showMessageDialog(null, "Player health " + playerHealth + "\n"
				+"Dragon health "+dragonHealth);
		JOptionPane.showMessageDialog(null, "Player lost "+ dragonAttack +"\n"
				+"Dragon lost "+playerAttack);
		
	}
			// 10.  Pop up a message that tells the player the health levels of player and
			// 		dragon.

			
			// (Bonus: Also display the amount of health that was lost by each in this
			// round)

		}

	}

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no treasure
JOptionPane.showMessageDialog(null, "You lost and there's no treasure for you");

		System.exit(0);   //This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of gold!
JOptionPane.showMessageDialog(null, "You won and got a lot of treasure");
		System.exit(0);   //This code ends the program
	}

}
