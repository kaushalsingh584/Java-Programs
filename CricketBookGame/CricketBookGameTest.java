package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.CricketBookGame;

public class CricketBookGameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		CricketBookGame obj1 = new CricketBookGame();
		CricketBookGame obj2 = new CricketBookGame();
		System.out.println("Enter the name of Player 1");
		obj1.setName(sc.next());
		System.out.println("Enter the name of Player 2");
		obj2.setName(sc.next());

		System.out.println("Enter 1 to play and 0 to exit");
		int flag = sc.nextInt();

		if (flag == 1) {

			CricketBookGameTest.process(obj1);
			System.out.println("\n"+obj1.getName() + " needs " + obj1.getScore() + " in " + obj1.getTurns());
			CricketBookGameTest.process(obj2);
			obj1.getWinner(obj1, obj2);

		} else {
			System.out.println("Game ended");
		}

	}

	public static void process(CricketBookGame obj) {

		Scanner sc = new Scanner(System.in);
		boolean point = true;
		System.out.println("\nPlayer :" + obj.getName());
		while (point) {
			System.out.println("Enter 1 to open book");
			int input = sc.nextInt();
			if (input == 1) {

				int pageNumber = (int) ((Math.random() * (300 - 0)) + 0);
				point = obj.CalculateScore(pageNumber);
				if (!point)
					System.out.println(
							"Name: " + obj.getName() + "\tFinal Score: " + obj.getScore() + "\tTurns: " + obj.getTurns());
			}

			else {
				System.out.println("Wrong input entered");
				break;
			}
		}

	}

}
