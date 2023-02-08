package com.monocept.test;

import com.monocept.model.MovieController;
import com.monocept.model.MovieManager;

public class MovieTest {

	public static void main(String[] args) {
		
		MovieController movieController = new MovieController(new MovieManager());
		
		movieController.start();
	}

}
