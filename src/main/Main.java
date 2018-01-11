package main;

import common.Constants;
import data.RecordContainer;
import data.RecordModel;
import interpreter.ExpressionInterpreter;
import rpn.RPNApi;
import rpn.impl.RPNApiImpl;
import tree.TreeDrawer;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Main {

  //example queries
  //(a = 1 and b = 2) or (a = 2 and b = 1)
  //(a>b or c<d) and h<g
  //((a>b or c<d) and h<g) or(a = 1 and b = 2) or (a = 2 and b = 1)
  //(a = 1 and b = 2) or (a = 2 and b = 1) \rand (a>b or c<d) and h<g (end line sing in the middle)

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final RecordContainer recordContainer = new RecordContainer();
    final RPNApi rpnApi = new RPNApiImpl();
    final ExpressionInterpreter expressionInterpreter = new ExpressionInterpreter(recordContainer);
    final TreeDrawer treeDrawer = new TreeDrawer();

    recordContainer.generateRandomRecords(1000, 10);

    String[] rpnQueue = rpnApi.createRPNValidArray(scanner.nextLine());
    System.out.println(Arrays.toString(rpnQueue));

    String[] copied = new String[rpnQueue.length];
    System.arraycopy(rpnQueue, 0, copied, 0, copied.length);

    treeDrawer.drawTreeOnConsole(copied);

    System.out.println(Constants.CLICK_CONFIRM);
    scanner.nextLine();
    Collection<RecordModel> recordModels = expressionInterpreter.interpret(rpnQueue);
    recordModels.forEach(recordModel -> System.out.println(recordModel.toString()));
  }

}
