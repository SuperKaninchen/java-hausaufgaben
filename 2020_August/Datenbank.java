import java.util.ArrayList;
import java.util.List;

public class Datenbank {
  
  private Medium[] MediumListe;
  
  public Datenbank() {
    MediumListe = new Medium[0];
    auflisten();
    erfasseMedium(new CD("Neue CD", true, "ziemlich langweilig", "REEEEE", new String[]{"Track1", "Track2"}));
    erfasseMedium(new DVD("Neue DvD", true, "krasser film", "irgendein dude"));
    erfasseMedium(new Medium("Neues Medium", true, "ne kassette oder so idk"));
    auflisten();
  }
  
  public static void main(String[] args) {
    new Datenbank();
  }
  public void erfasseMedium(Medium neuesMedium) {
    Medium[] tmp = new Medium[MediumListe.length+1];
    for (int i = 0; i < MediumListe.length; i++) {
      tmp[i] = MediumListe[i];
    }
    tmp[MediumListe.length] = neuesMedium;
    MediumListe = tmp;
  }
  public void auflisten() {
    System.out.println("===| Alle Medien: |===");
    for (Medium medium : MediumListe) {
      System.out.println(medium.ausgeben());
    }
    System.out.println("\n\n");
  }
  
}
