package javaot.service;

import javaot.common.Catalog;

public class MovieCatalog {
	private Catalog catalog;

	public MovieCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

	public void showMovie() {
		switch (catalog) {
		case ACTION:
			System.out.println("This catalog is for Action movie");
			break;
		case ADVENTURE:
			System.out.println("This catalog is for Adventure movie");
			break;
		default:
			System.out.println("Unknown catalog");
		}
	}
}
