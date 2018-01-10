package interpreter.instance;

import data.RecordModel;
import interpreter.Expression;

import java.util.Collection;

public class NotEqualSign extends Expression {

  public NotEqualSign(String left, String right) {
    super(left, right);
  }

  @Override
  public Collection<RecordModel> interpret(Collection<RecordModel> recordModel, String expression) {
    return null;
  }
}
