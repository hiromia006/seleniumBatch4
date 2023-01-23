package com.parabank.parasoft.test.testcases;

import com.parabank.parasoft.test.baseTest.BaseTest;
import com.parabank.parasoft.test.pages.CustomerLoginPage;
import com.parabank.parasoft.test.pages.OpenAccountPage;
import com.parabank.parasoft.test.pages.OverviewPage;
import com.parabank.parasoft.test.util.General;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenAccountTest extends BaseTest {
    CustomerLoginPage loginPage;
    OverviewPage overviewPage;
    OpenAccountPage openAccountPage;

    public OpenAccountTest() {
        super();

    }

    @BeforeClass
    public void initialization() {
        setUpBrowser();
        overviewPage = new CustomerLoginPage()
                .login(getUserName(), getPassword());
    }

    @Test
    public void openAccountShouldSucceed() {
        openAccountPage = overviewPage
                .clickOpenAccountLink()
                .clickOpenAccountBtn();
        Assert.assertTrue(openAccountPage.hasNewAccountId());
        openAccountPage.clickLogOutBtn();
    }


    @AfterClass
    public void tearDown() {
        General.domStable();
        driver.quit();
    }
}
