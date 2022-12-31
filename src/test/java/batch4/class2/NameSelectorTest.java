package batch4.class2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NameSelectorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://parabank.parasoft.com/parabank");
        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys("laskjdklasjd");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("laskjdklasjd");
        Thread.sleep(2000);

        driver.findElement(By.linkText("Services")).click();
        Thread.sleep(2000);

        driver.findElement(By.partialLinkText("min Pa")).click();
        Thread.sleep(2000);

        driver.findElement(By.tagName("div")).click();
        Thread.sleep(2000);



        driver.quit();
    }
}
