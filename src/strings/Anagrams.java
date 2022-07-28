//this is first commit, "with no repetition", where left part is highlight
//this is second commit, "with no repetition", where left part is highlight and highlighted is not changed
//this is third commit, "with repetition", where left part is highlight and highlighted is not changed
//this is fourth commit, "with repetition", where left part is highlight and highlighted is changed
//this is fifth commit, "without repetition with repetition", where left part is highlight and highlighted is changed


package strings;

import java.util.Scanner;

public class Anagrams {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string");
        String arrayOne = sc.nextLine();
        System.out.println("enter second string");
        String arrayTwo = sc.nextLine();
        boolean isAnagram = true;
//			boolean[] visited = new boolean[arrayTwo.length()];
//			if(arrayOne.length() == arrayTwo.length()) {
//				for(int i = 0; i<arrayOne.length(); i++) {
//					char c = arrayOne.charAt(i);
//					isAnagram = false;
//					for(int j = 0; j<arrayTwo.length(); j++) {
//						if(c == arrayTwo.charAt(j) && visited[j] != true) {
//							isAnagram = true;
//							visited[j] = true;
//							break;
//						}
//					}
//					if(!isAnagram) break;
//				}
//			}
        int[] a = new int[256];
        for(char c: arrayOne.toCharArray()) {
            int index = c;
            a[index]++;
        }
        for(char c: arrayTwo.toCharArray()) {
            int index = c;
            a[index]--;
        }

        for(int i = 0; i<256; i++) {
            if(a[i] != 0) {
                isAnagram = false;
                break;
            }
        }
        if(isAnagram)
            System.out.println("anagram");
        else
            System.out.println("not anagram");
        sc.close();
    }

}
