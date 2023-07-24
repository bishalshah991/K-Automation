package Pages;

import BaseClass.PageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public void type(By bylocator, String text){
        PageDriver.getCurrentDriver()
                .findElement(bylocator)
                .sendKeys(text);
    }

    public void click(By bylocator){
        PageDriver.getCurrentDriver()
                .findElement(bylocator)
                .click();
    }

    public void WaitForPresenceOfElement(By byLocator,int timeout){
        WebDriverWait wait = new WebDriverWait(PageDriver.getCurrentDriver(), Duration.ofMinutes(timeout));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(byLocator));
    }

}
