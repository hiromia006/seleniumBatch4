package com.parabank.parasoft.test.pages;

import com.parabank.parasoft.test.baseTest.BaseTest;
import com.parabank.parasoft.test.util.General;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UpdateProfilePage extends BaseTest {
    @FindBy(id = "customer.firstName")
    WebElement firstNameEl;

    @FindBy(id = "customer.lastName")
    WebElement lastNameEl;

    @FindBy(id = "customer.address.street")
    WebElement addressEl;

    @FindBy(css = "input.button")
    WebElement updateBtn;

    @FindBy(id = "customer.phoneNumber")
    List<WebElement> webElements;

    @FindBy(css = "a[href*='logout']")
    WebElement logoutLink;

    public UpdateProfilePage() {
        PageFactory.initElements(driver, this);
    }

    public UpdateProfilePage fillFirstName(String firstName) {
        General.domStable();
        firstNameEl.isDisplayed();
        firstNameEl.clear();
        firstNameEl.sendKeys(firstName);
        return this;
    }

    public UpdateProfilePage fillLastName(String lastName) {
        lastNameEl.isDisplayed();
        lastNameEl.clear();
        lastNameEl.sendKeys(lastName);
        return this;
    }

    public UpdateProfilePage fillAddress(String address) {
        addressEl.isDisplayed();
        addressEl.clear();
        addressEl.sendKeys(address);
        return this;
    }

    public UpdateProfilePage clickUpdateProfileBtn() {
        updateBtn.isDisplayed();
        updateBtn.click();
        return this;
    }

    public boolean hasPhoneNumber() {
        General.domStable();
        return webElements.size() == 0;
    }

    public CustomerLoginPage clickLogOutBtn() {
        logoutLink.isDisplayed();
        logoutLink.click();
        return new CustomerLoginPage();
    }

}
