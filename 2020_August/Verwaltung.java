public class Verwaltung {
  private Schueler[] a;
  
  public Verwaltung() {
    a = new Schueler[30];
  }
  
  public Schueler getSchueler(int index) {
    return a[index];
  }
  public void setSchueler(int index, String name, int alter, String klasse) {
    a[index] = new Schueler(name, alter, klasse);
  }
  public int getAnzahlSchueler() {
    return a.length;
  }
}
