package sets;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Set<String> fruits = new TreeSet<>();
		
		fruits.add("banana");
		fruits.add("appla");
		fruits.add("kiwi");
		System.out.println(fruits.add("kiwi"));
		System.out.println(fruits.add("lava"));
		System.out.println(fruits);
	}

}
