void main() {
	Hamster sandra = new MeinHamster(1,1,0,0);			//Ein Tab zurück
	while(sandra.kornDa()) {
		sandra.nimm();						//Klammern hinzugefügt
		sandra.vor();						//Semikolon hinzugefügt
		if(rechtsFrei() && rechtsKornDa()) {			//Tabs entfernt
			sandra.rechtsUm();
			sandra.vor();					//Vor kleingeschrieben
		}
		else
		{
			sandra.vor();					//Super zu sandra geändert
		}
	}
}