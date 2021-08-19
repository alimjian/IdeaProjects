package com.seleniummaster.uiautomation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch3 {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","/Users/alimjan/webdriver/chromedriver");


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        //driver.navigate().to("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("Java"+ Keys.ENTER);

        WebElement result=driver.findElement(By.id("result-stats"));


        String searchResult=result.getText();
        System.out.println(searchResult);

        int beginIndex=searchResult.indexOf("(");
        searchResult=searchResult.substring(0,beginIndex-1);
        searchResult=searchResult.replace("Environ","")
                .replace("résultats","").trim();
        System.out.println(searchResult);

        searchResult=searchResult.replace(" ","");

        System.out.println(searchResult);

        if(Integer.parseInt(searchResult)>=1000000){
            System.out.println("test passed, search result correct");

        }
        else {
            System.out.println("test failed");

        }

        Thread.sleep(2000);



       // driver.close();
       // driver.quit();














    }
}
