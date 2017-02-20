package com.yimei.site.support;

import cucumber.api.Scenario;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;
    private static int DEFAULT_WAIT_TIME = 10;

    public static WebDriver getDriver() {

        return driver;
    }

    public static void createFirefoxDriver() {

        driver = new FirefoxDriver();
        setDefaultDriverTimeout();
    }

    public static void shutdownDriver(Scenario scenario) {

        if (driver != null) {
            if (scenario.isFailed()) {

                try {

                    scenario.write("Current Page URL is " + driver.getCurrentUrl());
//                    byte[] screenshot = getScreenshotAs(OutputType.BYTES);
                    byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                    scenario.embed(screenshot, "image/png");

                } catch (WebDriverException somePlatformsDontSupportScreenShots) {

                    System.err.println(somePlatformsDontSupportScreenShots.getMessage());
                }

            }

            driver.quit();
            driver = null;
        }
    }

    private static void setDefaultDriverTimeout() {

        driver.manage().timeouts().implicitlyWait(DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
    }

    public static void get(String url) {

        driver.get(url);
    }

    public static WebElement waitForElement(By by) {

        return (new WebDriverWait(driver, DEFAULT_WAIT_TIME)).until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static List<WebElement> waitForAllElements(By by) {

        return (new WebDriverWait(driver, DEFAULT_WAIT_TIME)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public static String getCurrentURL() {

        return driver.getCurrentUrl();
    }

    public static void removeAttr(){

        JavascriptExecutor removeAttribute = (JavascriptExecutor)driver;
        removeAttribute.executeScript("var x=document.getElementsByName(\"NCV\");x[0].removeAttribute('disable');");

    }

    public static void   setAttr(){

        JavascriptExecutor removeAttribute = (JavascriptExecutor)driver;
        removeAttribute.executeScript("var x=document.getElementById(\"J_coaltype_dlm\");x.setAttribute(\"style\",\"display: none\");");
        removeAttribute.executeScript("var x=document.getElementById(\"J_coaltype_pcm\");x.setAttribute(\"style\",\"display: block\");");

    }


//    public static void setSleep(int time){
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }

    public boolean isByElementDisplayed(By by, int time) {
        boolean status = false;
        if (driver.findElement(by).isDisplayed() == false) {
            driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
        } else {
            status = true;
        }
        return status;
    }


}
