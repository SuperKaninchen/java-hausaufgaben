public class CD extends Medium {
	
	private String kuenstler;
	private int titelanzahl;
	private String[] trackArray;
	
	CD(String pTitel, boolean pHabIch, String pKommentar, String pKuenstler, String[] pTrackArray) {
		super(pTitel, pHabIch, pKommentar);
		kuenstler = pKuenstler;
		trackArray = pTrackArray;
		titelanzahl = trackArray.length;
	}
	
	public String ausgeben() {
		return super.ausgeben() + ", Künstler: " + kuenstler + ", Anzahl Titel: " + titelanzahl;
	}
	
}
