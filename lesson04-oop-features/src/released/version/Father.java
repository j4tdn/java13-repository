package released.version;

/*
 * Interface consist of
 * + abstract method 
 * + default method >> body
 * + static method >> body
 * + private method >> body
 */
public interface Father {
	void adn();
	
	//could be override
	default void playSport() {
		System.out.println("Father >> football");
	}
	
	//similar attribute >> couldn't override
	public static void drinkAcohol(int quantity) {
		money();
		System.out.println("Father >> drink: " + quantity + "bottles");
	}
	
	//couldn't override
	private static void money() {
		System.out.println();
	}
}
