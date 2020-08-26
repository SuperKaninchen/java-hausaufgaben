import java.util.ArrayList;
import java.util.List;

public class Datenbank {
	
	private List<CD> CDListe;
	private List<DVD> DVDListe;
	private List<Medium> MediumListe;
	
	public Datenbank() {
		CDListe = new ArrayList<CD>();
		DVDListe = new ArrayList<DVD>();
		MediumListe = new ArrayList<Medium>();
	}
	
	public void erfasseCD(CD neueCD) {
		CDListe.add(neueCD);
	}
	public void erfasseDVD(DVD neueDVD) {
		DVDListe.add(neueDVD);
	}
	public void auflisten() {
		System.out.println("===| Alle CDs: |===");
		for (CD cd : CDListe) {
			System.out.println(cd.ausgeben());
		}
		System.out.println("===| Alle DVDs: |===");
		for (DVD dvd : DVDListe) {
			System.out.println(dvd.ausgeben());
		}
		System.out.println("===| Alle Medien: |===");
		for (Medium medium : MediumListe) {
			System.out.println(medium.ausgeben());
		}
	}
	
}
