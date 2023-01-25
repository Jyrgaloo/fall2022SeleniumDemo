package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class HW_moving extends $BaseTest {


    @Test (priority = 1)
    public void testMoveToElementAndSelect() {
        driver.get("https://www.imoving.com/");
        WebElement houseTypeSelectMenu = driver.findElement(By.id("houseTypeSelectList"));
        Select select = new Select(houseTypeSelectMenu);
        select.selectByVisibleText("My Apartment");
        intro.$Helper.pause(1000);
        WebElement dropdown_menu = driver.findElement(By.id("hp-nav-select-house"));
        Select selectDropDownMenu = new Select(dropdown_menu);
        selectDropDownMenu.selectByVisibleText("Just a few Items");
        driver.findElement(By.xpath("(//button[@type='submit'])[11]")).click();

        intro.$Helper.pause(4000);
        driver.findElement(By.xpath("//a[@class='btn btn-blue col-xs-6']")).click();
        intro.$Helper.pause(1000);
        driver.findElement(By.xpath("//div[@class='modal-footer mc-flex-0']")).click();
        intro.$Helper.pause(1000);
        driver.findElement(By.xpath("//a[@id='closeTutorial']")).click();
        intro.$Helper.pause(2000);

        Actions action = new Actions(driver);

        WebElement dresserSelect = driver.findElement(By.xpath("//div[@class='14']")).findElement(By.xpath("//div[@class='item']"));
        action.moveToElement(dresserSelect).perform();
        driver.findElement(By.xpath("(//a[@class='btn btn-blue'])[1]")).click();
        driver.findElement(By.xpath("(//button[@class='quantity-plus'])[1]")).click();


        WebElement bed = driver.findElement(By.xpath("//div[@class='13']")).findElement(By.xpath("//div[@class='item']"));
        action.moveToElement(bed).perform();
        driver.findElement(By.xpath("(//a[@class='btn btn-blue'])[1]")).click();
        driver.findElement(By.xpath("(//button[@class='quantity-plus'])[3]")).click();



        WebElement tv = driver.findElement(By.xpath("//div[@class='12']")).findElement(By.xpath("//div[@class='item']"));
        action.moveToElement(tv).perform();
        driver.findElement(By.xpath("(//a[@class='btn btn-blue'])[1]")).click();
        driver.findElement(By.xpath("(//button[@class='quantity-plus'])[5]")).click();
        intro.$Helper.pause(1000);
        driver.findElement(By.xpath("(//h3[@class='action-header'])[2]")).click();
        intro.$Helper.pause(1000);
        driver.findElement(By.xpath("(//button[@class='quantity-plus'])[1]")).click();
        driver.findElement(By.xpath("(//button[@class='quantity-plus'])[3]")).click();
        driver.findElement(By.xpath("(//button[@class='quantity-plus'])[4]")).click();
        driver.findElement(By.xpath("(//a[@class='btn btn-blue'])[3]")).click();
        intro.$Helper.pause(1000);





        driver.findElement(By.xpath("(//input[@name='addressInput'])[1]")).sendKeys("Tempe, AZ 85281, USA");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,250)", "");
        intro.$Helper.pause(1000);
        driver.findElement(By.xpath("(//button[@class='btn btn-green save-instructions'])[1]")).click();
//        $Helper.pause(1000);
        driver.findElement(By.xpath("((//div[@class='pickup-point'])[2]//span//input)[1]")).sendKeys("San Antonio, TX 78216, USA");        intro.$Helper.pause(1000);
//        js.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(By.xpath("(//button[@class='btn btn-green save-instructions'])[3]")).click();
        driver.findElement(By.xpath("//button[text()='Confirm']")).click();
        driver.findElement(By.xpath("//div[@class='moving-footer clearfix']//button")).click();



//        driver.findElement(By.xpath("(//a[@class='btn btn-blue'])[2]")).click();
//        driver.findElement(By.xpath("(//button[@class='quantity-plus'])[3]")).click();
//

    }
//    @Test (priority = 2)
//    public void dresserTest (){
//
//        WebElement dresserSelect = driver.findElement(By.xpath("//div[@class='14']"));
//        Actions action = new Actions(driver);
//        action.moveToElement(dresserSelect);
//        driver.findElement(By.xpath("(//a[@class='btn btn-blue'])[1]")).click();
//        driver.findElement(By.xpath("(//button[@class='quantity-plus'])[1]")).click();
//        $Helper.pause(3000);

//    }
//    @Test (priority = 3)
//    public void bedTest (){
//
//        WebElement bed = driver.findElement(By.xpath("//div[@class='13']"));
//        Actions action = new Actions(driver);
//        action.moveToElement(bed);
//        driver.findElement(By.xpath("(//a[@class='btn btn-blue'])[1]")).click();
//        driver.findElement(By.xpath("(//button[@class='quantity-plus'])[1]")).click();

}


