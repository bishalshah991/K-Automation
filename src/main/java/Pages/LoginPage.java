package Pages;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;

import java.io.IOException;

public class LoginPage extends BasePage{

    public By text1 = By.cssSelector("p[class='greeting-heading']");
    By username = By.xpath("//input[@name='username']");
    By PassWord = By.cssSelector("input[name='password']");
    By LoginButton = By.cssSelector("div[class='form-buttons']>button");

    By Project = By.xpath("//div[starts-with(@class,'grid-view__section')]/div/div[1]/div/div[2]/div[1]/div[1]");

    public void LoginToApplication(String email, String password) throws IOException, ParseException {
        type(username,email);
        type(PassWord,password);
        click(LoginButton);
        WaitForPresenceOfElement(Project,10);
    }

}
