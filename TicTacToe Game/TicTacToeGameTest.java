package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.TicTacToe;

public class TicTacToeGameTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[][] arr ;

		char p1 = 'O', p2 = 'X', ch = 'O';
		int turn = 0;
		
		TicTacToe obj = new TicTacToe();

		int flag = 1;

		while (flag == 1) {

			
			System.out.println("\nPlayer  " +ch+": enter the row and column:");

			int row = sc.nextInt();
			int col = sc.nextInt();
			arr = obj.getArr();

			if (arr[row - 1][col - 1] != '\u0000')
				{
				System.out.println("Position already occupied ! Please enter other position");
				continue;
				}
			
			else {
				turn++;
				obj.setArr(arr, row, col, ch);
			}
			
			System.out.println("---------- ");
			for (int i = 0; i < arr.length; i++) {

				System.out.println(arr[i][0] + " | " + arr[i][1] + " | " + arr[i][2]);
				System.out.println("---------- ");

			}

			flag = obj.checkWinner(arr, ch, turn);

			if (flag == -1) {
				System.out.println("Draw");
				break;
			} else if (flag == 0) {
				System.out.println("Player "+ch+" Won!!");
				break;
			}
			
			if(ch == 'O')
				ch = 'X';
			else {
				ch = 'O';
			}
			
			
		}

	}

}
