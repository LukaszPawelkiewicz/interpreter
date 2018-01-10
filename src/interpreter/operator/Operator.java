package interpreter.operator;

import data.RecordModel;
import interpreter.Expression;

import java.util.Collection;

public abstract class Operator extends Expression {

  public abstract Collection<RecordModel> getMatchingValues(Collection<RecordModel> recordModels);

}
