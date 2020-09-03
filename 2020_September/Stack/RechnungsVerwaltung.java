class RechnungsVerwaltung {
  
  private Stack<Rechnung> stapel;
  
  RechnungsVerwaltung() {
  }
  
  public static void main(String[] args) {
    new RechnungsVerwaltung();
  }
  
  public Rechnung getRechnung() {
    return stapel.top();  
  }
  public void addRechnung(Rechnung pRechnung) {
    stapel.push(pRechnung);  
  }
  public void removeRechnung() {
    stapel.pop();  
  }
  
  
}
