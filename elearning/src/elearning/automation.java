package elearning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class automation {

public static void main(String[] args) throws InterruptedException{
System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://elearningm1.upskills.in/");
        driver.findElement(By.id("login")).sendKeys("kaviya");
        driver.findElement(By.id("password")).sendKeys("4c6RpXMD3zsWTvB");
        driver.findElement(By.id("form-login_submitAuth")).click();
        driver.findElement(By.xpath("//*[@id=\"profileCollapse\"]/div/ul/li[5]/a")).click();
        driver.findElement(By.id("profile_password0")).sendKeys("4c6RpXMD3zsWTvB");
        driver.findElement(By.id("password1")).sendKeys("4c6RpXMD3zsWTvB");
        driver.findElement(By.id("profile_password2")).sendKeys("4c6RpXMD3zsWTvB");
        driver.findElement(By.id("profile_apply_change")).sendKeys("4c6RpXMD3zsWTvB");
        Thread.sleep(1000);
     
}

}
