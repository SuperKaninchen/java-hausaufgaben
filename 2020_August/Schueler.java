public class Schueler extends Person {
  private String klasse;
  
  public Schueler(String iName, int pAlter, String pKlasse) {
    super(iName);
    super.setAlter(pAlter);
    klasse = pKlasse;
  }
  
  public String getKlasse() {
    return klasse;
  }
  public void setKlasse(String pKlasse) {
    klasse = pKlasse;
  }
  public String asString() {
    String out = super.asString();
    out += " " + klasse;
    return out;
  }
    
}
