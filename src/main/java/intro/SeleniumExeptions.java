package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SeleniumExeptions extends $BaseTest {

    @Test
    public void NoSuchElementExceptionTest() {
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.findElement(By.id("UserName1")).sendKeys("Hello World!");
        //org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element:

    }

    @Test
    public void noSuchWindowExceptionTest() {
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.switchTo().window("id"); //org.openqa.selenium.NoSuchWindowException: no such window
        browserHelper.SwitchToWindow(3); //java.lang.IllegalArgumentException: Invalid index: 3
    }

    @Test
    public void noSuchFrameExeptionTest() {
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.switchTo().frame(123); //org.openqa.selenium.NoSuchFrameException: no such frame
    }


    @Test
    public void noSuchAlertExceptionTest() {
        browserHelper.openURL("https://demoqa.com/text-box");
        alertHelper.acceptAlert();              //org.openqa.selenium.NoAlertPresentException: no such alert

    }

    @Test
    public void invalidSelectorExceptionTest() {
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.findElement(By.cssSelector("//button[@type='button'][2]")); //org.openqa.selenium.InvalidSelectorException: invalid selector

    }

    @Test
    public void noSuchSessionExceptionTest() {
        driver.quit();
        browserHelper.openURL("https://demoqa.com/text-box"); //org.openqa.selenium.NoSuchSessionException: Session ID is null

    }

    @Test
    public void staleElementReferenceExceptions() {  //org.openqa.selenium.StaleElementReferenceException: stale element reference
        browserHelper.openURL("https://www.amazon.com");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone", Keys.ENTER);
        List<WebElement> allBrands = driver.findElements(By.xpath("//div[@id='brandsRefinements']//ul/li/span/a"));
        int count = 0;
        for (
                WebElement e : allBrands) {
            count++;
            if (e.getText().contains("SAMSUNG")) {
                driver.findElement(By.xpath("(//div[@id='brandsRefinements']//ul/li/span/a/div/label/i)" + "[" + count + "]")).click();
            }
        }
    }

    @Test
    public void timeOutExceptionTest(){
        driver.navigate().to("https://demoqa.com/dynamic-properties");
        WebElement enableAfter = driver.findElement(By.id("enableAfter"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
        wait.until(ExpectedConditions.elementToBeClickable(enableAfter)).click();
    }

    @Test
    public void test123(){
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.findElement(By.id("submit")).click();//org.openqa.selenium.ElementNotInteractableException: element not interactable
    }

    @Test
    public void elementNotInteractableException(){
        driver.get("https://www.etsy.com/");
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']"));
        loginButton.click();
        $Helper.pause(2000);
        WebElement careersLink = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
        careersLink.click(); //org.openqa.selenium.ElementNotInteractableException: element not interactable

    }

    @Test
    public void elementClickInterceptedException(){
        browserHelper.openURL("https://demoqa.com/radio-button");
        driver.findElement(By.id("noRadio")).click();

    }


}