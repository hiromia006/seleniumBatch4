package com.parabank.parasoft.test.testcases;

import com.parabank.parasoft.test.baseTest.BaseTest;
import com.parabank.parasoft.test.pages.CustomerLoginPage;
import com.parabank.parasoft.test.pages.OverviewPage;
import com.parabank.parasoft.test.pages.UpdateProfilePage;
import com.parabank.parasoft.test.util.General;
import com.thedeanda.lorem.LoremIpsum;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UpdateProfileTest extends BaseTest {
    OverviewPage overviewPage;
    UpdateProfilePage updateProfilePage;

    public UpdateProfileTest() {
        super();
    }

    @BeforeClass
    public void initialization() {
        setUpBrowser();
        overviewPage = new CustomerLoginPage()
                .login(getUserName(), getPassword());
    }

    @Test
    public void updateProfileShouldSucceed() {
        updateProfilePage = overviewPage
                .clickUpdateProfileLink()
                .fillFirstName(LoremIpsum.getInstance().getFirstName())
                .fillLastName(LoremIpsum.getInstance().getLastName())
                .fillAddress(LoremIpsum.getInstance().getTitle(3))
                .clickUpdateProfileBtn();
        Assert.assertTrue(updateProfilePage.hasPhoneNumber());
        updateProfilePage.clickLogOutBtn();

    }

    @AfterClass
    public void tearDown() {
        General.domStable();
        driver.quit();
    }
}
