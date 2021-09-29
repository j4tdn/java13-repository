package released.version;
/**
 * Interface consists of
 * + abstract method >> no body
 * + default method >> body
 * + static method >> body
 * + private method
 */
public interface Father {
	void adn();
	
	// could be override
	// public default void playSport()
	default void playSport() { // default isn't access modified
		System.out.println("Father >> football"); // JAVA08
	}
	
	// similar to attribute, couldn't override
	// public static void drinkBeer(int quantity)
	static void drinkBeer(int quantity) {		  // JAVA08
		money();
		System.out.println("Father >> drink " + quantity + "bottles");
	}
	
	// couldn't override
	private static void money() {                 // JAVA09
		System.out.println("Father >> 500K");
	}
}
