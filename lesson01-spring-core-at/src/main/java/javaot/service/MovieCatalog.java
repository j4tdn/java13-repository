package javaot.service;

import org.springframework.context.annotation.Bean;

import javaot.common.Catalog;

public class MovieCatalog {

	private Catalog catelog;

	public MovieCatalog(Catalog catelog) {
		this.catelog = catelog;
	}

	
	public void showMovie() {
		switch (catelog) {
		case ACTION:
			System.out.println("We recommend You watching ACTION 234 movie");
			break;
		case ADVENTURE:
			System.out.println("We recommend You watching ADVENTURE 159 movie");
			break;
		default:
			System.out.println("Unknown catalog ...");
		}
	}
}
