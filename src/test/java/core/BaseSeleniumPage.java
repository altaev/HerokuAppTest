package core;

import org.openqa.selenium.WebDriver;
/*
* This page should be the base for all pages in pageObject class and pass webdriver to all pages
 */
abstract public class BaseSeleniumPage {
    protected static WebDriver driver;

    public static void setDriver(WebDriver webDriver){
        driver = webDriver;
    }
}
