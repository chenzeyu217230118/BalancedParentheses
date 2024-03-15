import java.util.Stack;

public class BalancedParentheses {
   Stack<Character> stack = new Stack<>();

   public void balancedParentheses(String expression){
    for(char bracket: expression.toCharArray()){
        if (bracket =='{' || bracket =='[' || bracket == '(') {

            stack.push(bracket);
        
        }
        else  if (bracket =='}' || bracket ==']' || bracket == ')'){
             if(stack.isEmpty() || !isItBalanced(stack.pop(),bracket)){
                System.out.println("The expression is not balaenced.");
                return;
                }
        }
    }
   }
    public boolean isItBalanced(char open, char close){
        
        if (open  == '{'&& close == '}') {
            return true;
        }
        else if(open == '[' && close==']'){
            return true;
        }
         else if (open == '('&& close ==')'){
            return true;
         }
         return false;
    }
}

