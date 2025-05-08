/*
Instructions:
Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.

Return your answer as a number.

*/


// My Answer
import java.util.List;

public class MixedSum {

 /*
  * Assume input will be only of Integer o String type
  */
	public int sum(List<?> mixed) {	
    int sum = 0;
    
    for(int i = 0; i < mixed.size(); i++) {
      Object value = mixed.get(i);
      
      if(value instanceof String) {
        String str = (String) value;
        int current = Integer.parseInt(str);
        sum += current;
      }else if(value instanceof Integer) {
        int current = (Integer) value;
        sum += current;
      }
    }
		return sum;
	}
}


// Other Correct/Interesting Answers
import java.util.List;

public class MixedSum {

	public int sum(List<?> mixed) {
		return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
	}

}

import java.util.List;

public class MixedSum {

 /*
  * Assume input will be only of Integer o String type
  */
	public int sum(List<?> mixed) {	
      int sum = 0;
    
      for (Object element : mixed)
      {
        if (element instanceof Integer)
        {
          sum += (Integer) element;
        }
        else if (element instanceof String){
        sum += Integer.parseInt( (String) element );
        }
      }
      return sum;
	}
}