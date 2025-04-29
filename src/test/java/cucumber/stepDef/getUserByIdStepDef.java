package cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import cucumber.api.getUserById;

public class getUserByIdStepDef {
    getUserById code = new getUserById();

    @Given("The API base URL is {string}")
    public void theAPIBaseURLIs(String urlLink) {
        code.setURL(urlLink);
    }

    @And("I send a GET request to {string}")
    public void iSendAGETRequestTo(String apiLink) {
        code.setApiLink(apiLink);
    }

    @When("I set user ID to {int}")
    public void iSetUserIDTo(int userID) {
        code.setUserId(userID);
    }

    @Then("The response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int response) {
        code.responseCheck(response);
    }
}
