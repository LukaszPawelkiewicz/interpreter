package interpreter.operator.logical.impl;

import data.RecordModel;
import interpreter.operator.compare.CompareOperator;
import interpreter.operator.logical.LogicalOperator;

import java.util.ArrayList;
import java.util.Collection;

public class Or extends LogicalOperator {
  public Or(CompareOperator left, CompareOperator right) {
    super(left, right);
  }

  @Override
  public Collection<RecordModel> getMatchingValues(Collection<RecordModel> recordModels) {
    Collection<RecordModel> result = new ArrayList<>();
    Collection<RecordModel> leftResult = left.getMatchingValues(recordModels);
    Collection<RecordModel> rightResult = right.getMatchingValues(recordModels);
    result.addAll(leftResult);
    rightResult.forEach(right -> {
      if (!result.contains(right)) result.add(right);
    });
    return result;
  }
}
