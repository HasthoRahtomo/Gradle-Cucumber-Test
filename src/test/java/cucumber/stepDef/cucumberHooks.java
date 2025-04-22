package cucumber.stepDef;
import cucumber.baseText;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class cucumberHooks extends baseText{

    @Before
    public void beforeTest() {
        getDriver();
    }

    @After
    public void afterTest() {
        driver.close();
    }
}
