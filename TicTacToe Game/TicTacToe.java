package com.monocept.model;

public class TicTacToe {
	
	private char[][] arr;
	
	public TicTacToe()
	{
		arr= new char[3][3];
	}
	

	public char[][] getArr() {
		return arr;
	}

	public void setArr(char[][] arr,int row,int col,char ch) {
		arr[row - 1][col - 1] = ch;
	}
	public int checkWinner(char[][] arr, char ch, int turn) {
		// TODO Auto-generated method stub
		//scanning rows
		if ((arr[0][0] == ch && arr[0][1] == ch && arr[0][2] == ch)
				|| (arr[1][0] == ch && arr[1][1] == ch && arr[1][2] == ch)
				|| (arr[2][0] == ch && arr[2][1] == ch && arr[2][2] == ch))
			return 0;
		
		//scanning columns
		if (arr[0][0] == ch && arr[1][0] == ch && arr[2][0] == ch
				|| (arr[0][1] == ch && arr[1][1] == ch && arr[2][1] == ch)
				|| (arr[0][2] == ch && arr[1][2] == ch && arr[2][2] == ch))
			return 0;
		
		//scanning right diagonal
		if (arr[0][0] == ch && arr[1][1] == ch && arr[2][2] == ch)
			return 0;
		
		//scanning left diagonal
		if (arr[0][2] == ch && arr[1][1] == ch && arr[2][0] == ch)
			return 0;

		if (turn == 9)
			return -1;
		
		return 1;
	}
	

}
