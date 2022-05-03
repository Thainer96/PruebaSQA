package StepsDefinitions;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import Acciones.PruebaAccion;
import CommonFuntions.BaseTest;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

public class TestSteps {

	WebDriver driver;
	Logger log = Logger.getLogger(TestSteps.class);
	BaseTest baseTest;
	PruebaAccion pruebaAccion;

	public TestSteps() {
		// super(driver);
		this.driver = Driver.driver;
		pruebaAccion = new PruebaAccion(driver);
	}

	@Dado("^un usuario que ingrese a la pagina de despegar$")
	public void unUsuarioQueIngreseALaPaginaDeDespegar() throws Throwable {
	}

	@Cuando("^seleccione el tipo \"([^\"]*)\"$")
	public void seleccioneElTipoSomething(String strArg1) throws Throwable {
		pruebaAccion.seleccionarTipo(strArg1);
	}

	@Y("^Seleccione de destino \"([^\"]*)\" con el mes \"([^\"]*)\" el dia \"([^\"]*)\" de llegada y \"([^\"]*)\" de salida$")
	public void seleccioneDeDestinoSomethingConElMesSomethingElDiaSomethingDeLlegadaYSomethingDeSalida(String ciudad,
			String mes, String diaLlegada, String diaSalida) throws Throwable {
		pruebaAccion.seleccionarDestino(ciudad, mes, diaLlegada, diaSalida);
	}

	@Y("^presione el boton aplicar y luego buscar$")
	public void presioneElBotonAplicarYLuegoBuscar() throws Throwable {
		pruebaAccion.realizarBusqueda();
	}

	@Entonces("^se muestra la lista de hoteles seleccionando \"([^\"]*)\"$")
	public void seMuestraLaListaDeHotelesSeleccionandoSomething(String hotel) throws Throwable {
		pruebaAccion.seleccionarHotel(hotel);
	}

	@Y("^se guarde la informacion en el archivo despues presionando el boton reservar$")
	public void seGuardeLaInformacionEnElArchivoDespuesPresionandoElBotonReservar() throws Throwable {
		pruebaAccion.guardarInformacion();
	}

	@Y("finalmente se llenan los datos del cliente {string}{string}{string}{string}{string}{string}{string}{string}{string}")
	public void finalmenteSeLlenanLosDatosDelCliente(String Nombre, String Apellido, String Correo, String codPais,
			String Area, String NumeroCelular, String NumTarjeta, String TitularTarjeta, String Vencimiento)
			throws Throwable {
		pruebaAccion.llenarInputCliente( Nombre,  Apellido,  Correo,  codPais,
				 Area,  NumeroCelular,  NumTarjeta,  TitularTarjeta,  Vencimiento);
	}

	

}
