package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickActions extends $BaseTest {

    @Test
    public void testDoubleClick(){
        driver.get("https://demoqa.com/buttons");

        WebElement DoubleClick = driver.findElement(By.id("doubleClickBtn"));
        Actions action = new Actions(driver);

        action.doubleClick(DoubleClick).perform();
        intro.$Helper.pause(3000);
        Assert.assertEquals(driver.findElement(By.id("doubleClickMessage")).getText(),"You have done a double click");


        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        action.contextClick(rightClickBtn).perform();
        Assert.assertEquals(driver.findElement(By.id("rightClickMessage")).getText(),"You have done a right click");

        WebElement clickMe = driver.findElement(By.xpath(".//button[text()='Click Me']"));
        clickMe.click();
        Assert.assertEquals(driver.findElement(By.id("dynamicClickMessage")).getText(),"You have done a dynamic click");



    }

    @Test
    public void testMoveToElementAndSelect(){
        driver.navigate().to("https://www.imoving.com/");
        WebElement houseTypeSelectMenu = driver.findElement(By.id("houseTypeSelectList"));
        Select select = new Select(houseTypeSelectMenu);
        select.selectByValue("1080");
        WebElement moveSizeMenu = driver.findElement(By.id("hp-nav-select-house"));
        Select select2 = new Select(moveSizeMenu);
        select2.selectByVisibleText("Just a few Items");
        WebElement clickQuotes = driver.findElement(By.xpath("//button[@class='btn btn-white quickQuoteLink']"));
        clickQuotes.click();
        intro.$Helper.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.imoving.com/full-inventory/#!/");
        driver.navigate().back();
        intro.$Helper.pause(3000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.imoving.com/");

        driver.navigate().refresh();
        driver.navigate().forward();
    }


}
