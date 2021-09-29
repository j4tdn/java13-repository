package released;

/**
 * Interface consists of 
 * + abstract method >> no body
 * + default method >> body
 * + static method  >> body
 */
public interface Father {
	void adn();
	
	default void playSport() {
		System.out.println("Father >> football");
	}
	
	static void drinkBeer(int quantity) {
		money();
		System.out.println("Father >> drink " + quantity + "bottles");
	}
	private static void money() {
		System.out.println("Father >> 500k");
	}

}
