package collectionFramewok;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
//Insertion order maintain,null value is not allowed
public class ArrayDequeExample {

	
	public static void main(String[] args) {
		
		ArrayDeque queue = new ArrayDeque();
		queue.offer(45);
		queue.offer(91);
		queue.add(45);
		queue.offer(63);
		queue.add(8);
		queue.add('a');
		queue.add("java");
		
		
		System.out.println(queue);
		
		queue.addFirst("first");
		queue.addLast("last");
		
		System.out.println("updated queue = "+queue);
		
		System.out.println("element method = "+queue.element());
		System.out.println("updated queue = "+queue);
		
				
	}
}
