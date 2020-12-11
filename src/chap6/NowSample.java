package chap6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class NowSample {
	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());

		for (Month month : Month.values()) {
			System.out.println(month);
			System.out.println(month.getValue());
			System.out.println(month.ordinal());
			System.out.println("-------------------");
		}
		
		System.out.println(LocalDate.of(2020, 12, 11));
		System.out.println(LocalDate.of(2020, Month.FEBRUARY, 31));

	}

}
