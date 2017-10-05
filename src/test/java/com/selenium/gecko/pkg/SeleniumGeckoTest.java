package com.selenium.gecko.pkg;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGeckoTest {
    public WebDriver driver;
    String baseURL, nodeURL;
    @Test
    public void Method1() throws InterruptedException {

        driver.get(baseURL);
        Assert.assertEquals("Welcome: Mercury Tours",driver.getTitle());
        Thread.sleep(5000);

    }
    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        System.out.println(System.getProperties());
        baseURL="http://newtours.demoaut.com/";
        nodeURL=" http://localhost:4444/wd/hub";
        DesiredCapabilities capability= DesiredCapabilities.chrome(); // browser of machine b
        capability.setBrowserName("chrome");
        capability.setPlatform(Platform.LINUX); // OS of machine b
        driver= new RemoteWebDriver(new URL(nodeURL), capability);


    }
    @AfterClass
    public void afterClass(){

    }
}
