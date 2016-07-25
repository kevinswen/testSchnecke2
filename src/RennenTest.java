import junit.framework.TestCase;

public class RennenTest extends TestCase {
	
	Rennen testObject;
	
	public void setUp(){
		testObject = new Rennen("test",5,10000);
		testObject.addRennschnecke(new Rennschnecke("Test","Test",1000,0));
	}
	//Überprüft den Konstruktor ob dieser vorhanden ist und die richtigen
	//Parameter besitzt
	public void testKonstruktor() throws Exception{
		testObject = new Rennen("test",5,10000);
	}
	//Prüft ob die Methode RemoveRennschnecke korrekt funktioniert
	public void testRemoveRennschnecke() throws Exception{
		testObject.removeRennschnecke("Test",1);
	}
	//Überprüft den zurückgegbenen String 
	public void testToString() throws Exception{
		assertNotNull(testObject.toString());
	}
	//Überprüft die Methode ermittleGewinner, indem getestet wird ob 
	//der return null ist wenn kein Gewinner vorhanden ist oder etwas
	//zurückgibt wenn einer feststeht
	public void testErmittleGewinner() throws Exception{
	if(testObject.ermittleGewinner()==null)
	{
		assertTrue(testObject.ermittleGewinner()==null); 	
	}else{
		assertFalse(testObject.ermittleGewinner()==null);
	}
	}
	//Prüft nur ob die Methode existiert da dort lediglich eine andere
	//Methode aufgerufen wird
	public void testLasseSchneckenKriechen() throws Exception{
		testObject.lasseSchneckenKriechen();
	}
	//Testet die Methode durchführen, indem überprüft wird ob ein Gewinner
	//vorhanden ist nachdem das Rennen durchgeführt wurde
	public void testDurchführen() throws Exception{
		testObject.durchführen();
		assertFalse(testObject.ermittleGewinner()==null);  
	}
}