package com.seleniummaster.project2;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FunctionLibrary {
    WebDriver driver;
    public void openBrowser(String url)
    {
        System.setProperty("webdriver.chrome.driver","/Users/alimjan/webdriver/chromedriver");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    public boolean Login(LoginUser loginUser)
    {
      driver.findElement(By.id("login_login_username")).sendKeys(loginUser.getUserName());
      driver.findElement(By.id("login_login_password")).sendKeys(loginUser.getPassword());
      driver.findElement(By.id("login_submit")).click();
        WebElement name=driver.findElement(By.className("username"));
        if (name.isDisplayed()){
            System.out.println("user logged in");
            return true;
        }else {
            System.out.println("user login failed");
            return false;
        }
    }
}
