package intro;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Demo1 extends $BaseTest {

    static Faker faker = new Faker();
    public static String generateFakeName(){ return faker.name().lastName().toString();}
    public static String generateFakeEmail(){ return faker.internet().emailAddress().toString();}
    public static String generateFakeAddress() {return faker.address().streetAddress(); }



    @Test
    public void testDemo1(){


        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField = driver.findElement(By.id("userName"));
        fullNameInputField.sendKeys(generateFakeName());

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys(generateFakeEmail());

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys(generateFakeAddress());

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys(generateFakeAddress());

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");


        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();



        String actualName = driver.findElement(By.id("name")).getText();
        String expectedName = fullNameInputField.getAttribute("value");
        Assert.assertTrue(actualName.contains(expectedName));

        String actualEmail = driver.findElement(By.id("email")).getText();
        String expectedEmail = email.getAttribute("value");
        Assert.assertTrue(actualEmail.contains(expectedEmail));


        String actualCurrentAddress = driver.findElement(By.xpath("//p[@id=\"currentAddress\"]")).getText();
        String expectedCurrentAddress= currentAddress.getAttribute("value");
        Assert.assertTrue(actualCurrentAddress.contains(expectedCurrentAddress));

        String actualPermanentAddress = driver.findElement(By.xpath("//p[@id=\"permanentAddress\"]")).getText();
        String expectedPermanentAddress= permanentAddress.getAttribute("value");
        Assert.assertTrue(actualPermanentAddress.contains(expectedPermanentAddress));








    }







}
