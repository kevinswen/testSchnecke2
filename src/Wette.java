
public class Wette {

	private String schneckenName;
	private String spielerName;
	private int wettEinsatz;
	public Wette(String schneckenName, int wettEinsatz, String spielerName) {
		this.schneckenName=schneckenName;
		this.wettEinsatz=wettEinsatz;
		this.spielerName=spielerName;
	}
	//Erstellt und gibt einen String zurück in dem die Infos der Wette
	//enthalten sind
	public String toString(){
		return String.format("Spieler:\t"+this.spielerName+"\nSchnecke:\t"+this.schneckenName+"\nWetteinsatz:\t"+this.wettEinsatz);
	}
}