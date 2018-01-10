package interpreter.operator.logical;

import interpreter.operator.Operator;

public abstract class LogicalOperator extends Operator {

  protected Operator left;
  protected Operator right;

  public LogicalOperator(Operator left, Operator right) {
    this.left = left;
    this.right = right;
  }

}
