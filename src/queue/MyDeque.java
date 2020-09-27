package queue;

public class MyDeque<e> {
	Node<e> head,tail;
	
	public static class Node<e> {
		
		public e data;
		public Node<e> prev,next;
		public Node(e data){
			this.data = data;
			this.prev = this.next = null;
		}
		
	}
	public void offerFirst(e in) {
		Node<e> toAdd = new Node<>(in);
		if(head == null) {
			head = tail = toAdd;
			return;
		}
		head.next = toAdd;
		toAdd.prev = head;
		head = toAdd;
	}
	public void offerLast(e in) {
		Node<e> toAdd = new Node<>(in);
		if(tail == null) {
			head = tail = toAdd;
			return;
		}
		tail.prev = toAdd;
		toAdd.next = tail;
		tail = toAdd;
	}
	public void addFirst(e in) {
		offerFirst(in);
	}
	public void addLast(e in) {
		offerLast(in);
	}
	public e pollFirst() {
		if(tail == null){
			return null;
		}
	Node<e> toRemove = head;
	if( tail==head){
		tail=head=null;
		return toRemove.data;}
	head = head.prev;
	toRemove.prev = head.next = null;
	
	if(head == null) {
		tail = null;
	}
	return toRemove.data;
	}
	public e pollLast() {
		if(head == null){
			return null;
		}
	Node<e> toRemove = tail;
	if( tail==head){
		tail=head=null;
		return toRemove.data;}
	tail = tail.next;
	toRemove.next = tail.prev = null;
	
	if(tail == null) {
		head = null;
	}
	return toRemove.data;
	}
	public e removeFirst() throws NullPointerException {
		e dat = pollFirst();
		if(dat == null) {
			throw new NullPointerException("queue is empty,cant delete the element from head");
		}
		else {
		return dat;}
	}
	public e removeLast() throws NullPointerException {
		e dat = pollLast();
		if(dat == null) {
			throw new NullPointerException("queue is empty,cant delete the element from tail");
			} 
		else {
		return dat;}
	}
	public e peekFirst() {
		if(head == null)
			return null;
		return head.data;
	}
	public e peekLast() {
		if(tail == null)
			return null;
		return tail.data;
	}
	public e getFirst() throws NullPointerException{
		if(peekFirst() == null) {
			throw new NullPointerException("queue is empty,cant see it through from head");
		} 
		else {
		return peekFirst();}
	}
	public e getLast() throws NullPointerException{
		if(peekLast() == null) {
			throw new NullPointerException("queue is empty,cant see it through from tail");
		}
		else {
		return peekLast();}
	}
}
