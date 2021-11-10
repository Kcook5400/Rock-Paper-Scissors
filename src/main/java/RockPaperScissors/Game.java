package RockPaperScissors;

import java.util.Random;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Oct 19, 2021
 */
@Data
@NoArgsConstructor
public class Game {
	
	private String player1;
	private String computerPlayer;
	private String winner;
	
	public Game(String player1) {
		super();
		this.player1=player1;
		this.setComputerPlayerToRandom();
		this.determineWinner();
	}
	
	public void setComputerPlayerToRandom() {
		int min = 1;
		int max = 3;
		int choice = (int)Math.floor(Math.random()*(max-min+1)+min);

		switch (choice) {
		case 1: this.setComputerPlayer("rock");
		break;
		case 2: this.setComputerPlayer("paper");
		break;
		case 3:this.setComputerPlayer("scissors");
		break;
		}
		
		
		
			
	}
	
	public void determineWinner() {
		if (this.player1.equals(this.computerPlayer)) {
			this.winner="draw";
		}
		else if(this.player1.equals("rock")&&this.computerPlayer.equals("scissors")) {
			this.winner="player 1";
		}
		else if(this.player1.equals("rock")&&this.computerPlayer.equals("paper")) {
			this.winner="computer";
		}
		else if(this.player1.equals("paper")&&this.computerPlayer.equals("rock")) {
			this.winner="player 1";
		}
		else if(this.player1.equals("paper")&&this.computerPlayer.equals("scissors")) {
			this.winner="computer";
		}
		else if(this.player1.equals("scissors")&&this.computerPlayer.equals("paper")) {
			this.winner="player 1";
		}
		else if(this.player1.equals("scissors")&&this.computerPlayer.equals("rock")) {
			this.winner="computer";
		}
		
		
	}


}
