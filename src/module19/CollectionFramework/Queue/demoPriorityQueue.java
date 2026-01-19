package module19.CollectionFramework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class demoPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(10);
		pq.offer(15);
		pq.offer(26);
		pq.offer(7);
		pq.offer(13);
		pq.offer(10);
		pq.offer(14);
//		pq.offer(null); NullPointerException
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
	}

}
