package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExeecuter extends $BaseTest {

    @Test
    public void test1(){
        driver.get("https://www.etsy.com/");
        WebElement careersLink = driver.findElement(By.xpath("//a[@href='https://www.etsy.com/careers?ref=ftr']"));
        intro.$Helper.jsClick(driver,careersLink);
        intro.$Helper.jsScrollDownThePage(driver,"350");
        intro.$Helper.pause(5000);
        intro.$Helper.jsScrollDownThePage(driver,"500");
    }

}
