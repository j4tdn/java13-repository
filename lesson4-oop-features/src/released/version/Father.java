package released.version;

public interface Father {
void adn();
default void playSport() {
	System.out.println("Father >> football");
}
static void drinkBeer(int quantity) {
	money();
	System.out.println("Father >> drink "+ quantity+" privatebottles" );
}
static private void money() {
	System.out.println("Father >> 500K");
}
}
