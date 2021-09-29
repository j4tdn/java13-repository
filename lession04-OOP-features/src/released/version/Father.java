package released.version;
/**
 * Inteface consists of
 * +abstract method >> no body
 * +defalt method >> body
 * +static method >> bode
 *
 */
public interface Father {
	void adn();
	//could be override
	default void playSport() {
		System.out.println("Father >> football");
	}
	//Hàm static không thể override ( non override)
	static void drinkBeer(int quantity) {
		money();
		System.out.println("Father >> drinks" + quantity + "bottles") ;
	}
	private static void money() {
		System.out.println("Father >> 500");
	}
	
}
