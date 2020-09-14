class QueueTester {
  private Queue<Patient> schlange;
  
  public QueueTester() {
    schlange = new Queue<Patient>();
    System.out.println(schlange.isEmpty());
    schlange.enqueue(new Patient("Max", "Mustermann", "Musterkasse"));
    System.out.println(schlange.isEmpty());
    System.out.println(schlange.dequeue().getName());
    System.out.println(schlange.isEmpty());
  }
  
  public static void main(String[] args) {
    new QueueTester();
  }
  
}
