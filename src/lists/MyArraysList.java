package lists;

//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArraysList {

	public static void main(String[] args) {
		List<String> laptops = new LinkedList<String>();
		
		
		laptops.add("hp");
		laptops.add("dell");
		laptops.add("acer");
		laptops.add("lenevo");
		laptops.add("mi");
		laptops.add("apple");
		String[] no = new String[laptops.size()];
		
		laptops.toArray(no);
		for(String e: laptops)
		System.out.println(e);
		
		
//		PairClass<String,Integer,Boolean> p1 = new PairClass("rahul",18,true);
//		PairClass<Double,Float,String> p2 = new PairClass(2001.0,18.8,'r');
//		PairClass<Float,String,Boolean> p3 = new PairClass(null,"jeera",false);
//		p1.getDescription();
//		p2.getDescription();
//		p3.getDescription();
//		
	}

}
