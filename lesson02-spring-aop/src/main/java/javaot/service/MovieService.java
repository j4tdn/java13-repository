package javaot.service;

public class MovieService {
	private String name;
	private String catalog;
	
	public MovieService() {
	}
	
	public MovieService(String name, String catalog) {
		this.name = name;
		this.catalog = catalog;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCatalog() {
		return catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}
	
	//Joint Point methods
	public void printName() {
		System.out.println("JOINT POINT printName----> " + name);
	}
	
	public void printCatalog() {
		System.out.println("JOINT POINT printCatalog----> " + catalog);
	}
	
	
}
