package intro;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Demo2 extends $BaseTest {



    @Test
    public void testDemo1(){
        driver.get("https://demoqa.com/text-box");

        Faker faker = new Faker();

        String userName = faker.name().lastName();
        String userEmail = faker.internet().emailAddress();
        String currentAddress = faker.address().streetAddress();
        String permanentAddress = faker.address().streetAddress();


        WebElement fullNameInput = driver.findElement(By.id("userName"));
        WebElement emailInput = driver.findElement(By.id("userEmail"));
        WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));

        fullNameInput.sendKeys(userName);
        emailInput.sendKeys(userEmail);
        currentAddressInput.sendKeys(currentAddress);
        permanentAddressInput.sendKeys(permanentAddress);


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");


        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        WebElement actualNameElement = driver.findElement(By.id("name"));
        WebElement actualEmailElement = driver.findElement(By.id("email"));
        WebElement actualCurrentAddressElement = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        WebElement actualPermanentAddressElement = driver.findElement(By.xpath("//p[@id='permanentAddress']"));

        String actualTextName = actualNameElement.getText();
        String actualTextEmail = actualEmailElement.getText();
        String actualTextCurrentAddress = actualCurrentAddressElement.getText();
        String actualTextPermanentAddress = actualPermanentAddressElement.getText();

        Assert.assertTrue(actualTextName.contains(userName));
        Assert.assertTrue(actualTextEmail.contains(userEmail));
        Assert.assertTrue(actualTextCurrentAddress.contains(currentAddress));
        Assert.assertTrue(actualTextPermanentAddress.contains(permanentAddress));





    }




}
