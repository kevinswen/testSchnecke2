import java.util.ArrayList;


public class Wettbüro {

	private Rennen rennen;
	private double faktor;
	private ArrayList<Wette> wetten;
	
	public Wettbüro(Rennen rennen, double faktor) {
		this.rennen=rennen;
		this.faktor=faktor;
		this.wetten=new ArrayList<Wette>();
	}
	//Fügt eine Wette hinzu
	public void wetteAnnehmen(String schneckenName, int wettEinsatz, String spielerName) {
		wetten.add(new Wette(schneckenName,wettEinsatz,spielerName));
	}
	//Führt das rennen durch
	public void rennenDurchführen(){
		this.rennen.durchführen();
	}
	//Erstellt einen String wo drin steht um welches Rennen es geht 
	//und welche Wetten abgeschlossen wurden
	public String createString() {
		StringBuilder string = new StringBuilder();
		string.append("Rennen:\n");
		string.append(this.rennen);
		string.append("Wetten:\n");
		if (wetten.size()>0)
		{
			for(Wette wette:this.wetten)
			{
				string.append(wette);
				string.append("\n");
			}
		}
		else
		{
			string.append("(keine)");
		}
		return string.toString();
	}
	//Erstellt einen String der die Infos der Wetten und des Rennens enthält,
	//erzeugt eine Ausgabe davon und gibt ihn zurück
	public StringBuilder print()
	{
		StringBuilder string=new StringBuilder();
		string.append("Wettbüro für:\n");
		string.append(this.rennen.toString());
		string.append("Wetten:\n");
		
		if (wetten.size()>0)
		{
			for (Wette wette:this.wetten)
			{
				string.append(wette);
				string.append("\n");
			}
		}
		else
		{
			string.append("(keine)");
		}
		System.out.println(string.toString());
		return string;
	}
}