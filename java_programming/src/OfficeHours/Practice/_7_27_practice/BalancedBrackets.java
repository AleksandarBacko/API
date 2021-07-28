package OfficeHours.Practice._7_27_practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {

//Checking for parenthesis is the most important task of a compiler.
//
//    Input: exp = “[()]{}{[()()]()}”
//    Output: Balanced
//
//    Input: exp = “[(])”
//    Output: Not Balanced
//
//Stack= Last in First Out
//
//Algorithm
//Declare a character Stack
//Traverse the string (iter)
//If the current character is a starting/opening bracket ('(' or '[' or '{') push it to stack
//If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then pop from the stack and
// if the popped character is the matching starting bracket then fine else brackets are not balanced.
//After complete traversal, if there is some starting bracket left in stack then “not balanced”
//
//E    pop()
//Removes the object at the top of this stack and returns that object as the value of this function.
//E    push(E item)
//Pushes an item onto the top of this stack.



    public static boolean isBalanced(String exp) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');


        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(' ch == '[' ch == '{')
            {
                stack.push(exp.charAt(i));
            }
            else if (ch == ')' ch == ']' ch == '}')
            {
                //nothing to match with
                if (stack.isEmpty()) {
                    return false;
                } else if (exp.charAt(i) != map.get(stack.pop())) {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isBalanced2(String str){
        String open = "{[(";
        Stack<Character> stack = new Stack();
        Map<Character, Character> map = new HashMap();
        map.put('{','}'); map.put('[',']'); map.put('(',')');

        for (int i = 0; i < str.length(); i++) {
            if(open.contains(""+str.charAt(i))){
                stack.push(str.charAt(i));
            }else{
                if(stack.isEmpty()||str.charAt(i) != map.get(stack.pop())){
                    return false;
                }
            }

        }
        return stack.isEmpty();

    }
}
