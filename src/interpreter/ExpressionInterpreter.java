package interpreter;

import data.RecordContainer;
import data.RecordModel;
import interpreter.number.NumberField;
import interpreter.number.impl.*;
import interpreter.operator.Operator;
import interpreter.operator.compare.impl.*;
import interpreter.operator.logical.impl.And;
import interpreter.operator.logical.impl.Or;

import java.util.Collection;
import java.util.Stack;

public class ExpressionInterpreter {

  private final RecordContainer recordContainer;

  public ExpressionInterpreter(RecordContainer recordContainer) {
    this.recordContainer = recordContainer;
  }

  public Collection<RecordModel> interpret(String[] elements) {
    Stack<Expression> stack = new Stack<>();

    for (String element : elements) {
      switch (element) {
        case "=":
          stack.push(new Equal((NumberField) stack.pop(), (NumberField) stack.pop()));
          break;
        case "<":
          stack.push(new Less((NumberField) stack.pop(), (NumberField) stack.pop()));
          break;
        case ">":
          stack.push(new Higher((NumberField) stack.pop(), (NumberField) stack.pop()));
          break;
        case "<=":
          stack.push(new LessEqual((NumberField) stack.pop(), (NumberField) stack.pop()));
          break;
        case ">=":
          stack.push(new HigherEqual((NumberField) stack.pop(), (NumberField) stack.pop()));
          break;
        case "!=":
          stack.push(new NotEqual((NumberField) stack.pop(), (NumberField) stack.pop()));
          break;

        case "or":
          stack.push(new Or((Operator) stack.pop(), (Operator) stack.pop()));
          break;
        case "and":
          stack.push(new And((Operator) stack.pop(), (Operator) stack.pop()));
          break;

        case "a":
          stack.push(new FieldA());
          break;
        case "b":
          stack.push(new FieldB());
          break;
        case "c":
          stack.push(new FieldC());
          break;
        case "d":
          stack.push(new FieldD());
          break;
        case "e":
          stack.push(new FieldE());
          break;
        case "f":
          stack.push(new FieldF());
          break;
        case "g":
          stack.push(new FieldG());
          break;
        case "h":
          stack.push(new FieldH());
          break;

        //default would be only numeric values
        default:
          stack.push(new NumericValue(element));
          break;
      }
    }

    Collection<RecordModel> result = recordContainer.getRecords();
    while (!stack.isEmpty()) {
      Expression popped = stack.pop();
      result = ((Operator) popped).getMatchingValues(result);
    }

    return result;
  }

}
