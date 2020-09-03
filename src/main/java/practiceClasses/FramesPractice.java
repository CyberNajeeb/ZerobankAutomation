package practiceClasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPractice {
    public static void main(String[] args) throws Exception {
        switchFrames();
    }
    //Can someone throw this Test in their Selenium framework? I'm trying to figure out frames and I don't know why it keeps failing. I'm pretty sure the xpaths are correct.

    public static void switchFrames() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-cybertekschool.herokuapp.com/nested_frames");
        Thread.sleep(500);
        WebElement left = driver.findElement(By.xpath("//frame[@name='frame-left']"));
        WebElement middle = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
        WebElement right = driver.findElement(By.xpath("//frame[@name='frame-right']"));
        WebElement bottom = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
        driver.switchTo().frame(left);
        Thread.sleep(500);
        driver.switchTo().frame(middle);
        Thread.sleep(500);
        driver.switchTo().frame(right);
        Thread.sleep(500);
        driver.switchTo().frame(bottom);
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(500);
    }
}
