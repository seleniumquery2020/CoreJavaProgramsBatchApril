package collectionFramewok;

import java.util.PriorityQueue;
//same datatype value,insertion order is not maintain
public class PriorityQueueExample {
	
	public static void main(String[] args) {
		
		PriorityQueue queue = new PriorityQueue();
		queue.offer(45);
		queue.offer(91);
		queue.add(52);
		queue.offer(63);
		queue.add(8);
		
		System.out.println(queue);
				
	}

}
