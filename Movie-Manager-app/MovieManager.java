package com.monocept.model;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MovieManager {

	private List<Movie> movies;
	private static final String FILEPATH_STRING = "D:\\Mono_java_04\\java\\33-movie-manager\\src\\com\\monocept\\model\\MovieData.txt";

	public MovieManager() {
		super();
		this.movies = new ArrayList<Movie>();
		laodMovies();
	}

	private void laodMovies() {
		Movie movie;
		try {
			FileInputStream iStream = new FileInputStream(FILEPATH_STRING);
			ObjectInputStream in = new ObjectInputStream(iStream);
			Object object = null;
			while ((object = in.readObject()) instanceof EndofFile == false) {

				movie = (Movie) object;
				movies.add(movie);

			}
			in.close();

		} catch (Exception e) {
//			System.out.println(e);
		}

	}

	public void saveMovies() {
		try {

			FileOutputStream oStream = new FileOutputStream(FILEPATH_STRING);
			ObjectOutputStream out = new ObjectOutputStream(oStream);
			for (Movie movie : movies) {
				out.writeObject(movie);
				out.flush();
			}
			out.writeObject(new EndofFile());
			out.flush();
			out.close();

			System.out.println("Saved successfully");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void addMovie(Movie movie) {
		movies.add(movie);
	}

	public List<Movie> getMovies() {

		return movies;
	}

	public void clearMovies() {

		movies.clear();
		try {
			new FileOutputStream(FILEPATH_STRING).close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Cleared movies successfully");

	}

}
