package javaot.service;

// Step 1: Join Point class
public class MovieService {
	private String name;
	private String catalog;

	public MovieService() {
	}

	public MovieService(String name, String catalog) {
		this.name = name;
		this.catalog = catalog;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	// Join Point methods
	public void printName() {
		System.out.println("++ JOIN POINT MovieService#printName -----> " + name);
	}

	// Join Point methods
	public void printCatalog() {
		System.out.println("++ JOIN POINT MovieService#printCatalog -----> " + catalog);
	}
}
