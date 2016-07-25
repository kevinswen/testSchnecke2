import junit.framework.TestCase;


public class RennschneckeTest extends TestCase {
	
	Rennschnecke testObject;
	
	public void setUp(){
		testObject = new Rennschnecke("test","test",5,0);
		testObject.getStrecke();
	}
	public void testCheckKonstruktor(){
		testObject = new Rennschnecke("test","test",5,0);
	}
	public void testCreateRennschneckeTestObject() throws Exception{
		assertNotNull(testObject);
	}
	//Prüft ob im return wert der Methode getName auch etwas enthalten ist
	public void testCheckGetName() throws Exception{
		assertTrue(testObject.getName()=="test");
	}
	//Prüft ob im return wert der Methode getRasse auch etwas enthalten ist
	public void testCheckGetRasse() throws Exception{
		assertTrue(testObject.getRasse()=="test");
	}
	//Prüft ob der return wert der Methode getMaxSp den richtigen wert
	//zurückgibt
	public void testCheckGetMaxSp() throws Exception{
		assertTrue(testObject.getMaxSp()==5);
	}
	//Prüft ob der return wert der Methode getStrecke den richtigen wert
	//zurückgibt
	public void testCheckGetStrecke() throws Exception{
		assertTrue(testObject.getStrecke()==0); 
	}
	//Testet ob die Methode Krieche die Schnecken fortbewegt indem geprüft
	//wird ob nach dem Aufruf dieser Methode die Strecke erhöt ist
	public void testCheckKrieche() throws Exception{
		int i = testObject.getStrecke();
		testObject.krieche();
		assertTrue(i<testObject.getStrecke());		
	}
	//Prüft ob im zurückgegeben String überhaupt etwas enthalten ist
	public void testCheckToString() throws Exception{
		assertNotNull(testObject.toString());
	}
}