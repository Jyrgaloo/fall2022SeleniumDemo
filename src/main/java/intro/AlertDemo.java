package intro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertDemo extends $BaseTest {


    @Test
    public void testALert (){
        driver.get("https://demoqa.com/alerts");

        WebElement alertButton = driver.findElement(By.id("alertButton"));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        intro.$Helper.pause(4000);


    }
    @Test
    public void testExplicitWaitAndAlert(){
        driver.get("https://demoqa.com/alerts");
        WebElement alertButton = driver.findElement(By.id("timerAlertButton"));
        alertButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }
    @Test
    public void testThirdBtn (){
        driver.get("https://demoqa.com/alerts");
        WebElement thirdBtn = driver.findElement(By.id("confirmButton"));
        thirdBtn.click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        Assert.assertEquals(driver.findElement(By.id("confirmResult")).getText(),"You selected Cancel");

    }

    @Test
    public void fourthBtn(){
        driver.get("https://demoqa.com/alerts");
        WebElement fourthBtn = driver.findElement(By.id("promtButton"));
        fourthBtn.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Jyrgal");
        alert.accept();
        Assert.assertEquals(driver.findElement(By.id("promptResult")).getText(),"You entered Jyrgal");
    }


}
