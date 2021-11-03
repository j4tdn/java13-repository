package datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.TimeZone;

import com.sun.org.apache.xalan.internal.xsltc.dom.AbsoluteIterator;

public class Ex06 {
	public static void main(String[] args) {
		System.out.println("default: "+TimeZone.getDefault());
		
		LocalDateTime dateTime =LocalDateTime.now();
		System.out.println("system dateTime: "+dateTime);
		
		LocalDateTime euTime =LocalDateTime.now(ZoneId.of("Atlantic/Faroe"));
		System.out.println("euTime: "+euTime);
		
		System.out.println("==================");
		String [] zoneIds=TimeZone.getAvailableIDs();
		for(String zoneid:zoneIds) {
			System.out.println(zoneid);
		}
	}
}
