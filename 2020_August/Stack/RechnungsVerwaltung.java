class RechnungsVerwaltung {
  
  private Stack<Rechnung> stapel;
  
  RechnungsVerwaltung() {
    stapel = new Stack<Rechnung>();
    Rechnung r1 = new Rechnung(500.0f);
    stapel.push(r1);
    System.out.println(stapel.top().getSumme());
    Rechnung r2 = new Rechnung(25.99f);
    stapel.push(r2);
    System.out.println(stapel.top().getSumme());
    stapel.pop();
    System.out.println(stapel.top().getSumme());
  }
  
  public static void main(String[] args) {
    new RechnungsVerwaltung();
  }
  
}
