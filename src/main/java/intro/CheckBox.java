package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBox extends $BaseTest {

    @Test
    public void clickCheckBox (){
        driver.get("https://demoqa.com/checkbox");

        WebElement firstCheck = driver.findElement(By.xpath("(.//button[@title='Toggle'])[1]"));
        firstCheck.click();

        WebElement secondCheck = driver.findElement(By.xpath("(.//button[@title='Toggle'])[2]"));
        secondCheck.click();

        WebElement selectBox = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[4]"));
        selectBox.click();

        Assert.assertTrue(selectBox.isEnabled());
    }


}



