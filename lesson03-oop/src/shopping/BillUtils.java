package shopping;
/**
 * Class used for doing functions of Bill
 * @author vietdev
 *
 */
public class BillUtils {
	private BillUtils() {
		
	}
	public static double getTotalPrice(Bill bill) {
		double toTal = 0d;
		for (PhoneDetails pD : bill.getPhoneDetails()) {
			double pDCost = pD.getPhone().getPrice() * pD.getQuantity();
			if (bill.getDateTime().getDayOfMonth() == 8 && bill.getDateTime().getMonthValue() == 5 && pD.getPhone().getPrice() > 590) {
				pDCost *= 0.9;
			}
			toTal+=pDCost;
		}
		return toTal;
	}
	public static String getAllPhoneDetails(Bill bill) {
		String str = "";
		for (PhoneDetails pD : bill.getPhoneDetails()) {
			str += pD.toString() + "\n";
		}
		return str;
	}
}
