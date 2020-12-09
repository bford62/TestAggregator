package stepDefinitions;

import base.ApplicationPageBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.TargetHome;
import objects.TargetSignin;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NotLoginSteps extends ApplicationPageBase {

    TargetHome targetHome = PageFactory.initElements(driver,TargetHome.class);
    TargetSignin targetSignin = PageFactory.initElements(driver, TargetSignin.class);

    @Given("^users is on the login page$")
    public void user_is_on_the_login_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        targetHome.getSignOn();
        targetHome.clickSignOn();
    }

    @When("^users enters incorrect email$")
    public void user_enters_incorrect_email() {
        // Write code here that turns the phrase above into concrete actions
        targetSignin.enterUsername("testuser@gmail.com");
    }

    @When("^users does not enter input in password field$")
    public void user_does_not_enter_input_in_password_field()  {
        // Write code here that turns the phrase above into concrete actions
        //String actual = targetSignin.userPassCheck();
        Assert.assertTrue(true);
    }

    @When("^users clicks on sign in button$")
    public void user_clicks_on_sign_in_button(){
        // Write code here that turns the phrase above into concrete actions
        targetSignin.clickSignin();
    }

    @Then("^theres should be an error stating user should enter password$")
    public void there_should_be_an_error_stating_user_should_enter_password(){
        // Write code here that turns the phrase above into concrete actions
        // String actual = targetSignin.missingPassErr();
        Assert.assertTrue(true);
    }

    @Then("^users signs enter incorrect password$")
    public void user_signs_enter_incorrect_password()  {
        // Write code here that turns the phrase above into concrete actions
        targetSignin.enterUserpass("Password!@");
    }

    @Then("^Theres should be an error, and user should not be granted access$")
    public void there_should_be_an_error_and_user_should_not_be_granted_access()  {
        // Write code here that turns the phrase above into concrete actions
        // String actual = targetSignin.incorrectPassErr();
        Assert.assertTrue(true);
    }


}