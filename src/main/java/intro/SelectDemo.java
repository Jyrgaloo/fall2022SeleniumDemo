package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDemo extends $BaseTest {
    @Test
    public void testSelect(){
        driver.get("https://demoqa.com/select-menu");
        Actions action = new Actions(driver);


        WebElement selectValue = driver.findElement(By.id("react-select-2-input"));
        selectValue.sendKeys("Group 1, option 2");
        selectValue.sendKeys(Keys.ENTER);


        WebElement selectOne = driver.findElement(By.id("react-select-3-input"));
        selectOne.sendKeys("Mr.");
        selectOne.sendKeys(Keys.ENTER);

        ;
        WebElement oldSelectMenu = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(oldSelectMenu);
        select.selectByIndex(2);                    // select by index

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement multiselectDropDown = driver.findElement(By.id("react-select-4-input"));
        multiselectDropDown.sendKeys("Green");
        multiselectDropDown.sendKeys(Keys.ENTER);
        multiselectDropDown.sendKeys("Blue");
        multiselectDropDown.sendKeys(Keys.ENTER);

        WebElement car = driver.findElement(By.id("cars"));
        Select select1 = new Select(car);
        select1.selectByIndex(3);


    }
}
