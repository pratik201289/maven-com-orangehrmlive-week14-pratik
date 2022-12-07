package com.orangehrm.www.testsuite;

import com.orangehrm.www.pages.LoginPage;
import com.orangehrm.www.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

LoginPage loginPage =new LoginPage();

   @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

       loginPage.setUserName("Admin");
       loginPage.setPassword("admin123");
       loginPage.setClickLoginButton();

       Assert.assertEquals(loginPage.getSuccessMessage(),"Dashboard","Success Message not displayed");

   }
}
