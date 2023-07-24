package testCase;

import BaseClass.PageDriver;
import BaseClass.TestBase;
import Pages.LoginPage;
import Utility.ReadJsonData;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class LoginPageTest extends TestBase {
    String path=System.getProperty("user.dir")+ File.separator +"TestData"+File.separator +"Data.json";
    @Test
    public void LoginToApplicationTest() throws IOException, ParseException {
        ReadJsonData readJsonData=new ReadJsonData();
        String u_username = readJsonData.Read_the_value_from_json(path,"Username");
        String p_Password = readJsonData.Read_the_value_from_json(path,"Password");
        LoginPage loginPage=new LoginPage();
        loginPage.LoginToApplication(u_username,p_Password);
    }
}
