package stack;

import java.util.Stack;

public class StringReverser {

    public String reverse(String input) {
        if(input==null)throw new IllegalArgumentException();

        Stack<Character>stack=new Stack<>();
        StringBuffer reversed=new StringBuffer();

        for(char ch:input.toCharArray()){
            stack.push(ch);
        }

        while (!stack.empty()){
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}
