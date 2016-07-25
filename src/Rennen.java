import java.util.ArrayList;


public class Rennen {
	
	private String name;
	private int anzSchnecken;
	private int zielStrecke;
	private ArrayList<Rennschnecke> teilnehmer;

	public Rennen(String name, int anzSchnecken, int zielStrecke) {
		this.name=name;
		this.anzSchnecken=anzSchnecken;
		this.zielStrecke=zielStrecke;
		this.teilnehmer=new ArrayList<Rennschnecke>();
	}
	//fügt dem Rennen eine Schnecke hinzu
	public void addRennschnecke(Rennschnecke neueRennschnecke) {
		this.teilnehmer.add(neueRennschnecke);
	}
	//entfernt eine Schnecke aus dem Rennen
	public void removeRennschnecke(String name, int schneckenzahl) {
			teilnehmer.remove(name);
			teilnehmer.remove((schneckenzahl-1));
	}
	// Baut einen String der die Infos des Rennens und der Schnecken enthält
	public String toString() {
		StringBuilder string=new StringBuilder();
		string.append("Name des Rennens:\t");
		string.append(this.name);
		string.append("\nAnzahl der Teilnehmer:\t");
		string.append(this.anzSchnecken);
		string.append("\nStrecke bis zum Ziel:\t");
		string.append(this.zielStrecke);
		string.append("\nSchnecken:\n");
		string.append("Name:\t");
		for( Rennschnecke snail:this.teilnehmer)
		{
			string.append("\n\t");
			string.append(snail.getName());
		}
		string.append("\n");
		string.append("Rasse:\t");
		for( Rennschnecke snail:this.teilnehmer)
		{
			string.append("\n\t");
			string.append(snail.getRasse());
		}
		string.append("\n");
		string.append("Max. Speed:\t");
		for( Rennschnecke snail:this.teilnehmer)
		{
			string.append("\n\t");
			string.append(snail.getMaxSp());
		}
		string.append("\n");
		string.append("Strecke:\t");
		for( Rennschnecke snail:this.teilnehmer)
		{
			string.append("\n\t");
			string.append(snail.getStrecke());
		}
		string.append("\n");

		return string.toString();
	}
	//Ermittelt den Gewinner und gibt ihn zurück.Er steht fest sobald die
	//gekrochene Strecke einer Schnecke der Strecke bis zum Ziel entspricht
	public Rennschnecke ermittleGewinner() {
		Rennschnecke gewinner = null;
		
		for(Rennschnecke schnecke:this.teilnehmer)
		{
			if(schnecke.getStrecke() == zielStrecke  || schnecke.getStrecke()> zielStrecke)
			{
				gewinner = schnecke;																		
				return gewinner;
			}
		}
		return null;
	}
	//Lässt jede Schnecke einmal kriechen.
	public void lasseSchneckenKriechen() {
		for(Rennschnecke schnecke:this.teilnehmer)
		{
			schnecke.krieche();
		}
		}
	//Führt das Rennnen aus bis ein Gewinner feststeht.
	public void durchführen() {
		Rennschnecke gewinner=null;
		while(gewinner == null)
		{
			lasseSchneckenKriechen();
			gewinner=ermittleGewinner();
		}
		System.out.println("Gewinner ist\t"+gewinner);
	}
}

