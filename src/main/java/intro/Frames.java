package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Frames extends $BaseTest {

    @Test
    public void sampleFrame(){
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame(2);
        WebElement text = driver.findElement(By.id("sampleHeading"));
        System.out.println(text.getText());

        driver.switchTo().defaultContent();
        driver.switchTo().frame(3);
        WebElement text1 = driver.findElement(By.id("sampleHeading"));
        System.err.println(text1.getText());

        driver.switchTo().defaultContent();
        WebElement frames = driver.findElement(By.xpath("//div[@class='main-header']"));
        System.out.println(frames.getText());




    }

}
