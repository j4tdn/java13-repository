package shopping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * Phone selling application
 * 
 * @author vietdev
 *
 */
public class Main {
	public static void main(String[] args) {
		/* Create Customers */
		Customer c1 = new Customer("Adam", "123", "456", "NewYork");
		Customer c2 = new Customer( "Kate", "243", "789","California");

		/* Create Phones */
		Phone i1 = new Phone("SS10+", "Android", "Black", 620d);
		Phone i2 = new Phone("SS20U", "Android", "Green", 840d);
		Phone i3 = new Phone("IP4", "IOS", "White", 280d);
		Phone i4 = new Phone("IP12", "IOS", "Black", 880d);
		Phone i5 = new Phone("WP8", "WindowPhone", "Blue", 560d);
		
		
		/* Customer ordering phones */
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		Bill b1 = new Bill(c1,
				new PhoneDetails[] { new PhoneDetails(i1, 3), new PhoneDetails(i4, 1), new PhoneDetails(i2, 1) },
				LocalDateTime.parse("08-05-2021 10:10:10", df));
		Bill b2 = new Bill(c2, new PhoneDetails[] { new PhoneDetails(i3, 2), new PhoneDetails(i5, 1) },
				LocalDateTime.parse("07-05-2021 20:10:12", df));
		Bill b3 = new Bill(c2, new PhoneDetails[] { new PhoneDetails(i4, 1) },
				LocalDateTime.parse("08-05-2021 09:10:10", df));
		
		System.out.println("+ Bill 1: \n" + b1);
		System.out.println("+ Bill 2: \n" + b2);
		System.out.println("+ Bill 3: \n" + b3);
		
	}
}
