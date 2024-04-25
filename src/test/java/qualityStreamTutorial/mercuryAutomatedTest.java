package qualityStreamTutorial;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class mercuryAutomatedTest {

	//Encontrar el chromeDriver
	String chromeDriverResourse = "./src/test/resources/chromeDriver/chromedriver.exe";
	//Instanciar el webDriver
	private WebDriver driver;
	
	//Before es para la preparacion de la pagina y demas
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", chromeDriverResourse);
		//Maximizamos la ventana
		driver.manage().window().maximize();
		//URL de la pagina a automatizar
		driver.get("https://demo.guru99.com/test/newtours/index.php");
	}
 //El viejo Christian nos volvera automatizadores
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
