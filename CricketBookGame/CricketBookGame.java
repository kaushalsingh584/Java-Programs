package com.monocept.model;

public class CricketBookGame {

	private String name;
	private int score;
	private int turns;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score += score;
	}

	public int getTurns() {
		return turns;
	}

	public void setTurns() {
		this.turns++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean CalculateScore(int pageNumber) {
		int points = pageNumber % 7;

		if (points == 0) {
			System.out.println("\t!!!! OOPS !!!!");
			System.out.println(
					"PageNumber: " + pageNumber + "\tPoints: " + points + "\tScore " + score + "\tTurns " + turns);
			return false;
		}
		score += points;
		turns++;

		System.out
				.println("PageNumber: " + pageNumber + "\tPoints: " + points + "\tScore " + score + "\tTurns " + turns);
		return true;
	}

	public void getWinner(CricketBookGame obj1, CricketBookGame obj2) {
		if (obj1.score == obj2.score) {
			if (obj1.turns > obj2.turns)
				System.out.println("\nWinner is" + obj2.name);
			else if (obj1.turns < obj2.turns)
				System.out.println("\nWinner is" + obj1.name);
			else
				System.out.println("\nNo Winner");
		} else if (obj1.score > obj2.score)
			System.out.println("\nWinner is " + obj1.name);
		else
			System.out.println("\nWinner is " + obj2.name);
	}

}
