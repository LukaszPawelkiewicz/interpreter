package data;

public class RecordModel {

  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;

  public RecordModel() {
  }

  public RecordModel(int a, int b, int c, int d, int e, int f, int g, int h) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
    this.e = e;
    this.f = f;
    this.g = g;
    this.h = h;
  }

  @Override
  public String toString() {
    return "RecordModel{" +
        "a=" + a +
        ", b=" + b +
        ", c=" + c +
        ", d=" + d +
        ", e=" + e +
        ", f=" + f +
        ", g=" + g +
        ", h=" + h +
        '}';
  }

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }

  public int getC() {
    return c;
  }

  public void setC(int c) {
    this.c = c;
  }

  public int getD() {
    return d;
  }

  public void setD(int d) {
    this.d = d;
  }

  public int getE() {
    return e;
  }

  public void setE(int e) {
    this.e = e;
  }

  public int getF() {
    return f;
  }

  public void setF(int f) {
    this.f = f;
  }

  public int getG() {
    return g;
  }

  public void setG(int g) {
    this.g = g;
  }

  public int getH() {
    return h;
  }

  public void setH(int h) {
    this.h = h;
  }
}
