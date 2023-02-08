package com.monocept.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieController {

	private MovieManager manager;

	public MovieController(MovieManager manager) {
		super();
		this.manager = manager;
	}

	public void start() {
		displayMenu();
	}

	private void displayMenu() {

		Boolean flag = true;
		int expression;
		Scanner sc = new Scanner(System.in);
		while (flag) {
			System.out.println(
					"Enter 1 for addMovie\nEnter 2 for clearMovie\nEnter 3 for getmovies\nEnter 4 for saveMovies\nEnter 5 for break");

			expression = sc.nextInt();

			switch (expression) {
			case 1:
				System.out.println("Enter the Movie details: id, year, name, genre");
				System.out.print("Enter movie id: ");
				int id = sc.nextInt();
				
				System.out.print("Enter movie release year: ");
				int year = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter movie name: ");
				String name = sc.nextLine();
				
				System.out.print("Enter movie genre: ");
				String genre = sc.nextLine();

				manager.addMovie(new Movie(id, year, name, genre));
				System.out.println("movie added successfully");
				break;
			case 2:
				manager.clearMovies();
				break;
			case 3:
				List<Movie> movies = manager.getMovies();
				for (Movie movie : movies)
					System.out.println(movie);
				break;
			case 4:
				manager.saveMovies();
				break;
			case 5:
				flag = false;
				System.out.println("Ended!!");
				break;
			default:
				System.out.println("Enter correct number");
			}
		}

	}
}
