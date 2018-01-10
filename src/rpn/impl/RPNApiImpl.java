package rpn.impl;

import rpn.RPNApi;

import java.util.Queue;

public class RPNApiImpl implements RPNApi {

  private final RPNAdapter rpnAdapter = new RPNAdapter();
  private final RPNBuilder rpnBuilder = new RPNBuilder();

  @Override
  public String[] createRPNValidArray(String text) {
    if (text.contains("\\r")) {
      int index = text.lastIndexOf("\\r");
      text = text.substring(0, index);
    }
    Queue<String> strings = rpnBuilder.convertInfixToRPN(rpnAdapter.getRPNBuilderValidDataFormat(text));
    return rpnAdapter.convertToStringArray(strings.toArray());
  }

}
