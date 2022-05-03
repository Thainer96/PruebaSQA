package Acciones;


import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonFuntions.BaseTest;
import Pages.TestPages;


public class PruebaAccion extends BaseTest {
	
	WebDriver driver;
	private static Logger log = Logger.getLogger(PruebaAccion.class);
	TestPages testPage = new TestPages(driver);
		
	public PruebaAccion(WebDriver driver) {
		super(driver);
	}
	
	
	public void seleccionarTipo(String tipo) {
		log.info("**********  seleccionarTipo ************");
		try {
			if(tipo.equals("Alojamiento")) {
				esperaExplicita(testPage.tiploSelect);
				hacerClick(testPage.tiploSelect);
				esperaExplicita(testPage.Xcerrar);
				hacerClick(testPage.Xcerrar);
				adjuntarCaptura("Seleccionar alojamiento");
			}
		} catch (Exception e) {
			log.error("########## Error - seleccionarTipo()  #######" + e);
			assertTrue("########## Error - seleccionarTipo() ########"+ e,false);
		}
	}
	
	public void seleccionarDestino(String ciudad,String mes, String diaLlegada, String diaSalida) {
		log.info("**********  seleccionarDestino ************");
		try {
			esperaExplicita(testPage.inputDestino);
			hacerClick(testPage.inputDestino);
			Thread.sleep(2000);
			EscribirElemento(testPage.inputDestino, ciudad);
			esperaExplicita(testPage.textCiudad);
			EnviarEnter(testPage.inputDestino);						
			String listDias = "(*//div[contains(@class,'sbox5-monthgrid-title-month') and text()='"+mes+"'])[3]//descendant-or-self::div//parent::div//following-sibling::div[contains(@class,'sbox5-monthgrid-dates')]//child::div[contains(@class,'sbox5-monthgrid-datenumber-number')]";
			String fechaActual = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
			log.info("Immprimiendo dia actual" + separarFecha(fechaActual, "dia"));
			hacerClick(testPage.fechaIda);
			esperaExplicita(By.xpath(listDias));
			selectValorLista(By.xpath(listDias), diaLlegada);	
			hacerClick(testPage.fechaRegreso);
			esperaExplicita(By.xpath(listDias));
			selectValorLista(By.xpath(listDias), diaSalida);
			adjuntarCaptura("Detalle reserva");
			
		} catch (Exception e) {
			log.error("########## Error - seleccionarDestino()  #######" + e);
			assertTrue("########## Error - seleccionarDestino() ########"+ e,false);
		}
	}
	
	public void realizarBusqueda() {
		log.info("**********  realizarBusqueda ************");
		try {
			Hacer_scroll(testPage.aplicarBtn);
			esperaExplicita(testPage.aplicarBtn);
			hacerClick(testPage.aplicarBtn);
			Hacer_scroll(testPage.buscarBtn);
			esperaExplicita(testPage.buscarBtn);
			hacerClick(testPage.buscarBtn);			
		} catch (Exception e) {
			log.error("########## Error - realizarBusqueda()  #######" + e);
			assertTrue("########## Error - realizarBusqueda() ########"+ e,false);
		}
	}
	
	public void seleccionarHotel(String hotel) {
		log.info("**********  seleccionarHotel ************");
		try {
			esperaExplicita(testPage.textMapas);			
			selectListHotel(testPage.listhoteles,hotel);
			
		} catch (Exception e) {
			log.error("########## Error - seleccionarHotel()  #######" + e);
			assertTrue("########## Error - seleccionarHotel() ########"+ e,false);
		}
	}
	
	public void guardarInformacion() {
		log.info("**********  guardarInformacion ************");
		try {
			TrabajarVentanas();
			esperaExplicita(testPage.btnModificar);			
			RegistrarInformacion("Hotel Casablanca".concat(","+returnStringListelement(testPage.listTextFechas).toString().concat(",")));
			Hacer_scroll(testPage.btnReservar);
			adjuntarCaptura("Guardar reserva");
			hacerClick(testPage.btnReservar);
			
		} catch (Exception e) {
			log.error("########## Error - guardarInformacion()  #######" + e);
			assertTrue("########## Error - guardarInformacion() ########"+ e,false);
		}
	}
	
	public void llenarInputCliente(String Nombre, String Apellido, String Correo, String codPais,
			String Area, String NumeroCelular, String NumTarjeta, String TitularTarjeta, String Vencimiento) {
		log.info("**********  llenarInputCliente ************");
		try {
			esperaExplicita(testPage.textTitular);
			llenarDatosCliente(testPage.listIntput, Nombre,  Apellido,  Correo,  codPais,
					 Area,  NumeroCelular,  NumTarjeta,  TitularTarjeta,  Vencimiento);
			
		} catch (Exception e) {
			log.error("########## Error - llenarInputCliente()  #######" + e);
			assertTrue("########## Error - llenarInputCliente() ########"+ e,false);
		}
	}
	
	
	

}
