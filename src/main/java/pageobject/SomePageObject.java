package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by ecenanovic on 24/02/2017.
 */


public class SomePageObject {
    WebDriver driver = new SafariDriver();
    //WebDriverWait wait = new WebDriverWait(driver, 100);

    public void goToWebsite(){
    driver.navigate().to("http://the-internet.herokuapp.com/");
    WebElement formAuthentication = driver.findElement(By.cssSelector("a[href='/login']"));
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='/login']")));
        formAuthentication.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //WebDriverWait
        assertThat(getCurrentURL(), equalTo("http://the-internet.herokuapp.com/login"));
        driver.quit();
    }

    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }

}
