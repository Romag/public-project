public class Counter {
  private int counter = 0;
  
  public int count() {
    return counter++;
  }
  
  public int doubleCount() {
    return counter+=2;
  }
  
  public int tripleCount() {
    return counter+=3;
  }
}
