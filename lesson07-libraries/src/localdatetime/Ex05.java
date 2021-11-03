package localdatetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.TimeZone;

public class Ex05 {
	public static void main(String[] args) {
		System.out.println("default: " + TimeZone.getDefault());

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("system dateTime: " + dateTime);

		LocalDateTime euTime = LocalDateTime.now(ZoneId.of("America/Thule"));
		System.out.println("system dateTime: " + euTime);
		
		System.out.println("===================================");
		String[] zoneIds = TimeZone.getAvailableIDs();
		for(String zoneId: zoneIds) {
			System.out.println(zoneId);
		}
	}

}
