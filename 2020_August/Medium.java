
public class Medium {
	
	private String titel;
	private boolean habIch;
	private String kommentar;
	
	Medium(String pTitel, boolean pHabIch, String pKommentar) {
		titel = pTitel;
		habIch = pHabIch;
		kommentar = pKommentar;
	}
	public String ausgeben() {
		return "Titel: " + titel + ", Kommentar: " + kommentar;
	}
	
	public void setKommentar(String pKommentar) {
		kommentar = pKommentar;
	}
	public String getKommentar() {
		return kommentar;
	}
	
	public void setVorhanden(boolean pHabIch) {
		habIch = pHabIch;
	}
	public boolean getVorhanden() {
		return habIch;
	}
	
}
