/*
Instructions:
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H

patrick feeney => P.F

*/


// My Answer
public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    char firstInitial = name.charAt(0);
    int space = name.indexOf(" ");
    char secondInitial = name.charAt(space + 1);
    
    return name = String.valueOf(firstInitial).toUpperCase() + "." + String.valueOf(secondInitial).toUpperCase();
    
  }
}


// Other Correct/Interesting Answers
public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    String[] names = name.split(" ");
    return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
  }
}