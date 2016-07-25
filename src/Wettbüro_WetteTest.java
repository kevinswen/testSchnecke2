import junit.framework.TestCase;


public class Wettbüro_WetteTest extends TestCase {
	
	Wettbüro testObject;
	Rennen testOb2;
	
	public void setUp(){
		testOb2 =new Rennen("Name",10,10);
		testObject = new Wettbüro(testOb2,1.5);
		testOb3 =new Wette("Garry",100,"Peter");
	}
	//Testet den Konstruktor der Klasse Wettbüro
	public void testKontruktorWettbüro() throws Exception{
		testObject = new Wettbüro(testOb2,1.5);
	}
	//Testet die Methode WetteAnnehmen
	public void testWetteAnnehmen() throws Exception{
		testObject.wetteAnnehmen("Garry",100,"Peter");
	}
	Wette testOb3;
	//Testet den Konstruktor der Klasse Wette
	public void testKonstruktorWette() throws Exception{
		testOb3 =new Wette("Garry",100,"Peter");
	}
	//Testet ob im zurückgegebenen String auch etwas enthalten ist
	public void testToString() throws Exception{
		assertNotNull(testOb3.toString());
	}
	//Prüft nur ob die Methode existiert da dort nur eine andere
	//Methode aufgerufen wird
	public void testRennenDurchführen() throws Exception{
		testObject.rennenDurchführen();
	}
	//Prüft ob im Rückgabewert überhaupt etwas enthalten ist
	public void testCreateString() throws Exception{
		assertNotNull(testObject.createString());
	}
	//Prüft ob im Rückgabewert überhaupt etwas enthalten ist
	public void testPrint(){
		assertNotNull(testObject.print());
	}
}
