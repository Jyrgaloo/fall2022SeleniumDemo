package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class CSSDemo extends $BaseTest {


    @Test
    public void CssTest1(){
        driver.get("https://www.amazon.com");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("cell phone", Keys.ENTER);

        WebElement appleText = driver.findElement(By.cssSelector("li[id='p_89/Apple']"));
        System.out.println(appleText.getText());

        WebElement seeMore = driver.findElement(By.xpath("(//span[@class='a-expander-prompt'])[12]"));
        seeMore.click();


        List<WebElement> allBrands = driver.findElements(By.xpath("//*[@id=\"brandsRefinements\"]/ul"));

        for (WebElement e : allBrands) {
            if (e.getText().equals("Samsung")){
                e.click();
                break;

            }

        }

    }

}
