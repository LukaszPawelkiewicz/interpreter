package interpreter.instance;

import data.RecordModel;
import interpreter.Expression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class EqualSign extends Expression {

  public EqualSign(String left, String right) {
    super(left, right);
  }

  @Override
  public Collection<RecordModel> interpret(Collection<RecordModel> recordModels, String expression) {
    Collection<RecordModel> result = new ArrayList<>();
    if (Objects.equals(left, "a")) {
      recordModels.forEach(record -> {
        if (record.getA() == Integer.parseInt(right)) result.add(record);
      });
    } else if (Objects.equals(left, "b")) {
      recordModels.forEach(record -> {
        if (record.getB() == Integer.parseInt(right)) result.add(record);
      });
    } else if (Objects.equals(left, "c")) {
      recordModels.forEach(record -> {
        if (record.getC() == Integer.parseInt(right)) result.add(record);
      });
    } else if (Objects.equals(left, "d")) {
      recordModels.forEach(record -> {
        if (record.getD() == Integer.parseInt(right)) result.add(record);
      });
    } else if (Objects.equals(left, "e")) {
      recordModels.forEach(record -> {
        if (record.getE() == Integer.parseInt(right)) result.add(record);
      });
    } else if (Objects.equals(left, "f")) {
      recordModels.forEach(record -> {
        if (record.getF() == Integer.parseInt(right)) result.add(record);
      });
    } else if (Objects.equals(left, "g")) {
      recordModels.forEach(record -> {
        if (record.getG() == Integer.parseInt(right)) result.add(record);
      });
    } else if (Objects.equals(left, "h")) {
      recordModels.forEach(record -> {
        if (record.getH() == Integer.parseInt(right)) result.add(record);
      });
    }
    return result;
  }
}
