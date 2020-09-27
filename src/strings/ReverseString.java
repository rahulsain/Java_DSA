package strings;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string you want to reverse");
		String array = sc.nextLine();
		String[] word = array.split(" ");
		String revWord = "";
		for(int i =word.length-1; i>=0; i--) {
			if(!(word[i].isEmpty())) 
				revWord = revWord.concat(word[i] + " ");
		}
		System.out.println(revWord);
        sc.close();
	}

}
