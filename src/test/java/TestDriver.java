package test.java;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;


public class TestDriver {
//    @Test
    @Disabled
    public void test1(){
        WebDriver driver = null;
//        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
//        driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.get("https://www.yahoo.com");

        WebElement search_box = driver.findElement(By.id("ybar-sbq"));
        search_box.sendKeys("NPRU");

        WebElement btn_search = driver.findElement(By.id("ybar-search"));
        btn_search.click();

        driver.close();
    }

//    @Test
    @Disabled
    public void test2(){
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.id("APjFqb")).sendKeys("kru");
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
//        String actual = driver.findElement(By.cssSelector(".qrShPb > span")).getText();
        String actual = driver.findElement(By.xpath("/html/body/div[3]/div/div[13]/div/div[2]/div[3]/div/div[3]/div/div/div[2]/div/div[2]/div[1]/div/div")).getText();

//        String expected = "มหาวิทยาลัยราชภัฏนครปฐม";
        String expected = "มหาวิทยาลัยราชภัฏกาญจนบุรี";

        assertEquals(expected, actual);


//        if(result.equalsIgnoreCase("มหาวิทยาลัยราชภัฏนครปฐม")){
//            System.out.println("pass");
//        }else{
//            System.out.println("not pass");
//        }
//        driver.findElement(By.cssSelector(".LLD4me")).click();
//        driver.findElement(By.cssSelector("center:nth-child(1) > .gNO89b")).click();
        driver.close();
    }

    @Test
    public void calculateTest(){
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.id("APjFqb")).sendKeys("5+5");
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
        String actual = driver.findElement(By.id("cwos")).getText();

        String expected = "10";

        assertEquals(expected, actual);

        driver.close();
    }
}
