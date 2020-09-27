package lists;

public class MainStackClass {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		MyStack<Integer> stack = new MyStack<>();
		stack.push(89);
		stack.push(6);
		stack.push(849);
		System.out.println(stack.search(6));
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
//		System.out.println(stack.peek());
//		System.out.println(stack.pop());
		System.out.println(stack.search(36));
	}

}
