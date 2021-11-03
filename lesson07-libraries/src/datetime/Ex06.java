package datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.TimeZone;

public class Ex06 {
	public static void main(String[] args) {
		System.out.println("default: " + TimeZone.getDefault());
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("system dateTime: " + dateTime);
		
		LocalDateTime euTime = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
		System.out.println(" " + euTime);
		String[] zoneIds = TimeZone.getAvailableIDs();
		for (String zoneId: zoneIds) {
			System.out.println(zoneId);
		}
	}
}
