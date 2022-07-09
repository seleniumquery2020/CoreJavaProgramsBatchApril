package collectionFramewok;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		LinkedHashMap map = new LinkedHashMap();
		map.put("Girl", "Supriya");
		map.put(2, 1.18);
		map.put(true, "Pragati");
		map.put(3.11, 'P');
		map.put(null, "Hello");
		map.put(2, 9000);

		System.out.println("Original Map : " + map);

		map.replace(3.11, "Java");
		map.replace(null, "Hello", "Hi");
		System.out.println("Updated Map : " + map);

		System.out.println("Size of map = " + map.size());

		Set<Map.Entry> entry = map.entrySet();

		for (Entry en : entry) {

			System.out.println(en.getKey() + "------" + en.getValue());
		}
	}
}
