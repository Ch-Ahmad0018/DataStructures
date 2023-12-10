import java.beans.Expression;
import java.util.Stack;
public class InfixtoPostfix{
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
String inToPost(String infix){
Stack<Character> operators=new Stack<>();
char symbol;
String postfix="";
for (int i=0;i<infix.length();i++){
 symbol=infix.charAt(i);
 if(Character.isLetter(symbol))
 postfix=postfix+symbol;
 else if (symbol=='('){
    operators.push(symbol);
 }
 else if (symbol==')'){
    while (operators.peek() != '('){
        postfix=postfix+operators.pop();
    }
    operators.pop();
}
else{
    while(!operators.isEmpty()&& !(operators.peek() == '(') && precedence(symbol)<=precedence(operators.peek())){
        postfix=postfix+operators.pop();       
    }
    operators.push(symbol);
}
}
while (!operators.isEmpty())
postfix = postfix + operators.pop();
return postfix;
} 
    public static void main(String[] args) {
    
}}