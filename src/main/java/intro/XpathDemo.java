package intro;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class XpathDemo extends $BaseTest {

    /*
    By.id                           1 из главных
    By.name
    By.ClassName
    By.partialLinkText
    By.LinkText
    By.tagName
    By.xpath (absolutXpath /html/   1 из главных
    By.cssSelector                  1 из главных


    //*[text()='Permanent Address']
    (//button[@type='button'])[2]
     */





    @Test
    public void xpathTest () {
        driver.get("https://demoqa.com/text-box");

        //Абсолютный путь xpath
        WebElement actualEmailNameText = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[2]/div[1]/label"));
        String expEmailText = "Email";
        Assert.assertEquals(actualEmailNameText.getText(),expEmailText);

        //relative xpath
        WebElement name2 = driver.findElement(By.xpath("//label[@id='userEmail-label']"));
        Assert.assertEquals(name2.getText(),"Email");

    }

    @Test
    public void test2 (){
        driver.get("https://demoqa.com/text-box");
        WebElement userName = driver.findElement(By.xpath("//input[@id='userName']"));
        userName.sendKeys("Jyrgalbek");
        Assert.assertEquals(userName.getAttribute("value"),"Jyrgalbek");
    }


    @Test
            public void clickSubmit(){
        driver.get("https://demoqa.com/text-box");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");


        WebElement clickSubmit = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        clickSubmit.click();


    }







}
