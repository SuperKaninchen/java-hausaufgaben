public class Person{
  private String name;
  private int alter;
  
  public Person(String pName) {
    name = pName;
    alter = 0;
  }
  
  public String getName() {
    return name;
  }
  public void setAlter(int pAlter) {
    alter = pAlter;
  }
  public int getAlter() {
    return alter;
  }
  public String asString() {
    return name;
  }
}
