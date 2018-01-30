package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class new_selenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://fits.qauber.com/#/page/login");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys("fitway@mailinator.com");
        //Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("fitway");

driver.findElement(By.xpath("//html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();

driver.findElement(By.xpath("/html[1]/body[1]/div[2]/aside[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]")).click();
//driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[1]/div[1]/h3[1]/button[1]")).click();
//driver.findElement(By.xpath("id(\"ngdialog1\")/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("velnovar@gmail.com");
driver.findElement(By.xpath("id(\"ngdialog1\")/div[2]/div[1]/form[1]/button[1]")).click();
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/aside[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]/span[1]")).click();
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[1]/div[1]/h3[1]/button[1]")).click();
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("RogaKopyta");
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("999999999999");
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("fitway@mailinator.com");





        // Selecting CheckBox
       // WebElement option1 = driver.findElement(By.id("vfb-6-0"));
        //option1.click();
    }
}
