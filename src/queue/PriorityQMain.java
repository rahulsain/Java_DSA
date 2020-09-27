package queue;

import java.util.PriorityQueue;

public class PriorityQMain {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("hello ji");
		pq.add("modi ji");
		pq.add("sharma ji");
		pq.add("taneja ji");
		pq.add("parle g");
		pq.add("pubg");
		
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
//		System.out.println(pq.remove());

	}

}
