package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RecordContainer {

  private final List<RecordModel> records = new ArrayList<>();
  private final Random random = new Random();

  public RecordContainer() {
  }

  public List<RecordModel> getRecords() {
    return records;
  }

  public void generateRandomRecords(int number, int bound) {
    for (int i = 0; i < number; i++) {
      records.add(new RecordModel(random.nextInt(bound),
          random.nextInt(bound),
          random.nextInt(bound),
          random.nextInt(bound),
          random.nextInt(bound),
          random.nextInt(bound),
          random.nextInt(bound),
          random.nextInt(bound)));
    }
  }

  public void addDefaultRecords() {
    records.add(new RecordModel(1, 2, 3, 4, 5, 6, 7, 8));
    records.add(new RecordModel(1, 2, 1, 2, 1, 2, 1, 2));
    records.add(new RecordModel(3, 3, 3, 3, 3, 3, 3, 3));
    records.add(new RecordModel(8, 7, 6, 5, 4, 3, 2, 1));
  }
}
