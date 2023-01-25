package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Etsy extends $BaseTest {

    @Test
    public void loginEtsy(){
        driver.navigate().to("https://www.etsy.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='join_neu_email_field']"))).sendKeys("test@gmail.kg");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='join_neu_password_field']"))).sendKeys("12345");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),'Войти в аккаунт')]"))).click();

    }
}
