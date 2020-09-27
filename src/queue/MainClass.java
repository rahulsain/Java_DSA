package queue;

//import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		MyQueue<Integer> q = new MyQueue<>();
//		
		q.enqueue(98);
		q.enqueue(982);
		q.enqueue(82);
		q.enqueue(92);

		


//		System.out.println(q.remove());
		System.out.println(q.dequeue());
//		System.out.println(q.remove());
		System.out.println(q.peek());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.peek());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.peek());




	}

}
