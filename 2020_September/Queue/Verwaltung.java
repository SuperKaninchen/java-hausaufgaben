public class Verwaltung {
  private Queue<Patient> schlange;
  
  public Verwaltung() {
    schlange = new Queue<Patient>();
  }
  public void enqueue(Patient pPatient) {
    schlange.enqueue(pPatient);
  }
  public void dequeue() {
    schlange.dequeue();
  }
  public boolean isEmpty() {
    return schlange.isEmpty();
  }
  public Patient front() {
    return schlange.front();
  }
}
