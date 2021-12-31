package co.com.sofka.stepdefinition;


import co.com.sofka.model.DespegarModel;
import co.com.sofka.page.DespegarPage;
import co.com.sofka.runner.DespegarCucumber;
import co.com.sofka.setup.WebUI;
import co.com.sofka.util.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;


public class despegarTestStepdefinition extends WebUI {

    private DespegarModel cliente;
    private static final Logger LOGGER = Logger.getLogger(despegarTestStepdefinition.class);

    //Scenario 1
    @Given("el cliente se encuentra en la pagina principal")
    public void elClienteSeEncuentraEnLaPaginaPrincipal() {
        try {
            generalSetup();
            generateClient();
            LOGGER.info("Se organiza la pagina principal y el cliente");
        } catch (Exception exception) {
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error("Problema en el Give");
            quitDrive();
        }
    }
    @When("el cliente selecciona el lugar de destino")
    public void elClienteSeleccionaElLugarDeDestino() {
        DespegarPage despegarPage = new DespegarPage(cliente, super.driver);
        try {
            despegarPage.flyIdaFields();
            LOGGER.info("Se escoge la configuracion ");
        } catch (Exception exception) {
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error("Problema en el primer when");
            quitDrive();
        }
    }
    @When("llena el formulario de datos personales y confirma su información")
    public void llenaElFormularioDeDatosPersonalesYConfirmaSuInformacion() {
        try {
            DespegarPage despegarPage = new DespegarPage(cliente, super.driver);
            despegarPage.escogerVuelo();
            despegarPage.fillInformation();
            LOGGER.info("Se escoge vuelo y se llena la informacion ");
        } catch (Exception exception) {
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error("Problema en el segundo when");
            quitDrive();
        }
    }
    @Then("la página deberá mostrar los datos ingresados")
    public void laPaginaDeberaMostrarUnMensajeIndicando() {
        try {
            DespegarPage despegarPage = new DespegarPage(cliente, super.driver);
            Assertions.assertEquals("Juan Ivan",despegarPage.checkName());
            Assertions.assertEquals("Gomez Hoyos",despegarPage.checkLastname());
            Assertions.assertEquals("14566546723",despegarPage.checkId());
            LOGGER.info("Se prueba si se realizo correctamente la incripcion");
            quitDrive();
        } catch (Exception exception) {
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error("Problema en el then");
            quitDrive();
        }
    }

    //Scenario 2

    @Given("el cliente esta la pagina principal")
    public void elClienteEstaLaPaginaPrincipal() {
        try {
            generalSetup();
            generateClient();
            LOGGER.info("Se organiza la pagina principal y el cliente");
        } catch (Exception exception) {
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error("Problema en el Give");
            quitDrive();
        }
    }
    @When("el cliente selecciona un lugar de destino y las fechas")
    public void elClienteSeleccionaUnLugarDeDestinoYLasFechas() {
        try {
            DespegarPage despegarPage = new DespegarPage(cliente, super.driver);
            despegarPage.flyIdaYVueltaFields();
            LOGGER.info("Se escoge la configuracion ");
        } catch (Exception exception) {
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error("Problema en el primer when");
            quitDrive();
        }
    }
    @When("llena los formulario de datos personales y confirma su información")
    public void llenaLosFormularioDeDatosPersonalesYConfirmaSuInformacion() {
        try {
            DespegarPage despegarPage = new DespegarPage(cliente, super.driver);
            despegarPage.escogerVuelo();
            despegarPage.fillInformation();
            LOGGER.info("Se escoge vuelo y se llena la informacion ");
        } catch (Exception exception) {
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error("Problema en el segundo when");
            quitDrive();
        }
    }
    @Then("el cliente vera los datos ingresados en la parte inferior")
    public void elClienteVeraLosDatosIngresadosEnLaParteInferior() {
        try {
            DespegarPage despegarPage = new DespegarPage(cliente, super.driver);
            Assertions.assertEquals("Juan Ivan",despegarPage.checkName());
            Assertions.assertEquals("Gomez Hoyos",despegarPage.checkLastname());
            Assertions.assertEquals("14566546723",despegarPage.checkId());
            LOGGER.info("Se prueba si se realizo correctamente la incripcion");
            quitDrive();
        } catch (Exception exception) {
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error("Problema en el then");
            quitDrive();
        }
    }

    private void generateClient () {
        cliente = new DespegarModel();
        cliente.setOrigen(" Medellin");
        cliente.setDestiny(" Nueva York");
//        cliente.setDestiny(" Bogota");
        cliente.setFirstDay(28);
        cliente.setFirstMonth("09");
        cliente.setFirstYear(2022);
        cliente.setLastDay(15);
        cliente.setLastMonth("10");
        cliente.setLastYear(2022);
        cliente.setBancoPse(Banks.BANCOLOMBIA);
        cliente.setName("Juan Ivan");
        cliente.setLastName("Gomez Hoyos");
        cliente.setDocuments(Documents.ID_DOCUMENTS);
        cliente.setState(State.ANTIOQUIA);
        cliente.setCity(City.SABANETA_ANT);
        cliente.setAddress("12 ###30-80");
        cliente.setBirthday("15");
        cliente.setBirthMont("8");
        cliente.setBirthYear("1989");
        cliente.setGender(Gender.MALE);
        cliente.setEmail("pedido-falso@pruebasQA.com");
        cliente.setArea("+057");
        cliente.setPhone(Phone.FIRST_NUMBER);
    }
}
