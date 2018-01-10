package interpreter.operator.compare;

import data.RecordModel;
import interpreter.Expression;
import interpreter.number.NumberField;

import java.util.Collection;

public abstract class CompareOperator extends Expression {

  protected NumberField left;
  protected NumberField right;

  public CompareOperator(NumberField left, NumberField right) {
    this.left = left;
    this.right = right;
  }

  public abstract Collection<RecordModel> getMatchingValues(Collection<RecordModel> recordModels);

}
