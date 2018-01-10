package interpreter.number.impl;

import data.RecordModel;
import interpreter.number.NumberField;

public class NumericValue extends NumberField {

  private final int value;

  public NumericValue(String value) {
    super();
    this.value = Integer.parseInt(value);
  }

  @Override
  public int getValue(RecordModel recordModel) {
    return value;
  }

}
