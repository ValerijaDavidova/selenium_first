
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class FirstTest {


   public static void main(String[] args) {

       System.setProperty( "webdriver.chrome.driver", "C://Users/Julia/Downloads/chromedriver_win32/chromedriver.exe" );
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.navigate().to("https://demoqa.com");
       driver.manage().timeouts().implicitlyWait(  Duration.ofSeconds(10) );

       driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][1]/div")).click();
       driver.findElement(By.xpath("//div[@class='element-group'][1]/div[@class='element-list collapse show']/ul[@class='menu-list']/li[@id='item-0']")).click();
       driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Rikko");
       driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("rikko@inbox.lv");
       driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Los Angeles");
       driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("New York");
       driver.findElement(By.xpath("//button[@id='submit']")).click();



    }
}
