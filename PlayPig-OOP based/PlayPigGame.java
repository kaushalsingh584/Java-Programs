package com.monocept.model;

import java.util.Scanner;

public class PlayPigGame {
	
	private String name;
	private int turn;
	private int totalScore;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getTurn() {
		return turn;
	}
	public void setTurn(int turn) {
		this.turn = turn;
	}
	public int getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	public PlayPigGame(int turn, int totalScore) {
		this.turn = turn;
		this.totalScore = totalScore;
	}
	
	
}
