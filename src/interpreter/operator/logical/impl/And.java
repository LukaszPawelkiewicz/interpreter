package interpreter.operator.logical.impl;

import data.RecordModel;
import interpreter.operator.Operator;
import interpreter.operator.logical.LogicalOperator;

import java.util.ArrayList;
import java.util.Collection;

public class And extends LogicalOperator {
  public And(Operator left, Operator right) {
    super(left, right);
  }

  @Override
  public Collection<RecordModel> getMatchingValues(Collection<RecordModel> recordModels) {
    Collection<RecordModel> result = new ArrayList<>();
    Collection<RecordModel> leftResult = left.getMatchingValues(recordModels);
    Collection<RecordModel> rightResult = right.getMatchingValues(recordModels);
    leftResult.forEach(left -> {
      if (rightResult.contains(left)) result.add(left);
    });
    return result;
  }
}
