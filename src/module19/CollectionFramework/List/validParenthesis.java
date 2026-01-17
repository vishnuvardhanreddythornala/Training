package module19.CollectionFramework.List;
import java.util.Stack;
public class validParenthesis {
public static boolean isValid(String s) {
	Stack<Character> stack = new  Stack<Character>();
		for(char ch : s.toCharArray()) {
			if(ch == '(' || ch == '{' || ch == '['){
				stack.push(ch);
			}
			else {
				if(stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if ((ch == ')' && top != '(') ||
	                    (ch == '}' && top != '{') ||
	                    (ch == ']' && top != '[')) {
	                    return false;
			}
		}
}
		return stack.isEmpty();
}
	public static void main(String[] args) {
    String s = "()[]{}";   // try "(]" also
    System.out.println(isValid(s));
}

}
