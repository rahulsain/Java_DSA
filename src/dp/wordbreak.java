import java.util.Arrays;
import java.util.List;
 
class Main
{
    // Function to segment given string into a space-separated
    // sequence of one or more dictionary words
 
    public static void wordBreak(List<String> dict, String word, String out)
    {
        // if the end of the string is reached,
        // print the output string
 
        if (word.length() == 0)
        {
            System.out.println(out);
            return;
        }
 
        for (int i = 1; i <= word.length(); i++)
        {
            // consider all prefixes of the current string
            String prefix = word.substring(0, i);
 
            // if the prefix is present in the dictionary, add it to the
            // output string and recur for the remaining string
 
            if (dict.contains(prefix)) {
                wordBreak(dict, word.substring(i), out + " " + prefix);
            }
        }
    }
 
    // Word Break Problem Implementation in Java
    public static void main(String[] args)
    {
        // List of strings to represent a dictionary
        List<String> dict = Arrays.asList("this", "th", "is", "famous", "Word",
            "break", "b", "r", "e", "a", "k", "br", "bre", "brea", "ak", "problem");
 
        // input string
        String word = "Wordbreakproblem";
 
        wordBreak(dict, word, "");
    }
}
