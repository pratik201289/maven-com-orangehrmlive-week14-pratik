package com.orangehrm.www.testsuite;

import com.orangehrm.www.pages.ForgotPassword;
import com.orangehrm.www.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {

 ForgotPassword forgotPassword =new ForgotPassword();

@Test
 public void userShouldNavigateToForgotPasswordPageSuccessfully(){

 forgotPassword.clickOnForgotPasswordLink();

 Assert.assertEquals(forgotPassword.verifyActualTextResetPassword(),"Reset Password","Reset Password not displayed");

}
}
