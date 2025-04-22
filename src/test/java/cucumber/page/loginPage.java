package cucumber.page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    WebDriver driver;

    By usernameInputTest = By.xpath("//*[@id=\"user-name\"]");
    By passwordInputTest = By.xpath("//*[@id=\"password\"]");
    By loginBtn = By.xpath("//*[@id=\"login-button\"]");

    public loginPage(WebDriver driver){
        this.driver = driver;
    }

    public void goToLoginPage(){
        driver.get("https://www.saucedemo.com/");
    }

    public void inputUsername(String username){
        driver.findElement(usernameInputTest).sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(passwordInputTest).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginBtn).click();
    }

    public void homePageValidation(){
        Assertions.assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
    }

    public void loginPageValidation(){
        Assertions.assertEquals("https://www.saucedemo.com/", driver.getCurrentUrl());
    }

    public void wrongDataErrorText(String errorText){
        Assertions.assertEquals(driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText(), errorText);
    }
}
