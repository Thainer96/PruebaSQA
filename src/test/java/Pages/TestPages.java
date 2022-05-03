package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestPages {
	WebDriver driver;
	
	
			public By tiploSelect;
			public By inputDestino;
			public By textCiudad;
			public By textMapas;
			public By Xcerrar;
			public By fechaIda;
			public By fechaRegreso;
			public By listDiasCalendario;
			public By buscarBtn;
			public By aplicarBtn;
			public By btnModificar;
			
			public By listhoteles;
			public By listVerDetalles;
			
			public By textDestino;
			public By listTextFechas;
			public By textTotal;
			
			public By btnReservar;
			
			public By textTitular;
			public By listIntput;
			
			
		public TestPages(WebDriver driver) {
			this.driver = driver;	
		
			
			tiploSelect = By.xpath("(*//label[contains(@class,'button-circle-label') and text() = 'Alojamientos'])");
			Xcerrar = By.xpath("(*//i[contains(@class,'login-incentive')])");
			textCiudad = By.xpath("(*//span[contains(@class,'ac-group-title') and text() = 'Ciudades'])");
			textMapas = By.xpath("(*//label[contains(@class,'eva-3-link') and text() = ' Ver en mapa '])");
			inputDestino = By.xpath("//input[@placeholder='Ingresa una ciudad, alojamiento o punto de interés']");
			fechaIda = By.xpath("//input[@placeholder='Entrada']");
			fechaRegreso = By.xpath("//input[@placeholder='Salida']");
			buscarBtn = By.xpath("(*//em[contains(@class,'btn-text') and text() = 'Buscar'])[2]");
			aplicarBtn = By.xpath("(*//em[contains(@class,'btn-text') and text() = 'Aplicar'])[4]");
			
			listhoteles = By.xpath("(*//span[contains(@class,'accommodation-nam')])");
			listVerDetalles = By.xpath("(*//em[contains(@class,'btn-text') and text()='Ver detalle'])");
			
			textDestino = By.xpath("(*//span[contains(@class,'item-container')])[2]");
			btnModificar = By.xpath("(*//em[contains(@class,'btn-text') and text()='Modificar'])");
			listTextFechas = By.xpath("(*//ul[contains(@class,'re-search-searchbox')])//child::span[contains(@class,'item-date-container')]");
			textTotal = By.xpath("(*//div[contains(@class,'price-info-wrapper')])[1]//child::span[2]");
			
			btnReservar = By.xpath("(*//em[contains(@class,'btn-text') and text()='Reservar ahora'])");
			textTitular = By.xpath("(*//div[contains(@class,'eva-3-h4') and text()='¿Quién será el titular de la reserva?'])");
			
			listIntput = By.xpath("//input[contains(@class,'input-tag')]");
		}	
}
