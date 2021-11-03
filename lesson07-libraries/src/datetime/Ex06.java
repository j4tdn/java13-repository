package datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.TimeZone;

public class Ex06 {
	// Time zone
	public static void main(String[] args) {
		System.out.println("dafault: " + TimeZone.getDefault());
		
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println("datetime: " + datetime);
		
		LocalDateTime euTime = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
		System.out.println("euTime dateTime: " + euTime);
		
		System.out.println("==========================");
		String[] zoneIds = TimeZone.getAvailableIDs();
		for(String zoneId: zoneIds) {
			System.out.println(zoneId);
		}
	}
}
