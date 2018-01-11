package tree;

import common.Constants;

import java.util.Stack;

public class TreeDrawer {

  public void drawTreeOnConsole(String[] rpnQueue) {
    Stack<TreeElement> stack = new Stack<>();

    for (String element : rpnQueue) {
      for (String operator : Constants.OPERATORS) {
        if (operator.equals(element)) {
          stack.push(new TreeElement<>(element, stack.pop(), stack.pop()));
          break;
        }
      }
      for (String field : Constants.FIELDS) {
        if (field.equals(element)) {
          stack.push(new TreeElement<>(element, null, null));
          break;
        }
      }
    }

    int spaces = 0;
    while (!stack.isEmpty()) {
      TreeElement popped = stack.pop();
      popped.display(0);
    }
  }

}
