package ex01;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import utils.DayAsString;
/**
 * Bài 1: Xây dựng ứng dụng The Ultimate Relationship Calculator Nhập thời gian
 * bắt đầu hẹn hò của 2 người. Nếu đã chia tay, nhập ngày chia tay ngược lại lấy
 * thời gian hiện tại Nhấn Enter để thực hiện tính toán. Hỏi Ngày bắt đầu hẹn họ
 * là ngày thứ mấy. Mối tình đã bắt đầu được bao nhiêu năm, tháng, ngày, giờ,
 * phút, giây
 */
public class UltimateRelationshipCalculatorv2 {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
		LocalDateTime start = LocalDateTime.parse("07:30:20 21/01/2018", dtf);
		LocalDateTime end = LocalDateTime.parse("01:00:15 30/07/2020", dtf);
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Ngày bắt đầu hẹn hò là thứ: " + getDayofWeek(now.getDayOfWeek().getValue()));
		
		if (start.isAfter(end)) {
			throw new IllegalArgumentException("dateStart cannot exceed dateEnd!!!");
		}
		
		LocalDate startDate = start.toLocalDate();
		LocalDate endDate = end.toLocalDate();
		
		LocalTime startTime= start.toLocalTime();
		LocalTime endTime= end.toLocalTime();
		
		
		Duration duration = Duration.between(startTime, endTime);
		
		if (endTime.isBefore(startTime)) {
			duration = duration.plusDays(1);
			endDate = endDate.minusDays(1);
		}
		
		Period period = Period.between(startDate, endDate);
		System.out.println("Mối tình đã bắt đầu được: "
				+ period.getYears() + "năm "
				+ period.getMonths() + "tháng "
				+ period.getDays() + "ngày "
				+ duration.toHoursPart() + "giờ "
				+ duration.toMinutesPart() + "phút "
				+ duration.toSecondsPart() + "giây.");
		
	}
	private static String getDayofWeek(int day) {
		if(day == 7) day = 0;
		DayAsString[] das = DayAsString.values();
		return das[day].toString();
	}
}
