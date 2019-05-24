package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static Quiz1 meinQuiz1 = new Quiz1();
	private static ArrayList<Player> players = new ArrayList<Player>();

	public static void main(String[] args) {
		//addPlayers();
		meinQuiz1.fragenEinlesen();
		new GuiQuiz1(meinQuiz1);
		
	}

	public static void addPlayers() {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		String answer;

		do {
			System.out.print("Bitte geben Sie einen Namen ein: ");
			players.add(new Player(sc.next()));

			// print the names of the currently registered players
			String outputList = "[";
			for (int i = 0; i < players.size() - 1; i++) {
				outputList += players.get(i).getName() + ", ";
			}
			outputList += players.get(players.size() - 1).getName();
			outputList += "]";
			System.out.printf("Bisher eingetragene Spieler: \n%s\n", outputList);

			answer = "";
			while (!(answer.equals("J") || answer.equals("N"))) {
				System.out.print("Wollen Sie weitere Spieler hinzufuegen? [J/N] ");
				answer = sc.next();
			}
		} while (answer.equals("J"));
		sc.close();
	}
}