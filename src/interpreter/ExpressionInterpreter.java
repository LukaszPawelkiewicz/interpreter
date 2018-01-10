package interpreter;

import data.RecordContainer;
import data.RecordModel;
import rpn.impl.RPNBuilder;

import java.util.Collection;

public class ExpressionInterpreter {

  private final RecordContainer recordContainer;

  public ExpressionInterpreter(RecordContainer recordContainer) {
    this.recordContainer = recordContainer;
  }

  public Collection<RecordModel> interpret(String expression) {
    RPNBuilder rpnBuilder = new RPNBuilder();

    return recordContainer.getRecords();
  }

}
