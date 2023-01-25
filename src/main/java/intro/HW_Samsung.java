package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class HW_Samsung {


    public static class CssDemo extends $BaseTest {

        @Test
        public void cssTest1() {
            driver.get("https://www.amazon.com/");

            driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("cell phone", Keys.ENTER);

            WebElement seeMore = driver.findElement(By.xpath("(//span[@class='a-expander-prompt'])[12]"));
            seeMore.click();

            WebElement allBrandsUl = driver.findElement(By.xpath("//*[@id=\"brandsRefinements\"]/ul"));

            List<WebElement> allBrandsLi = allBrandsUl.findElements(By.tagName("li"));

            for (WebElement brand : allBrandsLi) {
                if (brand.getText().equals("SAMSUNG")) {
                    brand.findElement(By.tagName("a")).click();
                    break;

                }
            }
        }
    }
}