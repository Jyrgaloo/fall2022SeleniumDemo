package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class GlovoLogin extends $BaseTest {



    @Test
    public void buttonGetStarted (){
        driver.get("https://glovoapp.com/kg/en/bishkek/");

        WebElement buttonGetStarted = driver.findElement(By.xpath("(//button[@id='user-register'])[2]"));
        buttonGetStarted.click();

        WebElement nameFieldInput = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        nameFieldInput.sendKeys("testName1");

        WebElement emailFieldInput = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
        emailFieldInput.sendKeys("testname@mail.com");

        WebElement passFieldInput = driver.findElement(By.xpath("//input[@type='password']"));
        passFieldInput.sendKeys("TestPassword,./123");

        WebElement buttonSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
        buttonSubmit.click();

    }



}
