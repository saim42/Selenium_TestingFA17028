package com.assignment.questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FA17BSE028 {

    @Test
    public void loginPassTest(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        sleep(100);
        driver.manage().window().maximize();
        String url="https://www.facebook.com/";
        driver.get(url);
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("03409646487");
        sleep(3500);

        WebElement password=driver.findElement(By.id("pass"));
        password.sendKeys("bbm42sj42");
        sleep(2500);

        WebElement logInButton=driver.findElement(By.id("u_0_b"));
        logInButton.click();
        sleep(15000);
        String expectedURL="https://www.facebook.com/recover/code/?ars=contact_point_login&ph[0]=%2B**********87&spc=0&fl=three_login_attempts_failure&hash=AUbqLzH8zvc2838t";
        String actualURL=driver.getCurrentUrl();
        Assert.assertTrue(actualURL.contains(expectedURL),"The Test either failed or there's some mistake in the code.");
        sleep(2000);
        driver.quit();
    }



    @Test
    public void loginFailTest(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        sleep(100);
        driver.manage().window().maximize();
        String url="https://www.facebook.com/";
        driver.get(url);
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("03409646487");
        sleep(3500);

        WebElement password=driver.findElement(By.id("pass"));
        password.sendKeys("ghalatpassword");
        sleep(2500);

        WebElement logInButton=driver.findElement(By.id("u_0_b"));
        logInButton.click();
        sleep(15000);
        String expectedURL="https://www.facebook.com/recover/code/?ars=contact_point_login&ph[0]=%2B**********87&spc=0&fl=three_login_attempts_failure&hash=AUbqLzH8zvc2838t";
        String actualURL=driver.getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL,"The Test either failed or there's some mistake in the code.");
        sleep(2000);
        driver.quit();
    }



    @Test
    public void signUpPassTest(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        sleep(500);
        driver.manage().window().maximize();
        String url="https://www.facebook.com/";
        driver.get(url);
        WebElement firstName=driver.findElement(By.id("u_0_m"));
        firstName.sendKeys("Saim");
        sleep(3000);
        WebElement lastName=driver.findElement(By.id("u_0_o"));
        lastName.sendKeys("Tunni");
        sleep(3000);
        WebElement email=driver.findElement(By.id("u_0_r"));
        email.sendKeys("saimjahangir842@gmail.com");
        sleep(3000);
        WebElement reEmail=driver.findElement(By.id("u_0_u"));
        reEmail.sendKeys("saimjahangir842@gmail.com");
        sleep(2000);
        WebElement password=driver.findElement(By.id("password_step_input"));
        password.sendKeys("1#237saim");
        sleep(2500);
        Select day=new Select(driver.findElement(By.id("day")));
        day.selectByVisibleText("15");
        sleep(3000);
        Select month=new Select(driver.findElement(By.id("month")));
        month.selectByVisibleText("Sept");
        sleep(2000);
        Select year=new Select(driver.findElement(By.id("year")));
        year.selectByVisibleText("1997");
        sleep(1000);
        WebElement gender=driver.findElement(By.id("u_0_7"));
        gender.click();
        sleep(1000);
        WebElement logInButton=driver.findElement(By.id("u_0_13"));
        logInButton.click();
        sleep(15000);
        String expectedURL="https://www.facebook.com/checkpoint/1501092823525282/?next=https%3A%2F%2Fwww.facebook.com%2F";
        String actualURL=driver.getCurrentUrl();
        Assert.assertTrue(actualURL.contains(expectedURL),"The Test failed because expected or actual doesn't match");
        sleep(2000);
        driver.quit();
    }




    @Test
    public void signUpFailTest(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        sleep(500);
        driver.manage().window().maximize();
        String url="https://www.facebook.com/";
        driver.get(url);
        WebElement firstName=driver.findElement(By.id("u_0_m"));
        firstName.sendKeys("Saim");
        sleep(3000);
        WebElement lastName=driver.findElement(By.id("u_0_o"));
        lastName.sendKeys("Tunni");
        sleep(3000);
        WebElement email=driver.findElement(By.id("u_0_r"));
        email.sendKeys("saimjahangir842@gmail.com");
        sleep(3000);
        WebElement reEmail=driver.findElement(By.id("u_0_u"));
        reEmail.sendKeys("saimjahangir842@gmail.com");
        sleep(2000);
        WebElement password=driver.findElement(By.id("password_step_input"));
        password.sendKeys("saimjahangir842@gmail.com");
        sleep(2500);
        Select day=new Select(driver.findElement(By.id("day")));
        day.selectByVisibleText("15");
        sleep(3000);
        Select month=new Select(driver.findElement(By.id("month")));
        month.selectByVisibleText("Sept");
        sleep(2000);
        Select year=new Select(driver.findElement(By.id("year")));
        year.selectByVisibleText("1997");
        sleep(1000);
        WebElement gender=driver.findElement(By.id("u_0_7"));
        gender.click();
        sleep(1000);
        WebElement signUpButton=driver.findElement(By.id("u_0_13"));
        signUpButton.click();
        sleep(15000);
        String expectedURL="https://www.facebook.com/checkpoint/1501092823525282/?next=https%3A%2F%2Fwww.facebook.com%2F";
        String actualURL=driver.getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL,"Your email address cannot be your password. Please enter at least six letters and numbers.");
        sleep(2000);
        driver.quit();
    }



    public void sleep(long t) {
        try{
            Thread.sleep(t);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
