package qualityStreamTutorial;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	
	String chromeDriverResource = "./src/test/resources/chromeDriver/chromedriver.exe";
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", chromeDriverResource);
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //Maximiza la ventana
		driver.get("https://www.google.com/");//Url de la pagina que queremos ocupar
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testGoogleSearch() {
		//Buscamos la searchbox del navegador
		WebElement searchbox = driver.findElement(By.name("q"));
		
		//Limpiamos el box
		searchbox.clear();
		
		//con esto ingresamos valores al box
		searchbox.sendKeys("Cigarettes after sex Touch Lyrics");
		
		//con esto damos entes a la busqueda
		searchbox.submit();
		
		//asignamos un tiempo para la validacion de que la busqueda se completo
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//checamos que el resultado de la busqueda sea lo que buscamos
		assertEquals("Cigarettes after sex Touch Lyrics", driver.getTitle());
	}
	/*
	@After
	
	 public void tearDown() {
		driver.quit();
	}
	 * 
	 * */
	
}
