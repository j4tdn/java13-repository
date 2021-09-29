package released.version;
/**
 * Interface consists of
 * + Abstract method >> no body
 * + default method >> body
 * + static method >> body
 * + private method
 * >> 1 ham static thi khong the override duoc
 */
public interface Father {
	void adn();
	
	// could be override
	default void playSport() {
		System.out.println("Father >> football");
	}
	
	// similar to attribute, couldn't
	static void drinkBeer(int quantity) {
		money();
		System.out.println("Father >> drink " + quantity +"bottles");
	}
	
	// couldn't
	private static void money() {
		System.out.println("Father >> 500K");
	}
}
