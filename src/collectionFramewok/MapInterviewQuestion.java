package collectionFramewok;

import java.util.HashMap;

//Input:- passage
/* output :-
p = 1
a = 2
s = 2
g = 1
e = 1
*/
public class MapInterviewQuestion {

	public static void main(String[] args) {

		String s = "passage";

		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();

		char[] ch = s.toCharArray();

		int count = 1;

		for (int i = 0; i < ch.length; i++) {

			if (hashmap.containsKey(ch[i])) {

				hashmap.put(ch[i], hashmap.get(ch[i]) + 1);
			} else {
				hashmap.put(ch[i], count);
			}
		}

		hashmap.forEach( (k, v) -> System.out.println(k + "=" + v) );

	}

}
