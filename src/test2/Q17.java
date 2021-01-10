package test2;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Q17 {

	public static void main(String[] args) {
		ZonedDateTime zdt = ZonedDateTime.now(ZoneOffset.UTC);
		System.out.println(zdt.toInstant());
	
	}
}
