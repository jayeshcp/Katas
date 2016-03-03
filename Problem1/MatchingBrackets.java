/**
 *  Check if brackets are matching.
 *  Time Complexity: O(N), Space Complexity: O(N)
 *
 *  @author Jayesh Chandrapal
 */
import java.util.*;

class MatchingBrackets {
	
  /**
   *  Checks if given input string contains matching brackets.
   *
   * @params str  input string to be checked
   * @returns     boolean value indicating if given string contains matching brackets
   */
  public static boolean isBalanced(String str) {
	    boolean balanced = true;
	    Stack stack = new Stack();
	    
	    for(Character c : str.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    balanced = false;
                    break;
                }
                
                Character top = stack.peek();
                if((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
                    stack.pop();
                } else {
                    balanced = false;
                    break;
                }
            }
	    }
	    
	    return balanced && stack.isEmpty();
	}
}
