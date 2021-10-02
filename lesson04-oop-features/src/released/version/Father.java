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
	default void playSport() {
		System.out.println("Father >> football");
	}
	
	// similar to attribute => cannot override
	// Reason:
	// + Parent p = new Child;
	// + Construct object => BUT "static" is not dependent on Object
	static void drinkBeer(int quantity) {
		money();
		System.out.println("Father >> drink" + quantity + "bottles");
		
	}
	
	// cannot override (because of static)
	// wanna call "money()" => must add "static" below
	private static void money() {
		System.out.println("Father >> 500K");
	}

}
