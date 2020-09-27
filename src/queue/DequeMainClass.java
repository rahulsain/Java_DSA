package queue;

public class DequeMainClass {

	public static void main(String[] args) {
		MyDeque<Integer> deq = new MyDeque<>();
		deq.addFirst(56);
		deq.addLast(83);
		deq.addLast(47);
		deq.addFirst(13);
		deq.addLast(92);
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		System.out.println(deq.pollFirst());
		System.out.println(deq.peekLast());
		deq.addFirst(56);
		deq.addLast(83);
		deq.addLast(47);
		System.out.println(deq.getLast());
		deq.addFirst(13);
		deq.addLast(92);
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		System.out.println(deq.pollFirst());
		System.out.println(deq.peekLast());
		System.out.println(deq.removeFirst());
		System.out.println(deq.getFirst());
		System.out.println(deq.removeLast());
//		System.out.println(deq.getLast());
		System.out.println(deq.peekFirst());
	}

}
