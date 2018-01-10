package rpn.impl;

import rpn.RPNApi;

import java.util.Queue;

public class RPNApiImpl implements RPNApi {

  private final RPNAdapter rpnAdapter = new RPNAdapter();
  private final RPNBuilder rpnBuilder = new RPNBuilder();

  @Override
  public Queue<String> createRPNValidArray(String text) {
    return rpnBuilder.convertInfixToRPN(rpnAdapter.getRPNBuilderValidDataFormat(text));
  }
}
