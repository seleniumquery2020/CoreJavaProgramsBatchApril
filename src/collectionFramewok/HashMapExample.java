package collectionFramewok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put("Girl", "Supriya");
		map.put(2, 1.18);
		map.put(true, "Pragati");
		map.put(3.11, 'P');
		map.put(null, "Hello");

		System.out.println("Original Map : " + map);

		System.out.println("Key 'true' is present in Map : " + map.containsKey(true));

		System.out.println("Value 'p' is present in Map : " + map.containsValue('P'));

		Set setEntry = map.entrySet();

		for (Object e : setEntry) {
			System.out.println(e);
		}

		map.forEach( (k, v) -> System.out.println(k + " " + v));

		Set setOfKey = map.keySet();

		for (Object e : setOfKey) {

			System.out.println(map.get(e));
		}

		Collection setOfValue = map.values();

		for (Object e : setOfValue) {

			System.out.println(e);
		}

	}

}
