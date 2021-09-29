package releases.version;

public interface Mother {
	void adn();
	
	//same name as Father
	default void playSport() {
		System.out.println("Mother >> Badminton...");
	}
	 static void drinkBeer(int quantity) {
		 System.out.println("Mother drinks "+ quantity + " bottles");
	 }
}
