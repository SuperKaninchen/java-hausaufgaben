
public class DVD extends Medium {
	
	private String regisseur;
	
	DVD(String pTitel, boolean pHabIch, String pKommentar, String pRegisseur) {
		super(pTitel, pHabIch, pKommentar);
		regisseur = pRegisseur;
	}
	
	public String ausgeben() {
		return super.ausgeben() + ", Regisseur: " + regisseur;
	}

}
