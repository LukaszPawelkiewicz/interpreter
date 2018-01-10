package interpreter.operator.logical;

import interpreter.operator.Operator;
import interpreter.operator.compare.CompareOperator;

public abstract class LogicalOperator extends Operator {

  protected CompareOperator left;
  protected CompareOperator right;

  public LogicalOperator(CompareOperator left, CompareOperator right) {
    this.left = left;
    this.right = right;
  }

}
