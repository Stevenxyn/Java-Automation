package qualityStreamTutorial;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class mercuryAutomatedTest {

	//Encontrar el chromeDriver
	String chromeDriverResourse = "./src/test/resources/chromeDriver/chromedriver.exe";
	//Instanciar el webDriver
	private webDriver driver;
	
	//Before es para la preparacion de la pagina y demas
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", chromeDriverResourse)
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
