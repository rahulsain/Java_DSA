package sets;
import java.util.*;

public class SubarraywithZeroSum {

	public static void main(String[] args) {
		int[] a = {-10,12,4,3,1,-32,-19,20};
		boolean found = false;
		int k = 7;
//		for(int i = 0; i<a.length; i++) {
//			int sum = 0;
//			for(int j =i; j<a.length; j++ ) {
//				sum += a[j];
//				if(sum == 0) {
//					found = true;
//					break;
//				}
//			}if(found) break;
//		}
		
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for(int ele : a) {
			set.add(sum);
			sum += ele;
			if(set.contains(sum-k)) {
				found = true;
				break;
			}
		}
		
		System.out.println("found = "+found);
	}

}
