package javaot.service;

public class MovieServiceImpl implements MovieService{

	public void addMovie() {
		System.out.println("MovieServiceImpl ----> addMovie ###");		
	}

	public void updateMovie() {
		System.out.println("MovieServiceImpl ----> updateMovie ###");		
		
	}

	public String getMovie() {
		return "MovieServiceImpl ----> getMovie ###";
	}

	public void validateMovie() throws Exception {
		System.out.println("MovieServiceImpl ----> validateMovie ###");		
	}
	

}
