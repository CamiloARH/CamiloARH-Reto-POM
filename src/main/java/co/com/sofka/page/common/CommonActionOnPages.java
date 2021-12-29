package co.com.sofka.page.common;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonActionOnPages extends BaseSikulix {
    private final WebDriver driver;
    private final WebDriverWait explicitWait;

    //Constructor

    protected CommonActionOnPages(WebDriver driver) {
        this.driver = driver;
        this.explicitWait = new WebDriverWait(driver,10);
    }
    protected void typeInto(By locator, String value){
        driver.findElement(locator).sendKeys(value);
    }

    protected void clearText(By locator){driver.findElement(locator).clear();}

    protected void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
    }

    protected void scrollUp(){
        JavascriptExecutor scrollUp = (JavascriptExecutor) driver;
        scrollUp.executeScript("window.scrollBy(1000,0)");
    }

    protected void scrollTo(By locator){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(locator));
    }

    protected void click(By locator){
        explicitWait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    protected String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    protected void pressEnter(By locator) {
        driver.findElement(locator).sendKeys(Keys.ENTER);
    }

    protected void pressTab(By locator) {
        driver.findElement(locator).sendKeys(Keys.TAB);
    }

    protected void arrowDown(By locator) {
        driver.findElement(locator).sendKeys(Keys.ARROW_DOWN);
    }


    protected void waitToBeClickable(By locator){
        this.explicitWait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected void waitUntilInvisibility (By locator) {
        var element = driver.findElement(locator);
        this.explicitWait.until(ExpectedConditions.invisibilityOf(element));
    }

    public boolean isElementPresent(By locator) {
        try {
            var element = driver.findElement(locator);
            return element.isDisplayed();
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    /*public void clickDay(By locator, int day) {
        var elements = driver.findElements(locator);
        var _day = elements.get(day - 1 );
        _day.click();
    }*/
////body/div[@id='component-modals']/div[1]/div[1]/div[2]/div[2]/div[3]/div[10]/div[1]
}
