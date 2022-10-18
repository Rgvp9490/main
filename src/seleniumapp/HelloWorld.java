package seleniumapp;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import zmq.ZObject;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class HelloWorld
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\RAGHAV\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //System.setProperty("webdriver.edge.driver","C:\\Users\\RAGHAV\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver=new ChromeDriver();
        //WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        //driver.get("http://www.google.com");
        driver.get("http://www.youtube.com");
        driver.get("http://www.reward.in");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
