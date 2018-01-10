package interpreter;

import data.RecordModel;

import java.util.Collection;

public abstract class Expression {

  protected String left;
  protected String right;

  public Expression(String left, String right) {
    this.left = left;
    this.right = right;
  }

  public final void setExpression(String expression) {
  }

  public abstract Collection<RecordModel> interpret(Collection<RecordModel> recordModel, String expression);

}
