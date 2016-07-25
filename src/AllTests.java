import junit.framework.Test;
import junit.framework.TestSuite;


public class AllTests {

	//Führt alle Tests aus
	
	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(RennenTest.class);
		suite.addTestSuite(RennschneckeTest.class);
		suite.addTestSuite(Wettbüro_WetteTest.class);
		//$JUnit-END$
		return suite;
	}

}
