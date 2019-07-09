package meeeeep;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static Quiz1 meinQuiz1 = new Quiz1();
	private static ArrayList<Player> players = new ArrayList<Player>();
	private static Graph meins = new Graph();

	public static void main(String[] args) {
		new AddPlayer(null, true); // don't ask me why it works but it should XD

		meins.addVertex(new Vertex("main"));
		playersToGraph();

		meinQuiz1.fragenEinlesen();
		new Auswahl(meinQuiz1, players);
	}

	public static void playersToGraph() {
		for (int i = 0; i < players.size(); i++) {
			Vertex newVertex = new Vertex(players.get(i).getName());
			meins.addVertex(newVertex);
			meins.addEdge(new Edge(meins.getVertex("main"), newVertex, players.get(i).getPoints()));
		}
	}

	public static ArrayList<Player> getPlayers() {
		return players;
	}

	public static void addPlayer(Player p) {
		players.add(p);
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
			while (!(answer.equals("j") || answer.equals("n"))) {
				System.out.print("Wollen Sie weitere Spieler hinzuen? [j/n] ");
				answer = sc.next();
			}
		} while (answer.equals("j"));
		sc.close();
	}
}
