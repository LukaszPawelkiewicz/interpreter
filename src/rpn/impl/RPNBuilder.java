package rpn.impl;

import java.util.*;

class RPNBuilder {

  /*
   * Method based on:
   * http://www.learn4master.com/data-structures/stack/convert-infix-notation-to-reverse-polish-notation-java
   */
  Queue<String> convertInfixToRPN(String[] infixNotation) {
    Map<String, Integer> precedence = new HashMap<>();
    precedence.put("=", 5);
    precedence.put("<", 5);
    precedence.put(">", 5);
    precedence.put("<=", 5);
    precedence.put(">=", 5);
    precedence.put("!=", 5);
    precedence.put("and", 4);
    precedence.put("or", 4);
    precedence.put("(", 0);

    Queue<String> queue = new LinkedList<>();
    Stack<String> stack = new Stack<>();

    for (String token : infixNotation) {
      if ("(".equals(token)) {
        stack.push(token);
        continue;
      }
      if (")".equals(token)) {
        while (!"(".equals(stack.peek())) {
          queue.add(stack.pop());
        }
        stack.pop();
        continue;
      }
      if (precedence.containsKey(token)) {
        while (!stack.empty() && precedence.get(token) <= precedence.get(stack.peek())) {
          queue.add(stack.pop());
        }
        stack.push(token);
        continue;
      }
      queue.add(token);
    }
    while (!stack.isEmpty()) {
      queue.add(stack.pop());
    }
    return queue;
  }

}
