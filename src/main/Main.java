package main;

import data.RecordContainer;
import data.RecordModel;
import interpreter.ExpressionInterpreter;
import rpn.RPNApi;
import rpn.impl.RPNApiImpl;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Main {

  //example queries
  //(a = 1 and b = 2) or (a = 2 and b = 1)
  //(a>b or c<d) and h<g

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final RecordContainer recordContainer = new RecordContainer();
    final RPNApi rpnApi = new RPNApiImpl();
    final ExpressionInterpreter expressionInterpreter = new ExpressionInterpreter(recordContainer);

    recordContainer.generateRandomRecords(1000, 10);

    String[] rpnQueue = rpnApi.createRPNValidArray(scanner.nextLine());
    System.out.println(Arrays.toString(rpnQueue));

    Collection<RecordModel> recordModels = expressionInterpreter.interpret(rpnQueue);
    recordModels.forEach(recordModel -> System.out.println(recordModel.toString()));
  }

}
