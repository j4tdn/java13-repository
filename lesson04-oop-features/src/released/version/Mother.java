package released.version;

public interface Mother {
	void adn();
	
	// same name as Father#playSport
	default void playSport() {
		System.out.println("Mother >> badminton ...");
	}
	
	static void drinkBeer(int qty) {
		System.out.println("Mother drinks " + qty + " bottles");
	}
}
