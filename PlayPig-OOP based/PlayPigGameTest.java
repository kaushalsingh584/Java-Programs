package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.PlayPigGame;

public class PlayPigGameTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = 0, score = 0;
		String str1 = "", name;

		PlayPigGame p1 = new PlayPigGame(0, 0);
		PlayPigGame p2 = new PlayPigGame(0, 0);

		System.out.println("Enter name for player 1");
		name = sc.next();
		p1.setName(name);
		System.out.println("Enter name for player 2");
		name = sc.next();
		p2.setName(name);

		boolean flag = true;

		int turn1 = PlayGame(p1);
		p1.setTurn(turn1);
		int turn2 = PlayGame(p2);
		p2.setTurn(turn2);

		if (turn1 < turn2)
			System.out.println(p1.getName() + " wins");
		else if(turn1 > turn2)
			System.out.println(p2.getName() + " wins");
		else 
			System.out.println("Draw");
			
		System.out.println("\nGame Over!");
	}

	public static int PlayGame(PlayPigGame p1) {
		int turn = 0, randomNumber, score = 0;
		String str1 = "";
		System.out.println(p1.getName() + " play :");
		Scanner sc = new Scanner(System.in);
		Boolean flag = true;
		while (p1.getTotalScore() < 20) {
			if (flag) {
				flag = false;
				turn++;
				System.out.println("\nTURN " + turn);
			}

			System.out.print("Roll or hold? (r/h) ");
			str1 = sc.next();

			if (str1.equals("h")) {
				flag = true;
				p1.setTotalScore(p1.getTotalScore() + score);
				System.out.println("Score for turn: " + score + "\nTotal score: " + p1.getTotalScore());
				score = 0;
			} else if (str1.equals("r")) {
				randomNumber = (int) ((Math.random() * (6 - 1)) + 1);
				System.out.println("Die: " + randomNumber);

				if (randomNumber == 1) {
					score = 0;
					flag = true;
					System.out.println("Turn over. No score.");
				} else
					score += randomNumber;

			} else
				System.out.println("wrong input entered ! Try again");

		}
		System.out.println("\n" + p1.getName() + " finished in " + turn + " turns!");
		return turn;
	}

}
