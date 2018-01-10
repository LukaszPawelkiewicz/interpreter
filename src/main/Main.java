package main;

import data.RecordContainer;
import rpn.RPNAdapter;
import rpn.RPNBuilder;

import java.util.Scanner;

public class Main {

  //(a <= 132 and b >= 12) or (a != 42 and b > 1)

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final RecordContainer recordContainer = new RecordContainer();
    final RPNAdapter rpnAdapter = new RPNAdapter();
    final RPNBuilder rpnBuilder = new RPNBuilder();

    System.out.println(rpnBuilder.convertInfixToRPN(rpnAdapter.getRPNBuilderValidDataFormat(scanner.nextLine())));
  }

}
