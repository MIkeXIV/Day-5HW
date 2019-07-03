package dateTimeApiProblems;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class DateAndTime {
	
	// answer to question one in LocalDateTime class used in conjunction with Period
	
	public void findPreviousThursday(LocalDate date) {
		LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
	}

	// zoneld is a representation of a time zone. has fixed offset and a set offset for different time zones
	// zone offset extends zoneld and defines the fixed offset fo the current time zone to GMT time zone i.e. +02:00
	
	public void convertInstanttoZonedDateTime() {
		
		Instant instant = Instant.now();
		System.out.println(instant);
		
		ZonedDateTime jpTime = instant.atZone(ZoneId.of("Asia/Tokyo"));
		System.out.println(jpTime.getOffset());		
	}
	
	public void getLengthofMonthinYear(dtype year) { // need the class here for dtype
		YearMonth yearMonthObject = YearMonth.of(1999, 2);
		int daysInMonth = yearMonthObject.lengthOfMonth();
	}
	
	
}
