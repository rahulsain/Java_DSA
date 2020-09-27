package queue;

import lists.MyLinkedList.Node;

public class MyQueue <e> {
	private Node<e> head,rear;
	
	public void enqueue(e a) {
		Node<e> toAdd = new Node<>(a);
		if(head == null) {
			head = rear = toAdd;
			return;
		}
		rear.next = toAdd;
		rear = rear.next;
	}
	public e dequeue() {
		Node<e> temp = head;
		if(head == null) {
			
			return null;
		}
		
		head = head.next;
		if(head == null)
			rear = null;
		return temp.data;
	}
	public e peek() {
		if(head == null)
			return null;
		return head.data;
	}
}
