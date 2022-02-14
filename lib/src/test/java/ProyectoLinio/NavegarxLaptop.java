package ProyectoLinio;

import org.openqa.selenium.WebDriver;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavegarxLaptop extends FileBase {

	public NavegarxLaptop(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//-------------------------------------------------------------------//
	
	By selecionarMenuLap = By.cssSelector("div[class=\"icon icon-hamburger\"]");
	
	By ClickOpcionLaptop = By.xpath("//span[text() = \"Computación\"]");
	
	By SeleccionarCategLaptop = By.cssSelector("img[src=\"//i.linio.com/cms/a30fd102-4dea-11ea-a23b-9212766c6bec.jpeg\"]");
	
	By SeleccionarMarca = By.xpath("//dt[text() = \"Marca\"]");
	
	By EscogerMarca  =  By.cssSelector("dd#brand-body > ul > li:nth-of-type(6) > label > span:nth-of-type(1) > a");
	
//	By SeleccionarNotebook  = By.cssSelector("main > div:nth-of-type(1) > div:nth-of-type(6) > div:nth-of-type(1) > div:nth-of-type(1) > ul > li > ul:nth-of-type(2) > li > a > span:nth-of-type(2)");
	
	//By SeleccionarNotebook = By.xpath("//body/div[3]/main[1]/div[1]/div[6]/div[1]/div[1]/ul[1]/li[1]/ul[2]/li[1]/a[1]/span[2]");
	
	By SeleccionarNotebook  = By.xpath("//span[text() = \"Notebooks\"]");
	
	By OrdenarPrecioAscendente = By.cssSelector("span[class=\"filters-item sort-by-title d-none d-md-block\"]");
	
	By SeleccionarPrecioAscendente = By.cssSelector("dd#sortBy-body > ul > li:nth-of-type(2) > label > a");

	By SeleccionarLaptop01 = By.cssSelector("img[src=\"//i.linio.com/p/f2ac053b0392454c5d3f4e988373e780-catalog.jpg\"]");
	
	By SeleccionarLaptop02 = By.cssSelector("img[src=\"//i.linio.com/p/8bf1f261fbe2eeb76cd587174bd6a7fd-catalog.jpg\"]");
	
	By SeleccionarLaptop03 = By.cssSelector("img[src=\"//i.linio.com/p/4a1ba3107bcc90de17986a5506126ec5-catalog.jpg\"]");
	
	By AnadirCarritoLaptop = By.id("buy-now");
	
	By SeguirComprando = By.xpath("//button[text() = \"Seguir comprando\"]");
	
	By MostrarCompras = By.cssSelector("span[class=\"icon icon-cart profile-menu-icon\"]");
	
	
	
	public void SelecionarMenuLaptop() throws InterruptedException {
		click(selecionarMenuLap);
		Thread.sleep(2000);
	}

	public void SeleccionarOpcionLaptop() throws InterruptedException {
		click(ClickOpcionLaptop);
		Thread.sleep(2000);
		Scroll1();
	}
	
	public void seleccionarCategoriaLaptop() throws InterruptedException {
		click(SeleccionarCategLaptop);
		Thread.sleep(3500);
	}
	
	public void SeleccionarMarcalaptop() throws InterruptedException {
		click(SeleccionarMarca);
		Scroll();
		Thread.sleep(3500);
	}
	
	public void EscogerMarcaLaptop() throws InterruptedException {
		click(EscogerMarca);
		Thread.sleep(3500);
	}
	
	public void SeleccionarNotebookPage() throws InterruptedException {	
		click(SeleccionarNotebook);
		Thread.sleep(3500);
	}
	
	public void OrdenarPrecioAscendentepage() throws InterruptedException {	
		click(OrdenarPrecioAscendente);
		Thread.sleep(3500);
	}
	
	public void SeleccionarPrecioAscendentepage() throws InterruptedException {	
		click(SeleccionarPrecioAscendente);
		Thread.sleep(4500);
	}
	
	public void SeleccionarLaptop01Page() throws InterruptedException {	
		click(SeleccionarLaptop01);
		Thread.sleep(3000);
	}
	
	
	public void SeleccionarLaptop02Page() throws InterruptedException {	
		click(SeleccionarLaptop02);
		Thread.sleep(3000);
	}
	
	
	public void SeleccionarLaptop03Page() throws InterruptedException {	
		click(SeleccionarLaptop03);
		Thread.sleep(3000);
	}

	
	public void AddCarritoComprasLaptop() throws InterruptedException {	
		click(AnadirCarritoLaptop);
		Thread.sleep(1500);
	}
	
	public void SeguirComprandoPage() throws InterruptedException {	
		click(SeguirComprando);
		Thread.sleep(1500);
		BackPage();
	}
	
	public void MostrarComprasPage() throws InterruptedException {	
		click(MostrarCompras);
		Thread.sleep(1500);
	}
	

	
	
public void SelecionarLaptop() throws InterruptedException {
	
    SelecionarMenuLaptop();
	SeleccionarOpcionLaptop();
	Thread.sleep(3000);
	seleccionarCategoriaLaptop();
	SeleccionarMarcalaptop();
	EscogerMarcaLaptop();
	SeleccionarNotebookPage();
	OrdenarPrecioAscendentepage();
	SeleccionarPrecioAscendentepage();
	SeleccionarLaptop01Page();
	AddCarritoComprasLaptop();
	SeguirComprandoPage();
	SeleccionarLaptop02Page();
	AddCarritoComprasLaptop();
	SeguirComprandoPage();
	SeleccionarLaptop03Page();
	AddCarritoComprasLaptop();
	SeguirComprandoPage();
	MostrarComprasPage();
	recorrer();
	
		
	}
	
	
}
