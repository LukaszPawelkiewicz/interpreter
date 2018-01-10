package interpreter.operator.logical;

import data.RecordModel;
import interpreter.Expression;
import interpreter.operator.compare.CompareOperator;

import java.util.Collection;

public abstract class LogicalOperator extends Expression {

  protected CompareOperator left;
  protected CompareOperator right;

  public LogicalOperator(CompareOperator left, CompareOperator right) {
    this.left = left;
    this.right = right;
  }

  public abstract Collection<RecordModel> getMatchingValues(Collection<RecordModel> recordModels);

}
