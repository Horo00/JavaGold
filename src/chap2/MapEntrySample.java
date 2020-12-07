package chap2;

import java.util.HashMap;
import java.util.Map;

public class MapEntrySample {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Allen");
		map.put(2, "Bill");
		map.put(3, "Charles");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.out.println(map.values());

	}

}
