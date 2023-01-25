package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrowserDemo extends $BaseTest {




    @Test
    public void test1(){
    browserHelper.openURL("https://demoqa.com/browser-windows");
    WebElement newTab = driver.findElement(By.id("tabButton"));
    newTab.click();
    intro.$Helper.pause(3000);
    browserHelper.SwitchToWindow(1);
    intro.$Helper.pause(3000);
    browserHelper.switchToParent();


    }


}
