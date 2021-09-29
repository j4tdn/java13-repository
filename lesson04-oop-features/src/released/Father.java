package released;

/**
 * Interface consists of 
 * + abstract method >> no body
 * + default method >> body
 * + static method  >> body
 */
public interface Father {
	void adn();
	// could be override
	default void playSport() {
		System.out.println("Father >> football");
	}
	// similar to attribute , couldn't override
	static void drinkBeer(int quantity) {
		money();
		System.out.println("Father >> drink " + quantity + "bottles");
	}
	//hàm private k override đk
	private static void money() {
		System.out.println("Father >> 500k");
	}

}
