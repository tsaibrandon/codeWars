/*
Instructions:
Write a function to split a string and convert it into an array of words.

Examples(Input ===> Output)

*/


// My Answer
public class Solution {

    public static String[] stringToArray(String s) {
      String[] words = new String[s.length()];
      
      for(int i = 0; i < s.length(); i++) {
        words[i] = s[i];
      }
      
      return words;
    }

}


// Other Correct/Interesting Answers
public class Solution {
    public static String[] stringToArray(String s) {
        return s.split(" ");
    }
}