package ex05;

public class ShoppingUtils {
	public static float getTotalMoney(Shopping shopping) {
		float totalMoney = 0f;
		for(TextBook textBook : shopping.getTextBooks()) {
			 totalMoney += textBook.getPriceTextBook();
		}
		for(ReferBook refBook : shopping.getReferBooks()) {
			 totalMoney += refBook.getPriceRefBook();
		}
		return totalMoney;
	}
}
