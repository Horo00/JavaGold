package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapSample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("A","A");
		BiFunction<String, String,String> f =(s1,s2) -> s1.toLowerCase();
		map.compute("A", f );
		map.compute("B", f);
		map.computeIfPresent("C", f);
		map.computeIfAbsent("C", (s) -> "1");
		
		System.out.println(map);
	}
}
