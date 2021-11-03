package datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Ex06 {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("system dateTime: " + dateTime);
		
		LocalDateTime euTime = LocalDateTime.now(ZoneId.of(null));
	}
}
