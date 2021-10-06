public class ReverseWords{
 
    public static void main(String[] args) {
 
        String inputString = "This is a string whose words are to be reversed";
 
        String outputString = reverseWordsFromString(inputString);
 
        System.out.println("The string with the reversed word is : " + outputString);
 
    }
 
    public static String reverseWordsFromString(String inputString) {
 
        String[] wordsArray = inputString.trim().split("\\s+");
        String stringWithReversedWords = "";
 
        for (String word : wordsArray) {
 
            stringWithReversedWords += reverseWord(word) + " ";
 
        }
        return stringWithReversedWords.trim();
 
    }
 
    public static String reverseWord(String word) {
        String reversedWord = "";
 
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
 
        }
        return reversedWord;
    }
 
}
