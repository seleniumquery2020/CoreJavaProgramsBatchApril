package collectionFramewok;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put(6, "Supriya");
		map.put(8, 1.18);
		map.put(1, "Pragati");
		map.put(9, 'P');
		map.put(10, "Hello");
		
		
		TreeMap treeMap = new TreeMap();
		
		treeMap.put(5, "Supriya");
		treeMap.put(4, 850);
		treeMap.put(7, 12345);
		treeMap.put(3, true);
		treeMap.put(2, "Hello");
		
		System.out.println("Original Map : " + treeMap);
		treeMap.putAll(map);
		
		System.out.println("Updated Map : " + treeMap);
		
		System.out.println("Ceiling Method : "+treeMap.ceilingKey(10));
		
		
		
	}
}
