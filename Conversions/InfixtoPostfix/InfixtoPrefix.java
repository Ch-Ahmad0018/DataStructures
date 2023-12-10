import java.beans.Expression;
import java.util.Scanner;
import java.util.Stack;
public class InfixtoPrefix{
    static int precedence(char c) {
if (c == '^') {
return 3;
} else if (c == '*' || c == '/') {
return 2;
} else if (c == '+' || c == '-') {
return 1;
} else {
return 0;
}
}
static String infixToPrefix(String infix) {
    String prefix = "";
    String reverseString = "";
    
    for (int i = infix.length() - 1; i >= 0; i--) {
        reverseString = reverseString + infix.charAt(i);
    }
       String reversePostfix="";
        Stack<Character> operators = new Stack<>();
        char symbol;
        String postfix = "";
        for (int i = 0; i < reversePostfix.length(); ++i) {
            symbol = reversePostfix.charAt(i);
            if (Character.isLetter(symbol))
                postfix = postfix + symbol;
            else if (symbol == ')') {
                operators.push(symbol);
            } else if (symbol == '(') {
                while (operators.peek() != ')') {
                    postfix = postfix + operators.pop();
                }
                operators.pop();
            } else {
                while (!operators.isEmpty() && !(operators.peek() == '(')
                        && precedence(symbol) <= precedence(operators.peek()))
                    postfix = postfix + operators.pop();
                operators.push(symbol);
            }
        }
        while (!operators.isEmpty())
        {
        postfix = postfix + operators.pop();
        }
        
    for (int i = reversePostfix.length() - 1; i >= 0; i--) {
        prefix = prefix + reversePostfix.charAt(i);
    }
    return prefix;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Infix Expression: ");
        String infixExpression = in.next();
        String prefixExpression = infixToPrefix(infixExpression);
        System.out.print("Prefix expression for the given Infix expression is: "+prefixExpression);
        
        
}}