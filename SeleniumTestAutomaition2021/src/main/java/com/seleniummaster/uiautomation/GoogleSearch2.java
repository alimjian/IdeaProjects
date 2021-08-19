package com.seleniummaster.uiautomation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch2 {
    public GoogleSearch2() {
    }

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","/Users/alimjan/webdriver/chromedriver");


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        //driver.navigate().to("https://www.google.com");

        Dimension dimension=new Dimension(600,700);
        driver.manage().window().setSize(dimension);
        Thread.sleep(2000);
        Point point=new Point(300,500);

        System.out.println(point);
        Thread.sleep(3000);
        driver.manage().window().setPosition(point);
        WebElement searchBox=driver.findElement(By.name("q"));
        Point p1=searchBox.getLocation();
        int xCordinate=p1.getX();
        int yCordinate= p1.getY();
        System.out.println(xCordinate);
        System.out.println(yCordinate);



           Thread.sleep(2000);
            driver.close();
            driver.quit();




    }
}
