package qualityStreamTutorial;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class mercuryAutomatedTest {

	String chromeDriverResource = "./src/test/resources/chromeDriver/chromedriver(v124).exe";
	//Instanciar el webDriver
	private WebDriver driver;
	
	//Localizadores
	By locatorRegisterHome = By.linkText("REGISTER"); 
	By registerPage = By.xpath("//img[@src='images/mast_register.gif']");
	
	
	//Before es para la preparacion de la pagina y demas
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", chromeDriverResource);
		driver = new ChromeDriver();
		//Maximizamos la ventana
		driver.manage().window().maximize();
		//URL de la pagina a automatizar
		driver.get("https://demo.guru99.com/test/newtours/index.php");
	}
	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void registerUser() throws InterruptedException {
		//dar clic en el boton de register
		driver.findElement(locatorRegisterHome).click();
		Thread.sleep(3000);
		
		if(driver.findElement(registerPage).isDisplayed()) {
			JOptionPane.showMessageDialog(null, "Estamos en la pagina de registro");
		}else {
			JOptionPane.showMessageDialog(null, "Fallo al entrar a la pagina del registro");

		}
	}

}
