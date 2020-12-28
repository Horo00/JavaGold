package test2;

import java.util.HashMap;
import java.util.Map;

public class Q32 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("X","a");
		map.put("Y","A");
		map.entrySet().stream()
			.sorted(Map.Entry.comparingByValue(String.CASE_INSENSITIVE_ORDER))
			.forEach(System.out::println);
	}
}
