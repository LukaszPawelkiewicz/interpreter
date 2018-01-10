package interpreter.number;

import data.RecordModel;
import interpreter.Expression;

public abstract class NumberField extends Expression {

  public abstract int getValue(RecordModel recordModel);

}
