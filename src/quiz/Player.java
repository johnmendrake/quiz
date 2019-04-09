package quiz;

public class Player {
	
	private String name = "";
	private int points = 0;
	
	public Player(String name) {
		super();
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getName() {
		return name;
	}
}
