import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class App {

    public static void main(String args[]){

        //Firefox still doesn't work even after updating to Firefox 59.0.2 (64bit)
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\GBTC440015ur\\Desktop\\selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe");
        //WebDriver wd = new FirefoxDriver();

        // But Chrome does:
        System.setProperty("webdriver.chrome.driver","C:\\Users\\GBTC440015ur\\Desktop\\selenium\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();

        wd.manage().deleteAllCookies();
        wd.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

        //wd.get("http://www.pluralsight.com/");
        wd.get("http://demo.guru99.com/");
        String wHnd = wd.getWindowHandle();
        System.out.println("Window handle is : " + wHnd);



        WebElement element=wd.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com");

        WebElement button=wd.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();

    }
}
