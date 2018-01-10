package data;

import java.util.ArrayList;
import java.util.List;

public class RecordContainer {

  private final List<RecordModel> records = new ArrayList<>();

  public RecordContainer() {
    records.add(new RecordModel(1, 2, 3, 4, 5, 6, 7, 8));
    records.add(new RecordModel(1, 2, 1, 2, 1, 2, 1, 2));
    records.add(new RecordModel(3, 3, 3, 3, 3, 3, 3, 3));
    records.add(new RecordModel(8, 7, 6, 5, 4, 3, 2, 1));
  }

  public List<RecordModel> getRecords() {
    return records;
  }
}
