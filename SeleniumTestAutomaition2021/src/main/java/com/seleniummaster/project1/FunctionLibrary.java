package com.seleniummaster.project1;

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
    public void login(LoginUser LoginUser)
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("login_login_username")).sendKeys(LoginUser.getUserName());
        driver.findElement(By.id("login_login_password")).sendKeys(LoginUser.getPassword());
        driver.findElement(By.id("login_submit")).click();
        driver.findElement(By.xpath("//*[@id=\"home-info-engage\"]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"main-column-container\"]/div[2]/a")).click();
        driver.findElement(By.id("editgroup_name")).sendKeys("mahara-test group2-alimjan"+System.currentTimeMillis());
        driver.findElement(By.id("editgroup_submit")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"main-column-container\"]/div[3]/a[2]/span[2]")).click();
        driver.findElement(By.id("editgroup_submit")).click();


        WebElement downElement = driver.findElement(By.xpath("//*[@class='user-toggle']/span[2]"));
       WebElement logoutIcon=driver.findElement(By.id("logoutbutton"));

    }
    public void logOut(){
        WebElement downElement = driver.findElement(By.xpath("//*[@class='user-toggle']/span[2]"));
        downElement.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement logOutIcon = driver.findElement(By.id("logoutbutton"));
        logOutIcon.click();
    }
    public void closeBrowser()
    {
     driver.close();
     driver.quit();
    }

}
