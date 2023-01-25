package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class WebTables extends $BaseTest {

    @DataProvider(name = "Registration data")
    public Object[][] dpMethod(){
        return new Object[][] {
                {"TestName","TestLastName","john@gmail.com","25","5000","Legal"},
        };
    }

    String firstName = "Kary";
    String lastName = "May";
    String eMail = "test@ng.com";
    String age = "25";
    String salary = "5000";
    String department = "Legal";


    @Test
    public void registrationForm (){
        driver.get("https://demoqa.com/webtables");
        driver.findElement(By.id("addNewRecordButton")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.attributeContains(By.id("firstName"),"class"," mr-sm-2 form-control"));
        WebElement firstNameInput = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstNameInput.sendKeys(firstName);
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastName);
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(eMail);
        driver.findElement(By.xpath("//input[@id='age']")).sendKeys(age);
        driver.findElement(By.xpath("//input[@id='salary']")).sendKeys(salary);
        driver.findElement(By.xpath("//input[@id='department']")).sendKeys(department);
        driver.findElement(By.xpath("//button[@id='submit']")).click();



        WebElement tables = driver.findElement(By.xpath("//div[@class='rt-tbody']"));

        List<WebElement> allList = tables.findElements(By.className("rt-tr-group"));

        for (WebElement e : allList) {
            System.out.println(e.getText());
        }




    }

}
