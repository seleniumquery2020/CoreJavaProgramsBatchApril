package collectionFramewok;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		HashSet hashSet = new HashSet();

		hashSet.add(85);
		hashSet.add(true);
		hashSet.add(5.14);
		hashSet.add('a');
		hashSet.add(null);
		hashSet.add(5.14);

		System.out.println("Hash Set = " + hashSet);

		LinkedHashSet set = new LinkedHashSet();
		set.add(50);
		set.add(true);
		set.add("Java");
		set.add('C');
		set.add("Java");

		System.out.println("linked Hash Set = " + set);

		set.addAll(hashSet);
		System.out.println("updated linked Hash Set = " + set);

		Object[] obj = set.toArray();

		for (Object o : obj) {
			System.out.println(o);
		}
	}
}
