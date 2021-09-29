package released.version;


public interface Father {
	void adn();
	
	default void playSport() {
		System.out.println("Father >> football");
	}
	
	static void drinkBeer(int quantity) {
		money();
		System.out.println("Father >> drinks" + quantity + "bottles");
	}
	
	private static void money() {
		System.out.println("Father >> 500k");
	}
}
