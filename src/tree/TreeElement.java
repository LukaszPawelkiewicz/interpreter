package tree;

public class TreeElement<T> {

  private T value;
  private TreeElement left;
  private TreeElement right;

  TreeElement(T value, TreeElement left, TreeElement right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }

  void display(int spaces) {
    StringBuilder spaceBuilder = new StringBuilder();
    for (int i = 0; i < spaces; i++) {
      spaceBuilder.append(" ");
    }
    System.out.println(spaceBuilder.toString() + value);
    if (left != null) left.display(spaces + 4);
    if (right != null) right.display(spaces + 4);
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public TreeElement getLeft() {
    return left;
  }

  public void setLeft(TreeElement left) {
    this.left = left;
  }

  public TreeElement getRight() {
    return right;
  }

  public void setRight(TreeElement right) {
    this.right = right;
  }
}
