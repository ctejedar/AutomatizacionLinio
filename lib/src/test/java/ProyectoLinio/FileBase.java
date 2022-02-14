package ProyectoLinio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileBase {

private WebDriver driver;
	
	public FileBase(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		return driver;
		
	}
	
	
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> findElements(By locator){
		return driver.findElements(locator);
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	public String getText(By locator) {
		return driver .findElement(locator).getText();
	}
	
	public void type(String inputText, By Locator) {
		driver.findElement(Locator).sendKeys(inputText);
	}
	
	public void click(By Locator) {
		driver.findElement(Locator).click();
	}
	
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
			
		}catch(org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	public void visit(String url) {
		driver.get(url);
	}
	
	public void BackPage() {
		driver.navigate().back();
	}
	

	public void Scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
	}
	

	
	public void recorrer() {
		String xpathTblProductos = "cart-item-section";
		int contador = 0;
		WebElement tblProductos = 
				driver.findElement(By.className(xpathTblProductos));
		
		List<WebElement> filas =
				tblProductos.findElements(By.className("div.cart-item.row"));
		
		
		
		for(WebElement objectCurrent : filas ){
			String strinlinktext = objectCurrent.getText();
			System.out.println("hols" + strinlinktext);
		}
		
		System.out.println("Consolidado: " + tblProductos.getText());
		
	
		
	 }
		
	/*	
		for(WebElement ticket: ticketList){
			List<WebElement> ticketCells = ticket.findElements(By.className("cart-item-section"));
			  if(ticketCells.get(4).getText().equalsIgnoreCase("Some Text")){
			   ticketCells.get(2).click(); //Redirects to pageB
			   
			   //Finally clicking on the 'SAVE & BACK' button which should return  to previous 
			   //page and pick the 2nd ticket from the list of all tickets (1st for loop) 
			   driver.findElement(By.id("save&back")).click();
			  }
			}
	}
	*/
	

	public void Scroll1() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
		
	public void UploadFile(By Locator) {
		
		WebElement uploadElement = driver.findElement(Locator);
		uploadElement.sendKeys ("C:\\Users\\christian.tejeda\\Documents\\ejemplo.docx");
		
	}
	
//	Alert alert = driver.switchTo().alert();
//	alert.accept()

	
}
