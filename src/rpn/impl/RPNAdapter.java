package rpn.impl;

import java.util.ArrayList;
import java.util.List;

class RPNAdapter {

  private static final String[] whiteSpaces = {" ", "\t"};
  private static final String[] allowedSingleSigns = {"a", "b", "c", "d", "e", "f", "g", "h", "=", "<", ">", "(", ")"};
  private static final String[] allowedDoubleSings = {"<=", ">=", "!=", "or"};
  private static final String[] allowedMultiSigns = {"and"};
  private static final String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

  @SuppressWarnings("StringConcatenationInLoop")
  String[] getRPNBuilderValidDataFormat(String text) {
    List<String> result = new ArrayList<>();
    text = removeWhiteSpaces(text);
    char[] signs = text.toCharArray();
    for (int i = 0; i < signs.length; i++) {
      boolean condition = false;

      String tmp = String.valueOf(signs[i]);
      if ((i + 2) < signs.length) {
        tmp = tmp + signs[i + 1] + signs[i + 2];
        for (String allowedMultiSing : allowedMultiSigns) {
          if (tmp.equals(allowedMultiSing)) {
            result.add(tmp);
            i = i + 2;
            condition = true;
          }
        }
      }
      if (condition) continue;

      tmp = String.valueOf(signs[i]);
      if ((i + 1) < signs.length) {
        tmp = tmp + signs[i + 1];
        for (String allowedDoubleSing : allowedDoubleSings) {
          if (tmp.equals(allowedDoubleSing)) {
            result.add(tmp);
            i++;
            condition = true;
          }
        }
      }
      if (condition) continue;

      tmp = String.valueOf(signs[i]);
      for (String allowedSingleSign : allowedSingleSigns) {
        if (tmp.equals(allowedSingleSign)) {
          if (tmp.equals("a") && ((i + 2) < signs.length) && signs[i + 1] == 'n' && signs[i + 2] == 'd') {
            break;
          }
          result.add(tmp);
          condition = true;
          break;
        }
      }
      if (condition) continue;

      tmp = String.valueOf(signs[i]);
      if (isStringNumeric(tmp)) {
        String localNumber = tmp;
        if ((i + 1) < signs.length) {
          tmp = String.valueOf(signs[i + 1]);
          while (isStringNumeric(tmp) && ((i + 1) < signs.length)) {
            localNumber = localNumber + tmp;
            tmp = String.valueOf(signs[i + 2]);
            i++;
          }
        }
        result.add(localNumber);
      }
    }

    return convertToStringArray(result.toArray());
  }

  String[] convertToStringArray(Object[] objects) {
    String[] result = new String[objects.length];
    for (int i = 0; i < objects.length; i++) {
      result[i] = (String) objects[i];
    }
    return result;
  }

  private boolean isStringNumeric(String s) {
    for (String number : numbers) {
      if (s.equals(number)) return true;
    }
    return false;
  }

  private String removeWhiteSpaces(String expression) {
    for (String whiteSpace : whiteSpaces) {
      expression = expression.replaceAll(whiteSpace, "");
    }
    return expression;
  }
}
