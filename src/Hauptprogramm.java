
public class Hauptprogramm {

	public static void main(String[] args) {
		
		Rennen rennen= new Rennen("Erstes Rennen",3,1000);

		rennen.addRennschnecke(new Rennschnecke("Harry","Mensch",1000,0));
		rennen.addRennschnecke(new Rennschnecke("Garry","Tier",10,0));
		rennen.addRennschnecke(new Rennschnecke("Larry","Fabel",10,0));
		
		Wettbüro wettbüro =new Wettbüro(rennen,1.5);
		
		wettbüro.wetteAnnehmen("Garry", 100, "Kevin");
		wettbüro.print();								
		wettbüro.rennenDurchführen();	
		wettbüro.print();
	}
}