package com.seleniummaster.loops;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleClick {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/alimjan/webdriver/chromedriver");


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();



        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //driver.navigate().to("https://www.google.com");


        driver.findElement(By.id("divpaxinfo")).click();

        for (int i=0;i<5;i++){
         Thread.sleep(2000);

            driver.findElement(By.id("hrefIncAdt")).click();



        }





        driver.close();
        driver.quit();









    }
}
