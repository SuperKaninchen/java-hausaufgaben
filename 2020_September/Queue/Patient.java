public class Patient {
  private String vorname;
  private String nachname;
  private String krankenkasse;
  
  public Patient(String pVorname, String pNachname, String pKrankenkasse) {
    vorname = pVorname;
    nachname = pNachname;
    krankenkasse = pKrankenkasse;
  }
  
  public String getName() {
    return vorname + " " + nachname;
  }
  public String getKrankenkasse() {
    return krankenkasse;
  }
  public String asString() {
    return getName() + "\n" + getKrankenkasse();
  }
}
