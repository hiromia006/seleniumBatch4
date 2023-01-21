package com.parabank.parasoft.test.pages;

import com.parabank.parasoft.test.baseTest.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage extends BaseTest {
    @FindBy(how = How.NAME, using = "username")
    WebElement usernameEl;

    @FindBy(name = "password")
    WebElement passwordEl;

    @FindBy(css = ".login .button")
    WebElement loginBtn;

    @FindBy(className = "error")
    WebElement errorEl;

    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    public CustomerLoginPage fillUsername(String username) {
        usernameEl.isDisplayed();
        usernameEl.clear();
        usernameEl.sendKeys(username);
        return this;
    }

    public CustomerLoginPage fillPassword(String password) {
        passwordEl.isDisplayed();
        passwordEl.clear();
        passwordEl.sendKeys(password);
        return this;
    }

    public OverviewPage clickLoginBtn() {
        loginBtn.isDisplayed();
        loginBtn.click();
        return new OverviewPage();
    }

    public CustomerLoginPage clickLoginBtn2() {
        loginBtn.isDisplayed();
        loginBtn.click();
        return this;
    }


    public OverviewPage login(String username, String password) {
        fillUsername(username);
        fillPassword(password);
        clickLoginBtn();
        return new OverviewPage();
    }

    public CustomerLoginPage login(String username) {
        fillUsername(username);
        clickLoginBtn();
        return this;
    }

    public boolean hasError() {
        return errorEl.isDisplayed();
    }

}
