package interpreter.operator.compare;

import interpreter.number.NumberField;
import interpreter.operator.Operator;

public abstract class CompareOperator extends Operator {

  protected NumberField left;
  protected NumberField right;

  public CompareOperator(NumberField left, NumberField right) {
    this.left = left;
    this.right = right;
  }

}
