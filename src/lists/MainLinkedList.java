package lists;

import java.util.*;

public class MainLinkedList {
	public static void getTime(List<Integer> list){
		long start = System.currentTimeMillis();
		for(int i = 0; i<1000; i++) {
//			ll.add(i+"added");
//			i *= 10;
//			l1.add(true);
////			i += 1000;
//			l2.add(i);
			list.add(i);
			
			
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getName()+" --> "+(end-start));
	}

	public static void getTime1(MyLinkedList<Integer> l3){
		long start = System.currentTimeMillis();
		for(int i = 0; i<100; i++) {
//			ll.add(i+"added");
//			i *= 10;
//			l1.add(true);
////			i += 1000;
//			l2.add(i);
			l3.add(i);
			
			
		}
		long end = System.currentTimeMillis();
		System.out.println("mylinkedlist --> "+(end-start));
	}
	public static void main(String[] args) {
		MyLinkedList<Integer> ll = new MyLinkedList<>();
		MyLinkedList<Integer> ll1 = new MyLinkedList<>();
		ll1.add(3945);
		ll1.add(83);
		ll1.add(69);

//		List<Integer> l1 = new ArrayList<>();
//		List<Integer> l2 = new LinkedList<>();
		
//		getTime(l1);
//		getTime(l2);
//		System.out.println(ll.size());
		getTime1(ll);
		ll.addAll(ll1);
		ll.removeAll(ll1);
		int newA[] = new int[ll.size()];
		newA = ll.toArray();
//		ll.print();	
//		System.out.println(ll.size()+" "+ll.contains(0));
//		ll.remove(1);
//		ll.print();	
//		System.out.println(ll.size()+" "+ll.contains(0));
//		ll.remove(30);
//		ll.print();
//		System.out.println(ll.size()+" "+ll.contains(30));
//		ll.remove(94);
//		ll.print();
//		System.out.println(ll.size()+" "+ll.contains(31));
//		ll.remove(30);
////		System.out.println(ll.size());
		for(int i = 0; i<ll.size(); i++) {
			System.out.print(newA[i]+" ");}
//		ll.print();	
//		System.out.println(ll.size()+" "+ll.contains(31));
//		ll.remove(88);
//		ll.print();
//		System.out.println(ll.size());
//		ll.clear();
		ll.print();


		 
		
////		System.out.println(l1+ " "+l2);
		
	}

}
