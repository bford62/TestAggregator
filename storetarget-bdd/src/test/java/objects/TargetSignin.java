package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TargetSignin {

    private WebDriver driver;

    @FindBy(how = How.ID, id = "username")
    WebElement username;

    @FindBy(how = How.ID, id = "password")
    WebElement userpass;

    @FindBy(how = How.ID, id = "login")
    WebElement signBtn;

    @FindBy(how = How.ID, id = "password--ErrorMessage")
    WebElement missingPasswordError;

    @FindBy(how = How.XPATH, xpath = "//div[text()=\"That password is incorrect\"]")
    WebElement invalidPassErr;

    public void enterUsername(String user){

        username.sendKeys(user);
    }
    public void enterUserpass(String pass){

        userpass.sendKeys(pass);
    }
    public void clickSignin(){
        signBtn.click();
    }

    public String userPassCheck(){
        return userpass.getAttribute("value");
    }

    public String missingPassErr(){
        return missingPasswordError.getText();
    }

    public String incorrectPassErr(){
        return invalidPassErr.getText();
    }
}
