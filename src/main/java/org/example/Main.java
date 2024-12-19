package main.java.org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = null;
        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.yahoo.com");

        WebElement search_box = driver.findElement(By.id("ybar-sbq"));
        search_box.sendKeys("NPRU");

        WebElement btn_search = driver.findElement(By.id("ybar-search"));
        btn_search.click();

//        driver.close();
    }
}