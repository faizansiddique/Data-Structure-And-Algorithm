package heap;

import java.util.PriorityQueue;

public class PriorityQueueMain {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		pq.add(25);
		pq.add(-22);
		pq.add(1343);
		pq.add(54);
		pq.add(0);
		pq.add(-4532);
		pq.add(255);

		Object[] ints = pq.toArray();
		for (Object num : ints) {
			System.out.print(num);
			System.out.print(",");
		}
		
		System.out.println(pq.peek());
		System.out.println(pq.remove());
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.peek());

		Object[] ints1 = pq.toArray();
		for (Object num : ints1) {
			System.out.println(num);
		}
	}

}
