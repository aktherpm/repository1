package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class firstClassPractice {

    public static void main(String[] args) throws InterruptedException {
      WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver =new ChromeDriver();
        driver.get("file:///C:/java/webpage/firstseleniumpractice.html");
        driver.findElement(By.id("fname")).sendKeys("MOHAMMAD");
        Thread.sleep(2000);
        driver.findElement(By.id("lname")).sendKeys("AKTHER");
        Thread.sleep(2000);
        driver.findElement(By.id("pnumber")).sendKeys("1234567890");
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.className("adress")).sendKeys("123 MAIN ST");
        Thread.sleep(2000);
        driver.findElement(By.id("scales")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("horns")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("contact")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//option[@value='valor3'][4]")).click();
//        Select select = new Select(Dropdown);
//        select.selectByValue("valor 4");
        Thread.sleep(1000);
        driver.findElement(By.linkText("Click here to visit microtech")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.findElement(By.partialLinkText("USA")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.findElement(By.id("submited")).click();
      System.out.println("element");
      System.out.println("jnekins");
        driver.close();
    }
}

