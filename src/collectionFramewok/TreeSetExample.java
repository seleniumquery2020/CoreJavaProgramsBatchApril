package collectionFramewok;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		TreeSet<Integer>  tree = new TreeSet<Integer> ();

		tree.add(1);
		tree.add(5);
		tree.add(4);
		tree.add(2);
		tree.add(3);

		System.out.println("TreeSet = " + tree);

		PriorityQueue queue = new PriorityQueue();
		queue.offer(45);
		queue.offer(91);
		queue.add(52);
		queue.offer(63);
		queue.add(8);

		tree.addAll(queue);

		System.out.println("updated TreeSet = " + tree);

		System.out.println("Ceiling of 50 = " + tree.ceiling(50)); // same method higher(50)//return same or greatest
																	// value

		System.out.println("Floor of 10 = " + tree.floor(10)); // same method lower(10) //return same or smallest value

		NavigableSet set = tree.descendingSet();

		// System.out.println("Descending Set = "+set);

		Iterator<Integer> itr = tree.descendingIterator();

		while (itr.hasNext()) {
			
			System.out.println(itr.next());

		}

		System.out.println("First or lowset value = " + tree.first());

		System.out.println("HeadSet = " + tree.headSet(45,false));

		System.out.println("TailSet = " + tree.tailSet(8));

		SortedSet set1 = tree.subSet(1, 8);
		System.out.println("Sub set = " + set1);

		System.out.println(tree.pollFirst()); // first value read and remove

		System.out.println(tree.pollLast()); // last value read and remove

		System.out.println("updated TreeSet = " + tree);

	}

}
