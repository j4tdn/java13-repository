package released.version;

public interface Mother {
	// Không có nội dung thân hàm gọi là "thực thi"
	void adn();
	
	// Có nội dung thân hàm => gọi là "kế thừa"
	// same name as Father#playSport
	default void playSport() {
		System.out.println("Mother >> badminton ...");
	}
	
	static void drinkBeer(int qty) {
		System.out.println("Mother drinks " + qty + " bottles");
	}

}
