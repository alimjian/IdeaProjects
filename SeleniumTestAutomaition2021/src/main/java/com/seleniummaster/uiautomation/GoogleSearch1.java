package com.seleniummaster.uiautomation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class GoogleSearch1 {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","/Users/alimjan/webdriver/chromedriver");


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        //driver.navigate().to("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("Java"+ Keys.ENTER);

        WebElement result=driver.findElement(By.id("result-stats"));

        if (result.isDisplayed())
            System.out.println("Google search test pass"); 
        else
            System.out.println("Google search test faile");

        //driver.close();
        //driver.quit();

        Thread.sleep(2000);
        Dimension dimension=new Dimension(600,700);
        driver.manage().window().setSize(dimension);
        Thread.sleep(3000);
        Point point=new Point(300,500);
        driver.manage().window().setPosition(point);
        WebElement serachBox=driver.findElement(By.name("q"));
        Point p1=serachBox.getLocation();
        int xCordinate=p1.getX();
        int yCordinate=p1.getY();
        System.out.println(xCordinate);
        System.out.println(yCordinate);













    }
}
