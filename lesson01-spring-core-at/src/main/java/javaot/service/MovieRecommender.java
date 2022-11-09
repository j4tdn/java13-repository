package javaot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// MovieRecommender as a bean('movieRecommender')
// Restrict --> initial bean via empty constructor
// Require --> scan
// bean
@Component
public class MovieRecommender {
	
	// unique --> initActionMovie, initAdventureMovie
	// <property name='movieCatalog' ref='initActionMovie' />
	@Autowired
	@Qualifier("initAdventureMovie") 
	private MovieCatalog movieCatalog;
	
	public void recommend() {
		movieCatalog.showMovie();
	}
}
