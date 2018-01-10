package interpreter.operator.compare.impl;

import data.RecordModel;
import interpreter.number.NumberField;
import interpreter.operator.compare.CompareOperator;

import java.util.ArrayList;
import java.util.Collection;

public class Equal extends CompareOperator {

  public Equal(NumberField left, NumberField right) {
    super(left, right);
  }

  @Override
  public Collection<RecordModel> getMatchingValues(Collection<RecordModel> recordModels) {
    Collection<RecordModel> result = new ArrayList<>();
    recordModels.forEach(model -> {
      if (left.getValue(model) == right.getValue(model)) result.add(model);
    });
    return result;
  }

}
