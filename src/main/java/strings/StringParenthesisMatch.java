package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StringParenthesisMatch {

    public static void main(String[] args) {
        String str = "{[({})]}";
        boolean b = checkParenthesis(str);
        System.out.println(b);
    }

    private static boolean checkParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        //Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (ch == '{' || ch == '[' || ch == '('){
                stack.push(ch);
            }

            if (stack.isEmpty())
                return false;

            Character character;

            switch (ch){
                case ')' :
                        character = stack.pop();
                        if (character == '[' || ch == '{')
                            return false;
                        break;

                case ']' :
                        character = stack.pop();
                        if (character == '{' || ch == '(')
                            return false;
                        break;

                case '}' :
                        character = stack.pop();
                        if (character == '[' || ch == '(')
                            return false;
                        break;
            }
        }
        return stack.isEmpty();
    }
}
