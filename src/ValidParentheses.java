import java.util.Stack;

public class ValidParentheses {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (cur == '(' || cur == '[' || cur == '{') {
				stack.push(cur);
				continue;
			}
			if (stack.empty()) return false;
			if (Math.abs(stack.peek() - cur) <= 2) stack.pop();
			else return false;
		}
		return stack.empty();
	}
}