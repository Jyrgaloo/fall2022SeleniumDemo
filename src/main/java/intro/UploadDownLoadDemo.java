package intro;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UploadDownLoadDemo extends $BaseTest {

    @Test
    public void test(){
        driver.navigate().to("https://demoqa.com/upload-download");
        driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\1\\OneDrive\\Документы\\Книга 1.xlsx");

    }
}
