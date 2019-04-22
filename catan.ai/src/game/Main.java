package game;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Integer[] players = getPlayers();
		Board board = new Board(players[0], players[1]);
		System.out.println("Board initialized!");
		System.out.println("Number of humans: " + board.numHumans);
		System.out.println("Number of AI: " + board.numAI);
	}

	private static Integer[] getPlayers() throws IOException {
		Integer[] fin = new Integer[2];
		Integer totPlayers = 0;
		Integer numHumans = 0;
		Integer numAI = 0;
		Scanner scan = new Scanner(System.in);
		while(totPlayers < 2 || totPlayers > 4) {
			System.out.print("Enter the number of human players: ");
			numHumans = scan.nextInt();
			System.out.print("Enter the number of AI players: ");
			numAI = scan.nextInt();
			totPlayers = numHumans + numAI;
			//some basic checks around the numbers entered
			if(totPlayers < 2) {
				System.out.println("Too few players. Enter more!");
			} else if (totPlayers > 4){
				System.out.println("Too many players. Enter less!");
			}
			System.out.println("----------------------");
		}
		scan.close();
		fin[0] = numHumans;
		fin[1] = numAI;
		return fin;
	}
}
