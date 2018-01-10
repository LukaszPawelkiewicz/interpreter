package main;

import data.RecordContainer;
import interpreter.ExpressionInterpreter;
import rpn.RPNApi;
import rpn.impl.RPNApiImpl;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  //(a <= 132 and b >= 12) or (a != 42 and b > 1)
  //(a = 1 and b = 2) or (a = 2 and b = 1)

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final RecordContainer recordContainer = new RecordContainer();
    final RPNApi rpnApi = new RPNApiImpl();
    final ExpressionInterpreter expressionInterpreter = new ExpressionInterpreter(recordContainer);

    String[] rpnQueue = rpnApi.createRPNValidArray(scanner.nextLine());
    System.out.println(Arrays.toString(rpnQueue));

    System.out.println(expressionInterpreter.interpret(rpnQueue));
  }

}
