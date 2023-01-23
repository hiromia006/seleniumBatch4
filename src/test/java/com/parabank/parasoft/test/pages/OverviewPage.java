package com.parabank.parasoft.test.pages;

import com.parabank.parasoft.test.baseTest.BaseTest;
import com.parabank.parasoft.test.util.General;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage extends BaseTest {
    @FindBy(css = "a[href*='logout']")
    WebElement logoutLink;

    @FindBy(css = "a[href*='openaccount']")
    WebElement openAccountLink;

    @FindBy(css = "a[href*='updateprofile']")
    WebElement updateProfileLink;



    public OverviewPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isLogoutLink() {
        return logoutLink.isDisplayed();
    }

    public OpenAccountPage clickOpenAccountLink() {
        General.domStable();
        openAccountLink.isDisplayed();
        openAccountLink.click();
        return new OpenAccountPage();
    }

    public UpdateProfilePage clickUpdateProfileLink() {
        General.domStable();
        updateProfileLink.isDisplayed();
        updateProfileLink.click();
        return new UpdateProfilePage();
    }

}
