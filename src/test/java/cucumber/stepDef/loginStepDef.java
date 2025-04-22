package cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import cucumber.page.loginPage;
import cucumber.baseText;

public class loginStepDef extends baseText {
    loginPage loginPage;

    @Given("user in on the login page")
    public void userInOnTheLoginPage() {
        loginPage = new loginPage(driver);
        loginPage.goToLoginPage();
    }

    @And("user input username text box with {string}")
    public void userInputUsernameTextBoxWith(String username) {
        loginPage.inputUsername(username);
    }

    @And("User input password text box with {string}")
    public void userInputPasswordTextBoxWith(String password) {
        loginPage.inputPassword(password);
    }

    @When("user click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("user will redirect to the home page")
    public void userWillRedirectToTheHomePage() {
        loginPage.homePageValidation();
    }

    @Then("user still in the login page")
    public void userStillInTheLoginPage() {
        loginPage.loginPageValidation();
    }

    @And("user see an error message {string}")
    public void userSeeAnErrorMessage(String errorText) {
        loginPage.wrongDataErrorText(errorText);
    }
}
