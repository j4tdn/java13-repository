package datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.TimeZone;

public class Ex06 {
	public static void main(String[] args) {
		System.out.println("default: " + TimeZone.getDefault());
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("dateTime" + dateTime);
		
		LocalDateTime euTime = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
		System.out.println("dateTime" + euTime);
		
		System.out.println("======================================");
		String[] zoneIDs = TimeZone.getAvailableIDs();
		for(String zoneID : zoneIDs) {
			System.out.println(zoneID);
		}
	}
}
