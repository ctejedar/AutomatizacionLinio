package ProyectoLinio;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ComprarLaptop_Test {

	
	private WebDriver driver;
	NavegarxLaptop navegarLaptop;
	
	@Before
	public void setUp() throws Exception {
		navegarLaptop = new NavegarxLaptop(driver);
		driver = navegarLaptop.chromeDriverConnection();
		navegarLaptop.visit("https://www.linio.com.pe/");
		Thread.sleep(5000);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		navegarLaptop.SelecionarLaptop();	
		Thread.sleep(3000);
	}
	
}
