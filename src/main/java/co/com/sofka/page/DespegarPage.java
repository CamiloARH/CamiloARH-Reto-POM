package co.com.sofka.page;

import co.com.sofka.model.DespegarModel;
import co.com.sofka.page.common.CommonActionOnPages;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.core.config.plugins.util.ResolverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

public class DespegarPage extends CommonActionOnPages {

    private final DespegarModel despegarModel;
    public static Log log= LogFactory.getLog(ResolverUtil.Test.class);

    //Constructor
    public DespegarPage(DespegarModel despegarModel, WebDriver webDriver) {
        super(webDriver);
        this.despegarModel = despegarModel;
        PageFactory.initElements(webDriver, this);
    }

    //Locators
    private final By soloIdaLocator = By.xpath("//span[text()='Solo ida']");
    private final By origenCityLocator = By.cssSelector("input[placeholder='Ingresa desde dónde viajas']");
    private final By destinyCityLocator = By.cssSelector("input[placeholder='Ingresa hacia dónde viajas']");
    private final By origenCityClickLocator = By.xpath("/html/body/div[4]/div/div/ul/li");
    private final By destinyCityClickLocator = By.xpath("/html/body/div[4]/div/div[1]/ul/li[1]");
    private final By dateLocator = By.cssSelector("input[placeholder='Ida']");
    private final By flechaCambioFecha = By.id("ico-arrow-right");
    private final By searchButtonLocator = By.cssSelector("button[class='sbox5-box-button-ovr--3LK5x sbox5-3-btn -secondary -icon -lg']");
    private final By locatorScrollAuxiliar = By.xpath("/html/body/div[3]");
    private final By buyButtonLocator = By.cssSelector("a[tooltip-position='LEFT_BOTTOM']");
    private final By equipajeLoadingLocator = By.className("-white");
    private final By equipajePageLocator = By.className("-show-modal");
    private final By continueButtonLocator = By.xpath("//em[.='Continuar']");
    private final By psePaymentLocator = By.xpath("//span[text()='PSE']");
    private final By locatorBancoOption = By.xpath("//*[@id=\"card-selector-0\"]");
    private final By nameFacturaLocator = By.cssSelector("input[id='invoice-first-name-0']");
    private final By lastNameFacturaLocator = By.cssSelector("input[id='invoice-last-name-0']");
    private final By idFacturaLocator = By.cssSelector("input[id='invoice-fiscal-identification-number-0']");
    private final By stateFacturaLocator = By.cssSelector("select[id='invoice-fiscal-address-state-0']");
    private final By cityFacturaLocator = By.cssSelector("input[id='invoice-fiscal-address-city-CASH_TRANSFER_BOG-0']");
    private final By cityDownFacturaLocator = By.cssSelector("ul[class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']");
    private final By addressFacturaLocator = By.xpath("//input[starts-with(@class,'input-tag invoice-fiscal-address-street')]");
    private final By nameFlyLocator = By.xpath("//input[starts-with(@class,'input-tag traveler-first-name')]");
    private final By lastNameFlyLocator = By.xpath("//input[starts-with(@class,'input-tag traveler-last-name')]");
    private final By idFlyLocator = By.cssSelector("input[id='traveler-identification-number-0']");
    private final By birthDayLocator = By.id("traveler-birthday-day-0");
    private final By birthMonthLocator = By.id("traveler-birthday-month-0");
    private final By birthYearLocator = By.id("traveler-birthday-year-0");
    private final By genderFemaleLocator = By.xpath("//em[text()='Femenino']");
    private final By genderMaleLocator = By.xpath("//em[text()='Masculino']");
    private final By emailLocator = By.cssSelector("input[placeholder='Ingresa el email de contacto']");
    private final By confirmationEmailLocator = By.cssSelector("input[placeholder='Ingresa tu email']");
    private final By areaLocator = By.cssSelector("input[autocomplete='section-contact-phone-0 tel-area-code']");
    private final By cellphoneLocator = By.cssSelector("input[autocomplete='section-contact-phone-0 tel-local']");

    //Locators to Check
    private final By nameCheckLocator = By.cssSelector("li:nth-child(1) div:nth-child(1) .eva-3-body-2:nth-child(2)");
    private final By lastNameCheckLocator = By.cssSelector("li:nth-child(1) div:nth-child(2) .eva-3-body-2:nth-child(2)");
    private final By idCheckLocator = By.cssSelector("li:nth-child(1) div:nth-child(3) .eva-3-body-2:nth-child(2)");


    //Funtions

    //Scenario 1
    public void flyIdaFields() {
        waitToBeClickable(soloIdaLocator);
        click(soloIdaLocator);

        click(origenCityLocator);
        clearText(origenCityLocator);
        typeInto(origenCityLocator, despegarModel.getOrigen());
        click(origenCityClickLocator);
        pressEnter(origenCityLocator);

        click(destinyCityLocator);
        clearText(destinyCityLocator);
        waitToBeClickable(destinyCityLocator);
        typeInto(destinyCityLocator, despegarModel.getDestiny());

        click(destinyCityClickLocator);
        pressEnter(destinyCityLocator);

        var dayToGoLocator = By.cssSelector("div[data-month='" + despegarModel.getFirstYear() + "-" + despegarModel.getFirstMonth() + "'] .sbox5-monthgrid-datenumber:nth-child(" + despegarModel.getFirstDay() + ")");

        click(dateLocator);
        scrollTo(locatorScrollAuxiliar);

        for (int i = 0; i <= Integer.parseInt(despegarModel.getFirstMonth()) - 1; i++) {
            click(flechaCambioFecha);
        }
        click(dayToGoLocator);
        click(searchButtonLocator);
    }

    //Scenario 2
    public void flyIdaYVueltaFields() {
        waitToBeClickable(origenCityLocator);

        click(origenCityLocator);
        clearText(origenCityLocator);
        typeInto(origenCityLocator, despegarModel.getOrigen());
        click(origenCityClickLocator);
        pressEnter(origenCityLocator);

        click(destinyCityLocator);
        clearText(destinyCityLocator);
        waitToBeClickable(destinyCityLocator);
        typeInto(destinyCityLocator, despegarModel.getDestiny());

        click(destinyCityClickLocator);
        pressEnter(destinyCityLocator);

        var dayToGoLocator = By.cssSelector("div[data-month='" + despegarModel.getFirstYear() + "-" + despegarModel.getFirstMonth() + "'] .sbox5-monthgrid-datenumber:nth-child(" + despegarModel.getFirstDay() + ")");
        var dayToBackLocator = By.cssSelector("div[data-month='" + despegarModel.getLastYear() + "-" + despegarModel.getLastMonth() + "'] .sbox5-monthgrid-datenumber:nth-child(" + despegarModel.getLastDay() + ")");

        click(dateLocator);
        scrollTo(locatorScrollAuxiliar);

        for (int i = 0; i <= Integer.parseInt(despegarModel.getFirstMonth()) - 1; i++) {
            click(flechaCambioFecha);
        }
        click(dayToGoLocator);
        log.info("Primera fecha");

        for (int i = 0; i <= Integer.parseInt(despegarModel.getFirstMonth())-Integer.parseInt(despegarModel.getLastMonth()); i++) {
            click(flechaCambioFecha);
        }
        click(dayToBackLocator);
        click(searchButtonLocator);
        log.info("Segunda fecha");
    }

    //General Scenario
    public void escogerVuelo() {
        //Page 2
        waitToBeClickable(buyButtonLocator);
        scrollTo(buyButtonLocator);
        click(buyButtonLocator);
        waitUntilInvisibility(equipajeLoadingLocator);

        if (isElementPresent(equipajePageLocator)) {
            waitToBeClickable(continueButtonLocator);
            click(continueButtonLocator);
        }else{
            log.info("No se necesita escoger tipo de equipaje");
        }
    }
    public void fillInformation() {

        //Page 3
        waitToBeClickable(psePaymentLocator);
        scrollTo(psePaymentLocator);
        click(psePaymentLocator);

        waitToBeClickable(locatorBancoOption);
        click(locatorBancoOption);
        typeInto(locatorBancoOption, despegarModel.getBancoPse().getValue());
        pressEnter(locatorBancoOption);

        scrollDown();
        waitToBeClickable(nameFacturaLocator);
        typeInto(nameFacturaLocator,despegarModel.getName());
        typeInto(lastNameFacturaLocator, despegarModel.getLastName());
        typeInto(idFacturaLocator, despegarModel.getDocuments().getValue());

        typeInto(stateFacturaLocator, despegarModel.getState().getValue());
        pressEnter(stateFacturaLocator);
        pressEnter(stateFacturaLocator);

        clearText(cityFacturaLocator);
        typeInto(cityFacturaLocator, despegarModel.getCity().getValue());
        waitToBeClickable(cityDownFacturaLocator);
        click(cityDownFacturaLocator);
        typeInto(addressFacturaLocator,despegarModel.getAddress());

        scrollTo(nameFlyLocator);
        typeInto(nameFlyLocator,despegarModel.getName());
        typeInto(lastNameFlyLocator,despegarModel.getLastName());
        typeInto(idFlyLocator,despegarModel.getDocuments().getValue());

        if(isElementPresent(birthDayLocator)){
            typeInto(birthDayLocator, despegarModel.getBirthday());
            typeInto(birthMonthLocator, despegarModel.getBirthMont());
            typeInto(birthYearLocator, despegarModel.getBirthYear());
        }else{
            log.info("No se encontro el campo de fecha de nacimiento");
        }
        if(isElementPresent(genderFemaleLocator) && despegarModel.getGender().getValue().equals("Female")){
            click(genderFemaleLocator);
        }else{
            log.info("No se encontro el campo de genero HOMBRE");
        }
        if(isElementPresent(genderMaleLocator) && despegarModel.getGender().getValue().equals("Male")){
            click(genderMaleLocator);
        }else{
            log.info("No se encontro el campo de genero HOMBRE");
        }
        typeInto(emailLocator,despegarModel.getEmail());
        typeInto(confirmationEmailLocator,despegarModel.getEmail());

        typeInto(areaLocator,despegarModel.getArea());
        typeInto(cellphoneLocator,despegarModel.getPhone().getValue());
    }

    public String checkName(){
        return getText(nameCheckLocator);
    }
    public String checkLastname(){
        return getText(lastNameCheckLocator);
    }
    public String checkId(){
        return getText(idCheckLocator);
    }




}
