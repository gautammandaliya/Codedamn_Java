import java.util.Stack;

public class Day23_Question1 { //change classname while copying code
    public static void main(String[] args) {
        // Test cases
        System.out.println(verifyBrackets("{[()]}"));    // true
        System.out.println(verifyBrackets("{[(])}"));    // false
        System.out.println(verifyBrackets(""));          // true
        System.out.println(verifyBrackets("{[()]"));      // false
        System.out.println(verifyBrackets("{[()]}}"));    // false
        System.out.println(verifyBrackets("{[(<>)]}"));   // true
        System.out.println(verifyBrackets("{[({})]}"));   // true
    }

    public static boolean verifyBrackets(String input) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : input.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{' || bracket == '<') {
                stack.push(bracket);
            } else if (bracket == ')' || bracket == ']' || bracket == '}' || bracket == '>') {
                if (stack.isEmpty() || !isValidPair(stack.pop(), bracket)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isValidPair(char openBracket, char closeBracket) {
        return (openBracket == '(' && closeBracket == ')') ||
                (openBracket == '[' && closeBracket == ']') ||
                (openBracket == '{' && closeBracket == '}') ||
                (openBracket == '<' && closeBracket == '>');
    }
}
