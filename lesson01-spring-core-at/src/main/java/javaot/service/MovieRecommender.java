package javaot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MovieRecommender {
	@Autowired
	@Qualifier("actionMovie")
	private MovieCatalog movieCatalog;
	
    public void recommend(){
        System.out.println("MovieRecommender ->> unknown");
    }

	public MovieCatalog getMovieCatalog() {
		return movieCatalog;
	}

	public void setMovieCatalog(MovieCatalog movieCatalog) {
		this.movieCatalog = movieCatalog;
	}
}
