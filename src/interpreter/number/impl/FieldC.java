package interpreter.number.impl;

import data.RecordModel;
import interpreter.number.NumberField;

public class FieldC extends NumberField {
  @Override
  public int getValue(RecordModel recordModel) {
    return recordModel.getC();
  }
}
