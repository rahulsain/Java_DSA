package maps;

//import java.util.*;
//import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) {
//		Map<Float,Integer> no = new HashMap<>();
//		
//		no.put(67.0f, 67);
//		no.put(68.0f, 68);
//		no.put(69.0f, 69);
//		
//		Map<Float,Integer> now = new HashMap<>();
//		
//		now.put(71f,81);
//		
//		now.replace(71f,81, 91);
//		no.putAll(now);
//		no.putIfAbsent(61.0f, 64);
//		
//		no.remove(71f,1);
//		
//		System.out.println(no);
//		System.out.println(no.entrySet());
//		
//		Set<Entry<Float,Integer>> entries = no.entrySet();
//		
//		for(Entry<Float,Integer> entry : entries) {
//			entry.setValue(entry.getValue() *10);
//		}
		
		
		
		System.out.println(getHash("CAT"));
	}



public static int getHash(String s) {
	int hash = 0;
	for(int i = 0; i<s.length(); i++) {
		hash +=s.charAt(i);
	}
	return hash;
}
}