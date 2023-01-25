package intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class $BaseTest {

    WebDriver driver;
    $BrowserHelper browserHelper;

    $AlertHelper alertHelper;

    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup(); // настройка ChromeDriver для подключения к браузеру
        driver = new ChromeDriver(); // создаем объектChromeDriver
        driver.manage().window().maximize(); // Увеличение открытого окна
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Будет ожидать 20 секунд
        browserHelper = new $BrowserHelper(driver);
        alertHelper = new $AlertHelper(driver);

}


    @AfterClass
    public void tearDown(){
//        driver.close();
//        driver.quit();
    }

}
