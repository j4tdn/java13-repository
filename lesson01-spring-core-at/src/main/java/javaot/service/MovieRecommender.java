package javaot.service;

import org.springframework.stereotype.Component;

// MovieRecommender as a bean('movieRecommender')
// Restrict --> initial bean via empty constructor
// Require --> scan
// bean
@Component
public class MovieRecommender {
	
	public void recommend() {
		System.out.println("Movie recommender >>>> unknown");
	}
}
