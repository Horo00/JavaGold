package chap6;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class NowSample {
	public static void main(String[] args) {
//		System.out.println(LocalDate.now());
//		System.out.println(LocalTime.now());
//		System.out.println(LocalDateTime.now());
//
//		for (Month month : Month.values()) {
//			System.out.println(month);
//			System.out.println(month.getValue());
//			System.out.println(month.ordinal());
//			System.out.println("-------------------");
//		}
//
//		System.out.println(LocalDate.of(2020, 12, 11));
//		System.out.println(LocalDate.of(2020, Month.JANUARY, 31));
//
//		for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
//			System.out.println(dayOfWeek);
//			System.out.println(dayOfWeek.getValue());
//			System.out.println(dayOfWeek.ordinal());
//
//		}
//
//		System.out.println(LocalDateTime.now());
//		System.out.println(LocalDate.from(LocalDateTime.now()));
//
//		OffsetDateTime offsetDateTime = OffsetDateTime.now();
//		System.out.println(offsetDateTime);
//		ZonedDateTime zonedDateTime = ZonedDateTime.now();
//		System.out.println(zonedDateTime);
//		System.out.println(LocalDateTime.from(offsetDateTime));
//		System.out.println(LocalDateTime.from(zonedDateTime));
//
//		for (ChronoUnit chronoUnit : ChronoUnit.values()) {
//			System.out.println(chronoUnit.name());
//			System.out.println(chronoUnit.ordinal());
//
//		}
		LocalDateTime localDate = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println(localDate);
		System.out.println(localDate.until(localDate.plus(100,ChronoUnit.DAYS),ChronoUnit.MILLIS));

		System.out.println(ChronoUnit.DAYS.addTo(localDate, 10));

		System.out.println(ZoneId.systemDefault());

		System.out.println(Period.between(LocalDate.now(),LocalDate.from(localDate.plus(100,ChronoUnit.DAYS))).getYears());
		
		DateTimeFormatter dtf = DateTimeFormatter.ISO_OFFSET_DATE;
		System.out.println(dtf.format(ZonedDateTime.now()));
		
		dtf = DateTimeFormatter.ofPattern("y年M月d日");
		System.out.println(dtf.format(ZonedDateTime.now()));
		
		Instant in = Instant.now();
		System.out.println(in);
//		LocalDateTime.now().toInstant();
		in = ZonedDateTime.now().toInstant();
		System.out.println(in.getEpochSecond());
		in = Instant.ofEpochSecond(100000000);
		System.out.println(in);
		
		in = Instant.EPOCH;
		System.out.println(in);
		Date date = new Date();
		System.out.println(	LocalDateTime.ofInstant(date.toInstant() , ZoneId.systemDefault()));
		System.out.println(localDate.atZone(ZoneId.systemDefault()));
		
		System.out.println(LocalDateTime.now().toInstant(ZoneOffset.from(localDate.atZone(ZoneId.systemDefault()))));
		
		
	}
}
