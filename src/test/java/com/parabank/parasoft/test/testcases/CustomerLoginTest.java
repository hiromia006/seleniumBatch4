package com.parabank.parasoft.test.testcases;

import com.parabank.parasoft.test.baseTest.BaseTest;
import com.parabank.parasoft.test.pages.CustomerLoginPage;
import com.parabank.parasoft.test.pages.OverviewPage;
import com.parabank.parasoft.test.util.General;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomerLoginTest extends BaseTest {
    CustomerLoginPage loginPage;
    OverviewPage overviewPage;

    @BeforeClass
    public void init() {
        setUpBrowser();
    }

    public CustomerLoginTest() {
        super();
    }

    @Test(priority = 1)
    public void loginShouldSucceed() {
        loginPage = new CustomerLoginPage();
        overviewPage = loginPage
                .fillUsername(getUserName())
                .fillPassword(getPassword())
                .clickLoginBtn();

        Assert.assertTrue(overviewPage.isLogoutLink());

//        OverviewPage overviewPage = new CustomerLoginPage()
//                .fillUsername(getUserName())
//                .fillPassword(getPassword())
//                .clickLoginBtn();

    }

    @Test(enabled = false)
    public void loginShouldSucceed2() {
        loginPage = new CustomerLoginPage();
        overviewPage = loginPage
                .login(getUserName(), getPassword());
        Assert.assertTrue(overviewPage.isLogoutLink());

//        Assert.assertTrue(new CustomerLoginPage().login(getUserName(), getPassword()).isLogoutLink());


    }

    @Test(priority = 0)
    public void loginShouldFail() {
        loginPage = new CustomerLoginPage()
                .login(getUserName());
        Assert.assertTrue(loginPage.hasError());

    }


    @AfterClass
    public void tearDown() {
        General.domStable();
        driver.quit();
    }
}
