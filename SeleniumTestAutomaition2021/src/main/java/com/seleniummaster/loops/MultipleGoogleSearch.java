package com.seleniummaster.loops;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleGoogleSearch {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","/Users/alimjan/webdriver/chromedriver");


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        driver.navigate().to("https://www.google.com");

        for (int i=1;i<3;i++){
            Thread.sleep(2000);
            driver.findElement(By.name("q")).sendKeys(args[i]+Keys.ENTER);
            driver.navigate().back();
        }




            driver.close();
            driver.quit();













    }
}
