package stack;

import java.util.Stack;

public class EvaluateExpression {
    public static void main(String[] args) {
        String []arr = { "5", "1", "2", "+", "4", "*", "+", "3", "-" };
        System.out.println("Expression result : "+evaluateExpression(arr));
    }

    private static int evaluateExpression(String[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (String opr : arr){
            if (opr.equals("+") || opr.equals("-") || opr.equals("*") || opr.equals("/")){
                int num1 = stack.pop();
                int num2 = stack.pop();

                switch (opr){
                    case "+": int add = num1 + num2;
                              stack.push(add);
                              break;
                    case "-": int sub = num2 - num1;
                              stack.push(sub);
                              break;
                    case "*": int mul = num1 * num2;
                              stack.push(mul);
                              break;
                    case "/": int div = num2 / num1;
                              stack.push(div);
                }
            }else{
                stack.push(Integer.parseInt(opr));
            }
        }

        return stack.pop();
    }
}
