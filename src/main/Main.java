package main;

import data.RecordContainer;
import rpn.RPNApi;
import rpn.impl.RPNApiImpl;

import java.util.Scanner;

public class Main {

  //(a <= 132 and b >= 12) or (a != 42 and b > 1)

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final RecordContainer recordContainer = new RecordContainer();
    final RPNApi rpnApi = new RPNApiImpl();

    System.out.println(rpnApi.createRPNValidArray(scanner.nextLine()));
  }

}
