package lists;

public class MyStack<e> {
	MyLinkedList<e> ll = new MyLinkedList<>();
	
	void push(e a) {
		ll.add(a);
	}
	
	public e pop() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("cannot pop empty stack!");
		}
		return ll.removeLast();
	}
	public e peek() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("cannot peek empty stack!");
		}
		return ll.getLast();
	}

	public boolean empty() {
		// TODO Auto-generated method stub
		return ll.isEmpty();
	}

	public boolean search(e a) {
		// TODO Auto-generated method stub
		return ll.contains(a);
	}

}
