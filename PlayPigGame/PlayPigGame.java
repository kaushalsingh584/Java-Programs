package com.monocept.test;

import java.util.Scanner;

public class PlayPigGame {

	public static void main(String[] args) {
		int score = 0, number = 0, totScore = 0;
		String str1 = "";
		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		int turn = 0;
		while (totScore < 20) {
			if (flag) {
				flag = false;
				turn++;
				System.out.println();
				System.out.println("TURN " + turn);

			}

			System.out.print("Roll or hold? (r/h) ");
			str1 = sc.next();

			if (str1.equals("h")) {
				flag = true;
				totScore += score;
				System.out.println("Score for turn: " + score + "\nTotal score: " + totScore);
				score = 0;
			} else if (str1.equals("r")) {
				number = (int) ((Math.random() * (6 - 1)) + 1);
				System.out.println("Die: " + number);
				if (number == 1) {
					score = 0;
					flag = true;
					System.out.println("Turn over. No score.");
				} else
					score += number;

			} else {
				System.out.println("wrong input entered ! Try again");
			}

		}

//		if (!str1.equals("h")) {
//			totScore += score;
//			System.out.println("Score for turn: " + score + "\nTotal score: " + totScore);
//		}
		System.out.println("\nYou finished in " + turn + " turns!");
		System.out.println("\nGame Over!");
	}

}
