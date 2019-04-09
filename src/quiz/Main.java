package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static ArrayList<Player> players = new ArrayList<Player>();

	public static void main(String[] args) {
		addPlayers();
	}

	public static void addPlayers() {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		String answer;

		do {
			System.out.print("Bitte geben Sie einen Namen ein: ");
			players.add(new Player(sc.next()));
			
			String ausgabe =  ""; 
			for (int i = 0 ; i < players.size()-1; i++) {
				 ausgabe += players.get(i).getName() + ", ";
			}
			ausgabe += players.get(players.size()-1).getName();
			System.out.printf("Bisher eingetragene Spieler: \n%s\n", ausgabe);
			
			answer = "";
			if (!answer.equals("J") || !answer.equals("N")) {
				System.out.print("Wollen Sie weitere Spieler hinzufügen? [J/N] ");
				answer = sc.next();
			}
		} while (answer.equals("J"));
		sc.close();
	}
}
