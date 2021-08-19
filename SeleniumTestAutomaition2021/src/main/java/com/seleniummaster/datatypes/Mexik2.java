package com.seleniummaster.datatypes;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Mexik2 {
    public static void main(String[] args) throws InterruptedException {


//        System.setProperty("webdriver.chrome.driver","/Users/alimjan/webdriver/chromedriver");
//
//        WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.google.com");
//        //driver.navigate().to("https://www.google.com" );
//        Thread.sleep(2000);
//       // driver.navigate().refresh();
//        driver.findElement(By.name("q")).sendKeys("Java"+ Keys.ENTER);
//        WebElement result=driver.findElement(By.id("result-stats"));
//        if (result.isDisplayed())
//            System.out.println("google search test pess ");
//        else
//            System.out.println("google search test file");
//        driver.close();
//        driver.quit();


        System.setProperty("webdriver.chrome.driver","/Users/alimjan/webdriver/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        //driver.navigate().to("https://www.google.com");

        Dimension dimension=new Dimension(600,700);
        driver.manage().window().setSize(dimension);
        Thread.sleep(2000);

        Point point=new Point(100,100);
        driver.manage().window().setPosition(point);
        Thread.sleep(2000);







        driver.findElement(By.name("q")).sendKeys("Java"+Keys.ENTER);
        WebElement result=driver.findElement(By.id("result-stats"));
        if (result.isDisplayed())
            System.out.println("google search test pass");
        else
            System.out.println("google search  test faile");
        driver.close();
        driver.quit();





























    }
}
