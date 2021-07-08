package stack;

import java.util.ArrayList;
import java.util.List;

class Stack<T> {
    private List<T> values;

    public Stack(){
        this.values = new ArrayList<T>();
    }

    public void push(T data){
        values.add(0, data);
    }

    public T pop(){
        if (values.size() == 0)
            return null;

        return values.remove(0);
    }

    public T peek(){
        if (values.size() == 0)
            return null;

        return values.get(0);
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Stack<String> stringStack = new Stack<>();
        stringStack.push("Shekhar");
        stringStack.push("Smita");
        stringStack.push("Kiran");
        stringStack.push("Amol");

        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
    }
}
